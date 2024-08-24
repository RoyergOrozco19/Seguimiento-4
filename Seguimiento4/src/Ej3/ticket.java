package Ej3;

public class ticket {
    private client client;
    private Journey journey;
    private seat seat;

    public ticket(client client, Journey journey, seat seat){
        this.client = client;
        this.journey = journey;
        this.seat = seat;
    }

    public trainTicket.client getClient() {
        return client;
    }

    public void setClient(trainTicket.client client) {
        this.client = client;
    }

    public Journey getJourney() {
        return journey;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    public trainTicket.seat getSeat() {
        return seat;
    }

    public void setSeat(trainTicket.seat seat) {
        this.seat = seat;
    }
}
