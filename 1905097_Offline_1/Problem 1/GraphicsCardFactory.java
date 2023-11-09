public class GraphicsCardFactory {

    public GraphicsCard getGraphicsCard(String str){
        if(str.equalsIgnoreCase("2 GB")){
            return new TwoGBGraphicsCard();
        }
        else if(str.equalsIgnoreCase("4 GB")){
            return new FourGBGraphicsCard();
        }
        else{
            return null;
        }
    }
}
