package computer_components.basic.Power;

import computer_components.basic.ModelInformation;

public abstract class Power extends ModelInformation {
    protected int   powerInWatt;

    public Power(String serialNumber, String manufacturer,
                 int powerInWatt) {
        super(serialNumber, manufacturer);
        this.powerInWatt = powerInWatt;

    }

    public int powerInWatt() {
        return powerInWatt;
    }
}
