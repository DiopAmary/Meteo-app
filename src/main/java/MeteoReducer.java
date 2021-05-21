import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class MeteoReducer extends Reducer<Text, MeteoWritable, Text, MeteoWritable> {
    protected void reduce(Text key, Iterable<MeteoWritable> values, Context context) throws IOException, InterruptedException{
        double sumWind = 0;
        double windMin = 0;
        double windMax = 0;
        long mesureWindCounter = 0;
        double temperatureMin = 0;
        double temperatureMax = 0;
        long mesureTemperatureCounter = 0;
        for(MeteoWritable meteoWritable : values){
            if(meteoWritable.getNombreMesureWind() != 0){
                mesureWindCounter += meteoWritable.getNombreMesureWind();
                if(windMin > meteoWritable.getWindMin())
                    windMin =  meteoWritable.getWindMin();
                if(windMax < meteoWritable.getWindMax())
                    windMax = meteoWritable.getWindMax();
                sumWind += meteoWritable.getWindMoyenne();
            }
            if(meteoWritable.getNombreMesureTemperature() != 0){
                mesureTemperatureCounter += meteoWritable.getNombreMesureTemperature();
                if(temperatureMin > meteoWritable.getTemperatureMin())
                    temperatureMin = meteoWritable.getTemperatureMin();
                if(temperatureMax < meteoWritable.getTemperatureMax())
                    temperatureMax = meteoWritable.getTemperatureMax();
            }
        }
        double moyenne = (double)Math.round(sumWind/mesureWindCounter*1000)/1000;
        MeteoWritable outputValue = new MeteoWritable(
                mesureTemperatureCounter,
                mesureWindCounter,
                temperatureMax,
                temperatureMin,
                windMax,
                windMin,
                moyenne
        );
        context.write(key, outputValue);
    }
}
