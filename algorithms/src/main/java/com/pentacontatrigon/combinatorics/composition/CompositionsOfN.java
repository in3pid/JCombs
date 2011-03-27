package com.pentacontatrigon.combinatorics.composition;

import java.util.ArrayList;
import java.util.List;


/**
 * The composition of a natural number n.
 *
 * @author mh
 *         <p/>
 *         TODO: Learn Java and write this in a good way.
 */
public class CompositionsOfN {

    //TODO cy: review and revise.
    //TODO cy: separaition of concerns
    //...
    private boolean empty = false;

    //...
    private List<Integer> p = new ArrayList<Integer>();

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
    public List<Integer> next() {
        List<Integer> r = (p);
        int i, rsum = 0;
        // find the rightmost element x of p such that 1 < x
        for (i = p.size() - 1; 0 <= i && p.get(i) <= 1; i--) {
            rsum += p.get(i);
        }
        if (i == -1) {
            empty = true;
        } else {
            // p.setSize(i + 1);  arrayList increments automagically
            p.set(i, p.get(i) - 1);
            p.add(rsum + 1);
        }
        return r;
    }
}
