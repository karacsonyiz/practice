package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(10)+1;
    }

    private int getActualDefence() {
        return random.nextInt(5);
    }

    protected void hit(Character enemy, int damage) {
        if(getActualDefence() < damage) {
            decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy,this.getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint = hitPoint - diff;
    }

    abstract public void secondaryAttack(Character enemy);

}
