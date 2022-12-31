
public class trie {
    static class node{
        node[] children;
        boolean eow;
        public node(){
            children=new node[26]; //a to z
            for(int i=0;i<26;i++){
                children[i]=null;
                
            }
            eow=false;
        }
    }
    // this is root of tire 
    static node root=new node();
    // insert in trie function here
    public static void insert(String word){
        node curr=root;
        for(int i=0;i<word.length();i++){ //time complexity word length
            int indx=word.charAt(i)-'a';
            if(curr.children[indx]==null){
                curr.children[indx]=new node();
            }
            if(i==word.length()-1){
                curr.children[indx].eow=true;
            }
            curr=curr.children[indx];
        }
    }
    //search operation 
    public static boolean search(String key){ //tc-O(L) L is lenght of word
        node curr=root;
        for(int i=0;i<key.length();i++){
            int indx=key.charAt(i)-'a';
            node node=curr.children[indx];
            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            curr=curr.children[indx];
            
        }
        return true;
    }
    // leetcode word break
    public static boolean wordbreak(String key){
        if(key.length()==0){
            return true;

        }
        for(int i=1;i<=key.length();i++){
            String firstpart=key.substring(0, i);
            String secondpart=key.substring(i);
            if(search(firstpart) && wordbreak(secondpart)){
                return true;
            }
        }
        return false;
    }
    public static boolean startsWith(String prefix){
        node curr=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }
    // count unique string
    public static int countuniqueSubstring(node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countuniqueSubstring(root.children[i]);
            }

        }
        return count+1;
    }
    public static String ans="";
    public static void longestword(node root,StringBuilder temp){
        if(root==null)return;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null &&root.children[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length())
                {
                    ans=temp.toString();

                }
                longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
    //     String words[]={"ganesh","shru","anish","nitu","krupa"};
    //     String keys="ganes";
    //     for(int i=0;i<words.length;i++){
    //         insert(words[i]);
    //     }
    //   System.out.println(startsWith(keys));
    // String str="apple";
    // for(int i=0;i<str.length();i++){
    //     String prefix=str.substring(i);
    //     insert(prefix);
    // }
    // System.out.println(countuniqueSubstring(root));

    // }
    
    String words[]={"a","banana","app","appl","ap","apply","apple"};
    for(int i=0;i<words.length;i++){
        insert(words[i]);
    }
    longestword(root, new StringBuilder(""));
    System.out.println(ans);
 }
}