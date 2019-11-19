package TV;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel > 0 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel > 0 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel <= 120)
            channel++;
        else
            channel = 1;
    }

    public void channelDown() {
        if (on && channel >= 1)
            channel--;
        else
            channel = 120;
    }

    public void volumeUp() {
        if (on && volumeLevel != 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel != 1)
            volumeLevel--;
    }
}
