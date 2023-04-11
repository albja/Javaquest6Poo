public class Classroom {
    public static void main(String[] args) {

        Wilder biket = new Wilder("Biket", false);
        Wilder arsen = new Wilder("Arsen", true);
        Wilder fred = new Wilder("Fred", false);
        Wilder pauline = new Wilder("Pauline", true);

        System.out.println(biket.whoAmI());
        System.out.println(arsen.whoAmI());
        System.out.println(fred.whoAmI());
        System.out.println(pauline.whoAmI());
    }

}
