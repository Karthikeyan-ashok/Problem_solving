class Solution {
    public boolean self(int i){
        int temp = i;
        while(i>0){
            int rem = i%10;
            if(rem==0) return false;
            if(temp%rem!=0){
                return false;
            }
            i = i/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a = new ArrayList<>(); 
        for(int i=left;i<=right;i++){
            if(self(i)){
                a.add(i);
            }
        }
        return a;
    }
}