public enum TypBlokuVlaku {
    RUSEN("pics/vlak.png"),
    VAGON_ZELENY("pics/vagon03.png"),
    VAGON_MODRY("pics/vagon01.png"),
    VAGON_CERVENY("pics/vagon02.png");
    
    private final String cestaKObrazku;
    
    TypBlokuVlaku(String cestaKObrazku) {
        this.cestaKObrazku = cestaKObrazku;
    }
    
    public String getCestaKObrazku() {
        return this.cestaKObrazku;
    }
}
