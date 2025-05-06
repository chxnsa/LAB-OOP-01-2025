public class Penyihir extends Hero {
    public Penyihir() {
        super("Penyihir", 80, 25);
    }

    public void serang() {
        System.out.println(getName() + " menyerang dengan sihir dengan kekuatan " + attackPower + "!");
    }

}
