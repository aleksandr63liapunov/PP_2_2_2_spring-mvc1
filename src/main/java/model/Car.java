package model;

public class Car {
    private String modal;
    private String color;
    private int count;

    public Car(String modal, String color, int count) {
        this.modal = modal;
        this.color = color;
        this.count = count;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modal='" + modal + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}
