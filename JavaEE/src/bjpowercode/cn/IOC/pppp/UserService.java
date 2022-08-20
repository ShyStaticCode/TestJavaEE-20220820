package bjpowercode.cn.IOC.pppp;

/**
 * 登录方法
 */
public class UserService {
    public boolean login(String name,String password){
        if("admin".equals(name) && "123456".equals(password)){
            return true;
        }
        return false;
    }

    public void logout(){
        System.out.print("系统已经安全退出！");
    }
}
