public class Merge {
    Node head;

    public static void main(String args[]) {
        Merge llist1 = new Merge();
        Merge llist2 = new Merge();
        llist1.push("Souza");
        llist1.push("Barbosa");
        llist1.push("Almeida");

        System.out.println("First Linked List:");
        llist1.printList();

        llist2.push("Angela");
        llist2.push("Cristina");
        llist2.push("Jorge");
        llist2.push("Bianca");
        llist2.push("Paulo");

        System.out.println("Second Linked List:");
        llist2.printList();

        llist1.merge(llist2);

        System.out.println("Modified first linked list:");
        llist1.printList();

        System.out.println("Modified second linked list:");
        llist2.printList();

    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    class Node
    {
        String data;
        Node next;
        Node(String d) {data = d; next = null; }
    }
    void push(String new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void merge(Merge q)
    {
        Node p_curr = head, q_curr = q.head;
        Node p_next, q_next;
        while (p_curr != null && q_curr != null) {
            p_next = p_curr.next;
            q_next = q_curr.next;
            q_curr.next = p_next;
            p_curr.next = q_curr;
            p_curr = p_next;
            q_curr = q_next;
        }
        q.head = q_curr;
    }
}
