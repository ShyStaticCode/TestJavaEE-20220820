package bjpowercode.cn.Demo.yichang.finally_test;

/**
 * 模拟栈的数据结构
 * push()压栈||pop()出栈
 */
public class MyStack {
    private Object[] elements;
    private int index;    //栈针

    /**
     * 压栈的方法
     * @param obj
     */
    public void  push(Object obj){
        if(this.index >= elements.length-1){
            System.out.println("栈已经满了，压栈失败。");
            return;
        }
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈"+obj.toString()+"元素成功,栈针指向"+index);
    }
    /**
     * 出栈的方法
     */
    public void pop(){
        if(this.index < 0){
            System.out.println("栈已经空了，出栈失败.");
            return;
        }
        System.out.print("出栈"+elements[index]+"元素成功,");
        this.index--;
        System.out.println("栈针指向"+index);
    }
    //有参和无参构造方法
    public MyStack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }
    public MyStack() {
        this.elements = new Object[10];
        this.index = -1;
    }
    //如果有私有化属性，set()和get()方法必须写上，虽然可能用不上
    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

}
