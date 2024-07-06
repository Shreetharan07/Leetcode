class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        char a = 'G';
        char b = 'P';
        char c = 'M';
        int a1=0;
        int b1=0;
        int c1=0;
        int n = garbage.length;
        int[] tarr = new int[n];
        int t = travel.length;
        
        // Initialize tarr for travel time with appropriate length
        for (int i = 0; i < t; i++) {
            tarr[i + 1] = travel[i];
        }
        
        // Travel time for the last house should be 0
        tarr[0] = 0; // No travel time for the first house
        
        int glass = 0;
        int paper = 0;
        int metal = 0;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (garbage[i].contains(Character.toString(a))) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == 'G') count++;
                }
                glass += count;
                a1=i;
            } 
        }
        
        for (int i = 0; i < n; i++) {
            int count1 = 0;
            if (garbage[i].contains(Character.toString(b))) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == 'P') count1++;
                }
                paper +=count1;
                b1=i;
            } 
        }
        
        for (int i = 0; i < n; i++) {
            int count2 = 0;
            if (garbage[i].contains(Character.toString(c))) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == 'M') count2++;
                }
                metal +=count2;
                c1=i;
            }
        }
        for(int i=0;i<=a1;i++){
            glass+=tarr[i];
        }
        for(int i=0;i<=b1;i++){
            paper+=tarr[i];
        }
        for(int i=0;i<=c1;i++){
            metal+=tarr[i];
        }
        return glass + paper + metal;
    }
}
