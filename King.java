

public class King extends ConcreatePiece {
    public King(int serialNUmber, Position position)
    {
        super(new ConcreatePlayer(true), "♔", "King" + serialNUmber, position);
    }
}
