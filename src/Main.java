import PcBuilder.Pc;
import computer_components.basic.Motherboard.models.AsRockZ690;
import computer_components.basic.Motherboard.models.Gigabyte_B550;
import computer_components.basic.Power.models.MontechBeta700;
import computer_components.basic.Processor.models.AmdRyzen7_5700G;
import computer_components.basic.pc_case.models.Ador500;
import computer_components.basic.ram.models.AdataXpgGammixD45;
import computer_components.basic.rom.models.ToshibaDt01;
import computer_components.basic.videocard.models.GigabyteGeForceRtx3060;

public class Main {
    public static void main(String[] args) {
        Pc pc1 = new Pc("Компьютер 1");
        pc1.setMotherboard(new Gigabyte_B550());
        pc1.setPower(new MontechBeta700());
        pc1.setPcCase(new Ador500());
        pc1.setProcessor(new AmdRyzen7_5700G());
        pc1.setRam(new AdataXpgGammixD45());
        pc1.setRom(new ToshibaDt01());
        pc1.setVideoCard(new GigabyteGeForceRtx3060());
        pc1.build();

        Pc pc2 = new Pc("Компьютер 2");
        pc2.setMotherboard(new AsRockZ690());
        pc2.setPower(new MontechBeta700());
        pc2.setPcCase(new Ador500());
        pc2.setProcessor(new AmdRyzen7_5700G());
        pc2.setRam(new AdataXpgGammixD45());
        pc2.setRom(new ToshibaDt01());
        pc2.setVideoCard(new GigabyteGeForceRtx3060());
        pc2.build();
    }
}