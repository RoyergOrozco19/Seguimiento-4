package Ej3;

public class train {
    private int number;
    private String route;
    private wagon[] wagons;

    public train(int number, String route, wagon[] wagons){
        this.number = number;
        this.route = route;
        this.wagons = wagons;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public wagon getWagon(String type) {
        for(wagon wagon : wagons) {
            if (wagon.getType().equalsIgnoreCase(type)) {
                return wagon;
            }
        }
        System.out.println("Wagon of specified type not found.");
        return null;
    }
}
