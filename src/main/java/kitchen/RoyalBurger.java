package kitchen;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class RoyalBurger  implements Burger{

    @Override
    public void prepare() {
        System.out.println("Making Royal Burger");
    }
}
