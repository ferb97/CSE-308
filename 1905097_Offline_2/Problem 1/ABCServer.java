import java.util.ArrayList;
import java.util.List;

public class ABCServer implements Server{

    private List<User> userList;
    private State curState;
    private State prevState;
    private int x;

    public ABCServer(){
        userList = new ArrayList<>();
        curState = new Operational();
        prevState = new Operational();
        x = 100;
    }
    @Override
    public State getState(){
        return this.curState;
    }
    @Override
    public void setState(State state){
        this.prevState = this.curState;
        this.curState = state;

        if(this.prevState.getName().equalsIgnoreCase(this.curState.getName()) ){
            System.out.println("Current state has not changed");
        }
        else {
            notifyAllUsers();
        }
    }
    @Override
    public void addUser(User user){
        userList.add(user);
    }
    @Override
    public void removeUser(User user){
        userList.remove(user);
    }
    @Override
    public void notifyAllUsers(){
        //System.out.println("ABC server has changed from " + this.prevState.getName() + " to " + this.curState.getName());

        if(prevState.getName().equalsIgnoreCase("Operational") && curState.getName().equalsIgnoreCase("Partially Down")){
            operationalToPartiallyDown();
        }

        else if(prevState.getName().equalsIgnoreCase("Operational") && curState.getName().equalsIgnoreCase("Fully Down")){
            operationalToFullyDown();
        }

        else if(prevState.getName().equalsIgnoreCase("Partially Down") && curState.getName().equalsIgnoreCase("Operational")){
            partiallyDownToOperational();
        }

        else if(prevState.getName().equalsIgnoreCase("Partially Down") && curState.getName().equalsIgnoreCase("Fully Down")){
            partiallyDownToFullyDown();
        }

        else if(prevState.getName().equalsIgnoreCase("Fully Down") && curState.getName().equalsIgnoreCase("Operational")){
            fullyDownToOperational();
        }

        else if(prevState.getName().equalsIgnoreCase("Fully Down") && curState.getName().equalsIgnoreCase("Partially Down")){
            fullyDownToPartiallyDown();
        }
    }

    public void operationalToPartiallyDown() {
        String premiumUserMsg = "1 - Partial service from ABC Server and partial service from DEF Server\n2 - Full service from DEF Server";
        String regularUserMsg = "1 - Use limited functionality from ABC Server\n2 - Pay $20 to use full functionality from DEF Server";

        for(User user: userList){
            if(user instanceof PremiumUser){
                user.operationalToPartiallyDown(premiumUserMsg);
            }

            else if(user instanceof RegularUser){
                user.operationalToPartiallyDown(regularUserMsg);
            }
        }
    }

    public void operationalToFullyDown() {
        String premiumUserMsg = "Data has been shifted from ABC Server to DEF Server";
        String regularUserMsg = "1 - Do nothing\n2 - Pay $20 to use full functionality from DEF Server";

        for(User user: userList){
            if(user instanceof PremiumUser){
                user.operationalToFullyDown(premiumUserMsg);
            }

            else if(user instanceof RegularUser){
                user.operationalToFullyDown(regularUserMsg);
            }
        }
    }

    public void partiallyDownToOperational(){

        for(User user: userList){
            String regularUserMsg = "";
            String premiumUserMsg = "";
            if(user instanceof PremiumUser){
                if(user.getCurServer().equalsIgnoreCase(User.DEF_SERVER)) {
                    premiumUserMsg = "Data has been shifted from DEF Server to ABC Server";
                }
                user.partiallyDownToOperational(premiumUserMsg);
            }

            else if(user instanceof RegularUser){
                if(user.getCurServer().equalsIgnoreCase("DEF")){
                    regularUserMsg = "Data has been shifted from DEF Server to ABC Server\nYour total bill is $" + x + " dollar for using the DEF Server";
                }
                user.partiallyDownToOperational(regularUserMsg);
            }
        }
    }

    public void partiallyDownToFullyDown(){

        for(User user: userList){
            String premiumUserMsg = "";
            String regularUserMsg = "";
            if(user instanceof PremiumUser){

                if(user.getCurServer().equalsIgnoreCase("ABC")){
                    premiumUserMsg = "Data has been shifted from ABC Server to DEF Server";
                }
                user.partiallyDownToFullyDown(premiumUserMsg);
            }

            else if(user instanceof RegularUser){
                user.partiallyDownToFullyDown(regularUserMsg);
            }
        }
    }

    public void fullyDownToOperational(){

        for(User user: userList){
            String regularUserMsg = "";
            String premiumUserMsg = "Data has been shifted from DEF Server to ABC Server";
            if(user instanceof PremiumUser){
                user.fullyDownToOperational(premiumUserMsg);
            }

            else if(user instanceof RegularUser){
                if(user.getCurServer().equalsIgnoreCase("DEF")){
                    regularUserMsg = "Data has been shifted from DEF Server to ABC Server\nYour total bill is $" + x + " dollar for using the DEF Server";
                }
                user.fullyDownToOperational(regularUserMsg);
            }
        }
    }

    public void fullyDownToPartiallyDown(){
        for(User user: userList){
            if(user instanceof PremiumUser){
                user.fullyDownToPartiallyDown();
            }

            else if(user instanceof RegularUser){
                user.fullyDownToPartiallyDown();
            }
        }
    }

}
