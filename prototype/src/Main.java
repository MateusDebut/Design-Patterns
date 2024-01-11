import cards.CloneableCard;
import cards.MonsterCard;
import cards.SpellCard;

public class Main {
    public static void main(String[] args) {
        CloneableCard originalMonsterCard = new MonsterCard("Dragão Branco de Olhos Azuis", 3000, 2500, 8);

        CloneableCard clonedMonsterCard = originalMonsterCard.clone();
        CloneableCard originalSpellCard = new SpellCard("Raio de Dark Magician", "Inflige 500 pontos de dano ao oponente.");

        CloneableCard clonedSpellCard = originalSpellCard.clone();

        System.out.println("Original Monster Card: " + originalMonsterCard);
        System.out.println("Cloned Monster Card: " + clonedMonsterCard);
        System.out.println("Original Spell Card: " + originalSpellCard);
        System.out.println("Cloned Spell Card: " + clonedSpellCard);
    }
}