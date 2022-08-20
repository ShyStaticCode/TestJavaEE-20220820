package bjpowercode.cn.Demo.jihe.List.danList;

public class Link {
    Node header =null;

    int size = 0;

    public int size(){
        return size;
    }

    /**
     * 向末尾添加元素
     * @param data
     */
    public void add(Object data){
        if(header == null){
            new Node(data,null);
        }else{
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
        size++;
    }

    /**
     * 查找末尾节点的方法
     * @return
     */
    private Node findLast(Node node) {
        if(node.next == null){
            return node;
        }
        return findLast(node.next);//递归
    }

    public  void  remove(Object obj){


    }

    public void  modify(Object newobj){

    }

    public  int find(Object obj){
        return 1;
    }
}
