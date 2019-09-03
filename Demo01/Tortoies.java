package Demo01;

/**
  * @author:  Zhang
  * @description:
  *
  * 继承 Thread 类 重写run方法
 *      调用 start 方法
 **/
public class Tortoies extends Thread{


    @Override
    public void run() {
        //线程体
        for (int i=1;i<100;i++)
            System.out.println("乌龟跑了" +i+"步");
    }
}
