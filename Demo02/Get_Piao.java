package Demo02;
/**
  * @author:  Zhang
  * @description:
  *
  * 模拟抢票
 **/
public class Get_Piao {
    public static void main(String[] args) {
        //创建真实角色
        Web12306 web12306=new Web12306();
        //创建代理角色 + 真实角色引用 + 代理角色名
        Thread thread1=new Thread(web12306,"路人甲");
        Thread thread2=new Thread(web12306,"黄牛乙");
        Thread thread3=new Thread(web12306,"攻城师");
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
