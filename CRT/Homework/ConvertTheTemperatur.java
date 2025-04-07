// https://leetcode.com/problems/convert-the-temperature/description/
public class ConvertTheTemperatur {
    public double[] convertTemperature(double celsius) {
        

        double k = celsius + 273.15;
        double f = ( celsius * 9 / 5) + 32;

        return new double[]{k,f};
    }
}
