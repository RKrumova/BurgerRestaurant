package chef_cashier;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class CreateBurger implements Command{
    private String order;

    @Override
    public void execute() {
        //something
    }
}
