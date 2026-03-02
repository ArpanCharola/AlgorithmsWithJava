package March;
// 1536. Minimum Swaps to Arrange a Binary Grid (leetcode)  
class march2 {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] trailingZeros = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
            }
            trailingZeros[i] = count;
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int required = n - 1 - i;
            
            int found = -1;
            for (int j = i; j < n; j++) {
                if (trailingZeros[j] >= required) {
                    found = j;
                    break;
                }
            }

            if (found == -1) {
                return -1;
            }

            for (int k = found; k > i; k--) {
                int temp = trailingZeros[k];
                trailingZeros[k] = trailingZeros[k - 1];
                trailingZeros[k - 1] = temp;
                swaps++;
            }
        }

        return swaps;
    }
    public static void main(String[] args) {
        march2 m = new march2();
        int[][] grid = {{0,0,1},{1,1,0},{1,0,0}};
        System.out.println(m.minSwaps(grid));
    }
}