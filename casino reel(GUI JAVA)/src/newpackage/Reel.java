/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class Reel {
	public static Random rand = rand = new Random();
        public static String [] images = new String[6];
	public static int index,index1,index2,index3;
        public static int count=0;
        public static Symbol obj = new Symbol();
        public static int usercoins=10;
        public static int userxcoins=0;
        public static int scount=0;  
        public static int wincount=0;  
        public static int lostcount=0;  
        public static int betcoins=0;  
        public static String ucoins="";
        public static int betavarage=0;
        
	public static void spin() {
            count++;
             images[0] = "redseven.png";
             images[1] = "bell.png";
             images[2] = "watermelon.png";
             images[3] = "plum.png";
             images[4] = "lemon.png";
             images[5] = "cherry.png";
             
            index = rand.nextInt(6);
            obj.setValue(index);
            Value();
        }
        
        public static void Value(){
            if(count==1){
                index1 = obj.getValue();
         
            }else if(count==2){
                index2 = obj.getValue();
                
            }else if(count==3){
                index3 = obj.getValue();
                 
            }
        }
        
        public static void win(){
        if((index1==0 && index2==0) || (index3==0 && index2==0)||(index3==0 && index1==0)){
            GUI.winCountLabel.setText("You won 7 coins");
            wincount++;
            usercoins = usercoins + betcoins*7;
        }else if((index1==1 && index2==1) || (index3==1 && index2==1)||(index3==1 && index1==1)){
            GUI.winCountLabel.setText("You won 6 coins");
            wincount++;
            usercoins = usercoins + betcoins*6;
        }else if((index1==2 && index2==2) || (index3==2 && index2==2)||(index3==2 && index1==2)){
            GUI.winCountLabel.setText("You won 5 coins");
            wincount++;
            usercoins = usercoins + betcoins*5;
        }else if((index1==3 && index2==3) || (index3==3 && index2==3)||(index3==3 && index1==3)){
            GUI.winCountLabel.setText("You won 4 coins");
            wincount++;
            usercoins = usercoins + betcoins*4;
        }else if((index1==4 && index2==4) || (index3==4 && index2==4)||(index3==4 && index1==4)){
            GUI.winCountLabel.setText("You won 3 coins");
            wincount++;
            usercoins = usercoins + betcoins*3;
        }else if((index1==5 && index2==5) || (index3==5 && index2==5)||(index3==5 && index1==5)){
            GUI.winCountLabel.setText("You won 2 coins");
            wincount++;
            usercoins = usercoins + betcoins*2;
        }else{
            GUI.winCountLabel.setText("You lost");
            lostcount++;
            usercoins = usercoins-betcoins;
        }
    }
        
      public static void print(){
         String win = Integer.toString(wincount);
         String los = Integer.toString(lostcount);
         String avarage =Integer.toString(betavarage/2);
          try(  PrintWriter out = new PrintWriter( "User.txt","UTF-8" )  ){
                    out.println( "User wins - "+win );
                    out.println( "User loses - "+los );
                    out.println( "User Bet avarage - "+avarage );
}catch(IOException e)
{
    System.out.println("Exception ");

} 
      }
        
        
        
        
        
        
        
	
}
