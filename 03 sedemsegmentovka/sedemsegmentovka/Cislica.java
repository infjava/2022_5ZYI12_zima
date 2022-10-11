public class Cislica {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    private Bodka bodkaHore;
    private Bodka bodkaDole;
    
    public Cislica(int x, int y) {
        this.segmentA = new Segment(5 + x, 0 + y, 19, 5);
        this.segmentB = new Segment(24 + x, 5 + y, 5, 19);
        this.segmentC = new Segment(24 + x, 29 + y, 5, 19);
        this.segmentD = new Segment(5 + x, 48 + y, 19, 5);
        this.segmentE = new Segment(0 + x, 29 + y, 5, 19);
        this.segmentF = new Segment(0 + x, 5 + y, 5, 19);
        this.segmentG = new Segment(5 + x, 24 + y, 19, 5);
        
        this.bodkaDole = new Bodka(12 + x, 36 + y, 5);
        this.bodkaHore = new Bodka(12 + x, 12 + y, 5);
    }
    
    public void zobraz(char znak) {
        switch (znak) {
            case '0':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zasviet();
                this.segmentG.zhasni();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '1':
                this.segmentA.zhasni();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '2':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zhasni();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zhasni();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '3':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '4':
                this.segmentA.zhasni();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '5':
                this.segmentA.zasviet();
                this.segmentB.zhasni();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zhasni();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '6':
                this.segmentA.zasviet();
                this.segmentB.zhasni();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '7':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '8':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '9':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zhasni();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
            case '.':
                this.segmentA.zhasni();
                this.segmentB.zhasni();
                this.segmentC.zhasni();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                this.bodkaDole.zasviet();
                this.bodkaHore.zhasni();
                break;
            case ':':
                this.segmentA.zhasni();
                this.segmentB.zhasni();
                this.segmentC.zhasni();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                this.bodkaDole.zasviet();
                this.bodkaHore.zasviet();
                break;
            default:
                this.segmentA.zhasni();
                this.segmentB.zhasni();
                this.segmentC.zhasni();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                this.bodkaDole.zhasni();
                this.bodkaHore.zhasni();
                break;
        }
    }
}
