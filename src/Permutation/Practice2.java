package Permutation;

import java.util.Arrays;

public class Practice2 {
    void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out){
        if(depth == 3){
            System.out.println(Arrays.toString(out));
            return;
        }

        for(int i=0; i < n; i++){
            if(visited[i] != true){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth+1, n, r, visited, out);
                visited[i] = false;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = 4;
        int r = 3;
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        Practice2 practice = new Practice2();
        practice.permutation(arr, 0, n, r, visited, out);
    }
}
