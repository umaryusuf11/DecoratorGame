public class GreaterFire extends SwordDecorator{
    public GreaterFire(Sword s) {
        this.sword = s;
    }

    @Override
    public void attack(GameCharacter target) {
        sword.attack(target);
        target.takeFireDamage(20);
    }
}