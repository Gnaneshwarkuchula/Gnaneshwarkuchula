class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int prod=1;
        int sum=0;
        while(temp>0){
int rem=temp%10;
sum+=rem;
prod*=rem;
temp/=10;
        }
        int result=prod-sum;
        return result;
    }
}