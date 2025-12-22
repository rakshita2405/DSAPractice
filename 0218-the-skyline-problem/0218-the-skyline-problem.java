class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<Pair> list = new ArrayList<>();
        
        // Convert buildings to start/end events
        for(int i = 0; i < buildings.length; i++){
            int sp = buildings[i][0];
            int ep = buildings[i][1];
            int ht = buildings[i][2];
            list.add(new Pair(sp, -ht)); // start
            list.add(new Pair(ep, ht));  // end
        }
        
        Collections.sort(list);
        
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        pq.offer(0); // ground level
        int currht = 0;
        
        for(Pair p : list){
            int x = p.x;
            int ht = p.ht;
            
            if(ht < 0){
                pq.offer(-ht); // start → add height
            } else {
                pq.remove(ht); // end → remove height
            }
            
            if(currht != pq.peek()){
                ans.add(Arrays.asList(x, pq.peek()));
                currht = pq.peek();
            }
        }
        
        return ans;
    }
    
    class Pair implements Comparable<Pair> {
        int x, ht;
        Pair(int x, int ht) {
            this.x = x;
            this.ht = ht;
        }
        
        public int compareTo(Pair other) {
            if(this.x != other.x)
                return this.x - other.x; // sort by x
            return this.ht - other.ht;   // start(-height) before end(+height)
        }
    }
}
