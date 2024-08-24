package Ej3;

public class Journey {
    private String date;
    private String departureTime;
    private String arrivalTime;
    private train train;

    public Journey(String date, String departureTime, String arrivalTime, train train){
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.train = train;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public trainTicket.train getTrain() {
        return train;
    }

    public void setTrain(trainTicket.train train) {
        this.train = train;
    }
}
