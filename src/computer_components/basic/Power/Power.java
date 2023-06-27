package computer_components.basic.Power;

import computer_components.basic.enums.ConnectionJack;
import computer_components.basic.enums.PowerFormFactor;

import java.util.Map;

public abstract class Power {
    protected int                           powerInWatt;
    protected PowerFormFactor               powerFormFactor;
    protected Map<ConnectionJack, Integer>  jacks;
}
