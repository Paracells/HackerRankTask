package hackerrank.dailytask;

import java.util.Scanner;

public class PrintLinkedList {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = new_node;
            return head;
        }
        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
        return head;

    }

    static void printLinkedList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;

    public void insertNode(int llistItem) {

    }
}
