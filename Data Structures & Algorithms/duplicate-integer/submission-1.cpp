class Solution {
public:
    
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> duplicates;
        for (int num : nums) {
            if (duplicates.contains(num)) {
                return true;
            }
            duplicates[num] += 1;
        }
        return false;
    }
};