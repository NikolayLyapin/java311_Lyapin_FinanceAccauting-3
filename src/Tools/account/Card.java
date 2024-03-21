package Tools.account;

public class Card implements Account{
    @Override
    public void setCurrentBalance(double changedValue) {
        cardInitValue = changedValue;
    }
    @Override
    public Double getCurrentBalance() {
        return cardInitValue;
    }
    @Override
    public String getAccountName() {
        return this.cardName;
    }
    private final String cardName;
    private double cardInitValue;
    public Card(String cardName, double cardInitValue) {
        this.cardName = cardName;
        this.cardInitValue = cardInitValue;
    }
}
