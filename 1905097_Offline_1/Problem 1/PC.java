import java.util.ArrayList;
import java.util.List;

public class PC {

    private Base base;
    private Processor processor;
    private Cooler cooler;
    private DvdDrive dvdDrive;
    private List<Ram> addedRam;
    private List<GraphicsCard> addedGraphicsCard;


    public PC() {
        base = null;
        processor = null;
        cooler = null;
        dvdDrive = null;
        addedRam = new ArrayList<>();
        addedGraphicsCard = new ArrayList<>();
    }

    public void setBase(Base base){
        this.base = base;
    }

    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public void setCooler(Cooler cooler){
        this.cooler = cooler;
    }

    public void setDvdDrive(DvdDrive dvdDrive){
        this.dvdDrive = dvdDrive;
    }

    public Base getBase(){
        return base;
    }

    public Processor getProcessor(){
        return processor;
    }

    public Cooler getCooler(){
        return cooler;
    }

    public DvdDrive getDvdDrive(){
        return dvdDrive;
    }

    public void addRam(Ram ram){
        addedRam.add(ram);
    }

    public void addGraphicsCard(GraphicsCard graphicsCard){
        addedGraphicsCard.add(graphicsCard);
    }

    public List<Ram> getAddedRam(){
        return addedRam;
    }

    public List<GraphicsCard> getAddedGraphicsCard(){
        return addedGraphicsCard;
    }

    public int getPCBasePrice(){
        return base.getBasePrice();
    }

    public int getPCTotalPrice(){
        int totalPrice = base.getBasePrice();
        totalPrice += processor.getPrice();

        if(cooler != null){
            totalPrice += cooler.getPrice();
        }
        if(dvdDrive != null){
            totalPrice += dvdDrive.getPrice();
        }

        for(int i = 0; i < addedRam.size(); i++){
            totalPrice += addedRam.get(i).getPrice();
        }

        for(int i = 0; i < addedGraphicsCard.size(); i++){
            totalPrice += addedGraphicsCard.get(i).getPrice();
        }

        return totalPrice;
    }

    public void print(){
        System.out.println("HardDisk: " + base.getHardDisk().getName());
        System.out.println("Base Price: " + getPCBasePrice());
        System.out.println("Processor: " + processor.getName());
        if(cooler != null){
            System.out.println("Cooler: " + cooler.getName());
        }
        if(dvdDrive != null){
            System.out.println("Dvd Drive: " + dvdDrive.getName());
        }
        if(addedRam.size() > 0){
            System.out.println("Added Ram: ");
            for(int i = 0; i < addedRam.size(); i++){
                System.out.println(addedRam.get(i).getName() + " " + addedRam.get(i).getSpeed());
            }
        }
        if(addedGraphicsCard.size() > 0){
            System.out.println("Added Graphics Card: ");
            for(int i = 0; i < addedGraphicsCard.size(); i++){
                System.out.println(addedGraphicsCard.get(i).getName());
            }
        }
        System.out.println("Total Price: " + getPCTotalPrice());

    }

}
