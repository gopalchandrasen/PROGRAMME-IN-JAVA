// package linkedlist;
class SinglyLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    
	public void insert_last(int val) {
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insert_index(int val,int index) {
		if(index==0) {
			insertFirst(val);
			return;
		}
		if(index==size) {
			insert_last(val);
			return;
		}
		Node temp=head; //head is in index 0
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
	}
	
	public int deleteFirst() {
		int val=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int val=tail.value;
		tail=secondLast;
		tail.next=null;
		return val;	
	}
	
	public int delete_index(int index) {
		if(index==0) {
			return deleteFirst();
		}
		Node prev=get(index-1);
		int val=prev.next.value;
		prev.next=prev.next.next;
		return val;
	}
	
	public Node find(int value) {
		Node node=head;
		while(node!=null) {
			if(node.value==value) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
	
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
public class SMain{
    public static void main(String[]args){
        SinglyLinkedList list=new SinglyLinkedList();
        //inserting at beginning
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        //inserting at end
		list.insert_last(114);
		list.insert_last(32);
		//inserting in any location
		list.insert_index(102, 0);
		list.insert_index(21, 5);
		
		list.display(); 
		//deleting first node
		System.out.println(list.deleteFirst());
        list.display(); 
        //deleting last node
        System.out.println(list.deleteLast());
        list.display();
        //deleting of any position
        System.out.println("Deleted value:"+list.delete_index(0));
        list.display();
        System.out.println(list.find(21));
    }
}