package model;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveFront(int number) {
        int MOVABLE_LOWER_BOUND = 4;
        if (number >= MOVABLE_LOWER_BOUND){
            position++;
        }
    }
}