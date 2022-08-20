package com.cn.lianbiao;

public class testLinkList {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insertFirst(24);
        ll.insertFirst(23);
        ll.insertFirst(18);
        ll.insertFirst(62);
        ll.insertFirst(21);


        ll.display();
        System.out.println("\n************");
        ll.deleteFirst();
        ll.display();
        System.out.println("\n***********");
        Node sse = ll.find(24);
        sse.display();

    }
}
