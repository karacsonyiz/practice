package dpintro.reptile;

public class Crocodile extends  LandDweller implements CanSwim {


    public Crocodile(int energy) {
        super(energy);
    }

    @Override
    public void swim() {
        decreaseEnergy(5);
    }

    public void walk() {
        decreaseEnergy(20);
    }
}
