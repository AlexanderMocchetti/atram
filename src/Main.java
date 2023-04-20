public class Main {
    public static void main(String[] args) {
        Thread produttore, consumatore;
        Buffer buffer = new Buffer(20);
        produttore = new Produttore(buffer);
        consumatore = new Consumatore(buffer);
        produttore.start();
        consumatore.start();
    }
}