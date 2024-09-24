// package DSA_Coding_Thinker.Adavance_DSA.Backtraking;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_Problem {
    public static boolean isSafe(int row, int col, char[][] bord) {
        // horizontal
        for (int j = 0; j < bord.length; j++) {
            if (bord[row][j] == 'Q') { // this row pr koi Queens he to return false kr do.
                return false;
            }
        }

        // vertical.
        for (int i = 0; i < bord[0].length; i++) {
            if (bord[i][col] == 'Q') {
                return false;
            }
        }

        // Uper left.
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (bord[r][c] == 'Q') {
                return false;
            }
        }

        // upper Right.
        r = row;
        for (int c = col; c < bord.length && r >= 0; r--, c++) {
            if (bord[r][c] == 'Q') {
                return false;
            }
        }

        // lower Left
        r = row;
        for (int c = col; c >= 0 && r < bord.length; r++, c--) {
            if (bord[r][c] == 'Q') {
                return false;
            }
        }

        // lower Right
        for (int c = col; c < bord.length && r < bord.length; r++, c++) {
            if (bord[r][c] == 'Q') {
                return false;
            }
        }

        return true; // safe he to true return kr do.
    }

    public static void savrBord(char[][] bord, List<List<String>> allbords) {
        String row = "";
        List<String> newBord = new ArrayList<>();
        for (int i = 0; i < bord.length; i++) {
            row = "";
            for (int j = 0; j < bord[0].length; j++) {
                if (bord[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBord.add(row);
        }
        allbords.add(newBord);
    }
    

    public static void helper(char[][] bord, List<List<String>> allbords, int col) { // Queens ko Place krane k liye.
        if (col == bord.length) { // Coluom n bn jaye (Base Conditition).
            savrBord(bord, allbords);
            return;
        }
        for (int row = 0; row < bord.length; row++) {
            if (isSafe(row, col, bord)) {  // Agar bord kii me Queen ko place krane sahi he ya nii.
                bord[row][col] = 'Q';  // if row or col me Queen Safe he to Q ko Place kra do.
                helper(bord, allbords, col + 1); // next Coluom me place krana he Queen ko.
                bord[row][col] = '.';  // if row or col me Queen Safe he to (.) Dot ko Place kra do.
            }
        }
    }

    // public List<List<String>> solveQueens(int n) {
    public static void main(String[] args) {
        int n = 4; // Bord kii Length.
        List<List<String>> allbords = new ArrayList<>();
        char[][] bord = new char[n][n];

        helper(bord, allbords, 0); // Character Array me se List of list me push

        // return allbords;

        System.out.println(allbords);

    }

}
