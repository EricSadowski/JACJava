import java.util.HashMap;



public class SuperFibs {

    public static void main(String[] args) {
        SuperFibs f = new SuperFibs();
long test = f.getNthFib(4);
long test2 = stepsCount;
System.out.println(test);
System.out.println(test2);

//SuperFibs g = new SuperFibs();
//long test3 = g.getNthFib(4);
//long test4 = stepsCount;

//System.out.println(test3);
//        System.out.println(test4);


    }

    private HashMap<Integer,Long> cache = new HashMap<>();
    public static int stepsCount = 1;
    public long getNthFib(int n){
        //if n<1 => throwIndexOutOfBoundsException

       long res;
//
//        if (cache.containsKey(n)) {
//            return cache.get(n);
//        }else{
            if(n==0) return 0;
            if(n==1) return 0;
            if(n==2) return 1;
            if(n==4) stepsCount++;

            res = getNthFib(n-1) + getNthFib(n-2) + getNthFib(n-3);
            //if(n==3) return 1;

      //  }

        cache.put(n, res);

        return res;


    }
}
