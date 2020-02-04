import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void canTune(){
        assertEquals("You are tuned to Clyde 1", radio.tune("Clyde 1"));
    }
}
