package device_management;

import Behaviours.IInput;

public class Keyboard extends InputDevice implements IInput {
    private String type;

    public Keyboard(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String enter() {
        return "pressed Enter";
    }

    @Override
    public String inputData(String data) {
        return sendData(data);
    }
}
