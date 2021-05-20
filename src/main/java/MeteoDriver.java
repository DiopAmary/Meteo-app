import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.File;
import java.io.IOException;

public class MeteoDriver {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        FileUtil.fullyDelete(new File(args[1]));
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Métèo data extration");
        job.setJarByClass(MeteoDriver.class);
        job.setMapperClass(MeteoMapper.class);
        //job.setCombinerClass(MeteoCombiner.class);
        job.setReducerClass(MeteoReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(MeteoWritable.class);
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
