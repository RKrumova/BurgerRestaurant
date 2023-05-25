package decorator;

import kitchen.Burger;
public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding ketchup on the burger");
    }
}