package com.company.command.stereo;

import com.company.command.Command;

/**
 * Created by oleg on 22.06.15.
 */
public class StereoOffCommand implements Command{
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
