public class Produttore extends Thread{
    private final Buffer buffer;
    private int count;
    public Produttore(Buffer buffer){
        super("Producer");
        this.buffer = buffer;
        count = 0;
    }
    @Override
    public void run() {
        while(true){
            try{
                count++;
                buffer.produce("Messaggio #" + count);
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
