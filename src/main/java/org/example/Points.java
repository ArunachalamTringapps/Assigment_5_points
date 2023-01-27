package org.example;
import java.util.*;
import java.util.logging.*;

class Coordi implements Cloneable {
    String x1;
    String y1;
    Coordi(String x1,String y1){
        this.x1=x1;
        this.y1=y1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equalling(String x2, String y2){
        return x1.equals(x2) && y1.equals(y2);
    }


}
public class Points {
    public static void main(String[] args)throws CloneNotSupportedException  {
        Scanner sc=new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        l.info("Welcome guys");
        l.info("Enter the co-ordinates X: ");
        String x1=sc.nextLine();
        l.info("Enter the co-ordinates Y: ");
        String y1=sc.nextLine();
        Coordi c1=new Coordi(x1,y1);
        l.info("Enter the co-ordinate X to check:");
        String x2=sc.nextLine();
        l.info("Enter the co-ordinates Y to check: ");
        String y2=sc.nextLine();
        Coordi c2=(Coordi) c1.clone();
        l.log(Level.INFO, () -> "The result is: " + c2.equalling(x2,y2));
    }
}