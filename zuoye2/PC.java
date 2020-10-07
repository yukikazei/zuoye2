package zuoye2;
public class PC {
    CPU cpu;
    HardDisk harddisk;
    void setCPU(CPU cpu){
        this.cpu=cpu;
    }
    void setHardDisk(HardDisk harddisk){
        this.harddisk=harddisk;
    }
    void shuchu(){
        System.out.println("CPU速度"+":"+cpu.getSpeed());
        System.out.println("CPU厂商"+":"+"AMD");
        System.out.println("硬盘容量"+":"+harddisk.getAmount());
    }
}