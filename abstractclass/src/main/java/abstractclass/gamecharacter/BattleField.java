package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    private boolean oneHit(Character attacker, Character defender) {
        if(!attacker.isAlive() || !defender.isAlive()){
            return false;
        }
        attacker.primaryAttack(defender);
        attacker.secondaryAttack(defender);
        return true;
    }

    public Character fight(Character one, Character other) {
        while(one.isAlive() && other.isAlive()){
            oneHit(one,other);
            oneHit(other,one);
            round += 1;
        }
        if(!one.isAlive()){
            return one;
        }
        return other;
    }

    public int getRound() {
        return round;
    }
}
