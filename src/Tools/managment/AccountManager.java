package Tools.managment;
import Tools.account.Account;
import Tools.managment.trasactions.AccountTrasaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class AccountManager {
    private final Account account;
    private final List<AccountTrasaction> futureTransactions = new ArrayList<>();
    public AccountManager(Account account) {
        this.account = account;
    }
    public void makeTransaction(AccountTrasaction currentTransactions) {
        double changedValue = account.getCurrentBalance() - currentTransactions.getTransactionValue();
        account.setCurrentBalance(changedValue);
        if (!TransactionsStorage.transactions.containsKey(account)) {
            List<AccountTrasaction> accountTransactions = new ArrayList<>();
            accountTransactions.add(currentTransactions);
            TransactionsStorage.transactions.put(account, accountTransactions);
        } else {
            TransactionsStorage.transactions.get(account).add(currentTransactions);
        }
    }
    public String getAllTransactions() {
        List<AccountTrasaction> accountTransactions = TransactionsStorage.transactions.get(account);
        String result = accountTransactions.stream().map(AccountTrasaction::toStringAsNameAndValue).collect(Collectors.joining("\n"));
        return this.account.getAccountName() + " {\n"
                + result
                + "\nbalance:" + account.getCurrentBalance()
                + "\n }";
    }
    public void makeAllFutureTransactions() {
        if (!futureTransactions.isEmpty()) {
            for (AccountTrasaction futureTransaction : futureTransactions) {
                makeTransaction(futureTransaction);
            }
            futureTransactions.clear();
        }
    }
    public void addFutureTransaction(AccountTrasaction futureTransaction) {
        futureTransactions.add(futureTransaction); // через это можно накидывать будущие затраты
    }
}
