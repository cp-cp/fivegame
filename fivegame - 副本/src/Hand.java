public class Hand
{
//    private java.lang.String[][] String;
    String playList[]=new String[3];
    int pointer=1;
    public Hand(String first, String second)
    {
        playList[1]=first;
        playList[2]=second;
    }

    public int Player()
    {
        return pointer;
    }

    public void change()
    {
        pointer=pointer%2+1;
    }
}
