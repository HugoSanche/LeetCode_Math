public class ConvertTheTemperature {
    public static void main(String[] args) {
        double celcius = 36.50;
        double[] sum = convertTemperature(celcius);
    }
    public static double[] convertTemperature(double celsius) {
        double[] temperature={celsius+273.15,celsius*1.80+32.00};
       // temperature[0]=celsius+273.15;
       // temperature[1]=celsius*1.80+32.00;
        return temperature;
    }

}
