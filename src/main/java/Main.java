package main.java;

public class Main {
    public static void main(String[] args) {

        Room room = new Room();
        RoboVac robovac = new RoboVac();
        room.setRoom(10, 10);
        room.furnish(1,2,new int[]{2,2});
        room.furnish(2,3,new int[]{3,4});
        robovac.setRoom(room);
        robovac.cleanRoom2();
    }
}
