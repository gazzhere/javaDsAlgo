public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
 
    // add first && add last
    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head==null){
        head=newNode;
        return;
        }
         newNode.next=head;
        head=newNode;

    } 
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        } 
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        LL list=new LL();

        list.addFirst("a");
        list.addFirst("ganesh");
        list.addLast("singh");
        list.printList();
     
    }
}
