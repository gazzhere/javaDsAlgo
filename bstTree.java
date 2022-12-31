import java.util.*;

import javax.xml.transform.Source;
public class bstTree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static node buildTree(int value[]){
        index++;
        if(value[index]==-1){
            return null;
        }
        node newNode=new node(value[index]);
        newNode.left=buildTree(value);
        newNode.right=buildTree(value);
        return newNode;
        }
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void levelorder (node root){
        if(root==null)return;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node curr=q.remove();
            if(curr==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
            }else{
             System.out.print(curr.data+"=>");
             if(curr.left!=null){
                q.add(curr.left);
             }
             if(curr.right!=null){
                q.add(curr.right);
             }
            }
        }
    }
    public static void main(String[] args) {
        int value[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root=tree.buildTree(value);
        // System.out.println(root.data);
        // preorder(root);
        levelorder(root);
    }
}
