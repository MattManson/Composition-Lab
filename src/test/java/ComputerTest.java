import Behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;


    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, keyboard);
        keyboard = new Keyboard("logitech", "k6", "wired");
        mouse = new Mouse("corsair", "b8", "wireless", 3);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }
    @Test
    public void hasOutputDevice(){
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputSpeaker(){
        Speaker speaker =new Speaker(11);
        computer = new Computer(8, 512, speaker, keyboard);
        assertEquals("playing: beep boop", computer.outputData("beep boop"));
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutPutDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, keyboard);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("epson", "stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canInputDataViaKeyboard(){
        Keyboard keyboard = new Keyboard("logitech", "k6", "wired");
        Computer computer = new Computer(8, 512, monitor, keyboard);
        assertEquals("now sending words", computer.inputData("words"));
    }
}
