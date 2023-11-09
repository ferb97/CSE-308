public class PCBuilderFactory {

    public PCBuilder getPCBuilder(String str){
        if(str.equalsIgnoreCase("PC1")){
            return new PC1Builder();
        }
        else if(str.equalsIgnoreCase("PC2")){
            return new PC2Builder();
        }
        else if(str.equalsIgnoreCase("PC3")){
            return new PC3Builder();
        }
        else if(str.equalsIgnoreCase("Gaming PC")){
            return new GamingPCBuilder();
        }
        else{
            return null;
        }
    }
}
