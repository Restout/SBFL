package org.example;

import lombok.Data;

@Data
public class Triangle {

    private int i;
    private int j;
    private int k;

    public Triangle() {
        i = 0;
        j = 0;
        k = 0;
    }

    public Triangle(int ii, int jj, int kk) {
        i = ii;
        j = jj;
        k = kk;
    }

    public int trityp() {
        int trityp;
        if ((i == 0) || (j == 0) || (k == 0))
            trityp = 4;
        else {
            trityp = 0;
            if (i == j)
                trityp = trityp + 1;
            if (i == k)
                trityp = trityp + 2;
            if (j == k)
                trityp = trityp + 3;
            if (trityp == 0) {
                if ((i + j <= k) || (j + k <= i) || (i + k <= j))
                    trityp = 4;
                else
                    trityp = 0 ;  // Mutant 6: 0 instead of 1
            } else {
                if (trityp > 3)
                    trityp = 3;
                else if ((trityp == 1) && (i + j > k))
                    trityp = 2;
                else if ((trityp == 2) && (i + k > j))
                    trityp = 2;
                else if ((trityp == 3) && (j + k > i))
                    trityp = 2;
                else
                    trityp = 4;
            }
        }
        return (trityp);
    }

    static public String conversionTrityp(int i) {
        switch (i) {
            case 1:
                return "scalen";
            case 2:
                return "isosceles";
            case 3:
                return "equilateral";
            default:
                return "not a ";
        }
    }
}
