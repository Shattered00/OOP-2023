package ie.tudublin;

import processing.core.PApplet;

public class Lifeboard {
    boolean[][] board;
    private int size;
    PApplet p;

    public Lifeboard(int size, PApplet p)
    {
        this.size = size;
        board = new boolean[size][size];
        this.p = p;
    }
    public void randomise()
    {
        for(int row = 0; row < size; row++)
        {
            for(int col = 0; col < size; col++)
            {
                float dice = p.random(0,1);
                board[row][col] = (dice <= 0.5f);
            }
        }
    }

    public int getSize() {
        return size;
    }
    

     public void setSize(int size) {
            this.size = size;
        }
    
    public void render()
    {
      //  float w = p.width/size;
        //float h = p.height/ size;
        
        for(int row = 0; row < size; row++)
        {
            for(int col = 0; col < size; col++)
            {
              //float x = col * w;
              //float y = row * w;

              if(board[row][col])
              {
                p.fill(0,255,0);
              }
              else
              {
                p.fill(0);
              }
            }
            //p.rect(x.y, )
        }
    }
}
