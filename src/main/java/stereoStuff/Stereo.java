package stereoStuff;

import components.CassettePlayer;
import components.CdPlayer;
import components.Radio;

public class Stereo {

    private String name;
    private Radio radio;
    private CdPlayer cdPlayer;
    private CassettePlayer cassettePlayer;

    public Stereo(String name, Radio radio, CdPlayer cdPlayer, CassettePlayer cassettePlayer) {
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.cassettePlayer = cassettePlayer;
    }

    public String getName() {
        return name;
    }

    public Radio getRadio() {
        return radio;
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public CassettePlayer getCassettePlayer() {
        return cassettePlayer;
    }
}
