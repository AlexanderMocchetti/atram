public class Main {
    public static void main(String[] args) {
        Thread gateIn, gateOut;
        Parcheggio parcheggio = new Parcheggio();
        gateIn = new GateIn(parcheggio);
        gateOut = new GateOut(parcheggio);
        gateIn.start();
        gateOut.start();
    }
}