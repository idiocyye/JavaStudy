package day23.two;

public class HotelMg {
    private Room[][] rooms;
    public HotelMg() {
        this.rooms = new Room[3][5];
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",false);
                }else if (i == 1) {
                    rooms[i][j] = new Room((i+1)*100+j+1,"大床房",false);
                }else if (i == 2) {
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",false);
                }
            }
        }
    }
    //打印
    public void print(){
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room=rooms[i][j];
                System.out.println(room);
            }
            System.out.println("");
        }
    }
    //订房
    public void book(int roomNumber){
        Room room=rooms[roomNumber/100-1][roomNumber%100-1];
        room.setFill(true);
    }
    //退房
    public void checkOut(int roomNumber) {
        Room room=rooms[roomNumber/100-1][roomNumber%100-1];
        room.setFill(false);
    }
}
