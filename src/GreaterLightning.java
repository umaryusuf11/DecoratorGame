public class GreaterLightning extends SwordDecorator{
    public GreaterLightning(Sword s) {
        this.sword = s;
    }

    @Override
    public void attack(GameCharacter target) {
        sword.attack(target);
        target.takeLightningDamage(20);
    }
}
