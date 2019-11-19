package TV;

import junit.framework.TestCase;

public class TVTest extends TestCase {

    public void testTurnOn() {
        TV tv = new TV();

        tv.turnOn();

        assertEquals(tv.on, true);
    }

    public void testTurnOff() {
        TV tv = new TV();

        tv.turnOn();

        tv.turnOff();

        assertEquals(tv.on, false);
    }

    public void testSetChannel() {
        TV tv = new TV();

        tv.turnOn();
        tv.setChannel(100);

        assertEquals(tv.channel, 100);
    }

    public void testSetVolume() {
        TV tv = new TV();

        tv.turnOn();
        tv.setVolume(5);

        assertEquals(tv.volumeLevel, 5);
    }

    public void testChannelUp() {
        TV tv = new TV();

        tv.turnOn();
        tv.channelUp();

        assertEquals(tv.channel, 2);
    }

    public void testChanneldown() {
        TV tv = new TV();

        tv.turnOn();
        tv.setChannel(5);
        tv.channeldown();

        assertEquals(tv.channel, 4);
    }

    public void testVolumeUp() {
        TV tv = new TV();

        tv.turnOn();
        tv.volumeUp();

        assertEquals(tv.volumeLevel, 2);
    }

    public void testVolumeDown() {
        TV tv = new TV();

        tv.turnOn();
        tv.setVolume(4);
        tv.volumeDown();

        assertEquals(tv.volumeLevel, 3);
    }
}