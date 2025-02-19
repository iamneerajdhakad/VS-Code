/*

There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.

*/

import java.util.Scanner;

public class DeleteNodeinaLinkedList {
    public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static class Linkedlist {

        Node head = null;
        Node tail = null;
        Scanner sc = new Scanner(System.in);

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
        }
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

        void deleteNode(Node node){

            if (node == null || node.next == null) {
                System.out.println("Cannot delete the node!");
                return;
            }

            node.data = node.next.data;
            node.next = node.next.next;
    
        }

        Node findNode(int value) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == value) {
                    return temp;
                }
                temp = temp.next;
            }
            return null; // Return null if node not found
        }
    }



    public static void main(String[] args) {
        
        Linkedlist l = new Linkedlist();

        l.EnterLinkedList();

        try(Scanner sc = new Scanner(System.in);){

        System.out.print("Enter the value of node to delete: ");
        int val = sc.nextInt();

        l.deleteNode(l.findNode(val));

        System.out.println();

        l.display();
        

        }
    }
}
