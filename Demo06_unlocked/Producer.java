package Demo06_unlocked;
/**
  * @author:  Zhang
  * @description:
  *
  * 生产者
 **/
public class Producer implements Runnable{
    private Movie movie;
    //把同一份资源传递进来
    public Producer(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            if (i%2==0){
                movie.play("左青龙！");
            }else{
                movie.play("右白虎！");
            }
        }
    }
}
