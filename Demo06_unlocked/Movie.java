package Demo06_unlocked;
/**
  * @author:  Zhang
  * @description:
  *
  * 资源    保证线程安全，同时防止死锁的发生
 *          红绿灯的方式解决死锁  设置标志位
 *          生产者生产时，消费者等待
 *          消费者消费时，生产者等待
 **/
public class Movie {
    private String pic;
    private boolean flag=true;  //真：生产者生产，消费者等待；假消费者消费，生产者等待

    public synchronized void watch(){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //开始消费
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(pic);
        //唤醒其他线程
        notify();//通知一个线程重新判断条件，不知道通知哪一个
        //已消费置位真
        flag=true;
    }

    public synchronized void play(String pic){
        if(!flag){
            //假，生产者等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //开始生产
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.pic=pic;
        //唤醒其他线程
        notifyAll();//唤醒其他所有线程重新检查条件
        //已生产，置为假
        flag=false;
    }
}
