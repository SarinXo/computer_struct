package computer_components.basic.enums;

public enum ProcessorSocket {
    LGA_1151("LGA 1151"),
    LGA_1151_V2("LGA 1151-v2"),
    LGA_1200("LGA 1200"),
    LGA_1700("LGA 1700"),
    LGA_2066("LGA 2066"),
    AM3_PLUS("AM3+"),
    AM4("AM4"),
    AM5("AM5"),
    TR4("TR4"),
    sTRX4("sTRX4"),
    sWRX8("sWRX8");
    private String socketName;
    ProcessorSocket(String name){
        this.socketName = name;
    }
}
