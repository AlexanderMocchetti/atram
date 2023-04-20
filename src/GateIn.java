public class GateIn extends Thread{
    private final Parcheggio parcheggio;
    public GateIn(Parcheggio parcheggio){
        super("Producer");
        this.parcheggio = parcheggio;
        Thread st = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("lao");
            }
        }){
            @Override
            public void run(){
                System.out.println("lolge");
            }
            public static void summary(){
                System.out.println("fsgf");
            }
        };
    }

    @Override
    public void run() {
        while(true){
            try{
                synchronized (parcheggio){
                    parcheggio.produce();
                }
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
