package Case;

import java.util.ArrayList;

//약수구하기, 두 수의 최대공약수와 최소공배수 구하기
//활용) 1~10 의 수 중 A의 약수 또는 B의 약수인 경우의 수
//활용) 1~10 의 수 중 A의 약수이면서 B의 약수인 경우의 수
public class Practice {

        //약수
        public ArrayList getDevisor(int num) {
            ArrayList result = new ArrayList();

            for(int i=1; i <= (int)num/2; i++){
                if(num % i == 0){
                    result.add(i);
                }
            }
            result.add(num);

            return result;
        }

        //최대 공약수
        public int getGCD(int numA, int numB){
            int gcd = -1;
            ArrayList list1 = this.getDevisor(numA);
            ArrayList list2 = this.getDevisor(numB);

            for(int itemA : (ArrayList<Integer>) list1){
                for(int itemB : (ArrayList<Integer>) list2){
                    if(itemA == itemB){
                        if(itemA > gcd){
                            gcd = itemA;
                        }
                    }
                }
            }
            return gcd;
        }

        //최소 공배수
        public int getLCM(int numA, int numB){
            int lcm = -1;

            int gcd = this.getGCD(numA,numB);

            if (gcd != -1) {
                lcm = numA * numB / gcd;
            }

            return lcm;
        }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 6;

        Practice p = new Practice();
        ArrayList l1 = p.getDevisor(number1);
        ArrayList l2 = p.getDevisor(number2);
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);

        System.out.println("최대공약수: "+ p.getGCD(number1, number2));
        System.out.println("최소공배수: "+ p.getLCM(number1, number2));
    }

}
