class Solution {
    public int countHomogenous(String s) {
       
        int n  =s.length();
          if (n == 0) return 0;
        long ans=0;
        int rep=1;
        int MOD = 1000000007;
        for(int i=1;i<n;i++){
if(s.charAt(i)==s.charAt(i-1)){
            rep++;

}
else{
                   ans = (ans + ((long) rep * (rep + 1) / 2)) % MOD;
rep=1;

}
        }
        ans = (ans + ((long) rep * (rep + 1) / 2)) % MOD;

        return (int) ans;      
    }
}