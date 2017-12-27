public class Treasury {
    private double taxRate;
    private double money;

    public Treasury(double money, double taxRate)
    {
        this.taxRate = taxRate;
        this.money = money;
    }

    public void setTaxRate(int taxRate)
    {
        this.taxRate = taxRate;
    }
    public double getTaxRate()
    {
        return this.taxRate;
    }
    public void addMoney(double money)
    {
        this.money += money;
    }
    public void takeMoney(double money)
    {
        this.money -= money;
    }
    public double getMoney()
    {
        return this.money;
    }
}