import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MeteoMapper  extends Mapper<LongWritable, Text, Text, MeteoWritable> {
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException{
        String line = value.toString();
        String[] lineSplit = line.split("\",\"");
        if (!lineSplit[1].equals("DATE")){
            //----------wind speed extraction---------------------
            String windValue = lineSplit[10].substring(8, 12);
            char windQuality = lineSplit[10].substring(13,14).charAt(0);
            double wind = 0;
            long mesureWindCounter = 0;
            if(!windValue.equals("9999") && Character.isDigit(windQuality) && Character.getNumericValue(windQuality) < 5){
                wind = Double.parseDouble(windValue)/10.0;
                mesureWindCounter = 1;
            }
            //---------temperature extraction----------------------
            String temperatureValue = lineSplit[13].substring(0, 5);
            char temperatureQuality = lineSplit[10].substring(6,7).charAt(0);
            double temperature = 0;
            long mesureTemperatureCounter = 0;
            if (!temperatureValue.equals("+9999") && Character.isDigit(temperatureQuality) && Character.getNumericValue(temperatureQuality) < 5) {
                temperature = Double.parseDouble(temperatureValue);
                mesureTemperatureCounter = 1;
            }

            if(0 != mesureWindCounter || mesureTemperatureCounter != 0){
                MeteoWritable outputValue = new MeteoWritable(
                        mesureTemperatureCounter,
                        mesureWindCounter,
                        temperature,
                        temperature,
                        wind,
                        wind,
                        wind
                );
                String output = lineSplit[1].substring(0, 7);
                Text outputKey = new Text(output);
                context.write(outputKey, outputValue);
            }
        }
    }
}
