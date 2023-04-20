public class Parcheggio {
    private int postiDisponibili;

    public Parcheggio(){
        postiDisponibili = 0;
    }

    public synchronized void produce() throws InterruptedException {
        while(postiDisponibili == 20)
            wait();
        postiDisponibili++;
        notifyAll();
    }
    public synchronized void consume() throws InterruptedException{
        while(postiDisponibili == 0)
            wait();
        postiDisponibili--;
        System.out.println(this);
        notifyAll();
    }

    @Override
    public synchronized String toString() {
        return String.valueOf(postiDisponibili);
    }
}
