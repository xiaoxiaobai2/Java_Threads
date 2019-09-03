/**
  * @author:  Zhang
  * @description:
  *
  * join 强行执行某一线程
 **/
public class Join_demo extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Join_demo join_demo=new Join_demo();
        join_demo.start();
        for (int i=1;i<10000;i++){
            if (i==50){
                join_demo.join(500);//强行加入
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
