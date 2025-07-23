package SmartHome.Stereos;

import SmartHome.Command;

public class StereoOnWithDVDCommand implements Command {
    Stereo stereo;

    public StereoOnWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        // turn on
        stereo.on();
        // put cd
        stereo.setDVD();
        // increase volume
        stereo.setVolume(15);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
