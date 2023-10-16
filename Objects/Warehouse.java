package Objects;
import java.util.Scanner;


public class Warehouse implements Record{
    private int id;
    private String name;
    private int managerId;
    private String phoneNumber;
    private String city;
    private String state;
    private String zipcode;
    private int inventorySize;
    private int orderId;

    public Warehouse(int id) {
        this.id = id;
    }

    public void displayWarehouseDetails() {
        System.out.println("Warehouse ID: " + getId());
        System.out.println("Name: " + getName());
        // Print other attributes as needed
    }

    @Override
    public Object getId() {
        return id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for managerId
    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and Setter for zipcode
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // Getter and Setter for inventorySize
    public int getInventorySize() {
        return inventorySize;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    // Getter and Setter for orderId
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public static Warehouse create() {
        Scanner scanner = new Scanner(System.in);
        int id = (int) (Math.random() * 100000000);
        Warehouse warehouse = new Warehouse(id);

        System.out.println("--- Add Warehouse ---");

        System.out.print("Enter Warehouse Name: ");
        String name = scanner.nextLine();
        warehouse.setName(name);

        System.out.print("Enter Manager ID: ");
        int managerId = scanner.nextInt();
        warehouse.setManagerId(managerId);

        // Consume the newline character left in the scanner's buffer
        scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        warehouse.setPhoneNumber(phoneNumber);

        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        warehouse.setCity(city);

        System.out.print("Enter State: ");
        String state = scanner.nextLine();
        warehouse.setState(state);

        System.out.print("Enter Zipcode: ");
        String zipcode = scanner.nextLine();
        warehouse.setZipcode(zipcode);

        System.out.print("Enter Inventory Size: ");
        int inventorySize = scanner.nextInt();
        warehouse.setInventorySize(inventorySize);

        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        warehouse.setOrderId(orderId);

        return warehouse;
    }
}
