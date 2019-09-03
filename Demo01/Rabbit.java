package Demo01;

public class Rabbit extends Thread {
    //重写父类的  run方法  等会调用start方法
    @Override
    public void run() {
        for (int i=1;i<100;i++){
            System.out.println("兔子跑了"+ i +"步");
        }
    }
}
