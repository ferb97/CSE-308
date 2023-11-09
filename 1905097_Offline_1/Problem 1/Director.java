public class Director {

    PCBuilder myPCBuilder;

    public void construct(PCBuilder pcBuilder){
        this.myPCBuilder = pcBuilder;
        myPCBuilder.setBase();
        myPCBuilder.setProcessor();
        myPCBuilder.setCooler();
        myPCBuilder.setDvdDrive();
    }

    public void addRamPC(Ram ram){
        myPCBuilder.addRam(ram);
    }

    public void addGraphicsCardPC(GraphicsCard graphicsCard){
        myPCBuilder.addGraphicsCard(graphicsCard);
    }
}
