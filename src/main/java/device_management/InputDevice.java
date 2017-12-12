package device_management;

public abstract class InputDevice {

    private String make;
    private String model;

    public InputDevice(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String sendData(String data){
        return "now sending " + data;
    }
}
