package Tools.account;

public class Wallet implements Account {
    @Override
    public void setCurrentBalance(double changedValue) {
        walletInitValue = changedValue;
    }
    @Override
    public Double getCurrentBalance() {
        return walletInitValue;
    }
    private final String walletName;
    private double walletInitValue;
    @Override
    public String getAccountName() {
        return this.walletName;
    }
    public Wallet(String walletName, double walletInitValue) {
        this.walletName = walletName;
        this.walletInitValue = walletInitValue;
    }
}
