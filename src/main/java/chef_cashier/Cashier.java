package chef_cashier;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class Cashier {
    private Chef chef;


    public void takeOrder(String order) {
        System.out.println("Cashier taking order");
        Command command = new CreateBurger(order);
        chef.executeCommand(command);
    }
}
