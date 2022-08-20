package bjpowercode.cn.Demo.IO.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<User> listUser = new ArrayList<>();

        listUser.add(new User(1,"张丹"));
        listUser.add(new User(2,"释放"));
        listUser.add(new User(3,"wangwu"));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Users"));


            oos.writeObject(listUser);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
