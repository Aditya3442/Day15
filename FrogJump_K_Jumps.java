public class FrogJump_K_Jumps {
    public static int jumps(int index,int[] arr,int k){

        if(index==0)
            return 0;
        int minEnergy=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(index-i<0) {
                continue;
            }
            int l=jumps(index-i,arr,k)+Math.abs(arr[index]-arr[index-i]);
            minEnergy=Math.min(minEnergy,l);
        }
        return minEnergy;
    }
    public static void main(String[] args) {
        int arr[]={10,30,40,50,20};
        System.out.println(jumps(5-1,arr,3));
    }
}
//There are
//        N stones, numbered
//1,2,…,N. For each
//i (
//1≤i≤N), the height of Stone
//i is
//h
//        i
//​
//        .
//
//There is a frog who is initially on Stone
//1. He will repeat the following action some number of times to reach Stone
//N:
//
//If the frog is currently on Stone
//i, jump to one of the following: Stone
//i+1,i+2,…,i+K. Here, a cost of
//∣h
//        i
//​
//        −h
//        j
//​
//        ∣ is incurred, where
//j is the stone to land on.
//Find the minimum possible total cost incurred before the frog reaches Stone
//N.
//
//        Constraints
//All values in input are integers.
//        2≤N≤10
//        5
//
//        1≤K≤100
//        1≤h
//        i
//​
//        ≤10
//        4
//
//Input
//Input is given from Standard Input in the following format:
//
//N
//        K
//h
//1
//        ​
//
//h
//2
//        ​
//
//        …
//h
//        N
//​
//
//Output
//Print the minimum possible total cost incurred.
//
//Sample Input 1
//Copy
//5 3
//        10 30 40 50 20
//Sample Output 1
//Copy
//30
//If we follow the path
//1 →
//        2 →
//        5, the total cost incurred would be
//∣10−30∣+∣30−20∣=30.
//
