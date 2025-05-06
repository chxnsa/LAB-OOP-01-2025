public class Petarung extends Hero {
    public Petarung() {
        this("Petarung", 120, 30);
    }

    public Petarung(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void serang() {
        System.out.println(getName() + " menyerang dengan pedang dengan kekuatan " + attackPower + "!");
    }

}
