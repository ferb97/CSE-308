public class ProcessorFactory {

    public Processor getProcessor(String str){
        if(str.equalsIgnoreCase("PC1")){
            return new IntelCoreI5();
        }
        else if(str.equalsIgnoreCase("PC2")){
            return new IntelCoreI7();
        }
        else if(str.equalsIgnoreCase("PC3")){
            return new IntelCoreI9();
        }
        else if(str.equalsIgnoreCase("GamingPC")){
            return new AMDRyzen();
        }
        else{
            return null;
        }
    }
}
