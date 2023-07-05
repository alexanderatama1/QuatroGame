
package unoquattro;

public class WildCard extends Card implements SpecialAbility {

    private String specialAbility;

    public WildCard(Color color, Shape shape, Fill fill) {
        super(color, shape, fill);
        specialAbility = "Wild";
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    @Override
    public void activateAbility() {
        // Implement the specific behavior for the Wild Card's special ability
        // ...
    }
}
