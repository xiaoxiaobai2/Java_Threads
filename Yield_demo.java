/**
  * @author:  Zhang
  * @description:
  *
  *  暂停当前线程让别人执行
 **/
public class Yield_demo extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Yield_demo yield_demo=new Yield_demo();
        yield_demo.start();
        for (int i=1;i<10000;i++){
            if (i%50==0){
                Thread.yield();//暂停当前线程,让别人运行
            }
            System.out.println("主线程进行中22222222222 "+  "  " +i);
        }

    }
    @Override
    public void run() {
        for (int i=1;i<10000;i++)
            System.out.println("子线程开始了111111111111111111111111111111111111" +  "                        " +i);
    }
}
