class RandomizedSet {
    HashMap<Integer,String> map;
    public RandomizedSet() {
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val, null);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.isEmpty() && map.containsKey(val)) {
            map.remove(val);
            return true;
        }
            return false;
    }
    
    public int getRandom() {
        if(!map.isEmpty()) {
          ArrayList<Integer> list = new ArrayList<>(map.keySet());
          Random r = new Random();
          return list.get(r.nextInt(list.size()));
        }
        return -1; 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */