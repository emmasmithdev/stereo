package stereoStuff;

import stereoStuff.Stereo;

public class Mp3Player implements IConnect {

    public String connect(Stereo stereo){
        String stereoName = stereo.getName();
        return "Connected to " + stereoName;
    }
}
