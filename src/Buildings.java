
import CityBuildings.Factory;
import CityBuildings.Office;

public class Buildings {
    private Office officeBuilding;
    private Factory factory;

    public Buildings(Office officeBuilding, Factory factory)
    {
        this.officeBuilding = officeBuilding;
        this.factory = factory;
    }
    public double collectFunds()
    {
        return officeBuilding.collectFunds();
    }
    public double getTotalJobs()
    {
        return officeBuilding.
    }
}


