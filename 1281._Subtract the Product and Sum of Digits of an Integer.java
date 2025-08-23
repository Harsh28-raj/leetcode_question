class Solution {
    public int subtractProductAndSum(int n) {

        int pro=1;
       int sum=0;
         int dif=0;
       int rem=0;


              while(n!=0){
                        rem=n%10;
                       pro=pro*rem;
                       sum=sum+rem;
                        n=n/10;



                  }
                           dif=pro-sum;
                  return dif;

}

}