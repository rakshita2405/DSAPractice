class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Fill adjacency list
        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        // Step 3: Check each course
        for(int i = 0; i < numCourses; i++) {
            if(!visited[i]) {
                if(dfs(i, adj, visited, recStack)) {
                    return false; // cycle found
                }
            }
        }
        return true;
    }
        
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited, boolean[] recStack) {
                          visited[node] = true;
        recStack[node] = true;

        for(int nei : adj.get(node)) {
            if(!visited[nei]) {
                if(dfs(nei, adj, visited, recStack)) {
                    return true;
                }
            }
            else if(recStack[nei]) {
                return true; 
            }
        }

        recStack[node] = false;
        return false;
    }
}

