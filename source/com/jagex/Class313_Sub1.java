/* Class313_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class313_Sub1 extends Class313
{
    Font aFont10085;
    Class292 this$0;
    FontMetrics aFontMetrics10086;
    Color aColor10087;
    boolean aBool10088;
    
    void method5642(Graphics graphics) {
	String string;
	if (aBool10088)
	    string = this$0.aString3226;
	else
	    string = new StringBuilder().append(this$0.aString3228).append
			 (" ").append
			 (this$0.aString3226).toString();
	graphics.setFont(aFont10085);
	graphics.setColor(aColor10087);
	graphics.drawString(string,
			    (this$0.method5283(aFontMetrics10086
						   .stringWidth(string),
					       -2129504139)
			     + anInt3483 * 642724771),
			    (this$0.method5284(0, (byte) 54)
			     + anInt3482 * -1691032291));
    }
    
    void method5641(Graphics graphics, int i) {
	String string;
	if (aBool10088)
	    string = this$0.aString3226;
	else
	    string = new StringBuilder().append(this$0.aString3228).append
			 (" ").append
			 (this$0.aString3226).toString();
	graphics.setFont(aFont10085);
	graphics.setColor(aColor10087);
	graphics.drawString(string,
			    (this$0.method5283(aFontMetrics10086
						   .stringWidth(string),
					       1323190395)
			     + anInt3483 * 642724771),
			    (this$0.method5284(0, (byte) 36)
			     + anInt3482 * -1691032291));
    }
    
    Class313_Sub1(Class292 class292, boolean bool, String string, int i,
		  int i_0_, int i_1_, int i_2_) {
	super(class292, i_1_, i_2_);
	this$0 = class292;
	aBool10088 = bool;
	aFont10085 = new Font(string, 0, i);
	aFontMetrics10086 = Class532.aCanvas7169.getFontMetrics(aFont10085);
	aColor10087 = new Color(i_0_);
    }
}
