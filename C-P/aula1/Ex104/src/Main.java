import java.io.*;
import java.util.*;

public class Main {
    private static Scanner inputScanner;

    public static void main(String[] args) {
        Map<String, Integer> numberMap = loadNumbersFromFile("numbers.txt");

        while(inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine().replace('-', ' ');
            Scanner lineScanner = new Scanner(line);

            for(boolean isFirstWord = true; lineScanner.hasNext(); isFirstWord = false) {
                String word;
                String lowerCaseWord = (word = lineScanner.next()).toLowerCase();
                if (!isFirstWord) {
                    System.out.print(" ");
                }

                if (numberMap.containsKey(lowerCaseWord)) {
                    word = numberMap.get(lowerCaseWord).toString();
                }

                System.out.print(word);
            }

            lineScanner.close();
            
            System.out.println();
        
        }
    }

    private static Map<String, Integer> loadNumbersFromFile(String fileName) {
        HashMap<String, Integer> numberMap = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File(fileName));

            while(fileScanner.hasNextLine()) {
                String line;
                if ((line = fileScanner.nextLine().trim()).length() > 0) {
                    String[] splitLine;
                    if ((splitLine = line.split(" - ")).length != 2) {
                        System.err.println("ERROR: syntax error in number file!");
                        System.exit(1);
                    }

                    String numberName = splitLine[1].toLowerCase();
                    if (numberMap.containsKey(numberName)) {
                        System.err.println("ERROR: repeated number \"" + numberName + "\" in number file!");
                        System.exit(1);
                    }

                    try {
                        numberMap.put(numberName, Integer.parseInt(splitLine[0]));
                    } catch (NumberFormatException e) {
                        System.err.println("ERROR: invalid number \"" + splitLine[0] + "\" in number file!");
                        System.exit(1);
                    }
                }
            }

            fileScanner.close();
        } catch (IOException e) {
            System.err.println("ERROR: reading number file!");
            System.exit(2);
        }

        return numberMap;
    }

    static {
        inputScanner = new Scanner(System.in);
    }
}