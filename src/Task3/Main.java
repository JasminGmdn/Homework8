package Task3;

public class Main {
    public static void main(String[] args) {
        Device device = new Device(12);
        Monitor device1 = new Monitor(13);
        EthernetAdapter device2 = new EthernetAdapter(14);

        System.out.println(device.equals(device1));
        System.out.println(device1.equals(device));

        System.out.println(device.hashCode());
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());

        System.out.println(device);
        System.out.println(device1);
        System.out.println(device2);

    }
}
