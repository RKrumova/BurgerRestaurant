package kitchen;

public class Kitchen {

    public Burger creatingBurger(String burgerType){
        if (burgerType.equalsIgnoreCase("royal")) {
            return new RoyalBurger();
        } else if (burgerType.equalsIgnoreCase("classic")) {
            return new ClassicBurger();
        } else if (burgerType.equalsIgnoreCase("vegetarian")) {
            return new VegetarianBurger();
        } else {
            return null;
        }
    }
}

