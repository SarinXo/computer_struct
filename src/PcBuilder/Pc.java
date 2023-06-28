package PcBuilder;

import computer_components.basic.Motherboard.Motherboard;
import computer_components.basic.Power.Power;
import computer_components.basic.Processor.Processor;
import computer_components.basic.pc_case.PcCase;
import computer_components.basic.ram.Ram;
import computer_components.basic.rom.Rom;
import computer_components.basic.videocard.VideoCard;

public class Pc {
    private String      name;
    private Motherboard motherboard;
    private PcCase      pcCase;
    private Power       power;
    private Processor   processor;
    private VideoCard   videoCard;
    private Ram         ram;
    private Rom         rom;
    private boolean     isComputerCorrect = false;

    public Pc(String name){ this.name = name;}
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setPcCase(PcCase pcCase) {
        this.pcCase = pcCase;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public void build(){
        checkCorrect();
        if(isComputerCorrect){
            System.out.println(name +" компьютер собран корректно\n");
        }else{
            System.out.println(name +" компьютер неверно собран! Повторите сборку или замените компонент\n");
        }
    }

    private void checkCorrect(){
        if(motherboard == null
            || pcCase == null
            || power == null
            || processor == null
            || ram == null
            || rom == null){
            return;
        }
        if(videoCard == null) {
            if (!processor.isHaveVideoCore()){
                return;}
        }
        if(isMotherboardCorrect() && isPowerEnough()){
            isComputerCorrect = true;
        }
    }

    private boolean isMotherboardCorrect(){
        if(processor.processorSocket() != motherboard.processorSocket())
            return false;
        if(ram.ramType() != motherboard.ramType())
            return false;
        return true;
    }

    private boolean isPowerEnough(){
        int powerInWatt = power.powerInWatt()
                    - motherboard.energyInputInWatt()
                    - processor.energyInputInWatt()
                    - ram.energyInputInWatt()
                    - rom.energyInputInWatt();
        if(videoCard != null)
            powerInWatt -= videoCard.energyInputInWatt();
        return powerInWatt >= 0;
    }
}
