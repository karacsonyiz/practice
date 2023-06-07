package dpintro.reptile;

public abstract class LandDweller {

    private int energy;

    public LandDweller(int energy) {
        this.energy = energy;
    }
    public void decreaseEnergy(int value) {
        if(value > energy) {
            throw new IllegalArgumentException("Not enough energy to move!");
        }
        this.energy = this.energy - value;
    }
    public int getEnergy() {
        return this.energy;
    }
}
