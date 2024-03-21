package Tools.managment;
import Tools.account.Account;
import Tools.managment.trasactions.AccountTrasaction;
import Tools.managment.trasactions.AccountTrasaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class TransactionsStorage {
    public static Map<Account, List<AccountTrasaction>> transactions = new HashMap<Account, List<AccountTrasaction>>();
}
