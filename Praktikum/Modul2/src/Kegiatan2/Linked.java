package Kegiatan2;

public class Linked {
   Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insert(int new_data){
        Node new_node = new Node(new_data);
        if (head == null){
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void showdata(){
        Node tnode = head;
        while (tnode  != null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public void sortlist(){
        Node curr = head;
        Node index = null;
        if(head == null){
            return;
        }
        else{
            while (curr != null){
                index = curr.next;
                while(index != null){
                    if(curr.data > index.data){
                        int temp = curr.data;
                        curr.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                curr = curr.next;
            }
        }
    }
    public static void main(String[] args) {
        Linked list1 = new Linked();
        list1.insert(8);
        list1.insert(7);
        list1.insert(1);
        list1.insert(4);
        list1.insert(6);
        list1.insert(2);
        list1.insert(3);
        System.out.println("Sebelum Diurutkan   :");
        list1.showdata();
        System.out.println("\n");
        System.out.println("Sesudah Diurutkan   :");
        list1.sortlist();
        list1.showdata();
        System.out.println("\n");
       
    }
}
