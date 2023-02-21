/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public final class Class251
{
    static long aLong2451;
    static Class705 aClass705_2452;
    
    public static final synchronized long method4507() {
	long l = System.currentTimeMillis();
	if (l < 366611380930165073L * Exception_Sub5.aLong11424)
	    aLong2451 += ((Exception_Sub5.aLong11424 * 366611380930165073L - l)
			  * 2155258201235508849L);
	Exception_Sub5.aLong11424 = -6825222345276936271L * l;
	return l + aLong2451 * 3828181334707548817L;
    }
    
    public static final synchronized long method4508(byte i) {
	long l = System.currentTimeMillis();
	if (l < 366611380930165073L * Exception_Sub5.aLong11424)
	    aLong2451 += ((Exception_Sub5.aLong11424 * 366611380930165073L - l)
			  * 2155258201235508849L);
	Exception_Sub5.aLong11424 = -6825222345276936271L * l;
	return l + aLong2451 * 3828181334707548817L;
    }
    
    public static final synchronized long method4509() {
	long l = System.currentTimeMillis();
	if (l < 366611380930165073L * Exception_Sub5.aLong11424)
	    aLong2451 += ((Exception_Sub5.aLong11424 * 366611380930165073L - l)
			  * 2155258201235508849L);
	Exception_Sub5.aLong11424 = -6825222345276936271L * l;
	return l + aLong2451 * 3828181334707548817L;
    }
    
    Class251() throws Throwable {
	throw new Error();
    }
    
    public static final void method4510(int i, String string, Color color,
					Color color_0_, Color color_1_,
					int i_2_) {
	try {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (null == Class642.aFont8329)
		Class642.aFont8329 = new Font("Helvetica", 1, 13);
	    if (null == color)
		color = new Color(140, 17, 17);
	    if (color_0_ == null)
		color_0_ = new Color(140, 17, 17);
	    if (null == color_1_)
		color_1_ = new Color(255, 255, 255);
	    try {
		if (Class286.anImage3146 == null)
		    Class286.anImage3146
			= (Class532.aCanvas7169.createImage
			   (-1445589163 * Class434.anInt4827,
			    -1883654023 * Class696_Sub47.anInt11032));
		Graphics graphics_3_ = Class286.anImage3146.getGraphics();
		graphics_3_.setColor(Color.black);
		graphics_3_.fillRect(0, 0, -1445589163 * Class434.anInt4827,
				     -1883654023 * Class696_Sub47.anInt11032);
		int i_4_ = -1445589163 * Class434.anInt4827 / 2 - 152;
		int i_5_ = Class696_Sub47.anInt11032 * -1883654023 / 2 - 18;
		graphics_3_.setColor(color_0_);
		graphics_3_.drawRect(i_4_, i_5_, 303, 33);
		graphics_3_.setColor(color);
		graphics_3_.fillRect(i_4_ + 2, i_5_ + 2, i * 3, 30);
		graphics_3_.setColor(Color.black);
		graphics_3_.drawRect(i_4_ + 1, 1 + i_5_, 301, 31);
		graphics_3_.fillRect(i * 3 + (2 + i_4_), 2 + i_5_, 300 - 3 * i,
				     30);
		graphics_3_.setFont(Class642.aFont8329);
		graphics_3_.setColor(color_1_);
		graphics_3_.drawString(string,
				       i_4_ + (304 - string.length() * 6) / 2,
				       22 + i_5_);
		if (Class503.aString5565 != null) {
		    graphics_3_.setFont(Class642.aFont8329);
		    graphics_3_.setColor(color_1_);
		    graphics_3_.drawString
			(Class503.aString5565,
			 (Class434.anInt4827 * -1445589163 / 2
			  - Class503.aString5565.length() * 6 / 2),
			 -1883654023 * Class696_Sub47.anInt11032 / 2 - 26);
		}
		graphics.drawImage(Class286.anImage3146, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class434.anInt4827 * -1445589163,
				  -1883654023 * Class696_Sub47.anInt11032);
		int i_6_ = -1445589163 * Class434.anInt4827 / 2 - 152;
		int i_7_ = -1883654023 * Class696_Sub47.anInt11032 / 2 - 18;
		graphics.setColor(color_0_);
		graphics.drawRect(i_6_, i_7_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_6_ + 2, 2 + i_7_, 3 * i, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(1 + i_6_, i_7_ + 1, 301, 31);
		graphics.fillRect(3 * i + (2 + i_6_), i_7_ + 2, 300 - i * 3,
				  30);
		graphics.setFont(Class642.aFont8329);
		graphics.setColor(color_1_);
		if (null != Class503.aString5565) {
		    graphics.setFont(Class642.aFont8329);
		    graphics.setColor(color_1_);
		    graphics.drawString
			(Class503.aString5565,
			 (-1445589163 * Class434.anInt4827 / 2
			  - Class503.aString5565.length() * 6 / 2),
			 -1883654023 * Class696_Sub47.anInt11032 / 2 - 26);
		}
		graphics.drawString(string,
				    i_6_ + (304 - string.length() * 6) / 2,
				    22 + i_7_);
	    }
	} catch (Exception exception) {
	    Class532.aCanvas7169.repaint();
	}
    }
    
    public static void method4511(int i, int i_8_, float f,
				  Interface43 interface43, int i_9_) {
	if (Class661.aClass372_8473 != null)
	    Class661.aClass372_8473.method6342(-558429719)
		.method6401(i, i_8_, f, interface43, (byte) 72);
    }
    
    public static int method4512(int i, int i_10_, int i_11_, int i_12_,
				 int i_13_, int i_14_, int i_15_) {
	if (1 == (i_14_ & 0x1)) {
	    int i_16_ = i_12_;
	    i_12_ = i_13_;
	    i_13_ = i_16_;
	}
	i_11_ &= 0x3;
	if (0 == i_11_)
	    return i;
	if (1 == i_11_)
	    return i_10_;
	if (2 == i_11_)
	    return 7 - i - (i_12_ - 1);
	return 7 - i_10_ - (i_13_ - 1);
    }
    
    static final void method4513(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2738
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -934271899);
	class259.aBool2695 = true;
    }
}
