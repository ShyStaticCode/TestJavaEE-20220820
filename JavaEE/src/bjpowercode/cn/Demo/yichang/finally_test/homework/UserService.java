package bjpowercode.cn.Demo.yichang.finally_test.homework;

import java.util.Scanner;

/**
 * 用户业务类
 */
public class UserService {

    //注册的方法
    public  void register(String name,int password) throws MyException {
        //判断非空（ ?? == null）最好放在最前面
        //判断非空也可以写成  null==name
        if(null == name || name.length() < 6 || name.length() > 14){

            throw new MyException("用户名长度设置不合法");
        }
        System.out.println("注册成功，欢迎"+name);

    }
}
