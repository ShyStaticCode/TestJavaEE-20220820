package bjpowercode.project;

/**
 * 字符串反转输出
 */
public class ZifuchuanFanzhuan {
    public String reverseString(String inString){
        StringBuilder sb = new StringBuilder(inString);
        return sb.reverse().toString();
    }
}
