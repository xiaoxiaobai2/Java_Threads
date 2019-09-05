package Demo05_locked;
/**
  * @author:  Zhang
  * @description:
  *
  * 过多的使用同步可能造成死锁（循环等待)
 **/
public class Test_Locked {
    public static void main(String[] args) {
        //多个线程访问同一个资源
        Object money=new Object();
        Object goods=new Object();
        //两个线程互相不释放资源，发生循环等待（死锁）
        Thread01 thread01=new Thread01(money,goods);
        Thread t1=new Thread(thread01);
        t1.start();
        Thread02 thread02=new Thread02(money,goods);
        Thread t2=new Thread(thread02);
        t2.start();
    }
}
