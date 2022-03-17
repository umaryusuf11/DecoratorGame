public abstract class SwordDecorator extends Sword {
    Sword sword;
    public abstract void attack(GameCharacter target);
}
