package Task1;

public class Monitor extends Device {

        int resolutionX;
        int resolutionY;

        private Monitor(int resolutionX, int resolutionY){
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
}
