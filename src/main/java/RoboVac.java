package main.java;

import java.util.Random;

public class RoboVac {
    private Room room;
    private int counter = 0;

    public void cleanRoom() {
        rndCleaningAlgorithm(setStartingPosition());
        System.out.println(counter);
        printRoom();
    }

    public void cleanRoom2() {
        snakeCleaningAlgorithm(setStartingPosition());
        System.out.println(counter);
        printRoom();
    }

    private void snakeCleaningAlgorithm(int[] position) {
        int x = position[0];
        int y = position[1];
        if (room.getRoom()[x][y] == 2) {
            room.getRoom()[x][y] = 1;
        }
        while (checkForDirtySpots()) {
            printRoomWithRobot(x, y);
            while (room.getRoom()[x - 1][y] != 0) {
                x--;
                counter++;
                if (room.getRoom()[x][y] == 2) {
                    room.getRoom()[x][y] = 1;
                }
            }
            int leftOrRight = randomNumber2();
            int howManyColumns = randomNumber3();
            if (leftOrRight == 0) {
                int i = 0;
                if (howManyColumns == 2) {
                    while ((room.getRoom()[x][y + 1] != 0) && (i < 3)) {
                        y++;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 1) {
                    while ((room.getRoom()[x][y + 1] != 0) && (i < 2)) {
                        y++;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 0) {
                    while ((room.getRoom()[x][y + 1] != 0) && (i < 1)) {
                        y++;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                }
            } else {
                int i = 0;
                if (howManyColumns == 2) {
                    while ((room.getRoom()[x][y - 1] != 0) && (i < 3)) {
                        y--;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 1) {
                    while ((room.getRoom()[x][y - 1] != 0) && (i < 2)) {
                        y--;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 0) {
                    while ((room.getRoom()[x][y - 1] != 0) && (i < 1)) {
                        y--;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                }
            }
            while (room.getRoom()[x + 1][y] != 0) {
                x++;
                counter++;
                if (room.getRoom()[x][y] == 2) {
                    room.getRoom()[x][y] = 1;
                }
            }
            if (leftOrRight == 0) {
                int i = 0;
                if (howManyColumns == 2) {
                    while ((room.getRoom()[x][y + 1] != 0) && (i < 3)) {
                        y++;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 1) {
                    while ((room.getRoom()[x][y + 1] != 0) && (i < 2)) {
                        y++;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 0) {
                    while ((room.getRoom()[x][y + 1] != 0) && (i < 1)) {
                        y++;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                }
            } else {
                int i = 0;
                if (howManyColumns == 2) {
                    while ((room.getRoom()[x][y - 1] != 0) && (i < 3)) {
                        y--;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 1) {
                    while ((room.getRoom()[x][y - 1] != 0) && (i < 2)) {
                        y--;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                } else if (howManyColumns == 0) {
                    while ((room.getRoom()[x][y - 1] != 0) && (i < 1)) {
                        y--;
                        counter++;
                        if (room.getRoom()[x][y] == 2) {
                            room.getRoom()[x][y] = 1;
                        }
                        i++;
                    }
                }
            }
        }
    }

    private void rndCleaningAlgorithm(int[] position) {
        int x = position[0];
        int y = position[1];

        while (checkForDirtySpots()) {
            printRoomWithRobot(x, y);
            if (room.getRoom()[x][y] == 2) {
                room.getRoom()[x][y] = 1;
            }

            switch (randomNumber4()) {
                case 0:
                    if (room.getRoom()[x - 1][y] != 0) {
                        x--;
                        counter++;
                    }
                    break;

                case 1:
                    if (room.getRoom()[x][y + 1] != 0) {
                        y++;
                        counter++;
                    }
                    break;

                case 2:
                    if (room.getRoom()[x + 1][y] != 0) {
                        x++;
                        counter++;
                    }
                    break;

                case 3:
                    if (room.getRoom()[x][y - 1] != 0) {
                        y--;
                        counter++;
                    }
                    break;
            }
        }
    }

    private int[] setStartingPosition() {
        int[] startingPosition = {0, 0};
        Random r = new Random();
        Random q = new Random();

        while (room.getRoom()[startingPosition[0]][startingPosition[1]] == 0) {
            startingPosition[0] = r.nextInt(room.getRoom().length - 1) + 1;
            startingPosition[1] = q.nextInt(room.getRoom()[0].length - 1) + 1;
            return startingPosition;
        }
        return startingPosition;
    }

    private boolean checkForDirtySpots() {
        for (int row = 0; row < room.getRoom().length; row++) {
            for (int col = 0; col < room.getRoom()[row].length; col++) {
                if (room.getRoom()[row][col] == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private void printRoomWithRobot(int x, int y) {
        for (int i = 0; i < room.getRoom().length; i++) {
            for (int j = 0; j < room.getRoom()[i].length; j++) {
                if (x == i && y == j) {
                    System.out.print("X ");
                } else
                    System.out.print((room.getRoom())[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printRoom() {
        for (int i = 0; i < room.getRoom().length; i++) {
            for (int j = 0; j < room.getRoom()[i].length; j++) {
                System.out.print((room.getRoom())[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private int randomNumber4() {
        Random r = new Random();
        return r.nextInt(4);
    }

    private int randomNumber3() {
        Random r = new Random();
        return r.nextInt(3);
    }

    private int randomNumber2() {
        Random r = new Random();
        return r.nextInt(2);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
