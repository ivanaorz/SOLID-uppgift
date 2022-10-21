import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Berth berth = new Berth();

        System.out.println("Write 1 to see berths of docked trucks, truck type and weight;\nWrite 2 to register a new truck at the station.");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number == 1) {.....
        } else if (number == 2) {
            System.out.println("Choose your type of truck: van, small truck, heavy truck");
            String truckType = scanner.next();
            System.out.println("Write truck weight");
            int truckWeight = scanner.nextInt();
        }
    }
}



