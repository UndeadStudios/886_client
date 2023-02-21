/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class292 implements Interface32
{
    boolean aBool3222;
    boolean aBool3223;
    List aList3224 = new ArrayList();
    boolean aBool3225;
    String aString3226;
    boolean aBool3227;
    String aString3228;
    AffineTransform anAffineTransform3229 = new AffineTransform();
    static long aLong3230;
    
    public void method195() {
	/* empty */
    }
    
    final int method5283(int i, int i_0_) {
	if (aBool3223)
	    return (Class434.anInt4827 * -1445589163 - i) / 2;
	return 0;
    }
    
    final int method5284(int i, byte i_1_) {
	if (aBool3222)
	    return (-1883654023 * Class696_Sub47.anInt11032 - i) / 2;
	return 0;
    }
    
    public void method194(boolean bool, int i) {
	if (!aBool3227 && !aBool3225) {
	    aBool3225 = true;
	    try {
		String[] strings = Class481.method7829(client.aString11066,
						       '|', -1558102017);
		if (strings.length < 3)
		    aBool3227 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class532.aCanvas7169);
		    int i_2_ = 0;
		    for (int i_3_ = 0; i_3_ < strings.length; i_3_++) {
			String[] strings_4_
			    = Class481.method7829(strings[i_3_].trim(), '=',
						  -177937400);
			if (strings_4_[0].equals("halign"))
			    aBool3223 = Boolean.parseBoolean(strings_4_[1]);
			else if (strings_4_[0].equals("valign"))
			    aBool3222 = Boolean.parseBoolean(strings_4_[1]);
			else if (strings_4_[0].equals("image")) {
			    String[] strings_5_
				= Class481.method7829(strings_4_[1], ',',
						      109238300);
			    Image image;
			    try {
				image = method5285(strings_5_[0], 1545724364);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i_2_++);
				aList3224.add
				    (new Class313_Sub2
				     (this, image,
				      Class275.method5102(strings_5_[1],
							  -1763556914),
				      Class275.method5102(strings_5_[2],
							  -1772682177)));
			    }
			} else if (strings_4_[0].equals("rotatingimage")) {
			    String[] strings_6_
				= Class481.method7829(strings_4_[1], ',',
						      1138365813);
			    Image image;
			    try {
				image = method5285(strings_6_[0], -601189109);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i_2_++);
				aList3224.add
				    (new Class313_Sub2_Sub1
				     (this, image,
				      Class275.method5102(strings_6_[1],
							  -1054601439),
				      Class275.method5102(strings_6_[2],
							  -920808020),
				      Float.parseFloat(strings_6_[3])));
			    }
			} else if (strings_4_[0].equals("progress")) {
			    String[] strings_7_
				= Class481.method7829(strings_4_[1], ',',
						      -842725842);
			    aList3224.add(new Class313_Sub1
					  (this,
					   Boolean.parseBoolean(strings_7_[0]),
					   strings_7_[1],
					   Class275.method5102(strings_7_[2],
							       -579922617),
					   Integer.decode(strings_7_[3])
					       .intValue(),
					   Class275.method5102(strings_7_[4],
							       -1108973787),
					   Class275.method5102(strings_7_[5],
							       -1901641426)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3227 = true;
	    }
	}
	if (aBool3227)
	    method5286(1612347385);
	else {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (graphics != null) {
		try {
		    aString3226
			= new StringBuilder().append("").append
			      (Class159.aClass295_1755.method5326(-1859508783))
			      .append
			      ("%").toString();
		    aString3228 = Class159.aClass295_1755.method5327(58163183);
		    if (null == Class286.anImage3146)
			Class286.anImage3146
			    = (Class532.aCanvas7169.createImage
			       (-1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023));
		    Graphics graphics_8_ = Class286.anImage3146.getGraphics();
		    graphics_8_.setColor(Color.BLACK);
		    graphics_8_.fillRect(0, 0,
					 Class434.anInt4827 * -1445589163,
					 (-1883654023
					  * Class696_Sub47.anInt11032));
		    Iterator iterator = aList3224.iterator();
		    while (iterator.hasNext()) {
			Class313 class313 = (Class313) iterator.next();
			class313.method5641(graphics_8_, -2002852070);
		    }
		    graphics.drawImage(Class286.anImage3146, 0, 0, null);
		} catch (Exception exception) {
		    aBool3227 = true;
		}
	    } else
		Class532.aCanvas7169.repaint();
	}
    }
    
    Image method5285(String string, int i) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class281.anApplet3006.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i_9_ = 0;
		int i_10_;
		while ((i_10_ = inputstream.read()) != -1)
		    is[i_9_++] = (byte) i_10_;
		Image image_11_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_11_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (null != inputstream)
		inputstream.close();
	    return image;
	} catch (Object object) {
	    if (null != inputstream)
		inputstream.close();
	    throw object;
	}
    }
    
    void method5286(int i) {
	Class251.method4510
	    (Class159.aClass295_1755.method5326(-1423124005),
	     Class159.aClass295_1755.method5327(-1688037060),
	     client.aColorArray11107[client.anInt11217 * 155153947],
	     client.aColorArray11070[client.anInt11217 * 155153947],
	     client.aColorArray11109[155153947 * client.anInt11217],
	     1959526279);
    }
    
    public void method188(int i) {
	Class198_Sub3.method15611(124228325);
    }
    
    public void method19(int i) {
	/* empty */
    }
    
    public int method202(int i) {
	return 100;
    }
    
    public boolean method198(long l) {
	return true;
    }
    
    public int method189() {
	return 0;
    }
    
    final int method5287(int i) {
	if (aBool3223)
	    return (Class434.anInt4827 * -1445589163 - i) / 2;
	return 0;
    }
    
    final int method5288(int i) {
	if (aBool3223)
	    return (Class434.anInt4827 * -1445589163 - i) / 2;
	return 0;
    }
    
    final int method5289(int i) {
	if (aBool3222)
	    return (-1883654023 * Class696_Sub47.anInt11032 - i) / 2;
	return 0;
    }
    
    Image method5290(String string) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class281.anApplet3006.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i = 0;
		int i_12_;
		while ((i_12_ = inputstream.read()) != -1)
		    is[i++] = (byte) i_12_;
		Image image_13_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_13_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (null != inputstream)
		inputstream.close();
	    return image;
	} catch (Object object) {
	    if (null != inputstream)
		inputstream.close();
	    throw object;
	}
    }
    
    Image method5291(String string) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class281.anApplet3006.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i = 0;
		int i_14_;
		while ((i_14_ = inputstream.read()) != -1)
		    is[i++] = (byte) i_14_;
		Image image_15_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_15_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (null != inputstream)
		inputstream.close();
	    return image;
	} catch (Object object) {
	    if (null != inputstream)
		inputstream.close();
	    throw object;
	}
    }
    
    void method5292() {
	Class251.method4510
	    (Class159.aClass295_1755.method5326(-1867133330),
	     Class159.aClass295_1755.method5327(-1650171763),
	     client.aColorArray11107[client.anInt11217 * 155153947],
	     client.aColorArray11070[client.anInt11217 * 155153947],
	     client.aColorArray11109[155153947 * client.anInt11217],
	     2140688420);
    }
    
    public int method203() {
	return 0;
    }
    
    public void method193() {
	Class198_Sub3.method15611(-260588705);
    }
    
    public void method192() {
	Class198_Sub3.method15611(-457642699);
    }
    
    public int method196() {
	return 100;
    }
    
    public void method186(boolean bool) {
	if (!aBool3227 && !aBool3225) {
	    aBool3225 = true;
	    try {
		String[] strings = Class481.method7829(client.aString11066,
						       '|', -1920238656);
		if (strings.length < 3)
		    aBool3227 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class532.aCanvas7169);
		    int i = 0;
		    for (int i_16_ = 0; i_16_ < strings.length; i_16_++) {
			String[] strings_17_
			    = Class481.method7829(strings[i_16_].trim(), '=',
						  9319565);
			if (strings_17_[0].equals("halign"))
			    aBool3223 = Boolean.parseBoolean(strings_17_[1]);
			else if (strings_17_[0].equals("valign"))
			    aBool3222 = Boolean.parseBoolean(strings_17_[1]);
			else if (strings_17_[0].equals("image")) {
			    String[] strings_18_
				= Class481.method7829(strings_17_[1], ',',
						      1986986648);
			    Image image;
			    try {
				image = method5285(strings_18_[0], 599550839);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2
				     (this, image,
				      Class275.method5102(strings_18_[1],
							  -1322274440),
				      Class275.method5102(strings_18_[2],
							  -1759618927)));
			    }
			} else if (strings_17_[0].equals("rotatingimage")) {
			    String[] strings_19_
				= Class481.method7829(strings_17_[1], ',',
						      -1129804579);
			    Image image;
			    try {
				image = method5285(strings_19_[0], 283422944);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2_Sub1
				     (this, image,
				      Class275.method5102(strings_19_[1],
							  -389910902),
				      Class275.method5102(strings_19_[2],
							  -1212628857),
				      Float.parseFloat(strings_19_[3])));
			    }
			} else if (strings_17_[0].equals("progress")) {
			    String[] strings_20_
				= Class481.method7829(strings_17_[1], ',',
						      1233448368);
			    aList3224.add(new Class313_Sub1
					  (this,
					   Boolean
					       .parseBoolean(strings_20_[0]),
					   strings_20_[1],
					   Class275.method5102(strings_20_[2],
							       -835458106),
					   Integer.decode(strings_20_[3])
					       .intValue(),
					   Class275.method5102(strings_20_[4],
							       -616525415),
					   Class275.method5102(strings_20_[5],
							       -357634858)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3227 = true;
	    }
	}
	if (aBool3227)
	    method5286(1612347385);
	else {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (graphics != null) {
		try {
		    aString3226
			= new StringBuilder().append("").append
			      (Class159.aClass295_1755.method5326(-1524393086))
			      .append
			      ("%").toString();
		    aString3228
			= Class159.aClass295_1755.method5327(-1550959355);
		    if (null == Class286.anImage3146)
			Class286.anImage3146
			    = (Class532.aCanvas7169.createImage
			       (-1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023));
		    Graphics graphics_21_ = Class286.anImage3146.getGraphics();
		    graphics_21_.setColor(Color.BLACK);
		    graphics_21_.fillRect(0, 0,
					  Class434.anInt4827 * -1445589163,
					  (-1883654023
					   * Class696_Sub47.anInt11032));
		    Iterator iterator = aList3224.iterator();
		    while (iterator.hasNext()) {
			Class313 class313 = (Class313) iterator.next();
			class313.method5641(graphics_21_, -2002852070);
		    }
		    graphics.drawImage(Class286.anImage3146, 0, 0, null);
		} catch (Exception exception) {
		    aBool3227 = true;
		}
	    } else
		Class532.aCanvas7169.repaint();
	}
    }
    
    public void method187(boolean bool) {
	if (!aBool3227 && !aBool3225) {
	    aBool3225 = true;
	    try {
		String[] strings
		    = Class481.method7829(client.aString11066, '|', 973498561);
		if (strings.length < 3)
		    aBool3227 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class532.aCanvas7169);
		    int i = 0;
		    for (int i_22_ = 0; i_22_ < strings.length; i_22_++) {
			String[] strings_23_
			    = Class481.method7829(strings[i_22_].trim(), '=',
						  117048340);
			if (strings_23_[0].equals("halign"))
			    aBool3223 = Boolean.parseBoolean(strings_23_[1]);
			else if (strings_23_[0].equals("valign"))
			    aBool3222 = Boolean.parseBoolean(strings_23_[1]);
			else if (strings_23_[0].equals("image")) {
			    String[] strings_24_
				= Class481.method7829(strings_23_[1], ',',
						      2017632206);
			    Image image;
			    try {
				image = method5285(strings_24_[0], 2143573996);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2
				     (this, image,
				      Class275.method5102(strings_24_[1],
							  -283056463),
				      Class275.method5102(strings_24_[2],
							  -1835989682)));
			    }
			} else if (strings_23_[0].equals("rotatingimage")) {
			    String[] strings_25_
				= Class481.method7829(strings_23_[1], ',',
						      672547473);
			    Image image;
			    try {
				image = method5285(strings_25_[0], 738779577);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2_Sub1
				     (this, image,
				      Class275.method5102(strings_25_[1],
							  -1119268317),
				      Class275.method5102(strings_25_[2],
							  -2077844222),
				      Float.parseFloat(strings_25_[3])));
			    }
			} else if (strings_23_[0].equals("progress")) {
			    String[] strings_26_
				= Class481.method7829(strings_23_[1], ',',
						      1649392927);
			    aList3224.add(new Class313_Sub1
					  (this,
					   Boolean
					       .parseBoolean(strings_26_[0]),
					   strings_26_[1],
					   Class275.method5102(strings_26_[2],
							       -1401091922),
					   Integer.decode(strings_26_[3])
					       .intValue(),
					   Class275.method5102(strings_26_[4],
							       -2020937971),
					   Class275.method5102(strings_26_[5],
							       -922474150)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3227 = true;
	    }
	}
	if (aBool3227)
	    method5286(1612347385);
	else {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (graphics != null) {
		try {
		    aString3226
			= new StringBuilder().append("").append
			      (Class159.aClass295_1755.method5326(-2146766175))
			      .append
			      ("%").toString();
		    aString3228
			= Class159.aClass295_1755.method5327(1760656008);
		    if (null == Class286.anImage3146)
			Class286.anImage3146
			    = (Class532.aCanvas7169.createImage
			       (-1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023));
		    Graphics graphics_27_ = Class286.anImage3146.getGraphics();
		    graphics_27_.setColor(Color.BLACK);
		    graphics_27_.fillRect(0, 0,
					  Class434.anInt4827 * -1445589163,
					  (-1883654023
					   * Class696_Sub47.anInt11032));
		    Iterator iterator = aList3224.iterator();
		    while (iterator.hasNext()) {
			Class313 class313 = (Class313) iterator.next();
			class313.method5641(graphics_27_, -2002852070);
		    }
		    graphics.drawImage(Class286.anImage3146, 0, 0, null);
		} catch (Exception exception) {
		    aBool3227 = true;
		}
	    } else
		Class532.aCanvas7169.repaint();
	}
    }
    
    public void method134() {
	/* empty */
    }
    
    public int method197() {
	return 100;
    }
    
    public int method208() {
	return 100;
    }
    
    public boolean method206(long l) {
	return true;
    }
    
    public boolean method205(long l) {
	return true;
    }
    
    public int method204() {
	return 0;
    }
    
    public int method201() {
	return 0;
    }
    
    public void method200() {
	Class198_Sub3.method15611(2024468487);
    }
    
    public void method191(boolean bool) {
	if (!aBool3227 && !aBool3225) {
	    aBool3225 = true;
	    try {
		String[] strings = Class481.method7829(client.aString11066,
						       '|', 1413211417);
		if (strings.length < 3)
		    aBool3227 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class532.aCanvas7169);
		    int i = 0;
		    for (int i_28_ = 0; i_28_ < strings.length; i_28_++) {
			String[] strings_29_
			    = Class481.method7829(strings[i_28_].trim(), '=',
						  238902338);
			if (strings_29_[0].equals("halign"))
			    aBool3223 = Boolean.parseBoolean(strings_29_[1]);
			else if (strings_29_[0].equals("valign"))
			    aBool3222 = Boolean.parseBoolean(strings_29_[1]);
			else if (strings_29_[0].equals("image")) {
			    String[] strings_30_
				= Class481.method7829(strings_29_[1], ',',
						      1683180413);
			    Image image;
			    try {
				image = method5285(strings_30_[0], -739698440);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2
				     (this, image,
				      Class275.method5102(strings_30_[1],
							  -1333787270),
				      Class275.method5102(strings_30_[2],
							  -1973512732)));
			    }
			} else if (strings_29_[0].equals("rotatingimage")) {
			    String[] strings_31_
				= Class481.method7829(strings_29_[1], ',',
						      779451793);
			    Image image;
			    try {
				image = method5285(strings_31_[0], -92304092);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2_Sub1
				     (this, image,
				      Class275.method5102(strings_31_[1],
							  -2140822416),
				      Class275.method5102(strings_31_[2],
							  -567276811),
				      Float.parseFloat(strings_31_[3])));
			    }
			} else if (strings_29_[0].equals("progress")) {
			    String[] strings_32_
				= Class481.method7829(strings_29_[1], ',',
						      -2102019085);
			    aList3224.add(new Class313_Sub1
					  (this,
					   Boolean
					       .parseBoolean(strings_32_[0]),
					   strings_32_[1],
					   Class275.method5102(strings_32_[2],
							       -2144988724),
					   Integer.decode(strings_32_[3])
					       .intValue(),
					   Class275.method5102(strings_32_[4],
							       -1803898092),
					   Class275.method5102(strings_32_[5],
							       -211573680)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3227 = true;
	    }
	}
	if (aBool3227)
	    method5286(1612347385);
	else {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (graphics != null) {
		try {
		    aString3226
			= new StringBuilder().append("").append
			      (Class159.aClass295_1755.method5326(-1044560512))
			      .append
			      ("%").toString();
		    aString3228
			= Class159.aClass295_1755.method5327(1356729332);
		    if (null == Class286.anImage3146)
			Class286.anImage3146
			    = (Class532.aCanvas7169.createImage
			       (-1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023));
		    Graphics graphics_33_ = Class286.anImage3146.getGraphics();
		    graphics_33_.setColor(Color.BLACK);
		    graphics_33_.fillRect(0, 0,
					  Class434.anInt4827 * -1445589163,
					  (-1883654023
					   * Class696_Sub47.anInt11032));
		    Iterator iterator = aList3224.iterator();
		    while (iterator.hasNext()) {
			Class313 class313 = (Class313) iterator.next();
			class313.method5641(graphics_33_, -2002852070);
		    }
		    graphics.drawImage(Class286.anImage3146, 0, 0, null);
		} catch (Exception exception) {
		    aBool3227 = true;
		}
	    } else
		Class532.aCanvas7169.repaint();
	}
    }
    
    void method5293() {
	Class251.method4510
	    (Class159.aClass295_1755.method5326(-2111062628),
	     Class159.aClass295_1755.method5327(-26029640),
	     client.aColorArray11107[client.anInt11217 * 155153947],
	     client.aColorArray11070[client.anInt11217 * 155153947],
	     client.aColorArray11109[155153947 * client.anInt11217],
	     2070445824);
    }
    
    public int method190(int i) {
	return 0;
    }
    
    public void method199(boolean bool) {
	if (!aBool3227 && !aBool3225) {
	    aBool3225 = true;
	    try {
		String[] strings = Class481.method7829(client.aString11066,
						       '|', -1768041776);
		if (strings.length < 3)
		    aBool3227 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class532.aCanvas7169);
		    int i = 0;
		    for (int i_34_ = 0; i_34_ < strings.length; i_34_++) {
			String[] strings_35_
			    = Class481.method7829(strings[i_34_].trim(), '=',
						  41566134);
			if (strings_35_[0].equals("halign"))
			    aBool3223 = Boolean.parseBoolean(strings_35_[1]);
			else if (strings_35_[0].equals("valign"))
			    aBool3222 = Boolean.parseBoolean(strings_35_[1]);
			else if (strings_35_[0].equals("image")) {
			    String[] strings_36_
				= Class481.method7829(strings_35_[1], ',',
						      927934928);
			    Image image;
			    try {
				image = method5285(strings_36_[0], -672528242);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2
				     (this, image,
				      Class275.method5102(strings_36_[1],
							  -1311663923),
				      Class275.method5102(strings_36_[2],
							  -1181648129)));
			    }
			} else if (strings_35_[0].equals("rotatingimage")) {
			    String[] strings_37_
				= Class481.method7829(strings_35_[1], ',',
						      -380744857);
			    Image image;
			    try {
				image = method5285(strings_37_[0], 902330601);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2_Sub1
				     (this, image,
				      Class275.method5102(strings_37_[1],
							  -1122783581),
				      Class275.method5102(strings_37_[2],
							  -851740235),
				      Float.parseFloat(strings_37_[3])));
			    }
			} else if (strings_35_[0].equals("progress")) {
			    String[] strings_38_
				= Class481.method7829(strings_35_[1], ',',
						      863744651);
			    aList3224.add(new Class313_Sub1
					  (this,
					   Boolean
					       .parseBoolean(strings_38_[0]),
					   strings_38_[1],
					   Class275.method5102(strings_38_[2],
							       -2094953507),
					   Integer.decode(strings_38_[3])
					       .intValue(),
					   Class275.method5102(strings_38_[4],
							       -1205531851),
					   Class275.method5102(strings_38_[5],
							       -1754121836)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3227 = true;
	    }
	}
	if (aBool3227)
	    method5286(1612347385);
	else {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (graphics != null) {
		try {
		    aString3226
			= new StringBuilder().append("").append
			      (Class159.aClass295_1755.method5326(-1669477815))
			      .append
			      ("%").toString();
		    aString3228
			= Class159.aClass295_1755.method5327(1949655931);
		    if (null == Class286.anImage3146)
			Class286.anImage3146
			    = (Class532.aCanvas7169.createImage
			       (-1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023));
		    Graphics graphics_39_ = Class286.anImage3146.getGraphics();
		    graphics_39_.setColor(Color.BLACK);
		    graphics_39_.fillRect(0, 0,
					  Class434.anInt4827 * -1445589163,
					  (-1883654023
					   * Class696_Sub47.anInt11032));
		    Iterator iterator = aList3224.iterator();
		    while (iterator.hasNext()) {
			Class313 class313 = (Class313) iterator.next();
			class313.method5641(graphics_39_, -2002852070);
		    }
		    graphics.drawImage(Class286.anImage3146, 0, 0, null);
		} catch (Exception exception) {
		    aBool3227 = true;
		}
	    } else
		Class532.aCanvas7169.repaint();
	}
    }
    
    public void method207(boolean bool) {
	if (!aBool3227 && !aBool3225) {
	    aBool3225 = true;
	    try {
		String[] strings
		    = Class481.method7829(client.aString11066, '|', 113764471);
		if (strings.length < 3)
		    aBool3227 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class532.aCanvas7169);
		    int i = 0;
		    for (int i_40_ = 0; i_40_ < strings.length; i_40_++) {
			String[] strings_41_
			    = Class481.method7829(strings[i_40_].trim(), '=',
						  -1471829460);
			if (strings_41_[0].equals("halign"))
			    aBool3223 = Boolean.parseBoolean(strings_41_[1]);
			else if (strings_41_[0].equals("valign"))
			    aBool3222 = Boolean.parseBoolean(strings_41_[1]);
			else if (strings_41_[0].equals("image")) {
			    String[] strings_42_
				= Class481.method7829(strings_41_[1], ',',
						      1226890234);
			    Image image;
			    try {
				image = method5285(strings_42_[0], -70426917);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2
				     (this, image,
				      Class275.method5102(strings_42_[1],
							  -1187038820),
				      Class275.method5102(strings_42_[2],
							  -113752573)));
			    }
			} else if (strings_41_[0].equals("rotatingimage")) {
			    String[] strings_43_
				= Class481.method7829(strings_41_[1], ',',
						      -531293018);
			    Image image;
			    try {
				image = method5285(strings_43_[0], 60968952);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (image != null) {
				mediatracker.addImage(image, i++);
				aList3224.add
				    (new Class313_Sub2_Sub1
				     (this, image,
				      Class275.method5102(strings_43_[1],
							  -1415810062),
				      Class275.method5102(strings_43_[2],
							  -854192864),
				      Float.parseFloat(strings_43_[3])));
			    }
			} else if (strings_41_[0].equals("progress")) {
			    String[] strings_44_
				= Class481.method7829(strings_41_[1], ',',
						      -1790183209);
			    aList3224.add(new Class313_Sub1
					  (this,
					   Boolean
					       .parseBoolean(strings_44_[0]),
					   strings_44_[1],
					   Class275.method5102(strings_44_[2],
							       -37450399),
					   Integer.decode(strings_44_[3])
					       .intValue(),
					   Class275.method5102(strings_44_[4],
							       -722975735),
					   Class275.method5102(strings_44_[5],
							       -683837559)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3227 = true;
	    }
	}
	if (aBool3227)
	    method5286(1612347385);
	else {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (graphics != null) {
		try {
		    aString3226
			= new StringBuilder().append("").append
			      (Class159.aClass295_1755.method5326(-1533640678))
			      .append
			      ("%").toString();
		    aString3228
			= Class159.aClass295_1755.method5327(-1042845267);
		    if (null == Class286.anImage3146)
			Class286.anImage3146
			    = (Class532.aCanvas7169.createImage
			       (-1445589163 * Class434.anInt4827,
				Class696_Sub47.anInt11032 * -1883654023));
		    Graphics graphics_45_ = Class286.anImage3146.getGraphics();
		    graphics_45_.setColor(Color.BLACK);
		    graphics_45_.fillRect(0, 0,
					  Class434.anInt4827 * -1445589163,
					  (-1883654023
					   * Class696_Sub47.anInt11032));
		    Iterator iterator = aList3224.iterator();
		    while (iterator.hasNext()) {
			Class313 class313 = (Class313) iterator.next();
			class313.method5641(graphics_45_, -2002852070);
		    }
		    graphics.drawImage(Class286.anImage3146, 0, 0, null);
		} catch (Exception exception) {
		    aBool3227 = true;
		}
	    } else
		Class532.aCanvas7169.repaint();
	}
    }
    
    Class292() {
	/* empty */
    }
    
    static final void method5294(Class683 class683, byte i) {
	int i_46_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_46_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_46_ >> 16];
	Class521.method8695(class259, class245, class683, (byte) -56);
    }
    
    static final void method5295(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class560.method9409(class259, class683, 1797640829);
    }
}
