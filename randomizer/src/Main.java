import java.util.*;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);
    public static List<String> prerandList;
    public static List<String> randList;
    public static void main(String[] args)
    {
        prerandList = new ArrayList<>();
        System.out.println("How many items in list");
        int listLength = Integer.parseInt(inputScanner.nextLine());
        System.out.println(listLength);
        for(int i = 0; i<listLength; i++)
        {
            System.out.println("Add value: ");
            String newValue = inputScanner.nextLine();
            prerandList.add(newValue);
        }

        randList = new ArrayList<>(prerandList);
        Collections.shuffle(randList);

        System.out.println(prerandList);
        System.out.println(randList);
    }
}