package SGDO;


public class GarageDoorAdapter implements StdGarageDoorOpener{

    private int speed;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    private PremiumGarageDoorOpener opener;

    public GarageDoorAdapter( PremiumGarageDoorOpener opener) {
        this.opener = opener;
    }

    @Override
    public void openDoor() {
        this.opener.openDoor(this.speed);
    }

    @Override
    public void closeDoor() {
        this.opener.closeDoor(this.speed);
    }
}
