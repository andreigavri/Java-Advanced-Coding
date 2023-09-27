package ro.sda._1_oop._4_composition;

public class PC {
private Case theCase;
private Monitor theMonitor;
private Motherboard theMotherbord;

    public PC(Case c, Monitor  m, Motherboard mth) {
        this.theCase = c;
        this.theMonitor = m;
        this.theMotherbord = mth;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        this.drawLogo();

    }

    private void drawLogo(){
        theMonitor.drawPixelAt(1200,50,"green");
    }
}

