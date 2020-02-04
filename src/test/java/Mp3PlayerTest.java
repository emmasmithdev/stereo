import components.CassettePlayer;
import components.CdPlayer;
import components.Radio;
import org.junit.Before;
import org.junit.Test;
import stereoStuff.Mp3Player;
import stereoStuff.Stereo;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    private Stereo stereo;
    private CassettePlayer cassettePlayer;
    private CdPlayer cdPlayer;
    private Radio radio;
    private Mp3Player mp3Player;

    @Before
    public void before(){
        cassettePlayer = new CassettePlayer("Toshiba", 5678, "Vengaboys");
        cdPlayer = new CdPlayer("Sony", 1234, 10);
        radio = new Radio();
        stereo = new Stereo("Bob the stereoStuff.Stereo", radio, cdPlayer, cassettePlayer);
        mp3Player = new Mp3Player();
    }

    @Test
    public void canConnectToStereo(){
        assertEquals("Connected to Bob the stereoStuff.Stereo", mp3Player.connect(stereo));
    }
}
