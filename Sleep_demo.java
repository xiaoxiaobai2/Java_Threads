import java.text.SimpleDateFormat;
import java.util.Date;
/**
  * @author:  Zhang
  * @description:
  *
  * 模拟十秒倒计时demo
 **/
public class Sleep_demo {
    public static void main(String[] args) throws InterruptedException {
        //设置开始时间为当前时间的后10S
        Date endtime=new Date(System.currentTimeMillis()+10*1000);//当前时间往后10秒
        long end=endtime.getTime();
        System.out.println("倒计时10s:");
        while (true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endtime));
            //模拟倒计时1S的间隔
            Thread.sleep(1000);
            endtime=new Date(endtime.getTime()-1000);
            //倒计时结束的判断
            if (end-10*1000>=endtime.getTime()){
                break;
            }
        }
        System.out.println(new SimpleDateFormat("mm分 ss秒").format(10*1000*60+5*1000));
    }
}
