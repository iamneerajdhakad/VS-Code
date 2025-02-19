import java.util.Scanner;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        Scanner sc = new Scanner(System.in);
        // Insert node at the head
        void insertAtHead() {
            
            System.out.print("Eneter The Value Of Node To Add At The Head Of LinkedList : ");
            int val = sc.nextInt();
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            System.out.println("\nAfter inserting at head:");
            display();
            System.out.println();
        }

        // Insert node at the end
        void insertAtEnd() {
            System.out.print("Eneter The Value Of Node To Add At The End Of LinkedList : ");
            int val = sc.nextInt();
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            System.out.println("\nAfter inserting at the end:");
            display();
            System.out.println();
        }

        // Display the linked list
        void display() {
            Node temp = head;
            System.out.print("LinkedList: ");
            if (temp == null) {
                System.out.println("LinkedList is Empty");
                return;
            }
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Display reverse of the linked list
        void displayReverse(Node head) {
            if (head == null) return;
            displayReverse(head.next);
            System.out.print(head.data + " ");
        }

        // Get the length of the linked list
        int length(Node head) {
            System.out.println();
            int count = 0;
            while (head != null) {
                count++;
                head = head.next;
            }
            System.out.println("\nLength of the LinkedList: " + count + "\n");
            return count;
        }

        // Insert at a specific index
        void insertAt() {
            System.out.print("Enter The Index Where The Node Is To Be Inserted : ");
            int idx = sc.nextInt();
            System.out.print("Enter The Value Of The Node : ");
            int val = sc .nextInt();
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            System.out.println("\nAfter inserting at index " + idx + ":");
            display();
            System.out.println();
        }

        // Get element at a specific index
        void getElement() {
            System.out.print("Enter The Idex Of the Node To GetData : ");
            int idx = sc.nextInt();
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            System.out.println("\nElement at position " + idx + " is: " + temp.data + "\n" );
        }

        // Merge two linked lists
        void merge(Node head1, Node head2) {
            Node temp1 = head1;
            while (temp1 != null && temp1.next != null) {
                temp1 = temp1.next;
            }
            if (temp1 != null) {
                temp1.next = head2;
            }
            System.out.println("After merging the two linked lists:");
            display();
            System.out.println();
            System.out.print("MergedLinkedList ");
            bubbleSort();
        }

        // Split the list into two parts at a given index
        void split(Node head) {

            Node temp = head;
            Node head2;

            System.out.print("\n Enter The Index To Split LinkedList : ");
            int idx = sc.nextInt();

            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            head2 = temp.next;
            temp.next = null;

            System.out.println("\nFirst half of linked list:");
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println("\n\nSecond half of linked list:");
            temp = head2;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            System.out.println();
        }

        // Bubble sort the linked list
        void bubbleSort() {
            if (head == null || head.next == null) {
                return; // Nothing to sort if the list has 0 or 1 element
            }

            boolean swapped;
            do {
                swapped = false;
                Node current = head;
                while (current.next != null) {
                    if (current.data > current.next.data) {
                        int temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
            System.out.println("After sorting the LinkedList:");
            display();
            //System.out.println();
        }

        // Create a linked list by user input
        void EnterLinkedList() {
            
            System.out.print("Enter the number of nodes in the linked list: ");
            int n = sc.nextInt();
            System.out.println();

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter value of node " + i + ": ");
                int val = sc.nextInt();

                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
            }
            System.out.println("\nThe entered linked list:");
            display();
            System.out.println();
            //sc.close();  // Close the scanner after use
        }

        // Delete a node at a specific index
        void Delete() {
            Node temp = head;
            System.out.print("Enter The Index Of The Node Which is To Be Deleted : ");
            int idx = sc.nextInt();
            if (head == null) {
                System.out.println("LinkedList is empty, can't delete");
            } else if (head.next == null) {
                head = null;
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            System.out.println("\nAfter deleting the " + idx + "th node:");
            display();
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        Linkedlist l2 = new Linkedlist();

        ll.EnterLinkedList();
        ll.insertAt();
        ll.insertAtHead();
        ll.insertAtEnd();
        ll.bubbleSort();
        System.out.println("\nReverse of LinkedList:");
        ll.displayReverse(ll.head);
        ll.length(ll.head);
        ll.getElement();
        ll.Delete();
        l2.EnterLinkedList();
        ll.merge(ll.head, l2.head);
        ll.split(ll.head);
        ll.display();
    }
}
