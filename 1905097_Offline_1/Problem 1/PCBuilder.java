interface PCBuilder {
    void setBase();
    void setProcessor() ;
    void setCooler();
    void setDvdDrive();
    void addRam(Ram ram);
    void addGraphicsCard(GraphicsCard graphicsCard);
    PC getPC();
}
