class VGAtoHDMI implements VGA {
    private HDMI HDMI;

    public VGAtoHDMI(HDMI hdmi) {
        this.HDMI = hdmi;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Using adapter to connect...");
        HDMI.connectWithHDMI();
    }
}