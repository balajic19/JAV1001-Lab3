public class Die {
    private String name;
    private int sides;
    private int sideUp;

    public Die() {
        name = "d6";
        sides = 6;
        roll();

    }

    public Die(int sides) {
        this.sides = sides;
        name = "d" + sides;
        roll();
    }

    public Die(int sides, int sideUp) {
        this.sides = sides;
        name = "d" + sides;
        this.sideUp = sideUp;
    }

    //A roll method to generate a random value
    public void roll() {
        sideUp = (int) (1 + Math.random() * sides);
    }

    public String getName() {
        return name;
    }

    public int getSides() {
        return sides;
    }

    public int getSideUp() {
        return sideUp;
    }

    public void setSides(int sides) {
        this.sides = sides;
        name = "d6";
    }

    public void setSideUp(int sideUp) {
        this.sideUp = sideUp;
    }
}