class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size()) { return false; }

        std::unordered_map<char, int> map1;
        
        for(int i{ 0 }; i < s.size(); i++) {
            map1[s.at(i)] += 1;
        }

        for(char c : t) {
            if (!map1.contains(c) || map1[c] == 0) { return false; }
            map1[c] -= 1;
        }

        return true;
    }
};
