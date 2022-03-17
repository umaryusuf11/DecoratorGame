public class Spear extends Sword{
    public Spear(){
        this.swordAttackPower = 40;
    }

    public void attack(GameCharacter target) {
        target.takeWeaponDamage(swordAttackPower);
    }
}
