package computer_components.basic.ram.models;

import computer_components.basic.ram.Ram;

import static computer_components.basic.enums.RamType.DDR4;

public class AdataXpgGammixD45 extends Ram {
    public AdataXpgGammixD45(){
        super(
                "AX4U32008G16A",
                "ADATA",
                DDR4,
                16,
                10
        );
    }
}
