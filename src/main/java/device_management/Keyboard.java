package device_management;

import Behaviours.IInput;

public class Keyboard extends InputDevice implements IInput{


    public Keyboard(String type, int buttons) {
        super(type, buttons);
    }

    public String inputData(String data) {
        return data;
    }
}
