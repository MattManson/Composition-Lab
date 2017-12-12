import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("corsair", "b8", "wireless", 3);
    }

    @Test
    public void canClick(){
        assertEquals("click", mouse.click());
    }

    @Test
    public void canMove(){
        assertEquals("Mouse moved", mouse.move());
    }

    @Test
    public void canSendData(){
        assertEquals("now sending click", mouse.sendData("click"));
    }
}
