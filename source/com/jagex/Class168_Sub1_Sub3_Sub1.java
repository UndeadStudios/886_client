/* Class168_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class168_Sub1_Sub3_Sub1 extends Class168_Sub1_Sub3
{
    Image anImage12149;
    
    public void method352() {
	/* empty */
    }
    
    void method18205(int i) {
	super.method18205(1648340065);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11626, anIntArray11626.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (-1098803169 * anInt11628,
					    1162325157 * anInt11625)),
					  databufferint, null);
	anImage12149 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    Class168_Sub1_Sub3_Sub1(Class182_Sub2 class182_sub2, Canvas canvas, int i,
			    int i_0_) {
	super(class182_sub2, canvas, i, i_0_);
	new Rectangle();
	method18205(2124043383);
    }
    
    public final int method14607(int i, int i_1_) {
	Graphics graphics = aCanvas11624.getGraphics();
	if (graphics == null)
	    return 0;
	graphics.drawImage(anImage12149, i, i_1_, aCanvas11624);
	return 0;
    }
    
    public void method127() {
	/* empty */
    }
    
    public int method14608() {
	return method14607(0, 0);
    }
    
    public final int method14611(int i, int i_2_) {
	Graphics graphics = aCanvas11624.getGraphics();
	if (graphics == null)
	    return 0;
	graphics.drawImage(anImage12149, i, i_2_, aCanvas11624);
	return 0;
    }
    
    public void method222() {
	/* empty */
    }
    
    void method18207() {
	super.method18205(1856725266);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11626, anIntArray11626.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (-1098803169 * anInt11628,
					    1162325157 * anInt11625)),
					  databufferint, null);
	anImage12149 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    public void method221() {
	/* empty */
    }
    
    public int method14610() {
	return method14607(0, 0);
    }
    
    public int method14606() {
	return method14607(0, 0);
    }
    
    public final int method14612(int i, int i_3_) {
	Graphics graphics = aCanvas11624.getGraphics();
	if (graphics == null)
	    return 0;
	graphics.drawImage(anImage12149, i, i_3_, aCanvas11624);
	return 0;
    }
}
