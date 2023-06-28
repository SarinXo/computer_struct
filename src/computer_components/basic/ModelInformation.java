package computer_components.basic;

public abstract class ModelInformation{
    protected String       serialNumber;
    protected String       manufacturer;


    public ModelInformation(String serialNumber, String manufacturer) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;

    }

}
