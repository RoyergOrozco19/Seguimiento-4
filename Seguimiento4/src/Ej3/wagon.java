package Ej3;

public class wagon {
    private String type;
    private int capacity;
    private seat[] seats;

    public wagon(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.seats = new seat[capacity];
        for (int i = 0; i < capacity; i++){
            seats[i] = new seat(i + 1);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public seat[] getSeats() {
        return seats;
    }

    public void setSeats(seat[] seats) {
        this.seats = seats;
    }

    public seat getSeat(int number) {
        if (number > 0 && number <= capacity){
            return  seats[number - 1];
        }else {
            System.out.println("Invalid seat number;");
            return null;
        }
    }
}
