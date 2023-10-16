package Objects;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.security.SecureRandom;


public class Equipment implements Record{
    private String serialNumber;
    private String name;
    private int length;
    private int width;
    private int height;
    private String description;
    private double weight;
    private Date purchaseDate;
    private AvailableStatus availableStatus;
    private String itemLocation;
    private int warehouseId;
    private String orderNumber;

    public Equipment(String serialNumber, AvailableStatus availableStatus) {
        this.serialNumber = serialNumber;
        this.availableStatus = availableStatus;
    }

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

    private static String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }

    public void displayEquipmentDetails() {
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Name: " + getName());
        // Print other attributes as needed
    }

    @Override
    public String getId() {
        return serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter and Setter for width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Getter and Setter for height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter and Setter for purchaseDate
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    // Getter and Setter for availableStatus
    public AvailableStatus getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(AvailableStatus availableStatus) {
        this.availableStatus = availableStatus;
    }

    // Getter and Setter for itemLocation
    public String getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    // Getter and Setter for warehouseId
    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    // Getter and Setter for orderNumber
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    // Create method to create Equipment object
    public static Equipment create() {
        Scanner scanner = new Scanner(System.in);
        String serialNumber = generateRandomString(12);
        Equipment equipment = new Equipment(serialNumber, AvailableStatus.ACTIVE);

        System.out.println("--- Add Equipment ---");
        
        System.out.print("Enter Name: ");
        equipment.setName(scanner.nextLine());

        System.out.print("Enter Length: ");
        equipment.setLength(scanner.nextInt());

        System.out.print("Enter Width: ");
        equipment.setWidth(scanner.nextInt());

        System.out.print("Enter Height: ");
        equipment.setHeight(scanner.nextInt());

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Description: ");
        equipment.setDescription(scanner.nextLine());

        System.out.print("Enter Weight: ");
        equipment.setWeight(scanner.nextDouble());

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Purchase Date (in format MM/dd/yyyy): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date purchaseDate = null;
        try {
            purchaseDate = dateFormat.parse(dateString);
            equipment.setPurchaseDate(purchaseDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in MM/dd/yyyy format.");
        }

        System.out.print("Enter Item Location: ");
        equipment.setItemLocation(scanner.nextLine());

        System.out.print("Enter Warehouse ID: ");
        equipment.setWarehouseId(scanner.nextInt());

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Order Number: ");
        equipment.setOrderNumber(scanner.nextLine());

        return equipment;
    }
}
