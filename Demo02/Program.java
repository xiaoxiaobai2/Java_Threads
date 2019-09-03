package Demo02;

public class Program implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<1000;i++)
            System.out.println("一遍敲代码一遍聊微信。。");
    }
}
