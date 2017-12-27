package CityBuildings;

import java.text.DecimalFormat;

public class Office {
    DecimalFormat roundDecimal = new DecimalFormat(".####");

    private int officeCount;
    private double officeMoney;
    private double officeProduction;
    private int jobsMax;
    private int jobsFilled;
    private int jobsOpen;
    private double officeUpkeep;

    public Office(int officeCount, double officeProduction, int jobsMax) {
        this.officeCount = officeCount;
        this.officeProduction = officeProduction;
        this.jobsMax = jobsMax;
        this.officeUpkeep = officeCount * .1;
    }
    public void setOfficeUpkeep(double officeUpkeep)
    {
        this.officeUpkeep = officeUpkeep;
    }
    public void addWorkers(double workers)
    {
        if(jobsOpen >= workers)
            jobsFilled += workers;
    }
    public double collectFunds()
    {
        officeMoney = ((officeProduction/jobsMax) * jobsFilled) - officeUpkeep;
        System.out.println("$" + officeMoney + " Earned");
        return officeMoney;

    }
}