package Demo03;

import java.util.concurrent.*;

/**
  * @author:  Zhang
  * @description:
  *
  * 可以返回值 并且可以抛出异常
 *  1、ExecutorService ser= Executors.newFixedThreadPool(2); 创建线程
 *  2、创建角色
 *  3、 Future 获取返回值
 *  4、停止线程
 *
 **/
public class Call {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //创建线程
        ExecutorService ser= Executors.newFixedThreadPool(2);
        //创建角色
        Race rabbit=new Race("小兔子",0.5);
        Race tortoies=new Race("小乌龟",1);
        //获取返回值
        Future<Integer> result1=ser.submit(rabbit);
        Future<Integer> result2=ser.submit(tortoies);
        Thread.sleep(5000);
        //停止线程
        rabbit.setTag(false);
        tortoies.setTag(false);
        System.out.println( "小兔子-->" +result1.get());
        System.out.println( "小乌龟-->" +result2.get());
        //停止线程
        ser.shutdownNow();
    }
}
class Race implements Callable<Integer>{
    private String name;//姓名
    private int step;//跑了多少步
    private double yanchi;//延迟，跑一步要多少秒
    private boolean tag=true;//线程是否继续

    public Race(String name, double yanchi) {
        this.name = name;
        this.yanchi = yanchi;
    }

    @Override
    public Integer call() throws Exception {
        while (tag){
            Thread.sleep((int)(yanchi*1000));
            this.step++;
        }
        return this.step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public double getYanchi() {
        return yanchi;
    }

    public void setYanchi(double yanchi) {
        this.yanchi = yanchi;
    }

    public boolean isTag() {
        return tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }
}