package chef_cashier;

import kitchen.Kitchen;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Chef {
    private Kitchen kitchen;

    public void executeCommand(Command command) {
        command.execute();
    }
}
