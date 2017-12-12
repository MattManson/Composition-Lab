package device_management;

import Behaviours.IOutput;

public abstract class PrintingDevice implements IOutput{
    private String make;
    private String model;

    public PrintingDevice(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String display(String data) {
        return "now displaying: " + data;
    }
}
