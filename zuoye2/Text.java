package zuoye2;
public class Text {
    public static void main(String args[]){
        CPU cpu =new CPU();
        cpu.setSpeed(2200);
        HardDisk harddisk=new HardDisk();
        harddisk.setAmount(200);
        PC pc=new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(harddisk);
        pc.shuchu();
    }
}