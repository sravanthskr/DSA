// Maths for DSA

class Prime{
    public static boolean isPrime(int n){
        if (n==1) return false;
        if (n==2) return true;
        for(int i=3; i*i<=n; i= i+2){ //skip even, check only half the numbers, if used Math.sqrt() gives float which is not valid
        //for(int i=3; i<=n; i= i+2){ //skip even
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 25;
        if(isPrime(n)){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}