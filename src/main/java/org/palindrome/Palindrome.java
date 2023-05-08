package org.palindrome;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int[] arrayNum = new int[String.valueOf(x).length()];

        int n = 0;
        while (x > 0){
            arrayNum[n] = x % 10;
            x = x / 10;
            n++;
        }

        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = arrayNum.length; j > 0; j--) {
                if (arrayNum[j - 1] == arrayNum[i]){
                    i++;
                    if (j == i ){
                        return true;
                    } else if (i + 1 == j || j - 1 == i){
                        return true;
                    }
                } else {
                    return false;
                }
            }

        }
        return false;
    }
}
