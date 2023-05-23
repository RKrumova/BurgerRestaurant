package restaurant;
//singleton
public class Restaurant {
    private static Restaurant instance;
    private Restaurant(){}

    private static Restaurant getInstance() {
        if(instance == null){
            instance = new Restaurant();
        }
        return instance;
    }
}
