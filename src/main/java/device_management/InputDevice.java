package device_management;

public abstract class InputDevice {
    String type;
    int buttons;

    public InputDevice(String type, int buttons) {
        this.type = type;
        this.buttons = buttons;
    }

    public String sendData(String data) {
        return data + " sent to the computer";
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }
}
