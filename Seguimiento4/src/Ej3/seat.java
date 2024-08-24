package Ej3;

public class seat {
    private int number;
    private String status;

    public seat(int number){
        this.number = number;
        this.status = "available";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void reserve(){
        if(status.equals("available")){
            status = "occupied";
        }else {
            System.out.println("Seat is not available for reservation.");
        }
    }

    public void occupy(){
        if (status.equals("reserved")){
            status = "ocuppied";
        }else {
            System.out.println("Seat is not reserved yet. ");
        }
    }
}
