import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
  * @author:  Zhang
  * @description:
  *
  * 学习timer类  任务调度
 **/
public class Demo_timer {
    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("起床了。。。");
            }
        },new Date(System.currentTimeMillis()+5*1000),1000);//设置任务 匿名内部类，重写run方法，设定启动时间（当前时间5s后），设定每1s执行一次
    }
}
