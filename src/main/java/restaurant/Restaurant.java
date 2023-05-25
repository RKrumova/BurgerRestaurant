package restaurant;
//singleton
public class Restaurant {
    private static Restaurant instance;
    private Restaurant(){}

    static Restaurant getInstance() {
        if(instance == null){
            instance = new Restaurant();
        }
        return instance;
    }
    public void open() {
        System.out.println("Restaurant is open!");
    }

    public void close() {
        System.out.println("Restaurant is closed!");
    }
}
