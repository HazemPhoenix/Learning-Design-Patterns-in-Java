package SmartHome.Garage;

import SmartHome.Command;

public class GarageDoorCloseCommand implements Command {
    GarageDoor GD;

    public GarageDoorCloseCommand(GarageDoor GD) {
        this.GD = GD;
    }

    public void execute() {
        GD.down();
    }

    @Override
    public void undo() {
        GD.up();
    }
}
