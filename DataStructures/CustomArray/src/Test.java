import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        GenericArray<String> customGeneric = new GenericArray<>();

        CustomArrayInt customArrayInt = new CustomArrayInt();
        customArrayInt.add(1);
        customArrayInt.add(2);
        customArrayInt.add(3);
        customArrayInt.add(4);
        customArrayInt.add(5);
        customArrayInt.add(6);
        customArrayInt.add(7);

        customGeneric.add("hi");
        customGeneric.add("wow");
        customGeneric.add("ok");



        System.out.println(customArrayInt);
        System.out.println(customArrayInt.getSize());
        customArrayInt.deleteByIndex(2);

        System.out.println(customArrayInt.getSize());

        customArrayInt.clear();

        System.out.println(customArrayInt);
        System.out.println(customGeneric);
    }

}
