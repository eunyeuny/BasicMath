package Recur;

public class Practice2 {

    static int gcd(int a, int b){

        if( a % b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {

    }
}
