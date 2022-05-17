package Task2;

import Task1.Device;

public class Monitor extends Device {

    int resolutionX;
    int resolutionY;

    public Monitor(int resolutionX, int resolutionY){
        super("Samsung", 120, "AB1234567CD");
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }
    public void setResolutionX(int resolutionX){
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }
    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
        return String.format("ResolutionX - " + resolutionX + "\n"
                + "ResolutionY - " + resolutionY);
    }
}

