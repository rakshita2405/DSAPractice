class Solution {
    public static void dfs(int[][] isConnected,boolean[] vis, int src) {
        vis[src] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[src][i] == 1 && !vis[i]) {
                dfs(isConnected, vis, i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
       int n=isConnected.length;
       int ans=0;
       boolean[] visited=new boolean[n];
         for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                ans++;   
            }
        }

        return ans;
    }
       
}