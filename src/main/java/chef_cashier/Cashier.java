package chef_cashier;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cashier {
    private Chef chef;
    public void takeOrder(String order) {
        Command command = new CreateBurger(order);
        chef.executeCommand(command);
    }
}
