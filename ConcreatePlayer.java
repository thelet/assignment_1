
public class ConcreatePlayer implements Player{

    public boolean defender;
    private int winsCounter;

    public ConcreatePlayer(boolean defender)
    {
        this.defender = defender;
        this.winsCounter=0;
    }



    public boolean isPlayerOne()
    {
        return defender;
    }


    @Override
    public int getWins()
    {
        return this.winsCounter;
    }

    public void setWinsCounter(int winsCounter) {
        this.winsCounter = this.winsCounter + winsCounter;
    }
}
