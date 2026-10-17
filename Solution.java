class Solution {
    private int sum(int n){
        int s = 0;
        while(n > 0){
            s += n % 10;
            n /= 10;
        }

        return s;
    }

    public int minElement(int[] nums) {
        int min = 100000;
        for(int i = 0; i < nums.length; i++){
            int x = sum(nums[i]);
            min = Math.min(min, x);
        }

        return min;
    }
}
