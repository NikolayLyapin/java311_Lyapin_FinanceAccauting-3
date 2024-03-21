package Tools.account;

public interface Account {
    public String getAccountName();
    public Double getCurrentBalance();

    void setCurrentBalance(double changedValue);
}
