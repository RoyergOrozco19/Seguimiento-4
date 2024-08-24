package Ej3;

public class mainTrainTicketSystem {
    public static void main(String[] args) {
        wagon economyWagon = new wagon("Economy", 100);
        wagon touristWagon = new wagon("Tourist", 50);

        wagon[] wagons = {economyWagon, touristWagon};
        train train = new train(101, "NY - CL", wagons);

        Journey journey = new Journey("2024-08-15", "08:00", "12:00", train);

        client client =new client("Jhonny Deep", "ID001", "998 Main ST", "None");

        seat seat = economyWagon.getSeat(10);
        seat.reserve();
        seat.occupy();

        ticket ticket = new ticket(client, journey, seat);

        System.out.println("Ticket for " + ticket.getClient().getName());
        System.out.println("Journey: " + ticket.getJourney().getDate() + " from " + ticket.getJourney().getDepartureTime() + " to " + ticket.getJourney().getArrivalTime());
        System.out.println("Train Number: " + ticket.getJourney().getTrain().getNumber());
        System.out.println("Seat Number: " + ticket.getSeat().getNumber() + " in " + economyWagon.getType() + " Wagon");
    }
}
