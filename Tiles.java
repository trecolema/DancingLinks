package Pentomino.src;

public class Tiles {


    static final int[][] F = {{1, -1, 1, 0, 1, 1, 2, 1}, {0, 1, 1, -1, 1, 0, 2, 0}};

    static final int[][] I = {{0, 1, 0, 2, 0, 3, 0, 4}, {1, 0, 2, 0, 3, 0, 4, 0}};

    static final int[][] L = {{1, 0, 1, 1, 1, 2, 1, 3}, {1, 0, 2, 0, 3, -1, 3, 0},
    {0, 1, 0, 2, 0, 3, 1, 3}, {0, 1, 1, 0, 2, 0, 3, 0}, {0, 1, 1, 1, 2, 1, 3, 1},
    {0, 1, 0, 2, 0, 3, 1, 0}, {1, 0, 2, 0, 3, 0, 3, 1}, {1, -3, 1, -2, 1, -1, 1, 0}};

    static final int[][] N = {{0, 1, 1, -2, 1, -1, 1, 0}, {1, 0, 1, 1, 2, 1, 3, 1},
    {0, 1, 0, 2, 1, -1, 1, 0}, {1, 0, 2, 0, 2, 1, 3, 1}, {0, 1, 1, 1, 1, 2, 1, 3},
    {1, 0, 2, -1, 2, 0, 3, -1}, {0, 1, 0, 2, 1, 2, 1, 3}, {1, -1, 1, 0, 2, -1, 3, -1}};

    static final int[][] P = {{0, 1, 1, 0, 1, 1, 2, 1}, {0, 1, 0, 2, 1, 0, 1, 1},
    {1, 0, 1, 1, 2, 0, 2, 1}, {0, 1, 1, -1, 1, 0, 1, 1}, {0, 1, 1, 0, 1, 1, 1, 2},
    {1, -1, 1, 0, 2, -1, 2, 0}, {0, 1, 0, 2, 1, 1, 1, 2}, {0, 1, 1, 0, 1, 1, 2, 0}};

    static final int[][] T = {{0, 1, 0, 2, 1, 1, 2, 1}, {1, -2, 1, -1, 1, 0, 2, 0},
    {1, 0, 2, -1, 2, 0, 2, 1}, {1, 0, 1, 1, 1, 2, 2, 0}};

    static final int[][] U = {{0, 1, 0, 2, 1, 0, 1, 2}, {0, 1, 1, 1, 2, 0, 2, 1},
    {0, 2, 1, 0, 1, 1, 1, 2}, {0, 1, 1, 0, 2, 0, 2, 1}};

    static final int[][] V = {{1, 0, 2, 0, 2, 1, 2, 2}, {0, 1, 0, 2, 1, 0, 2, 0},
    {1, 0, 2, -2, 2, -1, 2, 0}, {0, 1, 0, 2, 1, 2, 2, 2}};

    static final int[][] W = {{1, 0, 1, 1, 2, 1, 2, 2}, {1, -1, 1, 0, 2, -2, 2, -1},
    {0, 1, 1, 1, 1, 2, 2, 2}, {0, 1, 1, -1, 1, 0, 2, -1}};

    static final int[][] X = {{1, -1, 1, 0, 1, 1, 2, 0}};

    static final int[][] Y = {{1, -2, 1, -1, 1, 0, 1, 1}, {1, -1, 1, 0, 2, 0, 3, 0},
    {0, 1, 0, 2, 0, 3, 1, 1}, {1, 0, 2, 0, 2, 1, 3, 0}, {0, 1, 0, 2, 0, 3, 1, 2},
    {1, 0, 1, 1, 2, 0, 3, 0}, {1, -1, 1, 0, 1, 1, 1, 2}, {1, 0, 2, -1, 2, 0, 3, 0}};

    static final int[][] Z = {{0, 1, 1, 0, 2, -1, 2, 0}, {1, 0, 1, 1, 1, 2, 2, 2},
    {0, 1, 1, 1, 2, 1, 2, 2}, {1, -2, 1, -1, 1, 0, 2, -2}};

    static final int[][][] shapes = {F, I, L, N, P, T, U, V, W, X, Y, Z};


}
