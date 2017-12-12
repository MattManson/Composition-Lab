package device_management;

public class TypeWriter extends PrintingDevice {

    public TypeWriter(String make, String model) {
        super(make, model);
    }

    @Override
    public String outputData(String data) {
        return null;
    }
}
