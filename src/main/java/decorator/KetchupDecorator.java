package decorator;

import kitchen.Burger;

public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void prepare() {
        super.prepare();
        // Add ketchup to the burger
    }
}