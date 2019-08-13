package maplexo.leetcode.journey;
class Pow {
	public double pow(double x, int n) {
		double ans = 1;
		
		if (n == 0) {
			return 1;
		}

		//this is to avoid the integer overflow
		//when n is negative and we gotta invert n, n = -n
		//that's about to shortly follow, there will be a overflow
		//because inverting n when n = INT_MIN
		//results in -INT_MIN > INT_MAX
		if (n == Integer.MIN_VALUE) {
			n = n / 2;
			x = x * x;
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