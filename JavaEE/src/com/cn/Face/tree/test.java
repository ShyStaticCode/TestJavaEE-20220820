package com.cn.Face.tree;

public class test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(40);
        tree.insert(30);
        tree.insert(50);
        tree.insert(25);
        tree.insert(35);
        tree.insert(45);
        tree.insert(60);


        tree.afterOrder(tree.root);
        System.out.println("\n**************");
        tree.inOrder(tree.root);
        System.out.println("\n**************");
        tree.frontOrder(tree.root);

//        System.out.println(tree.root.data);
//        System.out.println(tree.root.leftChild.rightChild.data);
//        System.out.println(tree.root.rightChild.data);
    }
}
