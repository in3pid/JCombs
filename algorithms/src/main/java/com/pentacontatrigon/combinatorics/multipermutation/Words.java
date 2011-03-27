package com.pentacontatrigon.combinatorics.multipermutation;

/**
 * com.pentacontatrigon.combinatorics.multipermutation.Words iterates through the k-permutations (with repetition) of an
 * n-subset of the natural numbers.
 *
 * @author mh
 */
public class Words {

    /**
     * @param n
     * @param k
     * @return
     */
    public static int size(int n, int k) {
        return (int) Math.pow(n, k);
    }

    /**
     * @param n
     * @param k
     * @param i
     * @return
     */
    public static int[] get(int n, int k, int i) {
        int[] r = new int[k];
        fill(r, n, k, i);
        return r;
    }

    /**
     * @param r
     * @param n
     * @param k
     * @param i
     */
    public static void fill(int[] r, int n, int k, int i) {
        for (int j = 0; j < k; j++) {
            r[j] = i % n;
            i = (i - r[j]) / n;
        }
    }
}
