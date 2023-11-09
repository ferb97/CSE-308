interface Server {
    public void addUser(User user);
    public void removeUser(User user);
    public State getState();
    public void setState(State state);
    public void notifyAllUsers();
}
