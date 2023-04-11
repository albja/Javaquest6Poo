public class Wilder {

    public String name;
    public boolean aware;

    public Wilder(String name, boolean aware) {
        this.name = name;
        this.aware = aware;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAware() {

        return this.aware;
    }

    public String whoAmI() {
        if (aware) {
            return ("Je m'appelle " + name + " et je suis aware");
        } else {
            return ("Je m'appelle " + name + " et je ne suis aware");
        }
    }

    public static void main(String[] args) {
        Wilder lola = new Wilder("Lola", true);
        System.out.println(lola.whoAmI());
        Wilder bruno = new Wilder("Bruno", false);
        System.out.println(bruno.whoAmI());
    }

}
