public class City{
    private People people;
    private Buildings buildings;
    private Treasury treasury;
    private String cityName;
    private int unemployed;
    private int employed;
    public City(People people, Buildings buildings,Treasury treasury)
    {
        this.people = people;
        this.buildings = buildings;
        this.treasury = treasury;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public void displayStat()
    {
        System.out.println(this.cityName);
        System.out.println("Number of Citzens: " + people.getPeople());
        System.out.println("employment Rate: " + (buildings.getTotalJobs()/people.getPeople()) * buildings.getJobsFilled() + "%");
        System.out.println("Number Of Houses: " + people.getHouses());
        System.out.println("tax Rate: " + treasury.getTaxRate());
        System.out.println("Cash: " + treasury.getMoney());
    }

    public People getPeople()
    {
        return people;
    }
    public Buildings getBuildings()
    {
        return buildings;
    }
    public void addMoney(double money)
    {
        treasury.addMoney(money);
    }
    public void endDay()
    {
        //buildings.addMoney();
        treasury.addMoney(buildings.collectFunds());
    }
}
