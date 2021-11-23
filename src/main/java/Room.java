package main.java;

public class Room {
    private int[][] room;

    public void furnish(int length, int width, int[] position) {
        //position = new int[2];
        for (int i = position[0]; i < position[0] + length; i++) {
            for (int j = position[1]; j < position[1] + width; j++) {
                this.room[i][j] = 0;
            }
        }
    }

    public void setRoom(int dim1, int dim2) {
        int room[][] = new int[dim1][dim2];
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                if (i == 0 || j == 0 || i == dim1 - 1 || j == dim2 - 1) {
                    room[i][j] = 0;
                } else {
                    room[i][j] = 2;
                }
            }
        }
        this.room = room;
    }

    public int[][] getRoom() {
        return room;
    }
}
