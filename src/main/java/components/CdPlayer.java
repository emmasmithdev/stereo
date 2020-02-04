package components;

import stereoStuff.IConnect;
import stereoStuff.Stereo;

public class CdPlayer extends Component implements IConnect {

    private int cds;
    private int cdPlaying;

    public CdPlayer(String make, int model, int cds) {
        super(make, model);
        this.cds = cds;
        int cdPlaying = 0;
    }

    public int getCdPlaying() {
        return cdPlaying;
    }

    public int getCds() {
        return cds;
    }

    public void changeCd(){
        this.cdPlaying += 1;
    }

    public String connect(Stereo stereo){
        String stereoName = stereo.getName();
        return "Connected to " + stereoName;
    }

}
