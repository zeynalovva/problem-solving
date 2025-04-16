class Solution {
public:

    unordered_map<int, vector<int>>graph;

    int findCenter(vector<vector<int>>& edges) {
        for(auto list : edges){
            graph[list[0]].push_back(list[1]);
            graph[list[1]].push_back(list[0]);
        }
        int ans;

        for(auto [key, value] : graph){
            if(value.size() == graph.size()-1){
                ans = key;
                break;
            }
        }


        return ans;
    }
};