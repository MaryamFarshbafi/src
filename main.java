import java.util.Scanner;
import Objects.Equipment;
import Objects.Member;
import Objects.Warehouse;
import Objects.Database;


class RecordManagementSystem {
    private Database<Member> memberDatabase = new Database<>();
    private Database<Equipment> equipmentDatabase = new Database<>();
    private Database<Warehouse> warehouseDatabase = new Database<>();


    public static void main(String[] args) {
        RecordManagementSystem system = new RecordManagementSystem();
        system.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Record Management System");
            System.out.println("1. Add New Record");
            System.out.println("2. Edit Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Search Record");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    this.addMenu();
                    break;
                case 2:
                    this.editMenu();
                    break;
                case 3:
                    this.deleteMenu();
                    break;
                case 4:
                    this.searchMenu();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public void addMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println(" Add New Record");
        System.out.println("11. Add New Member");
        System.out.println("12. Add New WareHouse");
        System.out.println("13. Add New Equipment");
        System.out.println("10. Exit To Main Menu");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        boolean res = false;

        switch (choice) {
            case 11:
                Member member = Member.create();
                res = memberDatabase.addRecord(member);
                if(res) {
                    System.out.print("Member is added.");
                }
                else {
                    System.out.print("There is a problem, can't add member!!!!");
                }
                break;
            case 12:
                Warehouse warehouse = Warehouse.create();
                res = warehouseDatabase.addRecord(warehouse);
                if(res) {
                    System.out.print("Warehouse is added.");
                }
                else {
                    System.out.print("There is a problem, can't add warehouse!!!!");
                }
                break;
            case 13:
                Equipment equipment = Equipment.create();
                res = equipmentDatabase.addRecord(equipment);
                if(res) {
                    System.out.print("Equipment is added.");
                }
                else {
                    System.out.print("There is a problem, can't add equipment!!!!");
                }
                break;
            case 10:
                System.out.print("Going To Main Menu");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void editMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println(" Edit A Record");
        System.out.println("21. Edit A Member");
        System.out.println("22. Edit A WareHouse");
        System.out.println("23. Edit A Equipment");
        System.out.println("20. Exit To Main Menu");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();


        switch (choice) {
            case 21:
                // Edit A Member
                
                break;
            case 22:
                // Edit A WareHouse
               
                break;
            case 23:
                // Edit A WareHouse

                break;
            case 20:
                System.out.print("Going To Main Menu");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void deleteMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println(" Delete A Record");
        System.out.println("31. Delete A Member");
        System.out.println("32. Delete A WareHouse");
        System.out.println("33. Delete A Equipment");
        System.out.println("30. Exit To Main Menu");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        boolean res = false;

        switch (choice) {
            case 31:
                System.out.println("Give Member Id:");
                int memberId = scanner.nextInt();
                scanner.nextLine();
                Member member = memberDatabase.getRecordById(memberId);
                res = memberDatabase.deleteRecord(member);
                if(res) {
                    System.out.print("Member is deleted.");
                }
                else {
                    System.out.print("There is a problem, can't delete member!!!!");
                }
                break;
            case 32:
                System.out.println("Give Warehouse Id:");
                int wareHouseId = scanner.nextInt();
                scanner.nextLine();
                Warehouse warehouse = warehouseDatabase.getRecordById(wareHouseId);
                res = warehouseDatabase.deleteRecord(warehouse);
                if(res) {
                    System.out.print("Warehouse is deleted.");
                }
                else {
                    System.out.print("There is a problem, can't delete warehouse!!!!");
                }
                break;
            case 33:
                System.out.print("Give Equipment Id:");
                String equipmentId = scanner.nextLine();
                Equipment equipment = equipmentDatabase.getRecordById(equipmentId);
                res = equipmentDatabase.deleteRecord(equipment);
                if(res) {
                    System.out.print("Equipment is deleted.");
                }
                else {
                    System.out.print("There is a problem, can't delete equipment!!!!");
                }
                break;
            case 30:
                System.out.print("Going To Main Menu");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void searchMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println(" Search A Record");
        System.out.println("41. Search A Member");
        System.out.println("42. Search A WareHouse");
        System.out.println("43. Search A Equipment");
        System.out.println("40. Exit To Main Menu");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();


        switch (choice) {
            case 41:
                System.out.println("Give Member Id:");
                int memberId = scanner.nextInt();
                scanner.nextLine();
                Member member = memberDatabase.getRecordById(memberId);
                member.displayMemberDetails();
                break;
            case 42:
                System.out.println("Give WareHouse Id:");
                int wareHouseId = scanner.nextInt();
                scanner.nextLine();
                Warehouse warehouse = warehouseDatabase.getRecordById(wareHouseId);
                warehouse.displayWarehouseDetails();
                break;
            case 43:
                System.out.print("Give Equipment Id:");
                String equipmentId = scanner.nextLine();
                Equipment equipment = equipmentDatabase.getRecordById(equipmentId);
                equipment.displayEquipmentDetails();
                break;
            case 40:
                System.out.print("Going To Main Menu");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}