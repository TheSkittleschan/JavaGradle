package JavaGradle;

public class GreatestCommonDivisor {
    private int n1;
    private int n2;
    private int gcd;

    public GreatestCommonDivisor(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.gcd = 1;
    }

    public int findGcd() {
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }

    
}
