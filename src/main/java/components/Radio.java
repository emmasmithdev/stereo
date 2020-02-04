package components;

import stereoStuff.IConnect;
import stereoStuff.Stereo;

public class Radio implements IConnect {

    public String tune(String station){
        return "You are tuned to " + station;
    }

    public String connect(Stereo stereo){
        String stereoName = stereo.getName();
        return "Connected to " + stereoName;
    }
}
