import java.util.ArrayList;

public class Buffer {
    private ArrayList<String> list;
    private final int BUFFER_MAX_SIZE;

    public Buffer(int bufferMaxSize){
        list = new ArrayList<>();
        BUFFER_MAX_SIZE = bufferMaxSize;
    }

    public synchronized void produce(String string) throws InterruptedException {
        while(list.size() == BUFFER_MAX_SIZE)
            wait();
        list.add(string);
        notifyAll();
    }
    public synchronized void consume() throws InterruptedException{
        while(list.size() == 0)
            wait();
        String string = list.remove(0);
        System.out.println(string);
        notifyAll();
    }
}
