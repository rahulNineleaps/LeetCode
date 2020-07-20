package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> out= new ArrayList<List<Integer>>();
        if (root==null) return out;
        int count=1;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);
        
        while (!q.isEmpty()){
            List<Integer> temp= new ArrayList<Integer>();
            int size= q.size();
            for (int i=0;i<size;i++){
            
            TreeNode curr=q.poll();
            temp.add(curr.val);
                
            if(curr.left!=null){
                q.add(curr.left);
            }
            
                
            if(curr.right!=null){
                q.add(curr.right);
            } 
        }
            if((count%2)==0){
                Collections.reverse(temp);
            }
            count+=1;
            out.add(temp);
      }
        return out;
    }
}
