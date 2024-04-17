public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();

    }
}

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("up,right,left,down,diagonal,(4 all) ");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("up,left,right,down");
    }
}
