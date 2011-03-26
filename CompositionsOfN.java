/**
 * The compositions of a natural number n.
 *  
 * @author mh
 *
 * TODO: Write this in a good way.
 */
import java.util.Vector;

public class CompositionsOfN {
	private Integer n;
	private Vector<Integer> p;
	private boolean empty = false;
	public CompositionsOfN(int n_) {
		n = new Integer(n_);
		p = new Vector<Integer>();
		p.add(n);
	}
	public boolean hasNext() { return !empty; }
	public Vector<Integer> next() {
		Vector<Integer> r = (Vector<Integer>)p.clone();
		int i, rsum = 0;
		// find the rightmost element x of p such that 1 < x
		for (i = p.size() - 1; 0 <= i && p.get(i) <= 1; i--) { rsum += p.get(i); }
		if (i == -1) { empty = true; }
		else {
			int x = p.get(i);
			// rsum is the sum of the numbers to the right of x
			p.setSize(i + 1);
			p.set(i, x - 1);
			p.add(rsum + 1);
		}
		return r;
	}
}
