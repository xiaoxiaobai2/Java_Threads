package Demo01;

public class RabbitAPP {
    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit();
        Tortoies tortoies=new Tortoies();

        //启动线程，盗用 .start方法
        rabbit.start();
        tortoies.start();

        for (int i=1;i<100;i++)
            System.out.println("main线程执行了" +i + "步");
    }
}
