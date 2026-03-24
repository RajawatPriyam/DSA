class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n+1];

        int count = 0;
        int i = 2;
        while( i*i <= n){
            if(!prime[i]){
                for(int j = i*2; j <= n; j+=i){
                    prime[j] = true;
                }
            }
            i++;
        }
        for(i = 2; i < n; i++){
            if(prime[i] == false) count++;
        }
        return count;
    }
}