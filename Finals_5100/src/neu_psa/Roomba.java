package neu_psa;

public final class Roomba implements iRobot{
    public enum Directions{
        Up,Down, Left, Right
    }
    private int[][] room;
    String direction = Directions.Down.toString();

     int row  = 0;
     int col = 0;

    public Roomba(final int[][] room){
        this.room = room;
    }


    @Override
    public final boolean move() {
        if(direction.equals(Directions.Down)){
            if(row+1 < 0 || row+1 > room.length){
                return false;
            }
            if(room[row+1][col] == -1){
                return false;
            }
            row = row+1;
            col = col;
            return true;
        }
        if(direction.equals(Directions.Left)){
            if(col-1 < 0 || col-1 > room[0].length){
                return false;
            }
            if(room[row][col-1] == -1){
                return false;
            }
            row= row;
            col =col-1;
            return true;
        }
        if(direction.equals(Directions.Right)){
            if(col+1 < 0 || col+1 > room[0].length){
                return false;
            }
            if(room[row][col+1] == -1){
                return false;
            }
            row = row;
            col = col+1;
            return true;
        }
        if(direction.equals(Directions.Up)){
            if(row-1 < 0 || row-1 > room.length){
                return false;
            }
            if(room[row-1][col] == -1){
                return false;
            }
            row = row-1;
            col = col;
            return true;
        }
        return false;
    }

    @Override
    public final void turnLeft() {

        direction = Directions.Left.toString();
    }

    @Override
    public  final void turnRight() {
        direction = Directions.Right.toString();
    }

    @Override
    public final void clean() {
       room[row][col] = 1;
    }
}
