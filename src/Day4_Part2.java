import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4_Part2 {
    public static void main(String[] args) {
        Scanner fileIn = null;
        try{
            fileIn = new Scanner(new FileInputStream("day4.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        }
        int numPairs = 0;

        while(fileIn.hasNextLine()) {
            String currentPair = fileIn.nextLine();
            currentPair = currentPair.replaceAll("[^0-9]", " ");
            Scanner strParse = new Scanner(currentPair);
            int a1 = strParse.nextInt();
            int a2 = strParse.nextInt();
            int b1 = strParse.nextInt();
            int b2 = strParse.nextInt();
            if((a1 >= b1 && a1 <= b2) || (a2 >= b1 && a2 <= b2)|| (b1 >= a1 && b1 <= a2) || (b2 > a1 && b2 < a2)){
                numPairs++;
            }
        }
        System.out.println(numPairs);


    }






}
