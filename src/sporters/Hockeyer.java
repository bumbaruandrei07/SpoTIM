package sporters;

import behaviors.IBodySlam;
import behaviors.IHitPuck;
import behaviors.ITackle;
import humans.Human;

public class Hockeyer extends Human implements IHitPuck, ITackle {
    public Hockeyer(String name, int birthDate) {
        super(name, birthDate);
    }

    @Override
    public void hitPuck() {
        System.out.println("This hockeyer hits the puck very well");
    }

    @Override
    public void tackle() {
        System.out.println("This hockeyer can perform a very good tackle");
    }
}
