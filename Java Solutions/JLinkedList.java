import java.util.*;
public class JLinkedList<T>{
    Node head;
    class Node{
        T data;
        Node next;
        Node(){
            data=null;
            next=null;
        }
        Node(T d){
            data=d;
            next=null;
        }
    }
    JLinkedList(){
        head=new Node();
    }

    public void insertFront(T data){
        Node newNode=new Node(data);
        newNode.next=this.head.next;
        this.head.next=newNode;
    }

    public void insertEnd(T data){
        Node newNode=new Node(data);
        newNode.next=null;
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertKey(T data,T key){
        Node newNode=new Node(data);
        newNode.next=null;
        Node temp=this.head;
        boolean status=false;
        while(temp!=null){
            if(temp.data==key){
                status=true;
                break;
            }
            temp=temp.next;
        }
        if(status){
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    public void printList(){
        Node currNode=this.head.next;
        System.out.print("Linked List:");
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public void merge(JLinkedList<T> l2){
        Node l1Node=this.head;
        Node l2Node=l2.head;
        while(l1node.next!=null){
            l1Node=l1Node.next;
        }
        l1Node.next=l2Node.next;
        free(l2.head);
    }
    public static void main(String args[]){
        JLinkedList<Integer> list=new JLinkedList<Integer>();
        list.insertEnd(9);
        list.printList();
        list.insertFront(5);
        list.printList();
        list.insertEnd(10);
        list.printList();
        list.insertKey(7, 5);
        list.printList();
        list.insertKey(12,0);
        list.printList();
        list.insertKey(13,10);
        list.printList();
        list.insertFront(2);
        list.printList();
        JLinkedList<Integer> list2=new JLinkedList<Integer>();
        list2.insertFront(5);
        list2.insertEnd(25);
        list2.printList();
        list.merge(list2);
        list.printList();
    }
}