package cards;

public class SpellCard implements CloneableCard{
    private String name;
    private String effect;
    private boolean isFaceUp;

    public SpellCard(String name, String effect) {
        this.name = name;
        this.effect = effect;
    }

    @Override
    public CloneableCard clone() {
        return new SpellCard(this.name, this.effect);
    }

    @Override
    public String toString() {
        return "SpellCard{" +
                "name='" + name + '\'' +
                ", effect='" + effect + '\'' +
                ", isFaceUp=" + isFaceUp +
                '}';
    }

    public void setFaceUp(boolean isFaceUp){
        this.isFaceUp = isFaceUp;
    }

    public boolean isFaceUp(){
        return this.isFaceUp;
    }
}
