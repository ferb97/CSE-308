public class PartiallyDown implements State{

    private String name;

    public PartiallyDown(){
        name="Partially down";
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