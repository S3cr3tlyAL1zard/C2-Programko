public class Main {
    public static void main(String[] args) {
        Human[] pole = new Human[2];

        Human jedna = new Human("Jan", "Rubeš", 19);
        Human dva = new Human("Karel", "Nový", 23);

        BankAccount jednaBA = new BankAccount(1, 90000, jedna);
        BankAccount dvaBA = new BankAccount(2, -90000, dva);

        Bank jednaB = new Bank(156852, "Jan Rubeš");
        Bank dvaB = new Bank(418457, "Karel Nový");

        jednaBA.isInDebt();
        dvaBA.isInDebt();


    }
}