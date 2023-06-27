package computer_components.basic.enums;

public enum PciExpress {
    PCI_E__2_0("PCI-E 2.0"),
    PCI_E__3_0("PCI-E 3.0"),
    PCI_E__4_0("PCI-E 4.0"),
    PCI_E__5_0("PCI-E 5.0");
    private String name;
    PciExpress(String name){
        this.name = name;
    }
}
