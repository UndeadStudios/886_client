/* Class313_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class313_Sub2_Sub1 extends Class313_Sub2
{
    float aFloat11618;
    float aFloat11619;
    Class292 this$0;
    
    void method5642(Graphics graphics) {
	aFloat11619 += aFloat11618;
	if (aFloat11619 < 0.0F)
	    aFloat11619 += 360.0F;
	aFloat11619 %= 360.0F;
	double d = Math.toRadians((double) aFloat11619);
	int i = anImage10105.getWidth(null);
	int i_0_ = anImage10105.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5283(i, 738674471) + i / 2
				    + anInt3483 * 642724771),
			  (double) (this$0.method5284(i_0_, (byte) 43)
				    + i_0_ / 2 + anInt3482 * -1691032291));
	graphics2d.translate((this$0.method5283(i, 568308441)
			      + anInt3483 * 642724771),
			     (this$0.method5284(i_0_, (byte) 45)
			      + anInt3482 * -1691032291));
	graphics2d.drawImage(anImage10105, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3229);
    }
    
    Class313_Sub2_Sub1(Class292 class292, Image image, int i, int i_1_,
		       float f) {
	super(class292, image, i, i_1_);
	this$0 = class292;
	aFloat11618 = f;
	aFloat11619 = -aFloat11618;
    }
    
    void method5641(Graphics graphics, int i) {
	aFloat11619 += aFloat11618;
	if (aFloat11619 < 0.0F)
	    aFloat11619 += 360.0F;
	aFloat11619 %= 360.0F;
	double d = Math.toRadians((double) aFloat11619);
	int i_2_ = anImage10105.getWidth(null);
	int i_3_ = anImage10105.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5283(i_2_, -426949017)
				    + i_2_ / 2 + anInt3483 * 642724771),
			  (double) (this$0.method5284(i_3_, (byte) 88)
				    + i_3_ / 2 + anInt3482 * -1691032291));
	graphics2d.translate((this$0.method5283(i_2_, -1222186083)
			      + anInt3483 * 642724771),
			     (this$0.method5284(i_3_, (byte) 84)
			      + anInt3482 * -1691032291));
	graphics2d.drawImage(anImage10105, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3229);
    }
}
