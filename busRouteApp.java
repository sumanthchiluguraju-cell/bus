import java.util.*;

class Bus {
    int busNumber;
    String driverName;
    String route;
    String[] stops;

    Bus(int busNumber, String driverName, String route, String[] stops) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.route = route;
        this.stops = stops;
    }

    void displayBus() {
        System.out.println("\n----------------------------");
        System.out.println("Bus Number : " + busNumber);
        System.out.println("Driver     : " + driverName);
        System.out.println("Route      : " + route);
        System.out.println("Stops      : " + String.join(" -> ", stops));
        System.out.println("----------------------------");
    }

    boolean hasStop(String searchStop) {
        for (String stop : stops) {
            if (stop.equalsIgnoreCase(searchStop)) {
                return true;
            }
        }
        return false;
    }
}

public class busRouteApp {

    static ArrayList<Bus> buses = new ArrayList<>();

    public static void main(String[] args) {

        // 33 College Buses
        addBuses();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== COLLEGE BUS ROUTE MANAGEMENT SYSTEM =====");
            System.out.println("1. View All Buses");
            System.out.println("2. Search Bus by Number");
            System.out.println("3. Search Bus by Stop");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    viewAllBuses();
                    break;

                case 2:
                    System.out.print("Enter Bus Number: ");
                    int number = sc.nextInt();
                    searchByBusNumber(number);
                    break;

                case 3:
                    System.out.print("Enter Stop Name: ");
                    String stop = sc.nextLine();
                    searchByStop(stop);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Add 33 buses
    static void addBuses() {

        buses.add(new Bus(1, "Srinivas", "Route 1",
                new String[]{"Habsiguda", "HMT Nagar", "Nacharam", "Mallapur", "chengicharala","Gatkesar","ACE engineering college"}));

        buses.add(new Bus(2, "Narasimha", "Route 2",
                new String[]{"chintal", "Bal Nagar", "Bownnpelly", "Suchitra", "Alwal", "Hakimpet","Tumkunta","Timmaipalli","Keesara","Bogaram","Kondapur","Gatkesar","NFC Nagar","ACE engineering college"}));

        buses.add(new Bus(3, "Hari prasad", "Route 3",
                new String[]{"Adikmet", "Ramnagar", "Chilkkalguda", "RTC X Roads", "Musherabad", "Chilkalguda X road", "Seethaphal mandi", "Tarnaka", "Habsiguda","Uppal","Ghatkesar","ACE engineering college"}));

        buses.add(new Bus(4, "Balaraju", "Route 4",
                new String[]{"Anamdbagh", "Malkajgiri", "Anutex","Meerjalguda","Shanthi nagar","Ghatkesar","Lalapet","Moulali","ECIL","Rampally","Gatkesar","ACE engineering college"}));

        
        
        buses.add(new Bus(5, "Laxman", "Route 5",
                new String[]{"Paradise", "Sangeet", "Mettuguda", "Habsiguda", "Uppal","uppaldepot","Canara Nagar","Medipally","Ghatkesar","ACE engineering college"} ));

        buses.add(new Bus(6, " Arif", "Route 6",
                new String[]{"Aramghar", "Upparpalli", "Attarpur","Mehdipatnam","NMDC","Mahaveer Hospital","Lakdikapul","Liberty","Himayatnagar","Narayanguda","Barkathpura","Fever hospital","Nallakunta","vidya Nagar","Shivam road","6No. junction","uppal","Gatkesar","ACE engineering college"}));

        buses.add(new Bus(7, "Murali", "Route 7",
                new String[]{"Miyapur", "JNTU", "Kukatpally","Moosapet","Bharat Nagar","Erragadda","ESI","SR nagar","Ameerpet","Begumpet","Paradise","Sangeet","Rail Nilayam","Mettuguda","Tarnaka","ACE engineering college"}));

        buses.add(new Bus(8, "Driver 8", "Route 8",
                new String[]{"Stop V", "Stop W", "Stop X", "College"}));

        buses.add(new Bus(9, "Driver 9", "Route 9",
                new String[]{"Stop Y", "Stop Z", "Main Road", "College"}));

        buses.add(new Bus(10, "Driver 10", "Route 10",
                new String[]{"Market", "Temple", "Bus Stand", "College"}));

        buses.add(new Bus(11, "Driver 11", "Route 11",
                new String[]{"Railway Station", "Main Road", "Circle", "College"}));

        buses.add(new Bus(12, "Driver 12", "Route 12",
                new String[]{"Hospital", "Market", "Circle", "College"}));

        buses.add(new Bus(13, "Driver 13", "Route 13",
                new String[]{"Village A", "Village B", "Village C", "College"}));

        buses.add(new Bus(14, "Driver 14", "Route 14",
                new String[]{"Village D", "Village E", "Village F", "College"}));

        buses.add(new Bus(15, "Driver 15", "Route 15",
                new String[]{"Town A", "Town B", "Town C", "College"}));

        buses.add(new Bus(16, "Driver 16", "Route 16",
                new String[]{"Town D", "Town E", "Town F", "College"}));

        buses.add(new Bus(17, "Driver 17", "Route 17",
                new String[]{"Stop 17A", "Stop 17B", "Stop 17C", "College"}));

        buses.add(new Bus(18, "Driver 18", "Route 18",
                new String[]{"Stop 18A", "Stop 18B", "Stop 18C", "College"}));

        buses.add(new Bus(19, "Driver 19", "Route 19",
                new String[]{"Stop 19A", "Stop 19B", "Stop 19C", "College"}));

        buses.add(new Bus(20, "Driver 20", "Route 20",
                new String[]{"Stop 20A", "Stop 20B", "Stop 20C", "College"}));

        buses.add(new Bus(21, "Driver 21", "Route 21",
                new String[]{"Stop 21A", "Stop 21B", "Stop 21C", "College"}));

        buses.add(new Bus(22, "Driver 22", "Route 22",
                new String[]{"Stop 22A", "Stop 22B", "Stop 22C", "College"}));

        buses.add(new Bus(23, "Driver 23", "Route 23",
                new String[]{"Stop 23A", "Stop 23B", "Stop 23C", "College"}));

        buses.add(new Bus(24, "Driver 24", "Route 24",
                new String[]{"Stop 24A", "Stop 24B", "Stop 24C", "College"}));

        buses.add(new Bus(25, "Driver 25", "Route 25",
                new String[]{"Stop 25A", "Stop 25B", "Stop 25C", "College"}));

        buses.add(new Bus(26, "Driver 26", "Route 26",
                new String[]{"Stop 26A", "Stop 26B", "Stop 26C", "College"}));

        buses.add(new Bus(27, "Driver 27", "Route 27",
                new String[]{"Stop 27A", "Stop 27B", "Stop 27C", "College"}));

        buses.add(new Bus(28, "Driver 28", "Route 28",
                new String[]{"Stop 28A", "Stop 28B", "Stop 28C", "College"}));

        buses.add(new Bus(29, "Driver 29", "Route 29",
                new String[]{"Stop 29A", "Stop 29B", "Stop 29C", "College"}));

        buses.add(new Bus(30, "Driver 30", "Route 30",
                new String[]{"Stop 30A", "Stop 30B", "Stop 30C", "College"}));

        buses.add(new Bus(31, "Driver 31", "Route 31",
                new String[]{"Stop 31A", "Stop 31B", "Stop 31C", "College"}));

        buses.add(new Bus(32, "Driver 32", "Route 32",
                new String[]{"Stop 32A", "Stop 32B", "Stop 32C", "College"}));

        buses.add(new Bus(33, "Driver 33", "Route 33",
                new String[]{"Stop 33A", "Stop 33B", "Stop 33C", "College"}));
    }

    // Display all buses
    static void viewAllBuses() {

        System.out.println("\n===== ALL 33 COLLEGE BUSES =====");

        for (Bus bus : buses) {
            bus.displayBus();
        }
    }

    // Search using bus number
    static void searchByBusNumber(int number) {

        for (Bus bus : buses) {

            if (bus.busNumber == number) {
                bus.displayBus();
                return;
            }
        }

        System.out.println("Bus number " + number + " not found.");
    }

    // Search using stop name
    static void searchByStop(String stop) {

        boolean found = false;

        System.out.println("\nBuses available at: " + stop);

        for (Bus bus : buses) {

            if (bus.hasStop(stop)) {
                System.out.println("Bus " + bus.busNumber +
                        " - " + bus.route);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bus found for this stop.");
        }
    }
}