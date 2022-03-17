public class Fire extends SwordDecorator{
    public Fire(Sword s) {
        this.sword = s;
    }

    @Override
    public void attack(GameCharacter target) {
        sword.attack(target);
        target.takeFireDamage(10);
    }
}
