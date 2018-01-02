import Utility.Commands;

import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    private Commands commands =  new Commands();
    private City city;

    public Manage(City city) {
        this.city = city;
    }
    public void start()
    {
        System.out.println("Name your city");
        city.setCityName(scanner.nextLine());
    }
    public void menu()                                                                                              //Main menu
    {

        while(true)
        {
            int peopleOpen = city.getPeople().getPeople() - city.getBuildings().getJobsFilled();
            int peopleEmployed = city.getPeople().getPeople() - peopleOpen;
            System.out.println("Welcome to Menu");
            System.out.println("Employed: " + peopleEmployed);
            System.out.println("Unemployed: " + peopleOpen);
            System.out.println("Jobs - 1");
            System.out.println("Buildings - 2");
            System.out.println("End Turn - 3");
            System.out.println("Display Stats - 4");
            System.out.println("Quit - 0");

            int input = scanner.nextInt();

            switch (input)
            {
                case 0:
                    break;
                case 1:
                    jobs();
                    break;
                case 2:
                    break;
                case 3:
                    city.endDay();
                    break;
                case 4:
                    city.displayStat();
                    commands.CreateSpace(2);
                    break;
                default:
                    continue;
            }
        }

    }
    public void turn(){
        city.endDay();
    }

    public void jobs()
    {
        int peopleOpen = city.getPeople().getPeople() - city.getBuildings().getJobsFilled();
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner1 = new Scanner(System.in);

        while(true)
        {

            System.out.println("Please Select");
            System.out.println("Quit - 0");
            System.out.println("Office - 1");
            System.out.println("Factory - 2");
        /*

        */
            int input = scanner.nextInt();
            switch (input)
            {
                case 0:
                    break;
                case 1:
                    System.out.println("Office Openings - " + city.getBuildings().getOfficeBuilding().getOpenings());
                    System.out.println("Employed - " + city.getBuildings().getOfficeBuilding().getJobsFilled());
                    System.out.println("Offices - " + city.getBuildings().getOfficeBuilding().getOfficeCount());
                    System.out.println("Total Office Production - " + city.getBuildings().getOfficeBuilding().getOfficeProduction());
                    System.out.println("Add People - 1");
                    System.out.println("Remove People - 2");
                    System.out.println("Quit - 0");

                    int input2 = scanner.nextInt();

                    switch (input2)
                    {
                        case 0:
                            continue;
                        case 1:                                                                     //Add people to office building
                            System.out.println("People Available: " + peopleOpen);
                            if(peopleOpen > 0)
                            {
                                System.out.println("Enter Amount");
                                int answer = scanner.nextInt();
                                if(peopleOpen >= answer)
                                {
                                    city.getBuildings().getOfficeBuilding().addWorkers(answer);
                                    continue;
                                }
                                else
                                {
                                    System.out.println("Too many");
                                    continue;
                                }
                            }
                            continue;
                        case 2:                                                                                                         //Remove people from office Building
                            System.out.println("People Employed: " + city.getBuildings().getOfficeBuilding().getJobsFilled());
                            int answer = scanner.nextInt();
                            if(city.getBuildings().getOfficeBuilding().getJobsFilled() >= answer)
                            {
                                city.getBuildings().getOfficeBuilding().removeWorkers(answer);
                                continue;
                            }
                            else
                            {
                                System.out.println("too many people");
                                continue;
                            }
                        default:
                            continue;

                    }
                    //break;
                case 2:
                    continue;
                default:
                    continue;
            }
            break;
        }


    }
}
