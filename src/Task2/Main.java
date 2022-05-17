package Task2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung",120,"AB1234567CD");
        Monitor monitor = new Monitor(1280,1024);


        System.out.println(device.getClass());
        System.out.println(device);

        System.out.println(monitor.getClass());
        System.out.println(monitor);
    }
}
