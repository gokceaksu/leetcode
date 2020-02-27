/**
 * 
 */
package lrucache;


/**
 *
 */
public class Main {
	public static void main(String[] args){
		
		LRUCache obj = new LRUCache(2);

		obj.put(1,1);
		obj.put(2,2);
		int param_1 = obj.get(1);
		
		obj.put(3,3);
		
		int param_2 = obj.get(2);
		
		obj.put(4,4);
		
		int param_3 = obj.get(1);
		int param_4 = obj.get(3);
		int param_5 = obj.get(4);
		
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
		System.out.println(param_5);
	}

}
