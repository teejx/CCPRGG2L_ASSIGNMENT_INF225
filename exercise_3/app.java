public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();

        Character Assassin = new Character();

        Assassin.strength = 25;
        Assassin.agility = 15;
        Assassin.intelligence = 30;
        Assassin.name = "Teej";
        Assassin.sayMyName();
        Assassin.doAttack();

        weapon BrokenSword = new weapon();

        BrokenSword.name = "Broken Sword";
        BrokenSword.damage = -999;
        BrokenSword.rarity = "Broken";
        BrokenSword.tellName();
        BrokenSword.tellDamage();
        BrokenSword.tellRarity();
        BrokenSword.addDamage(1005);
        System.out.println(BrokenSword.showNameandRarity());

        weapon CommonSword = new weapon();

        CommonSword.name = "Common Sword";
        CommonSword.damage = 10;
        CommonSword.rarity = "Common";
        CommonSword.tellName();
        CommonSword.tellDamage();
        CommonSword.tellRarity();
        CommonSword.addDamage(5);
        System.out.println(CommonSword.showNameandRarity());

        weapon UncommonSword = new weapon();

        UncommonSword.name = "Uncommon Sword";
        UncommonSword.damage = 15;
        UncommonSword.rarity = "Uncommon";
        UncommonSword.tellName();
        UncommonSword.tellDamage();
        UncommonSword.tellRarity();
        CommonSword.addDamage(5);
        System.out.println(UncommonSword.showNameandRarity());

        weapon RareSword = new weapon();

        RareSword.name = "Rare Sword";
        RareSword.damage = 20;
        RareSword.rarity = "Rare";
        RareSword.tellName();
        RareSword.tellDamage();
        RareSword.tellRarity();
        CommonSword.addDamage(5);
        System.out.println(RareSword.showNameandRarity());

        weapon EpicSword = new weapon();

        EpicSword.name = "Epic Sword";
        EpicSword.damage = 35;
        EpicSword.rarity = "Epic";
        EpicSword.tellName();
        EpicSword.tellDamage();
        EpicSword.tellRarity();
        CommonSword.addDamage(5);
        System.out.println(EpicSword.showNameandRarity());

        weapon LegendarySword = new weapon();

        LegendarySword.name = "Legendary Sword";
        LegendarySword.damage = 9999999;
        LegendarySword.rarity = "Legendary";
        LegendarySword.tellName();
        LegendarySword.tellDamage();
        LegendarySword.tellRarity();
        CommonSword.addDamage(5);
        System.out.println(LegendarySword.showNameandRarity());


    }
}
