import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    //public static Scanner inputScanner = new Scanner(System.in);
    public static List<String> prerandList;
    public static List<String> randList;
    public static void main(String[] args)
    {
        prerandList = new ArrayList<>();
        /*System.out.println("How many items in list");
        int listLength = Integer.parseInt(inputScanner.nextLine());
        System.out.println(listLength);
        for(int i = 0; i<listLength; i++)
        {
            System.out.println("Add value: ");
            String newValue = inputScanner.nextLine();
            prerandList.add(newValue);
        }*/
        try
        {
            Scanner input = new Scanner(new File("input.txt"));
            while(input.hasNextLine())
            {
                String line = input.nextLine();
                prerandList.add(line);
            }
            input.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        randList = new ArrayList<>(prerandList);
        Collections.shuffle(randList);

        System.out.println(randList);

        try
        {
            File output = new File("output.txt");
            FileWriter outputWriter = new FileWriter(output);

            for(int i=0; i<randList.size(); i++)
            {
                outputWriter.write((i + 1) + " " + randList.get(i));
                outputWriter.write("\n");
            }
            outputWriter.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}