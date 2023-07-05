
package unoquattro;

public class SpecialColourCard extends Card implements SpecialAbility {

    private String specialAbility;

    public SpecialColourCard(Color color, Shape shape, Fill fill) {
        super(color, shape, fill);
        specialAbility = "Special Color";
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    @Override
    public void activateAbility() {
        // Implement the specific behavior for the Special Color Card's special ability
        // ...
    }
}
