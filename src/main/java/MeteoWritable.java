import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class MeteoWritable implements Writable {
    private long nombreMesureTemperature;
    private long nombreMesureWind;
    private double temperatureMax;
    private double temperatureMin;
    private double windMax;
    private double windMin;
    private double windMoyenne;


    @Override
    public void write(DataOutput out) throws IOException {
        out.writeLong(nombreMesureTemperature);
        out.writeLong(nombreMesureWind);
        out.writeDouble(temperatureMax);
        out.writeDouble(temperatureMin);
        out.writeDouble(windMax);
        out.writeDouble(windMin);
        out.writeDouble(windMoyenne);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        nombreMesureTemperature = in.readLong();
        nombreMesureWind = in.readLong();
        temperatureMax = in.readDouble();
        temperatureMin = in.readDouble();
        windMin = in.readDouble();
        windMax = in.readDouble();
        windMoyenne = in.readDouble();
    }

    public MeteoWritable(long nombreMesureTemperature, long nombreMesureWind, double temperatureMax, double temperatureMin, double windMax, double windMin, double windMoyenne) {
        this.nombreMesureTemperature = nombreMesureTemperature;
        this.nombreMesureWind = nombreMesureWind;
        this.temperatureMax = temperatureMax;
        this.temperatureMin = temperatureMin;
        this.windMax = windMax;
        this.windMin = windMin;
        this.windMoyenne = windMoyenne;
    }

    public MeteoWritable() {}

    @Override
    public String toString() {
        return "MeteoWritable[" +
                "Temp ( " + nombreMesureTemperature +
                " , " + temperatureMax +
                " , " + temperatureMin +
                " )\t( " + nombreMesureWind +
                " , " + windMax +
                " , " + windMin +
                " , " + windMoyenne +
                " ) ]";
    }

    public long getNombreMesureTemperature() {
        return nombreMesureTemperature;
    }

    public void setNombreMesureTemperature(long nombreMesureTemperature) {
        this.nombreMesureTemperature = nombreMesureTemperature;
    }

    public long getNombreMesureWind() {
        return nombreMesureWind;
    }

    public void setNombreMesureWind(long nombreMesureWind) {
        this.nombreMesureWind = nombreMesureWind;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public double getWindMax() {
        return windMax;
    }

    public void setWindMax(double windMax) {
        this.windMax = windMax;
    }

    public double getWindMin() {
        return windMin;
    }

    public void setWindMin(double windMin) {
        this.windMin = windMin;
    }

    public double getWindMoyenne() {
        return windMoyenne;
    }

    public void setWindMoyenne(double windMoyenne) {
        this.windMoyenne = windMoyenne;
    }
}
