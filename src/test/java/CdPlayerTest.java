import components.CdPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    private CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer("Sony", 1234, 10);
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals(1234, cdPlayer.getModel());
    }

    @Test
    public void hasNumberOfCDs(){
        assertEquals(10, cdPlayer.getCds());
    }

    @Test
    public void canGetNumberOfCdPlaying(){
        assertEquals(0, cdPlayer.getCdPlaying());
    }

    @Test
    public void canChangeCdPlaying(){
        cdPlayer.changeCd();
        cdPlayer.changeCd();
        assertEquals(2, cdPlayer.getCdPlaying());
    }
}
