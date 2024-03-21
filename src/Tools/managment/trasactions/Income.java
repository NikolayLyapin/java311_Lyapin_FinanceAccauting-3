package Tools.managment.trasactions;

public class Income implements AccountTrasaction {
    private final String incomeName;
    private final double incomeValue;
    public Income(String incomeName, double incomeValue) {
        this.incomeName = incomeName;
        if (incomeValue < 0) {
            this.incomeValue = changeSignOfValue(incomeValue);
        } else {
            this.incomeValue = incomeValue;
        }
    }
    private static double changeSignOfValue(double incomeValue) {
        return -1 * incomeValue;
    }
    @Override
    public String toStringAsNameAndValue() {
        return this.incomeName + ": " + this.incomeValue;
    }
    @Override
    public double getTransactionValue() {
        return incomeValue;
    }
}
