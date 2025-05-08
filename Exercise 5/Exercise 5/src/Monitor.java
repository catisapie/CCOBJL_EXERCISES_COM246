class Monitor {
    public void connect(VGA connector) {
        System.out.println("Monitor expecting VGA connection...");
        connector.connectWithVGA();
        System.out.println("Connected.");
    }
}