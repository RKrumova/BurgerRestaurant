package restaurant;

import chef_cashier.Cashier;
import chef_cashier.Chef;
import decorator.GarlicDecorator;
import decorator.KetchupDecorator;
import kitchen.Burger;
import kitchen.Kitchen;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();
        restaurant.open();

        Kitchen kitchen = new Kitchen();
        Chef chef = new Chef(kitchen);
        Cashier cashier = new Cashier(chef);

        cashier.takeOrder("Classic");

        Burger burger = kitchen.creatingBurger("Classic");
        burger.prepare();

        Burger decoratedBurger = new KetchupDecorator(new GarlicDecorator(burger));
        decoratedBurger.prepare();

        restaurant.close();
    }
}
