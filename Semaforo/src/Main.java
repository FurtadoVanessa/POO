public class Main {
    public static void main(String a[]){
        Producer p = new Producer();
        Consumer c = new Consumer();


        ThreadMo
        Integer valor = 2;

        Thread tConsumer = new Thread(c);
        Thread tProducer = new Thread(p);
        c.setConsumer(valor, p);
        p.setProducer(valor, c);


        tConsumer.start();
        tProducer.start();




    }
}
