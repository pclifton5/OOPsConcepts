import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InventoryFile{
    public static Path inventoryList = Paths.get(System.getProperty("user.dir") + "\\resources\\sample_data.txt");
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //Create
        System.out.println("Inventory List");
        createList();

        //Update
        System.out.println("Updating Inventory List");
        updateList();
        //Read
        System.out.println("List shows what we have in stock");
        readList();
        //Delete
        System.out.println("Do you want to delete list? Enter Y to do so or N to leave");
        String callDelete = scanner.next();
        if (callDelete == "Y"){
         deleteOption();
        }else{
            System.out.println("Thank you for your time.");
            System.exit(0);
            }
        }

        //Create inventory list
        public static void createList() {
            try {
                Files.createFile(inventoryList);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //Update list
        public static void updateList() {
            try {
                Files.writeString(inventoryList, "Show update with ordering new items and removing items from stock");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //Read list
        public static void readList(){
            String temp;
            try{
            temp = Files.readString(inventoryList);
                System.out.println(temp);
            }catch (Exception e){
                e.printStackTrace();
                }
            }


        //Delete the list file
        public static void deleteOption() {
            System.out.println("Do you want to delete this file? Enter Y or N");
        String choice = scanner.next();
        if (choice == "Y"){
            System.out.println("Are you sure? Enter Y or N");
            String finalChoice = scanner.next();
            if (finalChoice == "Y"){
            Files.delete(inventoryList);
                System.out.println("File Inventory List has been deleted.");
            }else{
                System.out.println("File intact.");
                System.exit(0);
            }
        }else{
            System.out.println("File intact.");
            System.exit(0);
        }
    }
}
