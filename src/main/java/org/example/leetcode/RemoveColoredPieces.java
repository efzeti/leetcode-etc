package org.example.leetcode;

/**
https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/solutions/1524153/c-python-java-count-aaa-and-bbb/?envType=daily-question&envId=2023-10-02
**/

public class RemoveColoredPieces {

    public static void main(String[] args) {

        System.out.println(winnerOfGame("AAAAABBB"));

    }


    public static boolean winnerOfGame(String colors) {
        int countA = 0;
        int countB = 0;

        for (int i = 2; i < colors.length(); i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i - 2) == 'A') {
                countA++;
            } else if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i - 2) == 'B') {
                countB++;
            }
        }

        return countA > countB;
    }

    public static int countMatches(String text, String str)
    {
        if (text.isEmpty() || str.isEmpty()) {
            return 0;
        }

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }

        return count;
    }

}
