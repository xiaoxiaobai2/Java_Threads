package Demo02;

/**
  * @author:  Zhang
  * @description:
  *
  * 推荐使用 runnable创建多线程
 *         1、避免单继承的局限性
 *         2、方便资源的共享
 **/
public class ProgramApp {
    public static void main(String[] args) {
        //创建真实角色
        Program program=new Program();
        //常见代理角色 + 真实角色的引用
        Thread thread=new Thread(program);
        //启动线程
        thread.start();

        //创建第二个线程
        //创建真实绝角色
        Chat_QQ chat_qq=new Chat_QQ();
        //创建代理角色  + 真实角色的引用
        Thread thread1 = new Thread(chat_qq);
        thread1.start();

        for (int i=0;i<1000;i++){
            System.out.println("正在敲代码。。。********************************************************************");
        }
    }
}
class Chat_QQ implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("一遍敲代码，一遍聊Q***************************Q！");
        }
    }
}