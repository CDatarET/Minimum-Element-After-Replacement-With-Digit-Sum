class Solution {
public:
    int sum(int n){
        int s = 0;
        while(n > 0){
            s += n % 10;
            n /= 10;
        }

        return s;
    }

    int minElement(vector<int>& nums) {
        int min = 100000;
        for(int i = 0; i < nums.size(); i++){
            min = std::min(min, sum(nums[i]));
        }

        return min;
    }
};
