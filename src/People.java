
public class People {
    private int people;
    private int houses;
    private int growthRate;

    public People(int people, int houses, int growthRate)
    {
        this.growthRate = growthRate;
        this.houses = houses;
        this.people = people;
    }

    public int getPeople()
    {
        return this.people;
    }
    public int getGrowthRate()
    {
        return this.growthRate;
    }
    public void setPeople(int people)
    {
        if(getHouses()*5 >= getPeople())
            this.people += getGrowthRate();
        else
            System.out.println("not enough houses");
    }
    /*public void setPeople(int people)
    {
        this.people = people;
    }
    public void subtractPeople(int people)
    {
        if(people > 0)
            this.people -= people;
    }*/
    public int getHouses()
    {
        return this.houses;
    }
    public void addHouses(int houses)
    {
        this.houses += houses;
    }
    public void setHouses(int houses)
    {
        this.houses = houses;
    }
    public void subtractHouses(int houses)
    {
        this.houses -= people;
    }

}