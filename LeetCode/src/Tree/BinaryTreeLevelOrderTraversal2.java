package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
                
          }
            result.add(temp);
        
        }
        Collections.reverse(result);
        return result;
    }
}
