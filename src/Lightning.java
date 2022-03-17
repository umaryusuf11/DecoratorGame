public class Lightning extends SwordDecorator{
    public Lightning(Sword s) {
        this.sword = s;
    }

    @Override
    public void attack(GameCharacter target) {
        sword.attack(target);
        target.takeLightningDamage(10);
    }
}
