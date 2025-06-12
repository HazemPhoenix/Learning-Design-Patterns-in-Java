package MedievalFights;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {
        weapon = new Sword();
    }

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
