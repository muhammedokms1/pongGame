import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;


    Ball(int x,int y,int widht,int height){
        super(x,y,widht,height);
        random = new Random();
        int randomXDirection = 0;
        randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);
        int randomYDirection = 0;
        randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);


    }
    public void setXDirection(int randomXDirekction){
        xVelocity = randomXDirekction;
    }
    public void setYDirection(int randomYDirekction){
        yVelocity = randomYDirekction;
    }
    public void move(){
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,height,width);
    }
}
