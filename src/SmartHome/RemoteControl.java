package SmartHome;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int pos, Command onCommand, Command offCommand) {
            onCommands[pos] = onCommand;
            offCommands[pos] = offCommand;
    }

    public void pressOnButton(int pos) {
        onCommands[pos].execute();
        undoCommand = onCommands[pos];
    }

    public void pressOffButton(int pos) {
        offCommands[pos].execute();
        undoCommand = offCommands[pos];
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
                stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
