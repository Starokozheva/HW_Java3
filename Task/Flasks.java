package Task;

public class Flasks {

    public static void main(String[] args) {

        int temperature1 = 120;
        int temperature2 = 90;
        boolean isDeviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Прибор работает корректно: " + isDeviceWorking);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}
