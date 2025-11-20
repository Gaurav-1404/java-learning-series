class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class NewLinkedList{
    Node head;

    // Insert At Beginning
    void insertAtBeginning(int num){
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    }
    
    // Insert At Specific position
    void insertAtSpecific(int pos, int num){
        Node temp = head;
        if(pos <= 0){
            System.out.println("Invalid Index!");
            return;
        }
        if(pos == 1){
            insertAtBeginning(num);
            return;
        }
        for(int i=1; temp != null && i < pos-1; i++){
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        Node newNode = new Node(num);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert At end
    void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Traverse (display)
    void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println();
    }

    
    // Delete At Beginning
    void deleteAtBeginning(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty.");
            return;
        }
        head = temp.next;
    }

    // Delete At Specific Position
    void deleteAtSpecific(int pos){
        Node temp = head;
        if(pos <= 0){
            System.out.println("Invalid Position!");
            return;
        }
        if(pos == 1){
            deleteAtBeginning();
            return;
        }
        for(int i = 1; temp!= null && i < pos-1 ;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid position! ");
            return;
        }
        temp.next = temp.next.next;
        
    }

    // Delete At End
    void deleteAtEnd(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty.");
            return;
        }
        if(temp.next == null){
            head = null;
            return;
        }
        else{
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
}
public class C42_LinkedListCreation {
    public static void main(String[] args) {
        NewLinkedList List1 = new NewLinkedList();
        List1.insertAtEnd(5);
        List1.insertAtEnd(7);
        List1.insertAtEnd(9);
        
        System.out.println("After Insertion at end: ");
        List1.traverse();

        List1.insertAtBeginning(3);
        List1.insertAtBeginning(1);
        System.out.println("After Insert at beginning: ");
        List1.traverse();

        List1.insertAtSpecific(2, 2);
        List1.insertAtSpecific(7, 8);
        System.out.println("After Insert at specific: ");
        List1.traverse();

        List1.deleteAtEnd();
        System.out.println("After deletion at end: ");
        List1.traverse();

        List1.deleteAtBeginning();
        System.out.println("After deletion at beginning: ");
        List1.traverse();


        List1.deleteAtSpecific(2);
        System.out.println("After Deletion specific: ");
        List1.traverse();

        List1.insertAtBeginning(1);

    }    
}
