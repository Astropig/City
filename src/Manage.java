import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);

    private City city;

    public Manage(City city) {
        this.city = city;
    }
    public void start()
    {
        System.out.println("Name your city");
        city.setCityName(scanner.nextLine());
    }
    public void menu()
    {
        System.out.println("Welcome to Menu");
        System.out.println("Employed: " + city.getPeople().getPeople() - city.getBuildings().getJobsFilled());
        System.out.println("Jobs: 1");
        System.out.println("Buildings: 2");
        int input = scanner.nextInt();

        switch (input)
        {
            case 1:
                jobs();
                break;
            case 2:

                break;
        }
    }
    public void turn(){
        city.endDay();
    }

    public void jobs()
    {
        int peopleOpen = city.getPeople().getPeople() - city.getBuildings().getJobsFilled();
        Scanner scanner = new Scanner(System.in);
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
                    switch (input)
                    {
                        case 0:
                            break;
                        case 1:
                            System.out.println("People Available: " + peopleOpen);
                            if(peopleOpen > 0)
                            {
                                System.out.println("Enter Amount");
                                int answer = scanner.nextInt();
                                if(peopleOpen >= answer)
                                {
                                    city.getBuildings().getOfficeBuilding().addWorkers(answer);
                                }
                            }
                            break;
                        case 2:

                            break;
                        case 3:
                            break;
                        default:
                            continue;

                    }
                    break;
                case 2:
                    break;
                default:
                    continue;
            }
            break;
        }


    }
}
