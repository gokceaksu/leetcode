/**
 * 
 */
package max_depth_of_binary_tree;


/**
 * 
 * solution to the problem: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 */
public class Solution {


    public int maxDepth(TreeNode root) {
        
        TreeNode[] arr = new TreeNode[100];
        
        int levelCount = 0;
        arr[0] = root;
        int levelNodeCount = getArrayLength(arr);
        
        while(levelNodeCount > 0){
            
            for(int i=0;i<levelNodeCount;i++){
                
            	TreeNode myNode = arr[0];
                if(myNode.left != null)
                    enqueue(arr,myNode.left);
                if(myNode.right != null)
                    enqueue(arr,myNode.right);
                
                dequeue(arr);
            }
            levelNodeCount = getArrayLength(arr);
            levelCount++;
        }
        return levelCount;
    }
    
    public int getArrayLength(TreeNode[] arr){
    	
    	int count = 0;
    	for(int i=0; i<arr.length;i++){
    		if(arr[i] == null) break;
    		count++;
    	}
    	return count;
    }
    
    public void enqueue(TreeNode[] arr, TreeNode newNode){
    	
    	int arrayLength = getArrayLength(arr);
        arr[arrayLength] = newNode;
    }
    
    public void dequeue(TreeNode[] arr){
        
    	int arrayLength = getArrayLength(arr);
    	
        for(int i=0;i<arrayLength-1;i++){
            arr[i]= arr[i+1];
        }
        arr[arrayLength-1] = null;
    }
	    
}
