package cards;

public class MonsterCard implements CloneableCard {
    private String name;
    private int attack;
    private int defense;
    private int stars;

    public MonsterCard(String name, int attack, int defense, int stars) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.stars = stars;
    }

    @Override
    public CloneableCard clone() {
        return new MonsterCard(this.name, this.attack, this.defense, this.stars);
    }

    @Override
    public String toString() {
        return "MonsterCard{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", stars=" + stars +
                '}';
    }
}
