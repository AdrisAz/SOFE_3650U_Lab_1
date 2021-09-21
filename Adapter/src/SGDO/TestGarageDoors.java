package SGDO;

public class TestGarageDoors {
    public static void main(String[] args){
//        BasicGarageDoor basic_gd = new BasicGarageDoor();
//        GarageDoorApp basic_app_1 = new GarageDoorApp(basic_gd);
//
//        basic_app_1.openDoor();
//        basic_app_1.closeDoor();
//


        PremiumGarageDoorOpener premium_opener = new PremiumGarageDoorOpener();
        PremiumGarageDoorApp premium_app = new PremiumGarageDoorApp(premium_opener);

        GarageDoorAdapter adapter = new GarageDoorAdapter(premium_opener);
        GarageDoorApp basic_app = new GarageDoorApp(adapter);

        adapter.setSpeed(5);
        basic_app.openDoor();

        premium_app.closeDoor(3);
//        basic_app.closeDoor();
//
//        premium_app.openDoor(2);
//        System.out.println("");
//        premium_app.closeDoor(2);




    }
    
}
