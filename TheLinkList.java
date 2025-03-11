// public class TheLinkList {

//     Node head;
//     private int size;

//     TheLinkList(){
//         this.size = 0;
//     }

//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//             size++;
//         }
//     }

//     // add - first, last
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }

//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }

//         currNode.next = newNode;
//     }

//     // print 
//     public void printList(){
//         if(head == null){
//             System.out.print(" List is empty ");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }

//         System.out.print("NULL");
//     }

//     // delete first
//     public void deleteFirst(){
//         if(head == null){
//             System.out.print(" This list is empty ");
//             return;
//         }
//         size--;
//         head = head.next;
//     }

//     // delete last
//     public void deleteLast(){
//         if(head == null){
//             System.out.print("This list is empty");
//             return;
//         }
//         size--;
//         if(head.next == null){
//             head = null;
//             return;
//         }

//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null){
//             lastNode = lastNode.next;
//             secondLast = secondLast.next;
//         }

//         secondLast.next = null;
//     }

//     public int getSize(){
//         return size;
//     }
//     public static void main(String[] args) {
//         TheLinkList list = new TheLinkList();
//         list.addFirst(" a");
//         list.addFirst(" is");
//         list.addFirst(" This");
//         list.addLast(" list");
//         list.printList();

//         list.deleteFirst();
//         list.printList();

//         list.deleteLast();
//         list.printList();

//         System.out.println(" "+list.getSize());
//     }
// }


/**
 * TheLinkList
 */

// import java.util.LinkedList;
// public class TheLinkList {

//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<String>();

//         list.addFirst("a");
//         list.addFirst("is");
//         System.out.println(list);

//         list.addLast("list");
//         list.addFirst("This");
//         list.add(".com"); // by default addLast
//         System.out.println(list);

//         System.out.println(list.size());

//         for(int i=0; i<list.size(); i++){
//             System.out.print(list.get(i) + " -> ");
//         }
//         System.out.println("null");

//         list.removeFirst();
//         System.out.println(list);

//         list.removeLast();
//         System.out.println(list);

//         list.remove(1); // by default last
//         System.out.println(list);
//     }
// }

// Reverse the linkedlist

// import java.util.LinkedList;
// import java.util.Collections;
// public class TheLinkList {

//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         System.out.println("Original LinkedList : " + list);

//         Collections.reverse(list);

//         System.out.println("After Reversing : " + list);

//     }
// }

// Find the Middle of a Linked List

// import java.util.LinkedList;

// public class TheLinkList {

//     public static int findMiddle(LinkedList<Integer> list){

//         int slow = 0, fast = 0;

//         while(fast < list.size()){
//             fast += 2;
//             slow++;
//         }
//         return list.get(slow);
//     }

//     public static void main(String[] args) {

//         LinkedList<Integer> list = new LinkedList<>();

//         for(int i=1; i<=8; i+=2){
//             list.add(i);
//         }

//         System.out.println("Originel LinkedList : " + list);

//         int middle = findMiddle(list);

//         System.out.println("Middle Element of the LinkedList : " + middle);
//     }
// }

// Code to merge two linkedlist 

// import java.util.LinkedList;
// public class TheLinkList {

//     public static void main(String[] args) {

//         LinkedList<Integer> list1 = new LinkedList<>();
//         LinkedList<Integer> list2 = new LinkedList<>();

//         for(int i=1; i<=5; i++){
//             list1.add(i);
//         }
//         for(int i=6; i<=10; i++){
//             list2.add(i);
//         }

//         list1.addAll(list2);

//         System.out.println(list1);
//     }
// }