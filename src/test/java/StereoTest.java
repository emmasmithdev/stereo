import components.CassettePlayer;
import components.CdPlayer;
import components.Radio;
import org.junit.Before;
import org.junit.Test;
import stereoStuff.Stereo;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private CassettePlayer cassettePlayer;
    private CdPlayer cdPlayer;
    private Radio radio;

    @Before
    public void before(){
        cassettePlayer = new CassettePlayer("Toshiba", 5678, "Vengaboys");
        cdPlayer = new CdPlayer("Sony", 1234, 10);
        radio = new Radio();
        stereo = new Stereo("Bob the stereoStuff.Stereo", radio, cdPlayer, cassettePlayer);
    }

    @Test
    public void hasName(){
        assertEquals("Bob the stereoStuff.Stereo", stereo.getName());
    }

    @Test
    public void hasCassettePlayer(){
        assertEquals(cassettePlayer, stereo.getCassettePlayer());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void hasCdPlayer(){
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("You are tuned to Clyde 1", stereo.getRadio().tune("Clyde 1"));
    }

    @Test
    public void canPlayCd(){
        assertEquals("Playing a choon", stereo.getCdPlayer().play());
    }
}
