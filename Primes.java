public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Boolean[] isPrime = new Boolean[n+1];
        int p = 2;
        int nextP = 2;
        int numOfPrimes = 0;
        isPrime[0] = false;
        isPrime[1] = false;
        System.out.println("Prime numbers up to " + n + ":");
        for(int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        while(p <= Math.sqrt(n)){
            for(int i = p + 1; i < isPrime.length; i++){
                if(i % p == 0){
                    isPrime[i] = false;
                }
            }
            for(int i = p + 1; i < isPrime.length; i++){
                if(isPrime[i] && nextP == p){
                    nextP = i;
                    break;
                }
            }
            p = nextP;
        }
        for(int i = 0; i < isPrime.length; i++){
            if(isPrime[i]){
                System.out.println(i);
                numOfPrimes++;
            }
        }
        System.out.println("There are " + numOfPrimes + " primes between 2 and " + n + " (" + numOfPrimes * 100 / n + "% are primes)");

    }
}