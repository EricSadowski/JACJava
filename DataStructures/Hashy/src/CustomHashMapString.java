public class CustomHashMapString {

    private Container[] hashTable = new Container[5];
    int totalItems;
    private class Container{
        Container next;
        String key;
        String value;

        public Container getNext() {
            return next;
        }

        public void setNext(Container next) {
            this.next = next;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private int computeHashValue(String key){
        //how I can compute the hashkey
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash <<= 1;  // same as: hash *= 2, adding xor may be better
            char c = key.charAt(i);
            //hash += c;
            hash = hash ^ c;
        }
        return hash;

    }

    //this method for adding a new element to the map
    void put(String key, String value){
        //with the hashCode we can decide where would be the index of key
        int hashCode = computeHashValue(key);
        int index = hashCode % hashTable.length; //gives me the index for inserting a new key [looking for a key]
        Container currContainer = hashTable[index];


        if (currContainer == null){
            Container insert = new Container();
            insert.setValue(value);
            insert.setKey(key);
            hashTable[index] = insert;
        }else {
            while (currContainer.next != null) {
                if (currContainer.key.equals(key)) {
                    currContainer.setValue(value);
                    return;
                }
                currContainer = currContainer.next;
            }
            if(currContainer.key.equals(key)){
                currContainer.setValue(value);
                return;
            }
            Container insert = new Container();
            insert.setValue(value);
            insert.setKey(key);
            currContainer.next = insert;
        }
    totalItems++;
    }

    boolean hasKey(String key){
        // first you need to find the index
        int hashCode = computeHashValue(key);
        int index = hashCode % hashTable.length;

        Container currContainer = hashTable[index];

        if (currContainer == null){
            return false;
        }else {
            while (currContainer.next != null) {
                if (currContainer.key.equals(key)) {
                    return true;
                }
                currContainer = currContainer.next;
            }
            if(currContainer.key.equals(key)){
                return true;
            }
            return false;
        }

    }

    String getValue(String key){
        //similar to haskey
        int hashCode = computeHashValue(key);
        int index = hashCode % hashTable.length;

        Container currContainer = hashTable[index];

        if (currContainer == null){
            return null;
        }else {
            while (currContainer.next != null) {
                if (currContainer.key.equals(key)) {
                    return currContainer.getValue();
                }
                currContainer = currContainer.next;
            }
            if(currContainer.key.equals(key)){
                return currContainer.getValue();
            }
            return null;
            //throw  new KeyNotFoundException("the key does not exist");
        }
    }

    void deleteByKey(String key){
        // find the index
        // find the container(node) and delete the node

        int hashCode = computeHashValue(key);
        int index = hashCode % hashTable.length; //gives me the index for inserting a new key [looking for a key]

        Container curContainer = hashTable[index];
        Container previous = null;

        while (curContainer != null){
            if(curContainer.key.equals(key)){
                // I found it !
                break;
            }
            previous = curContainer; // to have reference of the previous node
            curContainer = curContainer.next;
        }

        // if the key does not exist
        if (curContainer == null){
            return;
            //throw new KeyNotFoundException("the key does not exist");
        }

        //we found it at the beginning of the linkedlist
        if(previous ==null){
            hashTable[index] = curContainer.next; // means ignoring the first element
        }
        else{
            previous.next = curContainer.next; //change the reference of previous to the next
        }

        totalItems --;

    }

    public String[] getAllKeys(){
        String[] result = new String[totalItems];
        int keyCounter = 0;
        for(int i =0 ;i< hashTable.length; i++){
            for(Container curContainer = hashTable[i]; curContainer != null ; curContainer = curContainer.next ){
                result[keyCounter ++] = curContainer.key;
            }
        }

        return result;
    }

    public int getSize(){
        return totalItems;
    }

    public void print(){
        for(int i =0 ;i< hashTable.length; i++){
            System.out.printf("Entry %d \n", i);
            for(Container curContainer = hashTable[i]; curContainer != null ; curContainer = curContainer.next ){
                System.out.printf(" - key %s, value %s \n", curContainer.key, curContainer.value);
            }
        }
    }


    // have a method to give me a list of key and values
    // a structure to give me the key and value
//    public Pair<String, String>[] getAllKeyValuePairs(){
//        Pair<String, String>[] result = new Pair[totalItems];
//        int keyCounter = 0;
//        for(int i =0 ;i< hashTable.length; i++){
//            for(Container curContainer = hashTable[i]; curContainer != null ; curContainer = curContainer.next ){
//                Pair<String, String> pair = new Pair<>(curContainer.key, curContainer.value);
//                result[keyCounter++] = pair;
//            }
//        }
//
//        return result;
//    }


    // have a method to give me a list of key and values
}
