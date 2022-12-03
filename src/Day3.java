import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner fileInput = null;
        try{
            fileInput = new Scanner(new FileInputStream("day1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }

        int prioritySum = 0;

        while (fileInput.hasNextLine()){ //each loop is a new backpack
            String backpack = fileInput.nextLine();
            int size = backpack.length();

            String compartment1 = backpack.substring(0, size / 2);
            String compartment2 = backpack.substring(size/2);

            for(int i = 0; i < size / 2; i++){


            }













        }



    }





}
