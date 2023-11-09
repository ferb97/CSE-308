public class CoolerFactory {

    public Cooler getCooler(String str){
        if(str.equalsIgnoreCase("PC1")){
            return new RegularCooler();
        }
        else if(str.equalsIgnoreCase("PC2")){
            return new LiquidCooler();
        }
        else{
            return null;
        }
    }
}
