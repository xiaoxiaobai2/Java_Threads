package Demo06_unlocked;

public class Watcher implements Runnable {
    private Movie movie;

    //把同一份资源传递进来
    public Watcher(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++)
            movie.watch();
    }
}
