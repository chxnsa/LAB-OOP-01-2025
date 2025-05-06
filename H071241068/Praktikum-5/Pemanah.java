public class Pemanah extends Hero {
    public Pemanah() {
        super("Pemanah", 100, 20);
    }

    public void serang() {
        System.out.println(this.getName() + " menyerang dengan panah dengan kekuatan " + attackPower + "!");
    }
}
