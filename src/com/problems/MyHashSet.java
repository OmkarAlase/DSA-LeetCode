package com.problems;
//705. Design HashSet - https://leetcode.com/problems/design-hashset/description/
class MyHashSet {
    int[] map;
    public MyHashSet() {
        this.map = new int[1000001];
    }
    
    public void add(int key) {
        this.map[key] += 1;
    }
    
    public void remove(int key) {
        this.map[key] = 0;
    }
    
    public boolean contains(int key) {
        return this.map[key] != 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */