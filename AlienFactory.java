import java.util.Random;

public class AlienFactory {


    enum e {SQUID, MONKEY, TIGER, RAT}

        public Alien getAlien() {
            Random r = new Random(4);
            e alien = e.values()[r.nextInt()];
            switch (alien) {
                case SQUID:
                    return new SquidAlien("Squid");
                case MONKEY:
                    return new MonkeyAlien("Monkey");

                case TIGER:
                    return new TigerAlien("Tiger");

                case RAT:
                    return new RatAlien("Rat");

                default:
                    return null;


            }


        }
    }

