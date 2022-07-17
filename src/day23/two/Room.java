  package day23.two;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean fill;

    public Room() {
    }

    public Room(int roomNumber, String roomType, boolean fill) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.fill = fill;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof Room)) return false;
        if (this==obj) return true;
        Room room=(Room)obj;
        return this.getRoomNumber()==room.getRoomNumber();
    }

    @Override
    public String toString() {
        return "房间编号:"+roomNumber+" 房间类型："+roomType+" 房间是否空闲："+(fill?"占用":"空闲");
    }
}
