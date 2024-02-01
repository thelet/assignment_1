public class Position {
    private int _x;
    private int _y;

    public Position(int x, int y){
        this._x = x;
        this._y = y;
    }

    public int getX(){
        return this._x;
    }
    public int getY(){
        return this._y;
    }

    public String stringPos(){
        return "("+this._x+" + "+this._y+" )";
    }

}
