import java.util.ArrayList;

public class Bank {
    public int code;
    public String nameBank;
    public ArrayList<BankAccount> list;

    public Bank(int code, String nameBank){
        this.code = code;
        this.nameBank = nameBank;
        this.list = new ArrayList<>();
    }
    public void addAccount(BankAccount idk){
        list.add(idk);
    }

    public int totalBalance(){
        int totalBalance = 0;
        for(BankAccount idk : list){
            totalBalance += idk.balance;
        }
        return totalBalance;
    }

    public int totalAccounts(){
        return list.size();
    }
}
