package chef_cashier;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CreateBurger implements Command{
    private String order;
    @Override
    public void execute() {
        System.out.println("Prepere the burger ");
    }
}
