import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class KeyboardTest {
    Keyboard keyboard;


    @Before
    public void before(){
        keyboard = new Keyboard("logitech", "k6", "wired");
    }

    @Test
    public void canPressEnter(){
        assertEquals("pressed Enter", keyboard.enter());
    }

    @Test
    public void canSendData(){
        assertEquals("now sending words", keyboard.inputData("words"));
    }
}
