class Solution {
public:
    int jump(vector<int>& nums) {
        if(nums.size() == 1){
            return 0;
        }
        vector<int>arr(nums.size());
        for(int i = nums.size()-2; i>=0;i--){
            int h = nums[i];
            h+=i;
            if(h>=nums.size()-1){
                arr[i] = 1;
            }
            else{
                int mn = INT_MAX, index = i;
                for(int j = i + 1;j<=h;j++){
                    if(arr[j] != 0){
                        mn = min(mn, arr[j]);
                    }
                }
                if(mn == INT_MAX){
                    arr[i] = 0;
                }
                else{
                    arr[i] = mn + 1;
                }
            }
        }
        return arr[0];
    }
};