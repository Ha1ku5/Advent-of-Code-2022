import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3_Part2 {
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
            String elf1 = fileInput.nextLine();
            String elf2 = fileInput.nextLine();
            String elf3 = fileInput.nextLine();

            for(int i = 0; i < elf1.length(); i++) {
                //finds the value of elf1 that is present in both elf2 and elf3
                if (elf2.contains(elf1.charAt(i) + "") && elf3.contains(elf1.charAt(i) + "")) {
                    prioritySum += PriorityValues.indexOf(elf1.charAt(i));
                    break;
                }
            }

        }
        System.out.println(prioritySum);
    }
}
