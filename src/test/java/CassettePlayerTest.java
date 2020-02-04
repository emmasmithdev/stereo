import components.CassettePlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {

    private CassettePlayer cassettePlayer;

    @Before
    public void before(){
        cassettePlayer = new CassettePlayer("Toshiba", 5678, "Vengaboys");
    }

    @Test
    public void hasMake(){
        assertEquals("Toshiba", cassettePlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals(5678, cassettePlayer.getModel());
    }

    @Test
    public void hasTape(){
        assertEquals("Vengaboys", cassettePlayer.getTape());
    }

    @Test
    public void canChangeTape(){
        cassettePlayer.setTape("2Unlimited");
        assertEquals("2Unlimited", cassettePlayer.getTape());
    }

    @Test
    public void canEjectTape(){
        cassettePlayer.ejectTape();
        assertEquals("", cassettePlayer.getTape());
    }
}
