import java.util.Arrays;

public class Seive {
    public static boolean[] seive(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true); // fill all values true;
        prime[0] = false;
        prime[1] = false; // 0 and 1 as false , not prime
        for (int i=2; i*i<=n; i++){
            if(prime[i]){ // if true -> if prime
                for (int j = i*i; j<n; j=j+i){ // j is increased by i, to make all possible values non primes
                    prime[j]=false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int n = 25;
        boolean[] primes = seive(n); // primes stores values of prime array
        for (int i=2; i<n; i++){
            if(primes[i]){
                System.out.println(i + " "); // i are primes
            }
        }
    }
}
