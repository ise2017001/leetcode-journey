class Pow {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double ans = 1;
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