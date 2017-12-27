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
    public void turn(){
        city.endDay();
    }
}
