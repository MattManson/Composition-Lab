package device_management;

public class Mouse extends InputDevice {
    private String type;
    private int numKeys;

    public Mouse(String make, String model, String type, int numKeys) {
        super(make, model);
        this.type = type;
        this.numKeys = numKeys;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    public String click() {
        return "click";
    }

    public String move() {
        return "Mouse moved";
    }


}
