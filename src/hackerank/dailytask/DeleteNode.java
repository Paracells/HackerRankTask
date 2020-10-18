package hackerank.dailytask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Delete the node at a given position in a linked list and return a reference to the head node. The head is at position 0.
The list may be empty after you delete the node. In that case, return a null value.
 */
public class DeleteNode {
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (position == 0) return head = head.next;
        SinglyLinkedListNode current = head;
        int n = 0;
        while (n < position - 1) {
            current = current.next;
            n++;
        }
        current.next = current.next.next;
        return head;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    private static void printSinglyLinkedList(SinglyLinkedListNode llist1, String s, BufferedWriter bufferedWriter) {
    }
}

