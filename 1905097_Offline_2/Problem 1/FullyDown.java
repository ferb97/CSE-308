public class FullyDown implements State{

    private String name;

    public FullyDown(){
        name="Fully down";
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}