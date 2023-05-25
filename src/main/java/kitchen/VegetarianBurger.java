package kitchen;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class VegetarianBurger  implements Burger{
    @Override
    public void prepare() {
        System.out.println("Making Vegetarian Burger");

    }
}
