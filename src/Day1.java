
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
    Takes a file containing groups of ints
    prints the largest 3 groupings

 */
public class Day1 {
    public static void main(String[] args) {
        int maxCalories;
        int currentElf = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        Scanner fileInput = null;
        try{
            fileInput = new Scanner(new FileInputStream("day1.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            System.exit(0);
        }

        while(fileInput.hasNext()){
            System.out.println(currentElf++);

            int currentCalorieSum = 0;
            while(fileInput.hasNext()){
                String input = fileInput.nextLine();
                if(input.isBlank())
                    break;
                currentCalorieSum += Integer.parseInt(input);
            }
            if(currentCalorieSum > first) {
                third = second;
                second = first;
                first = currentCalorieSum;
            } else if (currentCalorieSum > second) {
                third = second;
                second = currentCalorieSum;
            } else if (currentCalorieSum > third){
                third = currentCalorieSum;
            }

        }

        maxCalories = first + second + third;
        System.out.println(maxCalories);
        //System.out.println(elfWithMostCal);








    }




}
