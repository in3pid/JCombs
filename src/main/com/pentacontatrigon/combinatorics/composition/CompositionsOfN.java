package com.pentacontatrigon.combinatorics.composition;


import java.util.Vector;

/**
 * The composition of a natural number n.
 *
 * @author mh
 *         <p/>
 *         TODO: Learn Java and write this in a good way.
 */
public class CompositionsOfN {

    //...
    private boolean empty = false;

    //...
    private Vector<Integer> p = new Vector<Integer>();

    /**
     * @param n
     */
    public CompositionsOfN(int n) {
        p.add(n);
    }

    /**
     * @return
     */
    public boolean hasNext() {
        return !empty;
    }

    /**
     * @return
     */
    public Vector<Integer> next() {
        Vector<Integer> r = (Vector<Integer>) p.clone();
        int i, rsum = 0;
        // find the rightmost element x of p such that 1 < x
        for (i = p.size() - 1; 0 <= i && p.get(i) <= 1; i--) {
            rsum += p.get(i);
        }
        if (i == -1) {
            empty = true;
        } else {
            p.setSize(i + 1);
            p.set(i, p.get(i) - 1);
            p.add(rsum + 1);
        }
        return r;
    }
}