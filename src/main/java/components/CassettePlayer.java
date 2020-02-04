package components;

import stereoStuff.IConnect;
import stereoStuff.Stereo;

public class CassettePlayer extends Component implements IConnect {

    private String tape;

    public CassettePlayer(String make, int model, String tape) {
        super(make, model);
        this.tape = tape;
    }

    public String getTape() {
        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    public void ejectTape(){
        setTape("");
    }

    public String connect(Stereo stereo){
        String stereoName = stereo.getName();
        return "Connected to " + stereoName;
    }
}
