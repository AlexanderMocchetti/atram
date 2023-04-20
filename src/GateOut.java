import java.util.Collections;

public class GateOut extends Thread{
    private final Parcheggio parcheggio;
    public GateOut(Parcheggio parcheggio){
        super("Consumer");
        this.parcheggio = parcheggio;
    }

    @Override
    public void run() {
        while (true){
            try{
                synchronized (parcheggio){
                    parcheggio.consume();
                }
                sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
