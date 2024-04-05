public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyHashMap<Integer, Integer> hMap = new MyHashMap<>();

        int key = 30;
        int value = 666;
        hMap.put(key, value);

        int putValue = hMap.get(30);
        System.out.println(putValue);
        hMap.remove(30);


        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("A", "B");
        myHashMap.put("E", "F");
        myHashMap.put("H", "P");
        myHashMap.put("P", "2");
        myHashMap.put("1",  "G");
        myHashMap.put("2", "6");
        myHashMap.put("3", "2");
        myHashMap.put("4", "4");
        myHashMap.put("1",  "H");


   System.out.println(myHashMap);
   System.out.println(myHashMap.get("A"));
   System.out.println(myHashMap.remove("A"));
        myHashMap.remove("2");
        System.out.println(myHashMap);
    }
    }
