import CityBuildings.*;
import Utility.Commands;

public class Main {
    public static Commands command = new Commands();
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
        command.CreateSpace(2);
        //manager.start();
        while (true)
        {
            manager.menu();
            command.CreateSpace(10);
            city.displayStat();
            command.CreateSpace(10);
        }

    }


}