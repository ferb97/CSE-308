public abstract class User {
    public static final String ABC_SERVER = "ABC";
    public static final String DEF_SERVER = "DEF";
    public static int ID;
    protected Server server;
    protected String curServer;
    protected int userID;

    public void setCurServer(String str){
        this.curServer = str;
    }

    public String getCurServer(){
        return this.curServer;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public int getUserID(){
        return this.userID;
    }

    public abstract void operationalToPartiallyDown(String msg);
    public abstract void operationalToFullyDown(String msg);
    public abstract void partiallyDownToOperational(String msg);
    public abstract void partiallyDownToFullyDown(String msg);
    public abstract void fullyDownToOperational(String msg);
    public abstract void fullyDownToPartiallyDown();
}
