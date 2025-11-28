//2965. Find Missing and Repeated Values 
// Link - https://leetcode.com/problems/find-missing-and-repeated-values/description/
import java.util.*;
class lc2965{
    public int[] MissingAndFun(int[][] grid){
        int repeated = -1;
        int missing = -1;
        Set<Integer> seen = new HashSet<>();
        int n = grid.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int val = grid[i][j];
                if (seen.contains(val)){
                    repeated = val;
                } else{
                    seen.add(val);
                }
            }
        }

        for (int x = 1; x<=n * n; x++){
            if (!seen.contains(x)){
                missing = x;
                break;
            }
        }

        return new int[] {repeated, missing};
    }
    public static void main(String args[]){
        int[][] grid = {
            {1, 2, 3},
            {5, 6, 5},
            {7, 8, 9}
        };
        int[] res;
        lc2965 lc = new lc2965();
        res = lc.MissingAndFun(grid);
        System.out.print(Arrays.toString(res));
    }
}