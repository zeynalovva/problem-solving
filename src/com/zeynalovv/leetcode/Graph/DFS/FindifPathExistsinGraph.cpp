class Solution {
public:
    bool t = false;
    unordered_map<int, vector<int>>graph;
    unordered_set<int>visited;


    void dfs(int source, int destination){
        if(source == destination){
            t = true;
            return;
        }
        if(visited.count(source)) return;

        visited.insert(source);

        for(int nodes : graph[source]){
            dfs(nodes, destination);
        }
    }


    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        for(int i = 0;i<edges.size();i++){
            graph[edges[i][0]].push_back(edges[i][1]);
            graph[edges[i][1]].push_back(edges[i][0]);
        }

        for(int nodes : graph[source]){
            cout<<nodes<<" ";
        }
        if(!visited.count(source)){
            dfs(source, destination);
        }
        return t;
    }
};