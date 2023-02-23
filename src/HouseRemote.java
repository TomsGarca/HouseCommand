import java.util.HashMap;
import java.util.Map;

public class HouseRemote {
    private Map<String, Command> commands = new HashMap<>();
    public void setCommand(String button, Command command) {
        commands.put(button, command);
    }
    public void pressButton(String button) {
        if (commands.containsKey(button)) {
            commands.get(button).execute();
        } else {
            System.out.println("No command for button " + button);
        }
    }
}
