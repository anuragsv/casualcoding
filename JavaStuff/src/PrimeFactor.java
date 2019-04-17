import java.util.Set;
import java.util.TreeSet;

/**
 * Given an integer, find all its prime factors.
 */

class PrimeFactor {

    private int n;

    /**
     * Constructor for PrimeFactor class.
     *
     * @param n integer whose prime factors need to be computed
     */
    PrimeFactor(int n) {
        this.n = n;
    }

    /**
     * This method computes and returns the prime factors of the integer given
     * in the constructor.
     *
     * @return Set<Integer> containing the prime factors
     */
    Set<Integer> getPrimeFactors() {
        Set<Integer> primeFactors = new TreeSet<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeFactors.add(i);
                n /= i;
                i--;
            }
        }

        return primeFactors;
    }

}
