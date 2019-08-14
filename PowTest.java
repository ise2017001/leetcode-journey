public class PowTest {
	public double powTest(double x, int n) {
		double ans = 1;
		if (n == 0) {
			return 1;
		}

		if (n == Integer.MIN_VALUE) {
			n = n / 2;
			x *= x;
		}

		if (n < 0) {
			n = -n;
			x = 1 / x;
		}

		while (n > 0) {
			if (n % 2 == 1) {
				ans = ans * x;
			}
			x = x * x;
			n = n / 2;
		}
		
		return ans;
	}
}