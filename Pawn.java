

public class Pawn extends ConcreatePiece {
    private int killsCount;
    private ConcreatePiece pawn;


    public Pawn(Player player,int  id, Position pos){
        super(player, player.isPlayerOne() ? "♙" : "♟", player.isPlayerOne() ? "Defender" + id : "Attacker" + id, pos);
    }
}
