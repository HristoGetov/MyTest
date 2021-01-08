package Lesson4;

public class Temperature {

    private double ftemp;



    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFtemp() {
        return ftemp;
    }

    public void setFtemp(double ftemp) {
        this.ftemp = ftemp;
    }
    public double getCelsius(){
        double celsius=(0.5555555556*(ftemp-32));
        return  celsius;
    }
    public double getKelvin(){
        double kelvin = (0.5555555556*(ftemp-32))+273;
        return kelvin;
    }
}
