public class LesserFire extends SwordDecorator{
    public LesserFire(Sword s) {
        this.sword = s;
    }

    @Override
    public void attack(GameCharacter target) {
        sword.attack(target);
        target.takeFireDamage(5);
    }
}