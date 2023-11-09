public class PC3Builder implements PCBuilder{

    private PC pc;

    public PC3Builder(){
        pc = new PC();
    }

    @Override
    public void setBase() {
        pc.setBase(new Base(new CPU(), new Motherboard(), new HardDisk("1 TB"), 70000));
    }

    @Override
    public void setProcessor() {
        pc.setProcessor(new IntelCoreI9());
    }

    @Override
    public void setCooler() {

    }

    @Override
    public void setDvdDrive() {
        pc.setDvdDrive(new RegularDvdDrive());
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
