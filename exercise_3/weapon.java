public class weapon {

    String name;
    int damage;
    String rarity;
    
    public void tellName() {
        System.out.println("Your Weapon is " + name);
    }
    public void tellDamage() {
        System.out.println("Damage: " + damage);
    }
    public void tellRarity() {
        System.out.println("Rarity: " + rarity);
    }
    public void addDamage(int additionalDamage) {
        int newDamage = damage + additionalDamage;
        System.out.println("Damage increased from " + damage + " to " + newDamage);

        this.damage = newDamage;
    }
    public String showNameandRarity() {
        return this.name + " " + this.rarity;
    }

}
