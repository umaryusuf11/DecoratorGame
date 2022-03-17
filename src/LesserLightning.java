public class LesserLightning extends SwordDecorator{
    public LesserLightning(Sword s) {
        this.sword = s;
    }

    @Override
    public void attack(GameCharacter target) {
        sword.attack(target);
        target.takeLightningDamage(5);
    }
}
