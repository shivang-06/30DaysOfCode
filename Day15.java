import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head == null){
            Node nn = new Node(data);
            head = nn;
            return head;
        }else if(head.next == null){
            Node nn = new Node(data);
            head.next = nn;
            nn.next = null;
            return head;
        }else{
            insert(head.next,data);
            return head;
        }
    }

	public static void display(Node head) {