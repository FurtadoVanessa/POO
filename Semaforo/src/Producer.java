public class Producer implements Runnable {

    Integer count;
    Consumer consumer;
    public void setProducer(int count, Consumer consumer) {
        this.count = count;
        this.consumer = consumer;
    }

    @Override
    public void run() {

        while(true){

                while (this.count == 5) {
                    try {
                        System.out.println("Dormindo Produtor");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            synchronized (this.count) {
                System.out.println("Produto incrementa");
                this.count++;
            }
                if (this.count == 1) {
                    System.out.println("Notifica consumidor");
                    this.consumer.notify();
                }


        }
    }
}
