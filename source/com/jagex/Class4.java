/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class4
{
    DisplayMode aDisplayMode32;
    GraphicsDevice aGraphicsDevice33;
    
    void method531(Frame frame) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_0_
		= ((Boolean) field.get(aGraphicsDevice33)).booleanValue();
	    if (bool_0_) {
		field.set(aGraphicsDevice33, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice33.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice33, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Object object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice33, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    int[] method532(byte i) {
	DisplayMode[] displaymodes = aGraphicsDevice33.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i_1_ = 0; i_1_ < displaymodes.length; i_1_++) {
	    is[i_1_ << 2] = displaymodes[i_1_].getWidth();
	    is[1 + (i_1_ << 2)] = displaymodes[i_1_].getHeight();
	    is[2 + (i_1_ << 2)] = displaymodes[i_1_].getBitDepth();
	    is[3 + (i_1_ << 2)] = displaymodes[i_1_].getRefreshRate();
	}
	return is;
    }
    
    void method533(Frame frame, int i, int i_2_, int i_3_, int i_4_,
		   byte i_5_) {
	aDisplayMode32 = aGraphicsDevice33.getDisplayMode();
	if (aDisplayMode32 == null)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method535(frame, 129528576);
	if (i_4_ == 0) {
	    int i_6_ = aDisplayMode32.getRefreshRate();
	    DisplayMode[] displaymodes = aGraphicsDevice33.getDisplayModes();
	    boolean bool = false;
	    for (int i_7_ = 0; i_7_ < displaymodes.length; i_7_++) {
		if (displaymodes[i_7_].getWidth() == i
		    && displaymodes[i_7_].getHeight() == i_2_
		    && displaymodes[i_7_].getBitDepth() == i_3_) {
		    int i_8_ = displaymodes[i_7_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_8_ - i_6_) < Math.abs(i_4_ - i_6_)) {
			i_4_ = i_8_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_4_ = i_6_;
	}
	aGraphicsDevice33.setDisplayMode(new DisplayMode(i, i_2_, i_3_, i_4_));
    }
    
    void method534(int i) {
	if (null != aDisplayMode32) {
	    DisplayMode[] displaymodes = aGraphicsDevice33.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_9_ = displaymodes;
	    for (int i_10_ = 0; i_10_ < displaymodes_9_.length; i_10_++) {
		DisplayMode displaymode = displaymodes_9_[i_10_];
		if (displaymode.equals(aDisplayMode32)) {
		    aGraphicsDevice33.setDisplayMode(aDisplayMode32);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice33, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode32 = null;
	}
	method535(null, 1597017685);
    }
    
    void method535(Frame frame, int i) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_11_
		= ((Boolean) field.get(aGraphicsDevice33)).booleanValue();
	    if (bool_11_) {
		field.set(aGraphicsDevice33, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice33.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice33, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Object object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice33, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    void method536() {
	if (null != aDisplayMode32) {
	    DisplayMode[] displaymodes = aGraphicsDevice33.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_12_ = displaymodes;
	    for (int i = 0; i < displaymodes_12_.length; i++) {
		DisplayMode displaymode = displaymodes_12_[i];
		if (displaymode.equals(aDisplayMode32)) {
		    aGraphicsDevice33.setDisplayMode(aDisplayMode32);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice33, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode32 = null;
	}
	method535(null, 1129497513);
    }
    
    void method537(Frame frame, int i, int i_13_, int i_14_, int i_15_) {
	aDisplayMode32 = aGraphicsDevice33.getDisplayMode();
	if (aDisplayMode32 == null)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method535(frame, -361397044);
	if (i_15_ == 0) {
	    int i_16_ = aDisplayMode32.getRefreshRate();
	    DisplayMode[] displaymodes = aGraphicsDevice33.getDisplayModes();
	    boolean bool = false;
	    for (int i_17_ = 0; i_17_ < displaymodes.length; i_17_++) {
		if (displaymodes[i_17_].getWidth() == i
		    && displaymodes[i_17_].getHeight() == i_13_
		    && displaymodes[i_17_].getBitDepth() == i_14_) {
		    int i_18_ = displaymodes[i_17_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_18_ - i_16_) < Math.abs(i_15_ - i_16_)) {
			i_15_ = i_18_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_15_ = i_16_;
	}
	aGraphicsDevice33.setDisplayMode(new DisplayMode(i, i_13_, i_14_,
							 i_15_));
    }
    
    public Class4() throws Exception {
	GraphicsEnvironment graphicsenvironment
	    = GraphicsEnvironment.getLocalGraphicsEnvironment();
	aGraphicsDevice33 = graphicsenvironment.getDefaultScreenDevice();
	if (!aGraphicsDevice33.isFullScreenSupported()) {
	    GraphicsDevice[] graphicsdevices
		= graphicsenvironment.getScreenDevices();
	    GraphicsDevice[] graphicsdevices_19_ = graphicsdevices;
	    for (int i = 0; i < graphicsdevices_19_.length; i++) {
		GraphicsDevice graphicsdevice = graphicsdevices_19_[i];
		if (null != graphicsdevice
		    && graphicsdevice.isFullScreenSupported()) {
		    aGraphicsDevice33 = graphicsdevice;
		    return;
		}
	    }
	    throw new Exception();
	}
    }
    
    int[] method538() {
	DisplayMode[] displaymodes = aGraphicsDevice33.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i = 0; i < displaymodes.length; i++) {
	    is[i << 2] = displaymodes[i].getWidth();
	    is[1 + (i << 2)] = displaymodes[i].getHeight();
	    is[2 + (i << 2)] = displaymodes[i].getBitDepth();
	    is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
	}
	return is;
    }
    
    void method539(Frame frame) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_20_
		= ((Boolean) field.get(aGraphicsDevice33)).booleanValue();
	    if (bool_20_) {
		field.set(aGraphicsDevice33, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice33.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice33, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Object object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice33, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    public static int method540(int i, int i_21_, int i_22_, boolean bool,
				int i_23_) {
	Class322 class322
	    = ((Class322)
	       Class575.aClass40_Sub10_7647.method76(i_22_, -1984296677));
	Class163 class163 = class322.aClass163_3544;
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	int i_24_;
	if (null == class525_sub10 || i_21_ < 0
	    || i_21_ >= class525_sub10.anIntArray10506.length
	    || null == class525_sub10.aClass9Array10508
	    || class525_sub10.aClass9Array10508[i_21_] == null)
	    i_24_ = ((Integer) class163.method2646(1710630235)).intValue();
	else
	    i_24_ = class525_sub10.aClass9Array10508[i_21_]
			.method26(class163.anInt1766 * 248546353, (byte) 84);
	return class322.method5722(i_24_, -1247950249);
    }
}
