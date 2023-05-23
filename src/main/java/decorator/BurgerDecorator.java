package decorator;

import kitchen.Burger;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BurgerDecorator implements Burger {
    final Burger burger;
    @Override
    public void prepare() {
        burger.prepare();
    }
}
