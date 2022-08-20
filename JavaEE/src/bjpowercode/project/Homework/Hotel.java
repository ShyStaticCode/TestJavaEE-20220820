package bjpowercode.project.Homework;


/**
 * 酒店类，利用二维数组进行模拟所有房间
 */
public class Hotel {
   private  Room[][] rooms;

    public Hotel() {
        //模拟房间，3层10间房
        rooms=new Room[3][10];
        //创建每个房间的对象
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(i==0) rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                if(i==1) rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                if(i==2) rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
            }
        }
    }
    /**
     * 遍历所有房间的状态
     */
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j].toString()+" ");
            }
            System.out.println();
        }
    }

    /**
     * 订房间方法
     * @param roomNo
     */
    public void order(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setStatus(false);
    }

    /**
     * 退房间
     * @param roomNo
     */
    public void exit(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setStatus(true);
    }
}
