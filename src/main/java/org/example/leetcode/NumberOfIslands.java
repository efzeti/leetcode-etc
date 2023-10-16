package org.example.leetcode;


/**
https://leetcode.com/problems/number-of-islands
**/

public class NumberOfIslands {

    private static int n;
    private static int m;

    public static void main(String[] args) {
        char[] a1 = {'1','1','0','0','0'};
        char[] a2 = {'1','1','0','0','0'};
        char[] a3 = {'0','0','1','0','0'};
        char[] a4 = {'0','0','0','1','1'};

        char[][] map = new char[4][];

        map[0] = a1;
        map[1] = a2;
        map[2] = a3;
        map[3] = a4;

        System.out.println(numIslands(map));
    }


    public static int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') {
                    System.out.println("grid[" + i + "][" + j + "]");
                    DFSMarking(grid, i, j);
                    System.out.println("++count");
                    ++count;
                }
        }
        return count;
    }

    private static void DFSMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
        System.out.println("assigning[" + i + "][" + j + "] to 0");
        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1);
    }
}
