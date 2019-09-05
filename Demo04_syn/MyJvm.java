package Demo04_syn;

import java.util.Date;

/**
  * @author:  Zhang
  * @description:
  *
  * 单例创建的方式
 *  懒汉式
 *  1、构造器私有化
 *  2、声明私有的静态属性
 *  3、提供访问属性的静态方法，确保该对象存在
 **/
public class MyJvm {
    private static MyJvm instance=null;
    private MyJvm() {
    }

    public static MyJvm getInstance() {
        //当不存在对象时  创建一个对象
        if (instance==null)
            instance=new MyJvm();
        return instance;
    }
}
class MyJvm02{
    private static MyJvm02 instance=null;
    private MyJvm02() {
    }

    public static MyJvm02 getInstance() {
        //当不存在对象时  创建一个对象
        if (instance==null){
            try {
                Thread.sleep(1000);//增加发生错误的可能性
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new MyJvm02();
        }
        return instance;
    }
}

class MyJvm03{
    private static MyJvm03 instance=null;
    private long time;
    private MyJvm03() {
    }

    public static MyJvm03 getInstance(long time) {
        //加入 double checking 机制 加快instance存在是=时的效率
        if (instance==null){
            //添加 synchronize 保证线程安全
            synchronized (MyJvm03.class){
                //当不存在对象时  创建一个对象
                if (instance==null){
                    try {
                        Thread.sleep(time);//增加发生错误的可能性
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance=new MyJvm03();
                }
            }

        }
        return instance;
    }
}

class JvmThread extends Thread{
    private long time;//延迟时间

    public JvmThread(long time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName()+"-------->"+MyJvm03.getInstance(time));
    }
}
/**
  * @author:  Zhang
  * @description:
  *
  * 单例对象的创建  ----饿汉式
 *  1、构造器私有化
 *  2、声明私有的静态属性，同时条用构造器
 *  3、创建静态的获取对象的方法
 **/
class MyJvm05{
    private static MyJvm05 instance=new MyJvm05();
    private MyJvm05() {
    }

    public static MyJvm05 getInstance() {
        return instance;
    }
}
class MyJvm04{
    private static class JvmHolder{
        //类 被调用之后就会给属性分配内存  并且只有一次
        private static MyJvm04 instance=new MyJvm04();
    }
    private MyJvm04() {
    }

    public static MyJvm04 getInstance() {
        return JvmHolder.instance;
    }
}
