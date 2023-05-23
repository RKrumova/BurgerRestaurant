package decorator;

import kitchen.Burger;

public class GarlicDecorator extends BurgerDecorator {
    public GarlicDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void prepare() {
        super.prepare();
        // Add ketchup to the burger
    }
}