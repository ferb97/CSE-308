public class Base {

    private CPU cpu;
    private Motherboard motherboard;
    private HardDisk hardDisk;
    private int basePrice;

    public Base(CPU cpu, Motherboard motherboard, HardDisk hardDisk, int basePrice){
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.hardDisk = hardDisk;
        this.basePrice = basePrice;
    }

    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }

    public void setMotherboard(Motherboard motherboard){
        this.motherboard = motherboard;
    }

    public void setHardDisk(HardDisk hardDisk){
        this.hardDisk = hardDisk;
    }

    public void setBasePrice(int basePrice){
        this.basePrice = basePrice;
    }

    public CPU getCPU(){
        return this.cpu;
    }

    public Motherboard getMotherboard(){
        return this.motherboard;
    }

    public HardDisk getHardDisk(){
        return this.hardDisk;
    }

    public int getBasePrice(){
        return this.basePrice;
    }
}
