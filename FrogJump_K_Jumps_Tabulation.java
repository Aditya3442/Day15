public class FrogJump_K_Jumps_Tabulation {
    public static void main(String[] args) {
        int arr[]={10,30,40,50,20};
        int dp[]=new int[arr.length];
        dp[0]=0;

        for(int i=1;i<arr.length;i++){
            int mini=Integer.MAX_VALUE;
            for(int j=1;j<=3;j++){
                if(i-j>=0){
                    int l=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    mini=Math.min(mini,l);
                }
            }
            dp[i]=mini;
        }
        System.out.println(dp[4]);
    }
}
