/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;



import javax.swing.*;


public class Symbol implements ISymbol {
	
	public static String image;
        public static int value;
        
        @Override
        public String getImage() {
		return image;
	}

        @Override
	public  void setImage(String image) {
		Symbol.image = image;
	}
	
	@Override
	public  void setValue(int v) {
		this.value=v;
		
	}

	@Override
	public  int getValue() {
		return value;
		
	}

	
	
}

