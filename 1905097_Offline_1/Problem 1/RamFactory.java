public class RamFactory {

    public Ram getRam(String str){
        if(str.equalsIgnoreCase("2666 MHz")){
            return new MHz2666Ram();
        }
        else if(str.equalsIgnoreCase("3200 MHz")){
            return new MHz3200Ram();
        }
        else{
            return null;
        }
    }
}
