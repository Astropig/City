import CityBuildings.*;

public class Main {
    public static void main(String[] args)
    {
        Factory factory = new Factory();
        Office office = new Office(1,5,5);
        Buildings buildings = new Buildings(office, factory);
        Treasury treasury = new Treasury(1000, 5);
        People people = new People(5, 1, 1);

        City city = new City(people, buildings, treasury);
        Manage manager = new Manage(city);
        //city.addMoney(23);
        city.displayStat();
        //manager.start();
        while (true)
        {
            manager.menu();
            city.displayStat();
            for(int i = 0; i < 13; i++)
            {
                System.out.println("");
            }
        }

    }
}