package bjpowercode.cn.annotation.project;

public class NotHasIdPropertyException extends RuntimeException{
    public NotHasIdPropertyException() {
    }
    public NotHasIdPropertyException(String message) {
        super(message);
    }
}
