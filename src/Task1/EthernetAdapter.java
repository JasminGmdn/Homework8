package Task1;

public class EthernetAdapter extends Device {
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac){
        super("Unknown", 23, "UD345");
        this.speed = speed;
        this.mac = mac;
    }

}
