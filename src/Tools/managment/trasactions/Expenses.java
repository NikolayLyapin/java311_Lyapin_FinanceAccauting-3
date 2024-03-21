package Tools.managment.trasactions;

public class Expenses implements AccountTrasaction {
    private final String expensesName;
    private final double expensesValue;
    public Expenses(String expensesName, double expensesValue) {
        this.expensesName = expensesName;
        if (expensesValue > 0) {
            this.expensesValue = changeSignOfValue(expensesValue);
        } else {
            this.expensesValue = expensesValue;
        }
    }
    private static double changeSignOfValue(double expensesValue) {
        return -1 * expensesValue;
    }
    @Override
    public String toStringAsNameAndValue() {
        return this.expensesName + ": " + this.expensesValue;
    }
    @Override
    public double getTransactionValue() {
        return expensesValue;
    }
}
