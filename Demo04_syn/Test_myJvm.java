package Demo04_syn;

/**
  * @author:  Zhang
  * @description:
  *
  * 测试单例对象  当没有发生多线程时 对象的地址相同
 *          当发生多线程时，就可能同时创建多个 实例，不符合单例对象
 *          所以要保证线程安全   加入synchronize
 **/

public class Test_myJvm {
    public static void main(String[] args) {
//        test01();
//        System.out.println("**********************************");
//        //加入延时   增加发生错误的概率
//        test02();
//        System.out.println("**********************************");
//        test03();
        test04();
    }
    public static void test01(){
        System.out.println(MyJvm.getInstance());
        System.out.println(MyJvm.getInstance());
    }
    public static void test02(){
        Thread thread=new JvmThread(100);
        thread.setName("test02");
        Thread thread2=new JvmThread(300);
        thread2.setName("test02");
        thread.start();
        thread2.start();
    }
    public static void test03(){
        Thread thread=new JvmThread(200);
        thread.setName("test03");
        Thread thread2=new JvmThread(400);
        thread2.setName("test03");
        thread.start();
        thread2.start();
    }
    public static void test04(){
        System.out.println(MyJvm04.getInstance());
        System.out.println(MyJvm04.getInstance());
    }
}
