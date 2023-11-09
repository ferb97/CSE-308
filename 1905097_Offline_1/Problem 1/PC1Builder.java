public class PC1Builder implements PCBuilder{

    private PC pc;

    public PC1Builder(){
        pc = new PC();
    }

    @Override
    public void setBase() {
        pc.setBase(new Base(new CPU(), new Motherboard(), new HardDisk("1 TB"), 70000));
    }

    @Override
    public void setProcessor() {
        pc.setProcessor(new IntelCoreI5());
    }

    @Override
    public void setCooler() {
        pc.setCooler(new RegularCooler());

    }

    @Override
    public void setDvdDrive() {

    }

    @Override
    public void addRam(Ram ram) {
        pc.addRam(ram);
    }

    @Override
    public void addGraphicsCard(GraphicsCard graphicsCard) {
        pc.addGraphicsCard(graphicsCard);
    }

    @Override
    public PC getPC() {
        return pc;
    }
}
