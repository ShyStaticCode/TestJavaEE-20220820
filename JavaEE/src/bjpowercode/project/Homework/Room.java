package bjpowercode.project.Homework;


/**
 * 酒店的房间
 */
public class Room {
    /**
     * 房间编号
     *1楼：101  102  103  104  105
     *2楼: 201  202  203  204  205
     *3楼： 301  302  303  304  305
     */
    private int no;
    /**
     * 房间的类型
     * 单人间   标准间   总统套房
     */
    private String type;
    /**
     * 房间的状态
     * true  表示空闲，可以预定
     * false 表示占用，不可预定
     */
    private boolean status;

    /**
     * equals()方法重写
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;
        Room room = (Room)obj;
        return this.no == room.getNo();
        }

    /**
     * 重写toString()方法
     * 将java对象转换为字符串
     * @return
     */
    @Override
    public String toString() {
        return "["+no + "," + type + '\'' + "," + (status ? "空闲" : "占用") + ']';
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public Room() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
