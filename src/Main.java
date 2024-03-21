import Tools.account.Account;
import Tools.account.Card;
import Tools.account.Wallet;
import Tools.managment.AccountManager;
import Tools.managment.trasactions.AccountTrasaction;
import Tools.managment.trasactions.Expenses;
import Tools.managment.trasactions.Income;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello my wallet Tinkoff! :)");
        Account tinkOff = new Card("Tinkoff", 10_000D);
        System.out.println("Пока что есть " + tinkOff.getCurrentBalance() + " рублей.");
        Account alfaWallet = new Wallet("AlfaWallet", 350_000D);
        System.out.println("А вот на кредитке есть " + alfaWallet.getCurrentBalance() + " рублей.");

        AccountTrasaction income = new Income("vernuli dolg", 105D);
        AccountTrasaction expenses = new Expenses("shaurma", 58D);
        AccountManager accountManager = new AccountManager(tinkOff);
        accountManager.makeTransaction(income); //объект
        accountManager.makeTransaction(expenses); //объект
        System.out.println(accountManager.getAllTransactions());

    }
}