public class DvdDriveFactory {

    public DvdDrive getDvdDrive(String str){
        if(str.equalsIgnoreCase("PC3")){
            return new RegularDvdDrive();
        }
        else{
            return null;
        }
    }
}
