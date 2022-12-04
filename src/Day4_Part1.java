import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4_Part1 {
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
            int firstStart = strParse.nextInt();
            int firstEnd = strParse.nextInt();
            int secondStart = strParse.nextInt();
            int secondEnd = strParse.nextInt();
            if((firstStart <= secondStart && firstEnd >= secondEnd) || (firstStart >= secondStart && firstEnd <= secondEnd)){
                numPairs++;
            }
        }
        System.out.println(numPairs);


    }






}
