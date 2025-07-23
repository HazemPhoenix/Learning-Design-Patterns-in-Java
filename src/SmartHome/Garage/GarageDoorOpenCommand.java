package SmartHome.Garage;

import SmartHome.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor GD;

    public GarageDoorOpenCommand(GarageDoor GD) {
        this.GD = GD;
    }

    public void execute() {
        GD.up();
    }

    @Override
    public void undo() {
        GD.down();
    }
}
