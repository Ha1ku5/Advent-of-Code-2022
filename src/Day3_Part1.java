import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3_Part1 {
    //if you put the values in a string like this, the index of the value corresponds to the priority value
    //b is at index 2, and has prio value of 2, use string.indexOf(char) to get the index of a character
    static String PriorityValues = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        Scanner fileInput = null;
        try{
            fileInput = new Scanner(new FileInputStream("day3.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(0);
        }
        //the value to be calculated for the answer to the problem
        int prioritySum = 0;

        while (fileInput.hasNextLine()){ //each loop is a new backpack
            String backpack = fileInput.nextLine();
            int size = backpack.length();
            String compartment1 = backpack.substring(0, size / 2);
            String compartment2 = backpack.substring(size/2);

            //checks if any value in comp1 is present in comp2
            for(int i = 0; i < compartment1.length(); i++) {
                if (compartment2.contains(compartment1.charAt(i) + "")) {
                    prioritySum += PriorityValues.indexOf(compartment1.charAt(i));
                    break;
                }
            }
        }
        System.out.println(prioritySum);
    }
}
