package Test;

import java.util.HashSet;

public class Practice4 {

    public static boolean recur(int n){
        HashSet<Integer> set = new HashSet<>();

        while(set.add(n)){
            int squareSum = 0;
            while(n > 0){
                int remain = n % 10;
                squareSum += remain * remain;
                n /= 10;
            }

            if(squareSum == 1){
                return true;
            }
            else{
                n = squareSum;
            }
        }


        return false;
    }
    public static void main(String[] args) {
        System.out.println(recur(61));
    }
}
