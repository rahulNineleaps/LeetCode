package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//import javax.swing.tree.TreeNode;


 // Definition for a binary tree node.
   class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 



public class BinaryTreeLevelOrderTRaversal {

	class Solution {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>>result= new ArrayList<List<Integer>>();
	        if (root==null) return result;
	        
	        Queue<TreeNode> q= new LinkedList<TreeNode>();
	        q.add(root);
	        while(q.size()>0){
	            //main loop which should be running until all element is fetched 
	           // List<TreeNode> tempnode= new ArrayList<TreeNode>();
	            
	            List<Integer>temp= new ArrayList<Integer>();
	            int size=q.size();
	            for (int i=0;i<size;i++){
	           
	            TreeNode curr=q.poll();
	            //Adding To Temp  
	            temp.add(curr.val);
	            
	            
	            if (curr.left!=null){
	                q.add(curr.left);
	            }
	            
	            if (curr.right!=null){
	                q.add(curr.right);
	            } 
	                
	          }result.add(temp);
	        
	        }
	        return result;
	    }
	}
}
