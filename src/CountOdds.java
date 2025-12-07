public class CountOdds {
    public int countOdds(int low, int high) {
        if(low%2 ==0 ){
            low+=1;
        }
        int count =0;
        while(low<=high){
            count++;
            low+=2;
        }
        return count;
    }
    public int countOddsOOfOne (int low, int high) {
        int range = high - low +1;
        if(high%2 != 0 && low %2 != 0){
            return range/2 +1;
        }
        return range /2;
    }
    public static void main(String[] args) {
        CountOdds countOdds = new CountOdds();
        System.out.println(countOdds.countOdds(1,10));
    }
}
