import java.util.*;

public class Combinations {
	private int[] M;
	private final int n;
	private final int k;
	private boolean empty;
	public Combinations(int n, int k) {
		this.n = n;
		this.k = k;
		this.M = new int[k];
		for (int i = 0; i < n; i++) { M[i] = i; }
	}
	public boolean hasNext() {
		return !empty;
	}
	public int[] next() {
		int[] R = (int[]) M.clone();
		int i = k - 1, t = n - 1;
		while (0 <= i && M[i] == t) { i--; t--; }
		if (0 <= i) for (t = M[i] + 1; i < k; i++, t++) M[i] = t;
		else empty = true;
		return R;
	}
}

