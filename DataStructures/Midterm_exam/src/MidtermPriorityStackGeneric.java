import org.junit.Assert;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;

class TestMe<T> {
    // Example: how to create and return a generic array
    public T[] makeArray(Class<T> type, T val0, T val1, T val2) {
        T[] array = (T[]) Array.newInstance(type, 3);
        array[0] = val0;
        array[1] = val1;
        array[2] = val2;
        return array;
    }
}

public class MidtermPriorityStackGeneric {

    public static void main(String[] args) {        
        // you can put code here if you like but it WILL NOT BE GRADED
        
//        PriorityStack<String> instance = new PriorityStack<>();
//        instance.push("Jerry");
//        instance.push("Terry");
//        instance.push("Larry");
//        instance.push("Barry");
//        Object [] result = instance.toArrayReversed(String.class);
//        Object [] expected = {"Jerry", "Terry", "Larry", "Barry" };
//        Assert.assertArrayEquals(expected, result);
        

//        PriorityStack<String> instance = new PriorityStack<>();
//        instance.push("Jerry", false);
//        instance.push("Terry");
//        instance.push("Larry", true);
//        instance.push("Barry");
//        instance.push("Eva", true);
//        instance.push("Martha");
//        instance.push("Ruth");
//        instance.push("Jack", true);
//        String res1 = instance.popPriority();
//        String res2 = instance.popPriority();
//        String res3 = instance.popPriority();
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);
        //instance.reorderByPriority();
       // System.out.println("Expected: [Eva:P,Larry:P,Ruth:N,Martha:N,Barry:N,Terry:N,Jerry:N]");
//        System.out.println("Result  : " + instance.toString());

        PriorityStack<String> instance = new PriorityStack<>();
        instance.push("Jerry", true);
        instance.push("Terry");
        instance.push("Larry", true);
        instance.push("Barry");
        instance.push("Harry", true);


        System.out.println(instance.toString());
        String wow = instance.reorderByPriority();
        System.out.println(wow);
        System.out.println(instance.toString());
//        assertEquals(4,instance.getSize());
//        assertEquals("[Barry:N,Larry:P,Terry:N,Jerry:N]",instance.toString());
//        int res1 = instance.hasValue("Eva");
//        assertEquals(-1, res1);
//        int res2 = instance.hasValue("Terry");
//        assertEquals(2, res2);
//        String res3 = instance.removeValue("Jerry");
//        System.out.println(instance.toString());
//        assertEquals("Jerry", res3);
//        String res4 = instance.removeValue("Barry");
//        System.out.println(res4);
//        System.out.println(instance.toString());

        //assertEquals("Barry", res4);
       // System.out.println(instance);
//        String res5 = instance.pop();
//        System.out.println(res5);
//        System.out.println(instance.toString());

        //assertEquals("Larry", res5);


//        PriorityStack<String> instance = new PriorityStack<>();
//        instance.push("Jerry");
//        //instance.push("Joe", true);
//        instance.push("Terry");
//        instance.push("Barry");
//        instance.push("Larry", true);
//        String res1 = instance.popPriority();
//        int res2 = instance.hasValue("Terry");
//        System.out.println("Expected Larry, got " + res1);
//        System.out.println( res2 + " in the building!");

        /*
        PriorityStack<String> instance = new PriorityStack<>();
        instance.push("Jerry");
        instance.push("Terry");
        instance.push("Larry", true);
        instance.push("Barry");
        int size = instance.getSize();
        */
        // assertEquals("[Barry:N,Larry:P,Terry:N,Jerry:N]",instance.toString());      
        
        /* // code demonstrating returning an array of a specific generic type
        TestMe<String> testMe = new TestMe<>();
        String [] result = testMe.makeArray(String.class, "Jerry", "Barry", "Larry");
        for (String s : result) {
            System.out.println("Value: " + s);
        } */
    }
    
}
