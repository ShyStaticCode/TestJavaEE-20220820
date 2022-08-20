package com.cn.lianbiao;

/**
 * 链表
 */
public class LinkList {
    private Node first;

    public LinkList(){
        first = null;
    }
    /**
     * 插入一个节点，头结点之后插入
     */
    public void insertFirst(long value) {
        Node node = new Node(value);
        if (first == null) {
            first = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    /**
     * 删除一个节点，头结点之后删除
     */
    public Node deleteFirst(){
        Node tmp = first;
        first = tmp.next;
        return tmp;
        }

    /**
     * 显示节点中的数据
     */
    public void display(){
        Node current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
    }
    /**
     * 查找方法
     */
    public Node find(long value){
        Node current = first;
        while(current.date != value){
            if(current.next ==null){
                return null;
            }
            current = current.next;
        }
        return current;
    }
}
