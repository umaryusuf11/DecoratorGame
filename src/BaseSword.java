public class BaseSword extends Sword {
    public BaseSword(int swordAttackPower) {
        this.swordAttackPower = swordAttackPower;
    }

    public void attack(GameCharacter target) {
        target.takeWeaponDamage(swordAttackPower);
    }
}
