public class Chess
{
    final int sizeX=15;
    final int sizeY=15;
    final char[] c={' ','◉','⊙'};
    //public
    int[][] map=new int[16][16];

    void Chess()
    {
        for(int i=0;i<=15;i++)
            for(int j=0;j<=15;j++)
                map[i][j]=0;
    }
    boolean able(int x,int y)
    {
        if(x<=sizeX&&y<=sizeY&&x>=1&&y>=1)return true;
        else return false;
    }
    public void Puts(int x,int y,int type)
    {
        map[x][y]=type;
    }
    boolean Win(int x,int y)
    {
        int sumX=0;
        for(int i=x;i<=sizeX;i++)
        {
         //   System.out.println(i+" "+y+"  "+map[i][x]+" "+map[x][y]);
               if(map[i][y]==map[x][y])
                   sumX++;
               else break;
        }
        for(int i=x-1;i>=1;i--)
        {
       //     System.out.println(i+" "+y+"  "+map[i][x]+" "+map[x][y]);
            if(map[i][y]==map[x][y])
                sumX++;
            else break;
        }
      //  System.out.println(sumX);


        int sumY=0;
        for(int i=y;i<=sizeY;i++)
        {
            if(map[x][i]==map[x][y])
                sumY++;
            else break;
        }
        for(int i=y-1;i>=1;i--)
        {
            if(map[x][i]==map[x][y])
                sumY++;
            else break;
        }

        int sumC=0,xx=x,yy=y;
        while(able(xx,yy))
        {
            if(map[xx][yy]==map[x][y])
                sumC++;
            else break;
            xx++;
            yy++;
        }
        xx=x-1;
        yy=y-1;
        while(able(xx,yy))
        {
            if(map[xx][yy]==map[x][y])
                sumC++;
            else break;
            xx--;
            yy--;
        }

        int sumD=0;
        xx=x;
        yy=y;
        while(able(xx,yy))
        {
            if(map[xx][yy]==map[x][y])
                sumD++;
            else break;
            xx++;
            yy--;
        }
        xx=x-1;
        yy=y+1;
        while(able(xx,yy))
        {
            if(map[xx][yy]==map[x][y])
                sumD++;
            else break;
            xx--;
            yy++;
        }
      //  System.out.println(sumD+" "+sumC+" "+sumX+" "+sumY);
        if(sumX>=5||sumC>=5||sumD>=5||sumY>=5)return true;
        else return false;
    }
}
