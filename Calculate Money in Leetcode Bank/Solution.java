class Solution {
    public int totalMoney(int n) {
        int s=0, j=1, i=0, count;
        for(count=1;count<=n;count++){
            if(count%7==1){
                s+=j;
                i=++j;
            }
            else
            {
                s=s+i;
                i++;
            }
        }
        return s;
    }
}
