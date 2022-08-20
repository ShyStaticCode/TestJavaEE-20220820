package com.cn.Face.tree;

/**
 * 二叉树
 */
public class Tree {
    //根结点
    public   Node root;



    /**
     * 后序遍历
     */
    public void afterOrder(Node localNode){
        if(localNode != null){
            //后序遍历左子树
            afterOrder(localNode.leftChild);
            //后序遍历右子树
            afterOrder(localNode.rightChild);
            //访问根结点
            System.out.print(localNode.data+",");
        }
    }

/**
 * 中序遍历
 */
    public void inOrder(Node localNode){
        if(localNode != null){
            //中序遍历左子树
            inOrder(localNode.leftChild);
            //访问根结点
            System.out.print(localNode.data+",");
            //中序遍历右子树
            inOrder(localNode.rightChild);
        }
        }





    /**
     * 前序遍历
     */
    public void frontOrder(Node localNode){

        if(localNode != null){
            //访问根结点
            System.out.print(localNode.data+",");
            //前序遍历左子树
            frontOrder(localNode.leftChild);
            //前序遍历右子树
            frontOrder(localNode.rightChild);
        }
    }







    /**
     * 插入节点
     * @param value
     */
    public void  insert(long value) {
        //封装结点
        Node newNode = new Node(value);
        //引用当前结点
        Node current = root;
        //引用父节点
        Node parent;
        if (root == null) {
            root = newNode;
            return;
        } else {
            while (true) {
                parent = current;
                if (current.data > value) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
/**
 * 查找节点
 * @param value*/


//    public void find(long value){
//
//
//    }

/**
 * 删除结点
 * @param value*/

//
//    public void delete(long value){
//
//    }

}
