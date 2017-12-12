package device_management;

import Behaviours.IInput;

public class Mouse extends InputDevice implements IInput{
    public Mouse(String type, int buttons) {
        super(type, buttons);
    }

    @Override
    public String inputData(String data) {
        return sendData(data);
    }
}
