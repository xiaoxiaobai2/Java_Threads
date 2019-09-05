package Demo06_unlocked;

/**
  * @author:  Zhang
  * @description:
  *
  * 测试生产者和消费者是否会发生冲突
 **/
public class App {
    public static void main(String[] args) {
        Movie movie=new Movie();
        Producer producer=new Producer(movie);
        Watcher watcher=new Watcher(movie);
        new Thread(producer).start();
        new Thread(watcher).start();
    }
}
