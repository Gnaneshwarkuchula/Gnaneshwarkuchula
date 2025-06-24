class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealht=0;
        for(int i=0;i< accounts.length;i++){
            int currentwealth=0; 
for(int j=0;j<accounts[i].length;j++){
    currentwealth+=accounts[i][j];
}
if(maxwealht < currentwealth){
    maxwealht=currentwealth;
}
            
        }
        return maxwealht;
    }
}