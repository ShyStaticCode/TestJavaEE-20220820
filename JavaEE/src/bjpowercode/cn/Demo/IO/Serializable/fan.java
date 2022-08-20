package bjpowercode.cn.Demo.IO.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class fan {
    public static void main(String[] args) {
        /**
         * 反序列化集合
         */
        ObjectInputStream ois= null;
        try {
             ois = new ObjectInputStream(new FileInputStream("Users"));
            List<User> list = (List<User>)ois.readObject();

            System.out.println(list);
            for (User user : list) {

                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
