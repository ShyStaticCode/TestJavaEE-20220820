package bjpowercode.cn.Demo.jihe.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fanxing{
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();

        Cat cat = new  Cat();
        Bird bird  = new Bird();
        list.add(cat);
        list.add(bird);
        list.add(new Animal());

        for (Animal animal : list) {
            System.out.println();
        }
        Iterator<Animal> it = list.iterator();

        while (it.hasNext()){
            Animal a = it.next();
            a.move(8);
            if(a instanceof Cat)
                ((Cat) a).catchMouse();
            if(a instanceof Bird)
                ((Bird) a).birdFly();
        }
    }

}












class Animal<qwerty>{

    public void move(qwerty o){
        System.out.println(o +"动物在移动");
    }

}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

class Bird extends Animal{
    public void birdFly(){
        System.out.println("鸟儿在飞翔");
    }
}
