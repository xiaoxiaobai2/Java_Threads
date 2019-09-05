package Demo05_locked;

public class Thread02 implements Runnable{
    Object money;
    Object goods;

    public Thread02(Object money, Object goods) {
        this.money = money;
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            synchronized (goods){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (money){

                }
            }
            System.out.println("一手给货一手给钱！");
        }
    }
}
