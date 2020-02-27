/**
 * 
 */
package lrucache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 
 * solution to the problem: https://leetcode.com/problems/lru-cache/
 * 
 */
public class LRUCache {
	
	
	int capacity=0;
    HashMap<Integer, Integer> map;
    Deque<Integer> deque;
	
	public LRUCache(int capacity) {
	    this.capacity = capacity;
	    map = new HashMap<>();
	    deque = new LinkedList<Integer>();
	}
	
	public int get(int key) {
		
		if(map.containsKey(key)){
			deque.remove(key);
			deque.addFirst(key);
			return map.get(key);
		}
		return -1;
	}
	
	public void put(int key, int value) {
		
		if(!map.containsKey(key)){
			if(capacity <= deque.size()){
				int removedKey = deque.removeLast();
				map.remove(removedKey);
			}
		}
		else{
			deque.removeIf(p-> p == key);
		}
		map.put(key, value);
		deque.addFirst(key);
	}
	
	
	/**
	 * Your LRUCache object will be instantiated and called as such:
	 * LRUCache obj = new LRUCache(capacity);
	 * int param_1 = obj.get(key);
	 * obj.put(key,value);
	 */
}
