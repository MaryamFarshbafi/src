package Objects;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class Member implements Record {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date dateOfBirth;

    private String street;
    private String city;
    private String zipcode;

    private AvailableStatus availableStatus;
    private MemberStatus memberStatus;

    private double distanceOfWarehouse;
    private Date dateOfReturn;
    private String purchaseType;
    private int warehouseId;

    public Member(int id, AvailableStatus availableStatus, MemberStatus memberStatus) {
        this.id = id;
        this.availableStatus = availableStatus;
        this.memberStatus = memberStatus;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + getId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        // Print other attributes as needed
    }

    @Override
    public Object getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public AvailableStatus getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(AvailableStatus availableStatus) {
        this.availableStatus = availableStatus;
    }

    public MemberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public double getDistanceOfWarehouse() {
        return distanceOfWarehouse;
    }

    public void setDistanceOfWarehouse(double distanceOfWarehouse) {
        this.distanceOfWarehouse = distanceOfWarehouse;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }


    public static Member create() {
        Scanner scanner = new Scanner(System.in);
        int id = (int) (Math.random() * (100000000 - 0 + 1));
        Member member = new Member(id, AvailableStatus.ACTIVE, MemberStatus.ACTIVE);

        System.out.println("--- Add Member ---");
        System.out.print("Enter First Name:");
        String firstName = scanner.nextLine();
        member.setFirstName(firstName);
        
        System.out.print("Enter Last Name:");
        String lastName = scanner.nextLine();
        member.setLastName(lastName);

        System.out.print("Enter Email:");
        String email = scanner.nextLine();
        member.setEmail(email);

        System.out.print("Enter Phone Numbner:");
        String phoneNumber = scanner.nextLine();
        member.setPhoneNumber(phoneNumber);

        System.out.print("Enter A BirthDate (in format MM/dd/yyyy): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date dateOfBirth = null;
        try {
            dateOfBirth = dateFormat.parse(dateString);
            member.setDateOfBirth(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in MM/dd/yyyy format.");
        }


        System.out.print("Enter city:");
        String city = scanner.nextLine();
        member.setCity(city);

        System.out.print("Enter Street:");
        String street = scanner.nextLine();
        member.setStreet(street);

        System.out.print("Enter Zipcode:");
        String zipcode = scanner.nextLine();
        member.setZipcode(zipcode);

        System.out.print("Enter A Date Of Return (in format MM/dd/yyyy): ");
        dateString = scanner.nextLine();
        Date dateOfReturn = null;
        try {
            dateOfReturn = dateFormat.parse(dateString);
            member.setDateOfReturn(dateOfReturn);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in MM/dd/yyyy format.");
        }

        System.out.print("Enter Purchase Type:");
        String purchaseType = scanner.nextLine();
        member.setPurchaseType(purchaseType);

        System.out.print("Enter Distance Of Warehouse:");
        double distanceOfWarehouse = scanner.nextDouble();
        member.setDistanceOfWarehouse(distanceOfWarehouse);

        System.out.print("Enter Warehouse Id:");
        int warehouseId = scanner.nextInt();
        member.setWarehouseId(warehouseId);
        
        return member;
    }
}