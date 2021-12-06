package BUOI27.thuchanh;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        System.out.println("Chuyen từ F sang C: " + FtoC(50));
        System.out.println("Chuyen từ C sang F: " + CtoF(28));
    }

    public static double FtoC(double fahrenheit) {
        double celcius;
    celcius = (5.0 / 9) *(fahrenheit -32);
    return celcius;
    }
    public static double CtoF(double celcius) {
        double fahrenheit;
        fahrenheit = (celcius * 9 / 5) +32;
        return fahrenheit;
    }
}
