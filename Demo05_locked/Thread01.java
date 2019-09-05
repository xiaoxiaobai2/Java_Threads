package Demo05_locked;

public class Thread01 implements Runnable{
    Object money;
    Object goods;

    public Thread01(Object money, Object goods) {
        this.money = money;
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            synchronized (money){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (goods){

                }
            }
            System.out.println("一手给钱收给货！");
        }
    }
}
