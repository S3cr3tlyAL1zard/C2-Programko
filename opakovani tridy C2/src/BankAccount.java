public class BankAccount {
    public int bankAccountNumber;
    public int balance;

    public Human owner;

    public BankAccount(int bankAccountNumber, int balance, Human owner){
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void isInDebt(){
        if(balance < 0){
            System.out.println(owner + " má dluh.");
        }
        else{
            System.out.println(owner + " nemá dluh.");
        }
    }
}
