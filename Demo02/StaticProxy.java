package Demo02;
/**
  * @author:  Zhang
  * @description:
  *
  * 静态代理模式
 * 1、真是角色
 * 2、代理角色
 * 3、二者实现相同的接口
 **/
public class StaticProxy {
    public static void main(String[] args) {
        //创建真是角色
        You you=new You();
        //创建代理角色 + 真是角色的引用
        wedding wedding=new wedding(you);
        wedding.merry();
    }
}
//接口
interface Meary{
    void merry();
}
//这是角色
class You implements Meary{
    @Override
    public void merry() {
        System.out.println("you get merry");
    }
}


//代理角色  婚庆公司
class wedding implements Meary{
    private You you;

    public wedding(You you) {
        this.you = you;
    }
    private void before(){
        System.out.println("整理猪窝。。。");
    }

    @Override
    public void merry() {
        before();
        you.merry();
        after();
    }
    private void after(){
        System.out.println("闹玉兔。。。");
    }
}