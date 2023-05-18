package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow = 100;

    public Archer(Point position,Random random) {
        super(position,random);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }

    private int getActualSecondaryDamage(){
        return this.getRandom().nextInt(5)+1;
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow = numberOfArrow - 1;
        hit(enemy,getActualSecondaryDamage());
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }






}
