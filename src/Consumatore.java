public class Consumatore extends Thread{
    private final Buffer buffer;
    public Consumatore(Buffer buffer){
        super("Consumer");
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while (true){
            try{
                buffer.consume();
                sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
