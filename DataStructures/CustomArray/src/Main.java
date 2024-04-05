public class Main {

    public class CustomArrayInt {
        //it has only one element
        private int[] data = new int[1];
        private int size = 0;

        // adding element
        public void add(int value){
            //adjust the size
            ensureSpaceForNewElement();
            data[size] = value;
            size++;
        }

        //DELETE BY INDEX

        /**
         * it throws exception if the index is less than 0 or more than size
         * @param index
         */
        public int[] deleteByIndex(int index){

            if(index < 0 || index > size){
                throw new IllegalArgumentException("Index out of bounds");
            }else{
                int[] newData = new int[size];
                for(int i = 0; i < index; i++){
                    newData[i] = data[i];
                }
                for(int i = 0; i < size; i++){
                    newData[index + i +1] = data[i];
                }
                data = newData;
                return data;

            }

        }


        //DELETE BY VALUE
        /**
         *
         * @param value
         * @return false when there is no value exists in the array
         */
        public boolean deleteByValue(int value){
            return false;
        }

        /**
         * insert the value in the index and it
         * throws IndexOutOfBoundException if the index is less than 0 or more than the size
         * @param value
         * @param index
         */
        public void insertAtIndex(int value, int index){

        }

        // it clears the array
        public void clear(){
                int[] newData = new int[0];
                data = newData;
                size=0;
        }

        /**
         * indexOutOfBoundException if index less than 0 or greater than size of the array
         * @param index
         * @return
         */
        public int get(int index){
        return data[index];
        }

//        public int[] getSlice(int startIndex, int length){
//
//        }
//
//        public String toString(){
//
//        }

        //checks the size
        private void ensureSpaceForNewElement() {
            // for checking if it is full or not, we can compare
            //size and length of the array
            if(size == data.length){
                //grow ? I am creating a new array that the size is double the size of data
                int[] newData = new int[data.length * 2];

                //copy data from the old data array into the new one
                for(int i=0; i< data.length; i++){
                    newData[i] = data[i];
                }

                //switch
                data =newData;
            }
        }
    }

}