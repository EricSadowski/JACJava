import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;





public class Main {

    public static void main(String[] args) throws Exception {

        File myFile = new File("src/teams.txt");
        Scanner inputFile = new Scanner(myFile);

        HashMap<String, ArrayList<String>> playersByTeams = new HashMap<>();
        ArrayList<String> teams = new ArrayList<>();
        ArrayList<String> players = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

//        HashMap<String, Integer> empIds = new HashMap<>();
//        empIds.put("John", 316);

        while (inputFile.hasNext()) {
            String str = inputFile.nextLine();
            list.add(str);
            String[] split = str.split(":");
            teams.add(split[0]);
            String[] iPlayers = split[1].split(",");
            for(String i : iPlayers){
                players.add(i);
            }
        }



        ArrayList<String> newPlayers = removeDuplicates(players);


        for (String key : playersByTeams.keySet()){
            if (list.contains(key)){

            }
        }

//        for(String i : newPlayers){
//            playersByTeams.put(i, null);
//        }
//
//        for(int i = 0; i < list.size(); i++ ){
//            if (list.get(i).contains())
//        }
//
//        playersByTeams.forEach((key, value) ->{
//            if()
//        });

        System.out.println(list);
        System.out.println(teams);
        System.out.println(newPlayers);

        inputFile.close();

    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        // return the new list
        return newList;
    }
}