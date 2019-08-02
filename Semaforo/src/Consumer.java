public class Consumer implements Runnable {


    Integer count;
    Producer producer;

    public void setConsumer(Integer count, Producer producer) {
        this.count = count;
        this.producer = producer;
    }

    @Override
    public void run() {

        while(true){
            while(this.count == 0){
                try {
                    System.out.println("Dormindo consumer");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (this.count){
                System.out.println("Count menos menos");
                this.count--;
            }

            if(this.count== 1){
                System.out.println("Notify producer");
                this.producer.notify();
            }

        }
    }
}
