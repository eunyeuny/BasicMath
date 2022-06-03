package Test02;

public class Practice1 {

    public static int soulition(int n) {
        int result = 0;

        if (n <= 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            result += soulition(i) * soulition(n - i - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(soulition(0));
        System.out.println(soulition(2));
        System.out.println(soulition(5));
        System.out.println(soulition(6));

    }

}
