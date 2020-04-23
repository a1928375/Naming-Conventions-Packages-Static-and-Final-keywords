package com.company;

import java.util.ArrayList;

public class Series {

    public static int nSum(int n) {

        int res= 0;

        for (int i=0 ; i<= n ; i++) {

            res += i;
        }

        return res;
    }

    public static long factorial (int n) {

        long res = 1L;

        for (int i =1; i<=n; i++) {

            res *= (long) i;
        }

        return res;
    }

    public static long fibonacci(int n) {

        if (n == 0) {

            return 0;

        } else if (n == 1) {

            return 1;

        } else {

            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
