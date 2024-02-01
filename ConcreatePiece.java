



public class ConcreatePiece implements Piece
{
    private final Player owner;
    private final String type;
    private final String name;
    private Position pos;




    public ConcreatePiece(Player owner, String type, String name, Position position) {
        this.owner = owner;
        this.type = type;
        this.name = name;
        this.pos = position;


    }

    @Override
    public Player getOwner() {
        return this.owner;
    }

    @Override
    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public Position getPos(){
        return this.pos;
    }

}
