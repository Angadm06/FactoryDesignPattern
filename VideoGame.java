import java.util.Random;


public class VideoGame {

    public void play() {
        AlienFactory af = new AlienFactory();
        Alien [] a = new Alien[10];
        for(int i=0; i<a.length; i++){
            a[i] = af.getAlien();
            
        }

    }

        


}
