package SmartHome.Stereos;

import SmartHome.Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        // turn on
        stereo.on();
        // put cd
        stereo.setCD();
        // increase volume
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
