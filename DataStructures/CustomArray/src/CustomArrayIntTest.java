import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayIntTest {

    @Test
    void add() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);

        assertEquals(2, array.getSize());
        assertEquals(6, array.get(0));
    }


    @Test
    void deleteByIndex() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);
        array.deleteByIndex(1);

        assertEquals(1, array.getSize());
    }

    @Test
    void deleteByValue() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);
        array.deleteByValue(6);

        assertEquals(1, array.getSize());
        assertEquals(5, array.get(0));

    }

    @Test
    void insertAtIndex() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);
        array.insertAtIndex(1,1);
        assertEquals(1, array.get(1));

    }

    @Test
    void clear() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);
        array.clear();
        assertEquals(0, array.getSize());

    }

    @Test
    void get() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        assertEquals(6, array.get(0));
    }

    @Test
    void getSlice() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);
        array.add(4);
        array.add(3);

        int[] slice = array.getSlice(1,2);

        int[] expected = {5,4};

        assertArrayEquals(expected, slice);
    }

//    @Test
//    void testToString() {
//
//        CustomArrayInt array = new CustomArrayInt();
//        array.add(6);
//        array.add(5);
//
//        String expected = "[6, 5]";
//        assertE
//    }

    @Test
    void getSize() {
        CustomArrayInt array = new CustomArrayInt();
        array.add(6);
        array.add(5);

        assertEquals(2, array.getSize());
    }
}