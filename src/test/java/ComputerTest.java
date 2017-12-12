import Behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;
    Printer printer;

    @Before
    public void before() {
        printer = new Printer("Epson", "Stylus", 200, 50);
        mouse = new Mouse("wireless", 4);
        keyboard = new Keyboard("wired", 128);
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, mouse);
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
//        assertEquals(22, computer.getO().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice(){
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }


    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(11);
        Computer computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Wub Wub Wub", computer.outputData("Wub Wub Wub"));

    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", printer.outputData("space invaders"));
    }


    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", printer.outputData("space invaders"));
    }


    @Test
    public void canSendDataWithMouse(){
        Mouse mouse = new Mouse("wireless", 4);
        computer = new Computer(8, 512, monitor, mouse);
        assertEquals("Click Click sent to the computer", computer.inputData("Click Click"));
    }

    @Test
    public void canSendDataWithKeyboard(){
        Keyboard keyboard = new Keyboard("wired", 128);
        computer = new Computer(8, 512, monitor, mouse);
        assertEquals("Tap Tap sent to the computer", computer.inputData("Tap Tap"));
    }



}
