package astalakshmi.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Service> services = new ArrayList<>();
        services.add(new Service.WinterTireChange(1, "Winter Tire Change", 1000, 200, 4));

        services.add(new Service.WinterTireChange.SummerTireChange(2, "Summer Tire Change", 1200, 200, 4));
        for (Service service : services) {
            System.out.println("Service: " + service.getName() + ", Price: " + service.CalculateServicePrice());

            }

        }
    }
