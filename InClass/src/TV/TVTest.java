package TV;

import junit.framework.TestCase;

public class TVTest extends TestCase {

    public void testTurnOn() {
        TV tv = new TV();

        tv.turnOn();

        assertEquals(true, tv.on);
    }

    public void testTurnOff() {
        TV tv = new TV();

        tv.turnOn();

        tv.turnOff();

        assertEquals(false, tv.on);
    }

    public void testSetChannel() {
        TV tv = new TV();

        tv.turnOn();
        tv.setChannel(100);

        assertEquals(100, tv.channel);
    }

    public void testSetVolume() {
        TV tv = new TV();

        tv.turnOn();
        tv.setVolume(5);

        assertEquals(5, tv.volumeLevel);
    }

    public void testChannelUp() {
        TV tv = new TV();

        tv.turnOn();
        tv.channelUp();

        assertEquals(2, tv.channel);
    }

    public void testChannelDown() {
        TV tv = new TV();

        tv.turnOn();
        tv.setChannel(5);
        tv.channelDown();

        assertEquals(4, tv.channel);
    }

    public void testVolumeUp() {
        TV tv = new TV();

        tv.turnOn();
        tv.volumeUp();

        assertEquals(2, tv.volumeLevel);
    }

    public void testVolumeDown() {
        TV tv = new TV();

        tv.turnOn();
        tv.setVolume(4);
        tv.volumeDown();

        assertEquals(3, tv.volumeLevel);
    }
}