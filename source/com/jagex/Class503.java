/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class503
    implements Interface59, Runnable, FocusListener, WindowListener
{
    protected static String aString5565;
    static final String aString5566 = "random.dat";
    public static int anInt5567;
    static Class37 aClass37_5568;
    static final int anInt5569 = 32;
    static long[] aLongArray5570;
    static long[] aLongArray5571;
    public static int anInt5572;
    public static int anInt5573;
    static boolean aBool5574;
    static final String aString5575 = "main_file_cache.idx255";
    static int anInt5576;
    static long aLong5577 = 7246681027506897664L;
    static volatile long aLong5578;
    protected static boolean aBool5579;
    static volatile boolean aBool5580;
    static final long aLong5581 = 3221225472L;
    protected static volatile boolean aBool5582;
    static final String aString5583 = "rw";
    static final String aString5584 = "main_file_cache.dat2";
    static final String aString5585 = "main_file_cache.idx";
    static int anInt5586;
    protected static Class37 aClass37_5587;
    static final int anInt5588 = 1048576;
    protected static Class37 aClass37_5589;
    public static int anInt5590;
    protected static volatile boolean aBool5591;
    static final int anInt5592 = 1;
    static Class508 aClass508_5593;
    static long aLong5594;
    public static int anInt5595;
    boolean aBool5596 = false;
    static final int anInt5597 = 0;
    public static int anInt5598;
    boolean aBool5599 = false;
    static int anInt5600;
    
    public void method376() {
	if (!aBool5574)
	    aLong5594 = ((Class251.method4508((byte) 8) + 4000L)
			 * -4391342627814901797L);
    }
    
    public void supplyApplet(Applet applet) {
	Class281.anApplet3006 = applet;
    }
    
    final void method8202(Class519 class519, String string, String string_0_,
			  int i, int i_1_, int i_2_, int i_3_, boolean bool,
			  int i_4_) {
	try {
	    method8226(Class508.aClass508_5656, bool, 36460330);
	    OutputStream_Sub1.anInt11049
		= ((Class434.anInt4827
		    = class519.method8643(-1900696799) * 514684413)
		   * -691945341);
	    Class696_Sub9.anInt10903
		= (Class696_Sub47.anInt11032
		   = class519.method8644(188711661) * 1209479625) * 1912326165;
	    anInt5572 = 0;
	    anInt5573 = 0;
	    if (Class669.method11036(-1772228847) == Class508.aClass508_5658) {
		OutputStream_Sub1.anInt11049
		    += 2046574830 * class519.method8645((byte) 60);
		Class696_Sub9.anInt10903
		    += 599669498 * class519.method8646((byte) -41);
		method8207(class519.method8647(-1006410808), (byte) -79);
	    }
	    Class403.anApplet4139 = Class281.anApplet3006;
	    method8203(string, string_0_, i, i_1_, i_2_, i_3_, 1988971792);
	} catch (Throwable throwable) {
	    Class525_Sub16_Sub13.method18448(null, throwable, (byte) 48);
	    method8223("crash", -1462379041);
	}
    }
    
    final void method8203(String string, String string_5_, int i, int i_6_,
			  int i_7_, int i_8_, int i_9_) throws Exception {
	anInt5600 = i_6_ * 317474529;
	Class411.anInt4254 = i * 1537651;
	RuntimeException_Sub4.anInt12141 = i_7_ * 646790131;
	RuntimeException_Sub4.anInt12142 = i_8_ * -937292981;
	Class538.aString7179 = "Unknown";
	Class58.aString636 = "1.1";
	try {
	    Class538.aString7179 = System.getProperty("java.vendor");
	    Class58.aString636 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class326.aString3561 = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class326.aString3561 = "Unknown";
	}
	Class396.aString4106 = Class326.aString3561.toLowerCase();
	try {
	    Class285.aString3142 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    Class285.aString3142 = "";
	}
	try {
	    Class107.aString1305
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class107.aString1305 = "";
	}
	try {
	    Class199.aString2194 = System.getProperty("user.home");
	    if (Class199.aString2194 != null)
		Class199.aString2194
		    = new StringBuilder().append(Class199.aString2194).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class396.aString4106.startsWith("win")) {
		if (Class199.aString2194 == null)
		    Class199.aString2194 = System.getenv("USERPROFILE");
	    } else if (Class199.aString2194 == null)
		Class199.aString2194 = System.getenv("HOME");
	    if (null != Class199.aString2194)
		Class199.aString2194
		    = new StringBuilder().append(Class199.aString2194).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (null == Class199.aString2194)
	    Class199.aString2194 = "~/";
	try {
	    Class521.anEventQueue7094
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class168_Sub1.aStringArray9113
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/", Class199.aString2194, "/tmp/",
			     "" };
	Class696_Sub29.aStringArray10958
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (Class411.anInt4254 * -1151787333).toString(),
			     new StringBuilder().append(".file_store_").append
				 (Class411.anInt4254 * -1151787333)
				 .toString() };
    while_2_:
	for (int i_10_ = 0; i_10_ < 4; i_10_++) {
	    Class662.aFile8475
		= method8262(string, string_5_, i_10_, (byte) 0);
	    if (!Class662.aFile8475.exists())
		Class662.aFile8475.mkdirs();
	    File[] files = Class662.aFile8475.listFiles();
	    if (null != files) {
		File[] files_11_ = files;
		for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
		    File file = files_11_[i_12_];
		    if (!method8239(file, false, 1449951188))
			continue while_2_;
		}
	    }
	    break;
	}
	Class525_Sub7.method16126(Class662.aFile8475, (byte) 1);
	Class515.method8594(-2074361242);
	aClass37_5589
	    = new Class37(new Class42((Class689_Sub2_Sub1.method18590
				       ("main_file_cache.dat2", (byte) -55)),
				      "rw", 3221225472L),
			  5200, 0);
	aClass37_5587
	    = new Class37(new Class42((Class689_Sub2_Sub1.method18590
				       ("main_file_cache.idx255", (byte) 99)),
				      "rw", 1048576L),
			  6000, 0);
	Class468.aClass37Array5129 = new Class37[anInt5600 * 30375201];
	for (int i_13_ = 0; i_13_ < 30375201 * anInt5600; i_13_++)
	    Class468.aClass37Array5129[i_13_]
		= new Class37(new Class42((Class689_Sub2_Sub1.method18590
					   (new StringBuilder().append
						("main_file_cache.idx").append
						(i_13_).toString(),
					    (byte) 20)),
					  "rw", 1048576L),
			      6000, 0);
	try {
	    Class202.aClass4_2222 = new Class4();
	} catch (Exception exception) {
	    Class695.aBool8757 = false;
	}
	Class198_Sub22.aClass498_10017 = new Class498();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_14_ = threadgroup.getParent();
	     null != threadgroup_14_;
	     threadgroup_14_ = threadgroup.getParent())
	    threadgroup = threadgroup_14_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
	    if (null != threads[i_15_]
		&& threads[i_15_].getName().startsWith("AWT"))
		threads[i_15_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    synchronized void method8204() {
	method8210(1461753223);
	Container container = Class203.method3854(1955349051);
	Class532.aCanvas7169 = new Canvas_Sub1(container);
	method8249(container, (byte) -89);
    }
    
    void method8205(File file, File file_16_, int i) {
	try {
	    Class42 class42 = new Class42(Class570.aFile7634, "rw", 10000L);
	    RSBuffer class525_sub38 = new RSBuffer(500);
	    class525_sub38.method16735(3, -1018553384);
	    class525_sub38.method16735(null != file_16_ ? 1 : 0, -1228502662);
	    class525_sub38.method16613(file.getPath(), 860199501);
	    if (file_16_ != null)
		class525_sub38.method16613(file_16_.getPath(), 1361131738);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.pos * -1133521593,
			       1185374181);
	    class42.method1047(1676174918);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    abstract void method8206();
    
    synchronized void method8207(String string, byte i) {
	Class198_Sub7.aFrame9932 = new Frame();
	Class198_Sub7.aFrame9932.setTitle(string);
	Class198_Sub7.aFrame9932.setResizable(true);
	Class198_Sub7.aFrame9932.addWindowListener(this);
	Class198_Sub7.aFrame9932.setBackground(Color.black);
	Class198_Sub7.aFrame9932.setVisible(true);
	Class198_Sub7.aFrame9932.toFront();
	Insets insets = Class198_Sub7.aFrame9932.getInsets();
	Class198_Sub7.aFrame9932.setSize
	    (insets.right + (insets.left
			     + -349587129 * OutputStream_Sub1.anInt11049),
	     insets.bottom + (insets.top
			      + Class696_Sub9.anInt10903 * 1666450389));
    }
    
    synchronized void method8208(byte i) {
	method8210(1729277268);
	Container container = Class203.method3854(1955349051);
	Class532.aCanvas7169 = new Canvas_Sub1(container);
	method8249(container, (byte) -9);
    }
    
    final void method8209(String string, String string_17_, int i, int i_18_,
			  int i_19_, int i_20_) throws Exception {
	anInt5600 = i_18_ * 317474529;
	Class411.anInt4254 = i * 1537651;
	RuntimeException_Sub4.anInt12141 = i_19_ * 646790131;
	RuntimeException_Sub4.anInt12142 = i_20_ * -937292981;
	Class538.aString7179 = "Unknown";
	Class58.aString636 = "1.1";
	try {
	    Class538.aString7179 = System.getProperty("java.vendor");
	    Class58.aString636 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class326.aString3561 = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class326.aString3561 = "Unknown";
	}
	Class396.aString4106 = Class326.aString3561.toLowerCase();
	try {
	    Class285.aString3142 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    Class285.aString3142 = "";
	}
	try {
	    Class107.aString1305
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class107.aString1305 = "";
	}
	try {
	    Class199.aString2194 = System.getProperty("user.home");
	    if (Class199.aString2194 != null)
		Class199.aString2194
		    = new StringBuilder().append(Class199.aString2194).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class396.aString4106.startsWith("win")) {
		if (Class199.aString2194 == null)
		    Class199.aString2194 = System.getenv("USERPROFILE");
	    } else if (Class199.aString2194 == null)
		Class199.aString2194 = System.getenv("HOME");
	    if (null != Class199.aString2194)
		Class199.aString2194
		    = new StringBuilder().append(Class199.aString2194).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (null == Class199.aString2194)
	    Class199.aString2194 = "~/";
	try {
	    Class521.anEventQueue7094
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class168_Sub1.aStringArray9113
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/", Class199.aString2194, "/tmp/",
			     "" };
	Class696_Sub29.aStringArray10958
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (Class411.anInt4254 * -1151787333).toString(),
			     new StringBuilder().append(".file_store_").append
				 (Class411.anInt4254 * -1151787333)
				 .toString() };
    while_4_:
	for (int i_21_ = 0; i_21_ < 4; i_21_++) {
	    Class662.aFile8475
		= method8262(string, string_17_, i_21_, (byte) 0);
	    if (!Class662.aFile8475.exists())
		Class662.aFile8475.mkdirs();
	    File[] files = Class662.aFile8475.listFiles();
	    if (null != files) {
		File[] files_22_ = files;
		for (int i_23_ = 0; i_23_ < files_22_.length; i_23_++) {
		    File file = files_22_[i_23_];
		    if (!method8239(file, false, 1449951188))
			continue while_4_;
		}
	    }
	    break;
	}
	Class525_Sub7.method16126(Class662.aFile8475, (byte) 1);
	Class515.method8594(-1674475836);
	aClass37_5589
	    = new Class37(new Class42((Class689_Sub2_Sub1.method18590
				       ("main_file_cache.dat2", (byte) -7)),
				      "rw", 3221225472L),
			  5200, 0);
	aClass37_5587
	    = new Class37(new Class42((Class689_Sub2_Sub1.method18590
				       ("main_file_cache.idx255", (byte) 16)),
				      "rw", 1048576L),
			  6000, 0);
	Class468.aClass37Array5129 = new Class37[anInt5600 * 30375201];
	for (int i_24_ = 0; i_24_ < 30375201 * anInt5600; i_24_++)
	    Class468.aClass37Array5129[i_24_]
		= new Class37(new Class42((Class689_Sub2_Sub1.method18590
					   (new StringBuilder().append
						("main_file_cache.idx").append
						(i_24_).toString(),
					    (byte) 0)),
					  "rw", 1048576L),
			      6000, 0);
	try {
	    Class202.aClass4_2222 = new Class4();
	} catch (Exception exception) {
	    Class695.aBool8757 = false;
	}
	Class198_Sub22.aClass498_10017 = new Class498();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_25_ = threadgroup.getParent();
	     null != threadgroup_25_;
	     threadgroup_25_ = threadgroup.getParent())
	    threadgroup = threadgroup_25_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_26_ = 0; i_26_ < threads.length; i_26_++) {
	    if (null != threads[i_26_]
		&& threads[i_26_].getName().startsWith("AWT"))
		threads[i_26_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    void method8210(int i) {
	if (Class532.aCanvas7169 != null) {
	    Class532.aCanvas7169.removeFocusListener(this);
	    Class532.aCanvas7169.getParent().setBackground(Color.black);
	    Class532.aCanvas7169.getParent().remove(Class532.aCanvas7169);
	}
    }
    
    final boolean method8211(int i) {
	String string
	    = Class281.anApplet3006.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method8223("invalidhost", -989017958);
	return false;
    }
    
    public void run() {
	do {
	    try {
		try {
		    method8212(1790063114);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    Class525_Sub16_Sub13.method18448(method8215(-16711936),
						     throwable, (byte) 26);
		    method8223("crash", -2092896627);
		    method8217(true, (byte) 43);
		    break;
		}
		method8217(true, (byte) -54);
	    } catch (Exception object) {
		method8217(true, (byte) -9);
		throw object;
	    }
	} while (false);
    }
    
    void method8212(int i) {
	if (Class538.aString7179 != null) {
	    String string = Class538.aString7179.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_27_ = Class58.aString636;
		if (string_27_.equals("1.1") || string_27_.startsWith("1.1.")
		    || string_27_.equals("1.2")
		    || string_27_.startsWith("1.2.")
		    || string_27_.equals("1.3")
		    || string_27_.startsWith("1.3.")
		    || string_27_.equals("1.4")
		    || string_27_.startsWith("1.4.")
		    || string_27_.equals("1.5")
		    || string_27_.startsWith("1.5.")
		    || string_27_.equals("1.6.0")) {
		    method8223("wrongjava", -1293254793);
		    return;
		}
		if (string_27_.startsWith("1.6.0_")) {
		    int i_28_;
		    for (i_28_ = 6;
			 (i_28_ < string_27_.length()
			  && Class353.method6258(string_27_.charAt(i_28_),
						 (byte) -24));
			 i_28_++) {
			/* empty */
		    }
		    String string_29_ = string_27_.substring(6, i_28_);
		    if (Class493.method7997(string_29_, -571385798)
			&& Class275.method5102(string_29_, -744291713) < 10) {
			method8223("wrongjava", -1700875458);
			return;
		    }
		}
	    }
	}
	Class203.method3854(1955349051).setFocusCycleRoot(true);
	anInt5590 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * -1239463163);
	anInt5598 = Runtime.getRuntime().availableProcessors() * -133458719;
	method8208((byte) 112);
	method8230(-780867003);
	Class19.aClass511_206 = Class567.method9490(-705532108);
	while (9124278632678370387L * aLong5594 == 0L
	       || (Class251.method4508((byte) 8)
		   < 9124278632678370387L * aLong5594)) {
	    anInt5586 = (Class19.aClass511_206
			     .method8511(aLong5577 * -4657414680009151345L)
			 * 206035505);
	    for (int i_30_ = 0; i_30_ < 1538211537 * anInt5586; i_30_++)
		method8213((short) -4025);
	    method8214(-1215889976);
	    Class273.method5084(Class532.aCanvas7169, 866557356);
	}
    }
    
    void method8213(short i) {
	long l = Class251.method4508((byte) 8);
	long l_31_ = aLongArray5571[Class289.anInt3209 * 839244831];
	aLongArray5571[839244831 * Class289.anInt3209] = l;
	Class289.anInt3209
	    = -787308577 * (1 + 839244831 * Class289.anInt3209 & 0x1f);
	if (0L != l_31_ && l <= l_31_) {
	    /* empty */
	}
	synchronized (this) {
	    Class280.aBool3001 = aBool5580;
	}
	method8220(-405177925);
    }
    
    void method8214(int i) {
	long l = Class251.method4508((byte) 8);
	long l_32_
	    = aLongArray5570[Class606.anInt7970 * 1538834927 - 1 & 0x1f];
	long l_33_ = aLongArray5570[1538834927 * Class606.anInt7970];
	aLongArray5570[Class606.anInt7970 * 1538834927] = l;
	Class606.anInt7970
	    = (Class606.anInt7970 * 1538834927 + 1 & 0x1f) * -1536914161;
	if (l_33_ != 0L && l > l_33_) {
	    int i_34_ = (int) (l - l_33_);
	    anInt5595 = (int) (l - l_32_) * 1843842801;
	    anInt5567 = -1352777801 * ((32000 + (i_34_ >> 1)) / i_34_);
	}
	if ((anInt5576 += -1364909177) * 2030252599 - 1 > 50) {
	    anInt5576 -= 474017886;
	    aBool5591 = true;
	    Class532.aCanvas7169.setSize(Class434.anInt4827 * -1445589163,
					 (Class696_Sub47.anInt11032
					  * -1883654023));
	    Class532.aCanvas7169.setVisible(true);
	    if (Class198_Sub7.aFrame9932 != null
		&& Class96.aFrame1186 == null) {
		Insets insets = Class198_Sub7.aFrame9932.getInsets();
		Class532.aCanvas7169.setLocation((insets.left
						  + anInt5572 * 288760183),
						 (anInt5573 * -1061711907
						  + insets.top));
	    } else
		Class532.aCanvas7169.setLocation(288760183 * anInt5572,
						 anInt5573 * -1061711907);
	}
	method8250(-1259442891);
    }
    
    String method8215(int i) {
	return null;
    }
    
    synchronized void method8216(String string) {
	Class198_Sub7.aFrame9932 = new Frame();
	Class198_Sub7.aFrame9932.setTitle(string);
	Class198_Sub7.aFrame9932.setResizable(true);
	Class198_Sub7.aFrame9932.addWindowListener(this);
	Class198_Sub7.aFrame9932.setBackground(Color.black);
	Class198_Sub7.aFrame9932.setVisible(true);
	Class198_Sub7.aFrame9932.toFront();
	Insets insets = Class198_Sub7.aFrame9932.getInsets();
	Class198_Sub7.aFrame9932.setSize
	    (insets.right + (insets.left
			     + -349587129 * OutputStream_Sub1.anInt11049),
	     insets.bottom + (insets.top
			      + Class696_Sub9.anInt10903 * 1666450389));
    }
    
    public final void focusLost(FocusEvent focusevent) {
	aBool5580 = false;
    }
    
    public void stop() {
	if (!aBool5574)
	    aLong5594 = ((Class251.method4508((byte) 8) + 4000L)
			 * -4391342627814901797L);
    }
    
    public void destroy() {
	if (!aBool5574) {
	    aLong5594 = Class251.method4508((byte) 8) * -4391342627814901797L;
	    Class229.method4381(5000L);
	    method8217(false, (byte) -14);
	}
    }
    
    public final void update(Graphics graphics) {
	paint(graphics);
    }
    
    final void method8217(boolean bool, byte i) {
	synchronized (this) {
	    if (aBool5574)
		return;
	    aBool5574 = true;
	}
	try {
	    method8222(-892834676);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aClass37_5589.method982(737874647);
	    for (int i_35_ = 0; i_35_ < 30375201 * anInt5600; i_35_++)
		Class468.aClass37Array5129[i_35_].method982(386197288);
	    aClass37_5587.method982(2062316988);
	    aClass37_5568.method982(563168712);
	} catch (Exception exception) {
	    /* empty */
	}
	if (aBool5599) {
	    try {
		QueryPerformanceCounter.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (Class525_Sub22.method16341(-1200680218))
	    Class525_Sub7_Sub13.method18248(-691734241).method389((byte) -78);
	if (Class532.aCanvas7169 != null) {
	    try {
		Class532.aCanvas7169.removeFocusListener(this);
		Class532.aCanvas7169.getParent().remove(Class532.aCanvas7169);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (null != Class198_Sub7.aFrame9932) {
	    Class198_Sub7.aFrame9932.setVisible(false);
	    Class198_Sub7.aFrame9932.dispose();
	    Class198_Sub7.aFrame9932 = null;
	}
    }
    
    public final void focusGained(FocusEvent focusevent) {
	aBool5580 = true;
	aBool5591 = true;
    }
    
    public static File method8218() {
	return Class662.aFile8475;
    }
    
    public final void windowActivated(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void windowClosed(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void windowClosing(WindowEvent windowevent) {
	aBool5579 = true;
	destroy();
    }
    
    public final void windowDeactivated(WindowEvent windowevent) {
	/* empty */
    }
    
    public void method367() {
	if (!aBool5574)
	    aLong5594 = 0L;
    }
    
    public final void windowIconified(WindowEvent windowevent) {
	/* empty */
    }
    
    public final synchronized void paint(Graphics graphics) {
	if (!aBool5574) {
	    aBool5591 = true;
	    if ((Class251.method4508((byte) 8)
		 - 7278985959834490711L * aLong5578)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (rectangle == null
		    || ((rectangle.width
			 >= OutputStream_Sub1.anInt11049 * -349587129)
			&& (rectangle.height
			    >= Class696_Sub9.anInt10903 * 1666450389)))
		    aBool5582 = true;
	    }
	}
    }
    
    public abstract void init();
    
    public static File method8219() {
	return Class662.aFile8475;
    }
    
    abstract void method8220(int i);
    
    public final void method8221(WindowEvent windowevent) {
	/* empty */
    }
    
    abstract void method8222(int i);
    
    void method8223(String string, int i) {
	if (!aBool5596) {
	    aBool5596 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class67.method1442(Class281.anApplet3006, "loggedout",
				   -292993566);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class281.anApplet3006.getAppletContext().showDocument
		    (new URL(Class281.anApplet3006.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method8224(String string, String string_36_, int i) {
	if (!aBool5596) {
	    aBool5596 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class67.method1442(Class281.anApplet3006, "loggedout",
				   -1991568046);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class281.anApplet3006.getAppletContext().showDocument
		    (new URL(Class281.anApplet3006.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_36_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    abstract void method8225();
    
    void method8226(Class508 class508, boolean bool, int i) {
	if (null == class508)
	    throw new NullPointerException();
	if (Class508.aClass508_5656 != class508
	    && Class508.aClass508_5657 != class508)
	    throw new IllegalStateException();
	aClass508_5593 = class508;
	if (Class508.aClass508_5657 != aClass508_5593) {
	    if (bool)
		aClass508_5593 = Class508.aClass508_5658;
	}
    }
    
    boolean method8227(File file, boolean bool) {
	boolean bool_37_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_37_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_37_;
    }
    
    public void method8228() {
	do {
	    try {
		try {
		    method8212(1530844705);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    Class525_Sub16_Sub13.method18448(method8215(-16711936),
						     throwable, (byte) 118);
		    method8223("crash", -1402182378);
		    method8217(true, (byte) 72);
		    break;
		}
		method8217(true, (byte) 50);
	    } catch (Exception object) {
		method8217(true, (byte) 39);
		throw object;
	    }
	} while (false);
    }
    
    abstract void method8229();
    
    abstract void method8230(int i);
    
    String method8231() {
	return null;
    }
    
    abstract void method8232();
    
    abstract void method8233();
    
    abstract void method8234();
    
    public final void method8235(WindowEvent windowevent) {
	/* empty */
    }
    
    void method8236() {
	if (Class532.aCanvas7169 != null) {
	    Class532.aCanvas7169.removeFocusListener(this);
	    Class532.aCanvas7169.getParent().setBackground(Color.black);
	    Class532.aCanvas7169.getParent().remove(Class532.aCanvas7169);
	}
    }
    
    String method8237() {
	return null;
    }
    
    String method8238() {
	return null;
    }
    
    public void method365(Applet applet) {
	Class281.anApplet3006 = applet;
    }
    
    boolean method8239(File file, boolean bool, int i) {
	boolean bool_38_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i_39_ = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i_39_);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_38_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_38_;
    }
    
    abstract void method8240();
    
    File method8241(String string, String string_40_, int i) {
	String string_41_
	    = (0 == i ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class570.aFile7634
	    = new File(Class199.aString2194,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_40_).append
			   (string_41_).append
			   (".dat").toString());
	String string_42_ = null;
	String string_43_ = null;
	boolean bool = false;
	if (Class570.aFile7634.exists()) {
	    try {
		Class42 class42
		    = new Class42(Class570.aFile7634, "rw", 10000L);
		int i_44_;
		RSBuffer class525_sub38;
		for (class525_sub38
			 = (new RSBuffer
			    ((int) class42.method1048(-1974969188)));
		     (-1133521593 * class525_sub38.pos
		      < class525_sub38.buffer.length);
		     class525_sub38.pos += 339428471 * i_44_) {
		    i_44_ = class42.method1049(class525_sub38.buffer,
					       (-1133521593
						* class525_sub38.pos),
					       ((class525_sub38
						 .buffer).length
						- (class525_sub38.pos
						   * -1133521593)),
					       (byte) 51);
		    if (i_44_ == -1)
			throw new IOException();
		}
		class525_sub38.pos = 0;
		i_44_ = class525_sub38.readUnsignedByte(1062214044);
		if (i_44_ < 1 || i_44_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_44_).toString());
		int i_45_ = 0;
		if (i_44_ > 1)
		    i_45_ = class525_sub38.readUnsignedByte(1039013917);
		if (i_44_ <= 2) {
		    string_42_ = class525_sub38.method16637(303430860);
		    if (i_45_ == 1)
			string_43_ = class525_sub38.method16637(1670931036);
		} else {
		    string_42_ = class525_sub38.method16638(1983982437);
		    if (1 == i_45_)
			string_43_ = class525_sub38.method16638(1856064008);
		}
		class42.method1047(388745482);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_42_ != null) {
		File file = new File(string_42_);
		if (!file.exists())
		    string_42_ = null;
	    }
	    if (null != string_42_) {
		File file = new File(string_42_, "test.dat");
		if (!method8239(file, true, 1449951188))
		    string_42_ = null;
	    }
	}
	if (string_42_ == null && 0 == i) {
	while_5_:
	    for (int i_46_ = 0;
		 i_46_ < Class696_Sub29.aStringArray10958.length; i_46_++) {
		for (int i_47_ = 0;
		     i_47_ < Class168_Sub1.aStringArray9113.length; i_47_++) {
		    File file
			= new File(new StringBuilder().append
				       (Class168_Sub1.aStringArray9113[i_47_])
				       .append
				       (Class696_Sub29.aStringArray10958
					[i_46_])
				       .append
				       (File.separatorChar).append
				       (string).append
				       (File.separatorChar).toString());
		    if (file.exists() && method8239(new File(file, "test.dat"),
						    true, 1449951188)) {
			string_42_ = file.toString();
			bool = true;
			break while_5_;
		    }
		}
	    }
	}
	if (string_42_ == null) {
	    string_42_
		= new StringBuilder().append(Class199.aString2194).append
		      (File.separatorChar).append
		      ("jagexcache").append
		      (string_41_).append
		      (File.separatorChar).append
		      (string).append
		      (File.separatorChar).append
		      (string_40_).append
		      (File.separatorChar).toString();
	    bool = true;
	}
	if (null != string_43_) {
	    File file = new File(string_43_);
	    File file_48_ = new File(string_42_);
	    try {
		File[] files = file.listFiles();
		File[] files_49_ = files;
		for (int i_50_ = 0; i_50_ < files_49_.length; i_50_++) {
		    File file_51_ = files_49_[i_50_];
		    File file_52_ = new File(file_48_, file_51_.getName());
		    boolean bool_53_ = file_51_.renameTo(file_52_);
		    if (!bool_53_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8205(new File(string_42_), null, 1525927402);
	return new File(string_42_);
    }
    
    File method8242(String string, String string_54_, int i) {
	String string_55_
	    = (0 == i ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class570.aFile7634
	    = new File(Class199.aString2194,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_54_).append
			   (string_55_).append
			   (".dat").toString());
	String string_56_ = null;
	String string_57_ = null;
	boolean bool = false;
	if (Class570.aFile7634.exists()) {
	    try {
		Class42 class42
		    = new Class42(Class570.aFile7634, "rw", 10000L);
		int i_58_;
		RSBuffer class525_sub38;
		for (class525_sub38
			 = (new RSBuffer
			    ((int) class42.method1048(-1765990031)));
		     (-1133521593 * class525_sub38.pos
		      < class525_sub38.buffer.length);
		     class525_sub38.pos += 339428471 * i_58_) {
		    i_58_ = class42.method1049(class525_sub38.buffer,
					       (-1133521593
						* class525_sub38.pos),
					       ((class525_sub38
						 .buffer).length
						- (class525_sub38.pos
						   * -1133521593)),
					       (byte) 7);
		    if (i_58_ == -1)
			throw new IOException();
		}
		class525_sub38.pos = 0;
		i_58_ = class525_sub38.readUnsignedByte(1742735314);
		if (i_58_ < 1 || i_58_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_58_).toString());
		int i_59_ = 0;
		if (i_58_ > 1)
		    i_59_ = class525_sub38.readUnsignedByte(540250351);
		if (i_58_ <= 2) {
		    string_56_ = class525_sub38.method16637(-605771665);
		    if (i_59_ == 1)
			string_57_ = class525_sub38.method16637(2044770004);
		} else {
		    string_56_ = class525_sub38.method16638(2012979962);
		    if (1 == i_59_)
			string_57_ = class525_sub38.method16638(1759887895);
		}
		class42.method1047(-349299647);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_56_ != null) {
		File file = new File(string_56_);
		if (!file.exists())
		    string_56_ = null;
	    }
	    if (null != string_56_) {
		File file = new File(string_56_, "test.dat");
		if (!method8239(file, true, 1449951188))
		    string_56_ = null;
	    }
	}
	if (string_56_ == null && 0 == i) {
	while_6_:
	    for (int i_60_ = 0;
		 i_60_ < Class696_Sub29.aStringArray10958.length; i_60_++) {
		for (int i_61_ = 0;
		     i_61_ < Class168_Sub1.aStringArray9113.length; i_61_++) {
		    File file
			= new File(new StringBuilder().append
				       (Class168_Sub1.aStringArray9113[i_61_])
				       .append
				       (Class696_Sub29.aStringArray10958
					[i_60_])
				       .append
				       (File.separatorChar).append
				       (string).append
				       (File.separatorChar).toString());
		    if (file.exists() && method8239(new File(file, "test.dat"),
						    true, 1449951188)) {
			string_56_ = file.toString();
			bool = true;
			break while_6_;
		    }
		}
	    }
	}
	if (string_56_ == null) {
	    string_56_
		= new StringBuilder().append(Class199.aString2194).append
		      (File.separatorChar).append
		      ("jagexcache").append
		      (string_55_).append
		      (File.separatorChar).append
		      (string).append
		      (File.separatorChar).append
		      (string_54_).append
		      (File.separatorChar).toString();
	    bool = true;
	}
	if (null != string_57_) {
	    File file = new File(string_57_);
	    File file_62_ = new File(string_56_);
	    try {
		File[] files = file.listFiles();
		File[] files_63_ = files;
		for (int i_64_ = 0; i_64_ < files_63_.length; i_64_++) {
		    File file_65_ = files_63_[i_64_];
		    File file_66_ = new File(file_62_, file_65_.getName());
		    boolean bool_67_ = file_65_.renameTo(file_66_);
		    if (!bool_67_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8205(new File(string_56_), null, 365219982);
	return new File(string_56_);
    }
    
    public void method370() {
	if (!aBool5574) {
	    aLong5594 = Class251.method4508((byte) 8) * -4391342627814901797L;
	    Class229.method4381(5000L);
	    method8217(false, (byte) -50);
	}
    }
    
    File method8243(String string, String string_68_, int i) {
	String string_69_
	    = (0 == i ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class570.aFile7634
	    = new File(Class199.aString2194,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_68_).append
			   (string_69_).append
			   (".dat").toString());
	String string_70_ = null;
	String string_71_ = null;
	boolean bool = false;
	if (Class570.aFile7634.exists()) {
	    try {
		Class42 class42
		    = new Class42(Class570.aFile7634, "rw", 10000L);
		int i_72_;
		RSBuffer class525_sub38;
		for (class525_sub38
			 = (new RSBuffer
			    ((int) class42.method1048(-2028109587)));
		     (-1133521593 * class525_sub38.pos
		      < class525_sub38.buffer.length);
		     class525_sub38.pos += 339428471 * i_72_) {
		    i_72_ = class42.method1049(class525_sub38.buffer,
					       (-1133521593
						* class525_sub38.pos),
					       ((class525_sub38
						 .buffer).length
						- (class525_sub38.pos
						   * -1133521593)),
					       (byte) 24);
		    if (i_72_ == -1)
			throw new IOException();
		}
		class525_sub38.pos = 0;
		i_72_ = class525_sub38.readUnsignedByte(218475129);
		if (i_72_ < 1 || i_72_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_72_).toString());
		int i_73_ = 0;
		if (i_72_ > 1)
		    i_73_ = class525_sub38.readUnsignedByte(303368180);
		if (i_72_ <= 2) {
		    string_70_ = class525_sub38.method16637(852811092);
		    if (i_73_ == 1)
			string_71_ = class525_sub38.method16637(64399063);
		} else {
		    string_70_ = class525_sub38.method16638(1645127196);
		    if (1 == i_73_)
			string_71_ = class525_sub38.method16638(1816991787);
		}
		class42.method1047(-927956436);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_70_ != null) {
		File file = new File(string_70_);
		if (!file.exists())
		    string_70_ = null;
	    }
	    if (null != string_70_) {
		File file = new File(string_70_, "test.dat");
		if (!method8239(file, true, 1449951188))
		    string_70_ = null;
	    }
	}
	if (string_70_ == null && 0 == i) {
	while_7_:
	    for (int i_74_ = 0;
		 i_74_ < Class696_Sub29.aStringArray10958.length; i_74_++) {
		for (int i_75_ = 0;
		     i_75_ < Class168_Sub1.aStringArray9113.length; i_75_++) {
		    File file
			= new File(new StringBuilder().append
				       (Class168_Sub1.aStringArray9113[i_75_])
				       .append
				       (Class696_Sub29.aStringArray10958
					[i_74_])
				       .append
				       (File.separatorChar).append
				       (string).append
				       (File.separatorChar).toString());
		    if (file.exists() && method8239(new File(file, "test.dat"),
						    true, 1449951188)) {
			string_70_ = file.toString();
			bool = true;
			break while_7_;
		    }
		}
	    }
	}
	if (string_70_ == null) {
	    string_70_
		= new StringBuilder().append(Class199.aString2194).append
		      (File.separatorChar).append
		      ("jagexcache").append
		      (string_69_).append
		      (File.separatorChar).append
		      (string).append
		      (File.separatorChar).append
		      (string_68_).append
		      (File.separatorChar).toString();
	    bool = true;
	}
	if (null != string_71_) {
	    File file = new File(string_71_);
	    File file_76_ = new File(string_70_);
	    try {
		File[] files = file.listFiles();
		File[] files_77_ = files;
		for (int i_78_ = 0; i_78_ < files_77_.length; i_78_++) {
		    File file_79_ = files_77_[i_78_];
		    File file_80_ = new File(file_76_, file_79_.getName());
		    boolean bool_81_ = file_79_.renameTo(file_80_);
		    if (!bool_81_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8205(new File(string_70_), null, -448881489);
	return new File(string_70_);
    }
    
    public void method368() {
	if (!aBool5574)
	    aLong5594 = 0L;
    }
    
    void method8244(File file, File file_82_) {
	try {
	    Class42 class42 = new Class42(Class570.aFile7634, "rw", 10000L);
	    RSBuffer class525_sub38 = new RSBuffer(500);
	    class525_sub38.method16735(3, -725516839);
	    class525_sub38.method16735(null != file_82_ ? 1 : 0, -763252433);
	    class525_sub38.method16613(file.getPath(), 1967345740);
	    if (file_82_ != null)
		class525_sub38.method16613(file_82_.getPath(), 466365405);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.pos * -1133521593,
			       -823494517);
	    class42.method1047(-31940617);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    void method8245(File file, File file_83_) {
	try {
	    Class42 class42 = new Class42(Class570.aFile7634, "rw", 10000L);
	    RSBuffer class525_sub38 = new RSBuffer(500);
	    class525_sub38.method16735(3, -1167199603);
	    class525_sub38.method16735(null != file_83_ ? 1 : 0, -562362901);
	    class525_sub38.method16613(file.getPath(), 287848498);
	    if (file_83_ != null)
		class525_sub38.method16613(file_83_.getPath(), 643984112);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.pos * -1133521593,
			       -1888131411);
	    class42.method1047(-937110338);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    public final void method8246(WindowEvent windowevent) {
	/* empty */
    }
    
    public void method380() {
	if (!aBool5574)
	    aLong5594 = ((Class251.method4508((byte) 8) + 4000L)
			 * -4391342627814901797L);
    }
    
    boolean method8247(File file, boolean bool) {
	boolean bool_84_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_84_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_84_;
    }
    
    public void method366(Applet applet) {
	Class281.anApplet3006 = applet;
    }
    
    public static File method8248() {
	return Class662.aFile8475;
    }
    
    void method8249(Container container, byte i) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class532.aCanvas7169);
	Class532.aCanvas7169.setSize(Class434.anInt4827 * -1445589163,
				     -1883654023 * Class696_Sub47.anInt11032);
	Class532.aCanvas7169.setVisible(true);
	if (container == Class198_Sub7.aFrame9932) {
	    Insets insets = Class198_Sub7.aFrame9932.getInsets();
	    Class532.aCanvas7169.setLocation((insets.left
					      + 288760183 * anInt5572),
					     (anInt5573 * -1061711907
					      + insets.top));
	} else
	    Class532.aCanvas7169.setLocation(288760183 * anInt5572,
					     -1061711907 * anInt5573);
	Class532.aCanvas7169.addFocusListener(this);
	Class532.aCanvas7169.requestFocus();
	Class280.aBool3001 = true;
	aBool5580 = true;
	Class532.aCanvas7169.setFocusTraversalKeysEnabled(false);
	aBool5591 = true;
	aBool5582 = false;
	aLong5578 = Class251.method4508((byte) 8) * -2565403161145424793L;
    }
    
    abstract void method8250(int i);
    
    public static File method8251() {
	return Class662.aFile8475;
    }
    
    public static Class42 method8252(String string, String string_85_,
				     boolean bool) {
	File file = new File(Class662.aFile8475,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class42 class42;
		try {
		    Class42 class42_86_ = new Class42(file, "rw", 10000L);
		    class42 = class42_86_;
		} catch (IOException ioexception) {
		    break;
		}
		return class42;
	    }
	} while (false);
	String string_87_ = "";
	if (33 == -1151787333 * Class411.anInt4254)
	    string_87_ = "_rc";
	else if (34 == Class411.anInt4254 * -1151787333)
	    string_87_ = "_wip";
	File file_88_ = new File(Class199.aString2194,
				 new StringBuilder().append("jagex_").append
				     (string_85_).append
				     ("_preferences").append
				     (string).append
				     (string_87_).append
				     (".dat").toString());
	do {
	    if (!bool && file_88_.exists()) {
		Class42 class42;
		try {
		    Class42 class42_89_ = new Class42(file_88_, "rw", 10000L);
		    class42 = class42_89_;
		} catch (IOException ioexception) {
		    break;
		}
		return class42;
	    }
	} while (false);
	Class42 class42;
	try {
	    Class42 class42_90_ = new Class42(file, "rw", 10000L);
	    class42 = class42_90_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class42;
    }
    
    static void method8253() {
	try {
	    File file = new File(Class199.aString2194, "random.dat");
	    if (file.exists())
		aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    else {
	    while_8_:
		for (int i = 0; i < Class696_Sub29.aStringArray10958.length;
		     i++) {
		    for (int i_91_ = 0;
			 i_91_ < Class168_Sub1.aStringArray9113.length;
			 i_91_++) {
			File file_92_
			    = new File(new StringBuilder().append
					   (Class168_Sub1.aStringArray9113
					    [i_91_])
					   .append
					   (Class696_Sub29.aStringArray10958
					    [i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_92_.exists()) {
			    aClass37_5568
				= new Class37(new Class42(file_92_, "rw", 25L),
					      24, 0);
			    break while_8_;
			}
		    }
		}
	    }
	    if (null == aClass37_5568) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    static void method8254() {
	try {
	    File file = new File(Class199.aString2194, "random.dat");
	    if (file.exists())
		aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    else {
	    while_9_:
		for (int i = 0; i < Class696_Sub29.aStringArray10958.length;
		     i++) {
		    for (int i_93_ = 0;
			 i_93_ < Class168_Sub1.aStringArray9113.length;
			 i_93_++) {
			File file_94_
			    = new File(new StringBuilder().append
					   (Class168_Sub1.aStringArray9113
					    [i_93_])
					   .append
					   (Class696_Sub29.aStringArray10958
					    [i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_94_.exists()) {
			    aClass37_5568
				= new Class37(new Class42(file_94_, "rw", 25L),
					      24, 0);
			    break while_9_;
			}
		    }
		}
	    }
	    if (null == aClass37_5568) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    static void method8255() {
	try {
	    File file = new File(Class199.aString2194, "random.dat");
	    if (file.exists())
		aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    else {
	    while_10_:
		for (int i = 0; i < Class696_Sub29.aStringArray10958.length;
		     i++) {
		    for (int i_95_ = 0;
			 i_95_ < Class168_Sub1.aStringArray9113.length;
			 i_95_++) {
			File file_96_
			    = new File(new StringBuilder().append
					   (Class168_Sub1.aStringArray9113
					    [i_95_])
					   .append
					   (Class696_Sub29.aStringArray10958
					    [i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_96_.exists()) {
			    aClass37_5568
				= new Class37(new Class42(file_96_, "rw", 25L),
					      24, 0);
			    break while_10_;
			}
		    }
		}
	    }
	    if (null == aClass37_5568) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass37_5568
		    = new Class37(new Class42(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    static void method8256(RSBuffer class525_sub38, int i) {
	if (null != aClass37_5568) {
	    try {
		aClass37_5568.method986(0L);
		aClass37_5568.method987(class525_sub38.buffer, i, 24,
					(byte) 1);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method8257(RSBuffer class525_sub38, int i) {
	if (null != aClass37_5568) {
	    try {
		aClass37_5568.method986(0L);
		aClass37_5568.method987(class525_sub38.buffer, i, 24,
					(byte) 1);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public void method371() {
	if (!aBool5574)
	    aLong5594 = ((Class251.method4508((byte) 8) + 4000L)
			 * -4391342627814901797L);
    }
    
    public abstract void method378();
    
    synchronized void method8258() {
	method8210(1773340381);
	Container container = Class203.method3854(1955349051);
	Class532.aCanvas7169 = new Canvas_Sub1(container);
	method8249(container, (byte) -22);
    }
    
    public final void method8259(WindowEvent windowevent) {
	/* empty */
    }
    
    public static Container method8260() {
	if (null != Class96.aFrame1186)
	    return Class96.aFrame1186;
	if (Class198_Sub7.aFrame9932 != null)
	    return Class198_Sub7.aFrame9932;
	return Class281.anApplet3006;
    }
    
    synchronized void method8261(String string) {
	Class198_Sub7.aFrame9932 = new Frame();
	Class198_Sub7.aFrame9932.setTitle(string);
	Class198_Sub7.aFrame9932.setResizable(true);
	Class198_Sub7.aFrame9932.addWindowListener(this);
	Class198_Sub7.aFrame9932.setBackground(Color.black);
	Class198_Sub7.aFrame9932.setVisible(true);
	Class198_Sub7.aFrame9932.toFront();
	Insets insets = Class198_Sub7.aFrame9932.getInsets();
	Class198_Sub7.aFrame9932.setSize
	    (insets.right + (insets.left
			     + -349587129 * OutputStream_Sub1.anInt11049),
	     insets.bottom + (insets.top
			      + Class696_Sub9.anInt10903 * 1666450389));
    }
    
    File method8262(String string, String string_97_, int i, byte i_98_) {
	String string_99_
	    = (0 == i ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class570.aFile7634
	    = new File(Class199.aString2194,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_97_).append
			   (string_99_).append
			   (".dat").toString());
	String string_100_ = null;
	String string_101_ = null;
	boolean bool = false;
	if (Class570.aFile7634.exists()) {
	    try {
		Class42 class42
		    = new Class42(Class570.aFile7634, "rw", 10000L);
		int i_102_;
		RSBuffer class525_sub38;
		for (class525_sub38
			 = (new RSBuffer
			    ((int) class42.method1048(-1838520378)));
		     (-1133521593 * class525_sub38.pos
		      < class525_sub38.buffer.length);
		     class525_sub38.pos += 339428471 * i_102_) {
		    i_102_ = class42.method1049(class525_sub38.buffer,
						(-1133521593
						 * class525_sub38.pos),
						((class525_sub38
						  .buffer).length
						 - (class525_sub38.pos
						    * -1133521593)),
						(byte) 60);
		    if (i_102_ == -1)
			throw new IOException();
		}
		class525_sub38.pos = 0;
		i_102_ = class525_sub38.readUnsignedByte(1770277947);
		if (i_102_ < 1 || i_102_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_102_).toString());
		int i_103_ = 0;
		if (i_102_ > 1)
		    i_103_ = class525_sub38.readUnsignedByte(1748412746);
		if (i_102_ <= 2) {
		    string_100_ = class525_sub38.method16637(1920299531);
		    if (i_103_ == 1)
			string_101_ = class525_sub38.method16637(2075245157);
		} else {
		    string_100_ = class525_sub38.method16638(1602489319);
		    if (1 == i_103_)
			string_101_ = class525_sub38.method16638(1804720914);
		}
		class42.method1047(1621573285);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_100_ != null) {
		File file = new File(string_100_);
		if (!file.exists())
		    string_100_ = null;
	    }
	    if (null != string_100_) {
		File file = new File(string_100_, "test.dat");
		if (!method8239(file, true, 1449951188))
		    string_100_ = null;
	    }
	}
	if (string_100_ == null && 0 == i) {
	while_11_:
	    for (int i_104_ = 0;
		 i_104_ < Class696_Sub29.aStringArray10958.length; i_104_++) {
		for (int i_105_ = 0;
		     i_105_ < Class168_Sub1.aStringArray9113.length;
		     i_105_++) {
		    File file
			= new File(new StringBuilder().append
				       (Class168_Sub1.aStringArray9113[i_105_])
				       .append
				       (Class696_Sub29.aStringArray10958
					[i_104_])
				       .append
				       (File.separatorChar).append
				       (string).append
				       (File.separatorChar).toString());
		    if (file.exists() && method8239(new File(file, "test.dat"),
						    true, 1449951188)) {
			string_100_ = file.toString();
			bool = true;
			break while_11_;
		    }
		}
	    }
	}
	if (string_100_ == null) {
	    string_100_
		= new StringBuilder().append(Class199.aString2194).append
		      (File.separatorChar).append
		      ("jagexcache").append
		      (string_99_).append
		      (File.separatorChar).append
		      (string).append
		      (File.separatorChar).append
		      (string_97_).append
		      (File.separatorChar).toString();
	    bool = true;
	}
	if (null != string_101_) {
	    File file = new File(string_101_);
	    File file_106_ = new File(string_100_);
	    try {
		File[] files = file.listFiles();
		File[] files_107_ = files;
		for (int i_108_ = 0; i_108_ < files_107_.length; i_108_++) {
		    File file_109_ = files_107_[i_108_];
		    File file_110_ = new File(file_106_, file_109_.getName());
		    boolean bool_111_ = file_109_.renameTo(file_110_);
		    if (!bool_111_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8205(new File(string_100_), null, 956466030);
	return new File(string_100_);
    }
    
    final boolean method8263() {
	String string
	    = Class281.anApplet3006.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method8223("invalidhost", -1334591564);
	return false;
    }
    
    public final void method8264(WindowEvent windowevent) {
	/* empty */
    }
    
    void method8265() {
	if (Class538.aString7179 != null) {
	    String string = Class538.aString7179.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_112_ = Class58.aString636;
		if (string_112_.equals("1.1") || string_112_.startsWith("1.1.")
		    || string_112_.equals("1.2")
		    || string_112_.startsWith("1.2.")
		    || string_112_.equals("1.3")
		    || string_112_.startsWith("1.3.")
		    || string_112_.equals("1.4")
		    || string_112_.startsWith("1.4.")
		    || string_112_.equals("1.5")
		    || string_112_.startsWith("1.5.")
		    || string_112_.equals("1.6.0")) {
		    method8223("wrongjava", -1939588303);
		    return;
		}
		if (string_112_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_112_.length()
				 && Class353.method6258(string_112_.charAt(i),
							(byte) -78)); i++) {
			/* empty */
		    }
		    String string_113_ = string_112_.substring(6, i);
		    if (Class493.method7997(string_113_, -571385798)
			&& Class275.method5102(string_113_, -663514853) < 10) {
			method8223("wrongjava", -1829810737);
			return;
		    }
		}
	    }
	}
	Class203.method3854(1955349051).setFocusCycleRoot(true);
	anInt5590 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * -1239463163);
	anInt5598 = Runtime.getRuntime().availableProcessors() * -133458719;
	method8208((byte) 6);
	method8230(-780867003);
	Class19.aClass511_206 = Class567.method9490(-1662559262);
	while (9124278632678370387L * aLong5594 == 0L
	       || (Class251.method4508((byte) 8)
		   < 9124278632678370387L * aLong5594)) {
	    anInt5586 = (Class19.aClass511_206
			     .method8511(aLong5577 * -4657414680009151345L)
			 * 206035505);
	    for (int i = 0; i < 1538211537 * anInt5586; i++)
		method8213((short) -10112);
	    method8214(-1616214688);
	    Class273.method5084(Class532.aCanvas7169, 684514873);
	}
    }
    
    static void method8266(Object object) {
	if (null != Class521.anEventQueue7094) {
	    for (int i = 0;
		 i < 50 && Class521.anEventQueue7094.peekEvent() != null; i++)
		Class229.method4381(1L);
	    try {
		if (null != object)
		    Class521.anEventQueue7094
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method8267(Object object) {
	if (null != Class521.anEventQueue7094) {
	    for (int i = 0;
		 i < 50 && Class521.anEventQueue7094.peekEvent() != null; i++)
		Class229.method4381(1L);
	    try {
		if (null != object)
		    Class521.anEventQueue7094
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method8268(Object object) {
	if (null != Class521.anEventQueue7094) {
	    for (int i = 0;
		 i < 50 && Class521.anEventQueue7094.peekEvent() != null; i++)
		Class229.method4381(1L);
	    try {
		if (null != object)
		    Class521.anEventQueue7094
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static void method8269(Object object) {
	if (null != Class521.anEventQueue7094) {
	    for (int i = 0;
		 i < 50 && Class521.anEventQueue7094.peekEvent() != null; i++)
		Class229.method4381(1L);
	    try {
		if (null != object)
		    Class521.anEventQueue7094
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method8270() {
	long l = Class251.method4508((byte) 8);
	long l_114_ = aLongArray5571[Class289.anInt3209 * 839244831];
	aLongArray5571[839244831 * Class289.anInt3209] = l;
	Class289.anInt3209
	    = -787308577 * (1 + 839244831 * Class289.anInt3209 & 0x1f);
	if (0L != l_114_ && l <= l_114_) {
	    /* empty */
	}
	synchronized (this) {
	    Class280.aBool3001 = aBool5580;
	}
	method8220(1655938119);
    }
    
    void method8271() {
	long l = Class251.method4508((byte) 8);
	long l_115_
	    = aLongArray5570[Class606.anInt7970 * 1538834927 - 1 & 0x1f];
	long l_116_ = aLongArray5570[1538834927 * Class606.anInt7970];
	aLongArray5570[Class606.anInt7970 * 1538834927] = l;
	Class606.anInt7970
	    = (Class606.anInt7970 * 1538834927 + 1 & 0x1f) * -1536914161;
	if (l_116_ != 0L && l > l_116_) {
	    int i = (int) (l - l_116_);
	    anInt5595 = (int) (l - l_115_) * 1843842801;
	    anInt5567 = -1352777801 * ((32000 + (i >> 1)) / i);
	}
	if ((anInt5576 += -1364909177) * 2030252599 - 1 > 50) {
	    anInt5576 -= 474017886;
	    aBool5591 = true;
	    Class532.aCanvas7169.setSize(Class434.anInt4827 * -1445589163,
					 (Class696_Sub47.anInt11032
					  * -1883654023));
	    Class532.aCanvas7169.setVisible(true);
	    if (Class198_Sub7.aFrame9932 != null
		&& Class96.aFrame1186 == null) {
		Insets insets = Class198_Sub7.aFrame9932.getInsets();
		Class532.aCanvas7169.setLocation((insets.left
						  + anInt5572 * 288760183),
						 (anInt5573 * -1061711907
						  + insets.top));
	    } else
		Class532.aCanvas7169.setLocation(288760183 * anInt5572,
						 anInt5573 * -1061711907);
	}
	method8250(-1584708235);
    }
    
    final void method8272(boolean bool) {
	synchronized (this) {
	    if (aBool5574)
		return;
	    aBool5574 = true;
	}
	try {
	    method8222(-892834676);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aClass37_5589.method982(533179346);
	    for (int i = 0; i < 30375201 * anInt5600; i++)
		Class468.aClass37Array5129[i].method982(1236975851);
	    aClass37_5587.method982(-12781484);
	    aClass37_5568.method982(1886478280);
	} catch (Exception exception) {
	    /* empty */
	}
	if (aBool5599) {
	    try {
		QueryPerformanceCounter.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (Class525_Sub22.method16341(-1923723195))
	    Class525_Sub7_Sub13.method18248(-691734241).method389((byte) -66);
	if (Class532.aCanvas7169 != null) {
	    try {
		Class532.aCanvas7169.removeFocusListener(this);
		Class532.aCanvas7169.getParent().remove(Class532.aCanvas7169);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (null != Class198_Sub7.aFrame9932) {
	    Class198_Sub7.aFrame9932.setVisible(false);
	    Class198_Sub7.aFrame9932.dispose();
	    Class198_Sub7.aFrame9932 = null;
	}
    }
    
    void method8273(Class508 class508, boolean bool) {
	if (null == class508)
	    throw new NullPointerException();
	if (Class508.aClass508_5656 != class508
	    && Class508.aClass508_5657 != class508)
	    throw new IllegalStateException();
	aClass508_5593 = class508;
	if (Class508.aClass508_5657 != aClass508_5593) {
	    if (bool)
		aClass508_5593 = Class508.aClass508_5658;
	}
    }
    
    public final void windowDeiconified(WindowEvent windowevent) {
	/* empty */
    }
    
    static long method8274() {
	return Class19.aClass511_206.method8512((byte) 4);
    }
    
    static long method8275() {
	return Class19.aClass511_206.method8512((byte) 4);
    }
    
    public static final void method8276() {
	Class19.aClass511_206.method8509(1528942061);
	for (int i = 0; i < 32; i++)
	    aLongArray5570[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray5571[i] = 0L;
	anInt5586 = 0;
    }
    
    void method8277() {
	if (Class538.aString7179 != null) {
	    String string = Class538.aString7179.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_117_ = Class58.aString636;
		if (string_117_.equals("1.1") || string_117_.startsWith("1.1.")
		    || string_117_.equals("1.2")
		    || string_117_.startsWith("1.2.")
		    || string_117_.equals("1.3")
		    || string_117_.startsWith("1.3.")
		    || string_117_.equals("1.4")
		    || string_117_.startsWith("1.4.")
		    || string_117_.equals("1.5")
		    || string_117_.startsWith("1.5.")
		    || string_117_.equals("1.6.0")) {
		    method8223("wrongjava", -1646734328);
		    return;
		}
		if (string_117_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_117_.length()
				 && Class353.method6258(string_117_.charAt(i),
							(byte) -71)); i++) {
			/* empty */
		    }
		    String string_118_ = string_117_.substring(6, i);
		    if (Class493.method7997(string_118_, -571385798)
			&& (Class275.method5102(string_118_, -1421486105)
			    < 10)) {
			method8223("wrongjava", -1788196811);
			return;
		    }
		}
	    }
	}
	Class203.method3854(1955349051).setFocusCycleRoot(true);
	anInt5590 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * -1239463163);
	anInt5598 = Runtime.getRuntime().availableProcessors() * -133458719;
	method8208((byte) 16);
	method8230(-780867003);
	Class19.aClass511_206 = Class567.method9490(-1138629208);
	while (9124278632678370387L * aLong5594 == 0L
	       || (Class251.method4508((byte) 8)
		   < 9124278632678370387L * aLong5594)) {
	    anInt5586 = (Class19.aClass511_206
			     .method8511(aLong5577 * -4657414680009151345L)
			 * 206035505);
	    for (int i = 0; i < 1538211537 * anInt5586; i++)
		method8213((short) -7604);
	    method8214(977164941);
	    Class273.method5084(Class532.aCanvas7169, 224658889);
	}
    }
    
    public static File method8278() {
	return Class662.aFile8475;
    }
    
    static {
	anInt5567 = 0;
	anInt5595 = 0;
	aLongArray5570 = new long[32];
	aLongArray5571 = new long[32];
	anInt5572 = 0;
	anInt5573 = 0;
	aString5565 = null;
	aBool5591 = true;
	anInt5576 = 445211564;
	aBool5582 = false;
	aLong5578 = 0L;
	aBool5579 = false;
	aBool5580 = true;
	aClass37_5568 = null;
	aClass37_5589 = null;
	aClass37_5587 = null;
	aClass508_5593 = null;
	aLong5594 = 0L;
	aBool5574 = false;
	anInt5590 = 1239463163;
	anInt5598 = -133458719;
    }
    
    void method8279(File file, File file_119_) {
	try {
	    Class42 class42 = new Class42(Class570.aFile7634, "rw", 10000L);
	    RSBuffer class525_sub38 = new RSBuffer(500);
	    class525_sub38.method16735(3, -812247928);
	    class525_sub38.method16735(null != file_119_ ? 1 : 0, -1921079596);
	    class525_sub38.method16613(file.getPath(), 2077032181);
	    if (file_119_ != null)
		class525_sub38.method16613(file_119_.getPath(), 727826468);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.pos * -1133521593,
			       2030481779);
	    class42.method1047(-169443115);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    public void method372() {
	if (!aBool5574)
	    aLong5594 = ((Class251.method4508((byte) 8) + 4000L)
			 * -4391342627814901797L);
    }
    
    public final void method369(Graphics graphics) {
	paint(graphics);
    }
    
    public static final void method8280() {
	Class19.aClass511_206.method8509(971350167);
	for (int i = 0; i < 32; i++)
	    aLongArray5570[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray5571[i] = 0L;
	anInt5586 = 0;
    }
    
    public void method377() {
	if (!aBool5574) {
	    aLong5594 = Class251.method4508((byte) 8) * -4391342627814901797L;
	    Class229.method4381(5000L);
	    method8217(false, (byte) -7);
	}
    }
    
    public abstract void method381();
    
    public final void method364(Graphics graphics) {
	paint(graphics);
    }
    
    public static final void method8281(int i, String string, Color color,
					Color color_120_, Color color_121_) {
	try {
	    Graphics graphics = Class532.aCanvas7169.getGraphics();
	    if (null == Class642.aFont8329)
		Class642.aFont8329 = new Font("Helvetica", 1, 13);
	    if (null == color)
		color = new Color(140, 17, 17);
	    if (color_120_ == null)
		color_120_ = new Color(140, 17, 17);
	    if (null == color_121_)
		color_121_ = new Color(255, 255, 255);
	    try {
		if (Class286.anImage3146 == null)
		    Class286.anImage3146
			= (Class532.aCanvas7169.createImage
			   (-1445589163 * Class434.anInt4827,
			    -1883654023 * Class696_Sub47.anInt11032));
		Graphics graphics_122_ = Class286.anImage3146.getGraphics();
		graphics_122_.setColor(Color.black);
		graphics_122_.fillRect(0, 0, -1445589163 * Class434.anInt4827,
				       (-1883654023
					* Class696_Sub47.anInt11032));
		int i_123_ = -1445589163 * Class434.anInt4827 / 2 - 152;
		int i_124_ = Class696_Sub47.anInt11032 * -1883654023 / 2 - 18;
		graphics_122_.setColor(color_120_);
		graphics_122_.drawRect(i_123_, i_124_, 303, 33);
		graphics_122_.setColor(color);
		graphics_122_.fillRect(i_123_ + 2, i_124_ + 2, i * 3, 30);
		graphics_122_.setColor(Color.black);
		graphics_122_.drawRect(i_123_ + 1, 1 + i_124_, 301, 31);
		graphics_122_.fillRect(i * 3 + (2 + i_123_), 2 + i_124_,
				       300 - 3 * i, 30);
		graphics_122_.setFont(Class642.aFont8329);
		graphics_122_.setColor(color_121_);
		graphics_122_.drawString(string,
					 (i_123_
					  + (304 - string.length() * 6) / 2),
					 22 + i_124_);
		if (aString5565 != null) {
		    graphics_122_.setFont(Class642.aFont8329);
		    graphics_122_.setColor(color_121_);
		    graphics_122_.drawString
			(aString5565,
			 (Class434.anInt4827 * -1445589163 / 2
			  - aString5565.length() * 6 / 2),
			 -1883654023 * Class696_Sub47.anInt11032 / 2 - 26);
		}
		graphics.drawImage(Class286.anImage3146, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class434.anInt4827 * -1445589163,
				  -1883654023 * Class696_Sub47.anInt11032);
		int i_125_ = -1445589163 * Class434.anInt4827 / 2 - 152;
		int i_126_ = -1883654023 * Class696_Sub47.anInt11032 / 2 - 18;
		graphics.setColor(color_120_);
		graphics.drawRect(i_125_, i_126_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_125_ + 2, 2 + i_126_, 3 * i, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(1 + i_125_, i_126_ + 1, 301, 31);
		graphics.fillRect(3 * i + (2 + i_125_), i_126_ + 2,
				  300 - i * 3, 30);
		graphics.setFont(Class642.aFont8329);
		graphics.setColor(color_121_);
		if (null != aString5565) {
		    graphics.setFont(Class642.aFont8329);
		    graphics.setColor(color_121_);
		    graphics.drawString(aString5565,
					(-1445589163 * Class434.anInt4827 / 2
					 - aString5565.length() * 6 / 2),
					((-1883654023
					  * Class696_Sub47.anInt11032 / 2)
					 - 26));
		}
		graphics.drawString(string,
				    i_125_ + (304 - string.length() * 6) / 2,
				    22 + i_126_);
	    }
	} catch (Exception exception) {
	    Class532.aCanvas7169.repaint();
	}
    }
    
    public final void method375(Graphics graphics) {
	paint(graphics);
    }
    
    public final synchronized void method379(Graphics graphics) {
	if (!aBool5574) {
	    aBool5591 = true;
	    if ((Class251.method4508((byte) 8)
		 - 7278985959834490711L * aLong5578)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (rectangle == null
		    || ((rectangle.width
			 >= OutputStream_Sub1.anInt11049 * -349587129)
			&& (rectangle.height
			    >= Class696_Sub9.anInt10903 * 1666450389)))
		    aBool5582 = true;
	    }
	}
    }
    
    public final synchronized void method382(Graphics graphics) {
	if (!aBool5574) {
	    aBool5591 = true;
	    if ((Class251.method4508((byte) 8)
		 - 7278985959834490711L * aLong5578)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (rectangle == null
		    || ((rectangle.width
			 >= OutputStream_Sub1.anInt11049 * -349587129)
			&& (rectangle.height
			    >= Class696_Sub9.anInt10903 * 1666450389)))
		    aBool5582 = true;
	    }
	}
    }
    
    public final void method8282(FocusEvent focusevent) {
	aBool5580 = true;
	aBool5591 = true;
    }
    
    public final void method8283(FocusEvent focusevent) {
	aBool5580 = true;
	aBool5591 = true;
    }
    
    public final void method8284(FocusEvent focusevent) {
	aBool5580 = false;
    }
    
    public final void method8285(FocusEvent focusevent) {
	aBool5580 = false;
    }
    
    public final void method8286(FocusEvent focusevent) {
	aBool5580 = false;
    }
    
    public final void method8287(FocusEvent focusevent) {
	aBool5580 = false;
    }
    
    void method8288(File file, File file_127_) {
	try {
	    Class42 class42 = new Class42(Class570.aFile7634, "rw", 10000L);
	    RSBuffer class525_sub38 = new RSBuffer(500);
	    class525_sub38.method16735(3, -1711047724);
	    class525_sub38.method16735(null != file_127_ ? 1 : 0, -535852325);
	    class525_sub38.method16613(file.getPath(), 1326348205);
	    if (file_127_ != null)
		class525_sub38.method16613(file_127_.getPath(), 626850527);
	    class42.method1051(class525_sub38.buffer, 0,
			       class525_sub38.pos * -1133521593,
			       -1023995005);
	    class42.method1047(-746437657);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    public void method8289() throws Exception_Sub2 {
	if (!aBool5599) {
	    Class525_Sub7_Sub13.method18248(-691734241).method385("jaclib",
								  -1777098483);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class396.aString4106.startsWith("win"))
		    throw new Exception_Sub2(128, "jaclib");
	    }
	    aBool5599 = true;
	}
    }
    
    public final void method8290(WindowEvent windowevent) {
	/* empty */
    }
    
    public void start() {
	if (!aBool5574)
	    aLong5594 = 0L;
    }
    
    public final void method8291(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8292(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8293(WindowEvent windowevent) {
	aBool5579 = true;
	destroy();
    }
    
    public final void method8294(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8295(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8296(WindowEvent windowevent) {
	/* empty */
    }
    
    abstract void method8297();
    
    public void method373() {
	if (!aBool5574) {
	    aLong5594 = Class251.method4508((byte) 8) * -4391342627814901797L;
	    Class229.method4381(5000L);
	    method8217(false, (byte) 1);
	}
    }
    
    public void method374() {
	if (!aBool5574) {
	    aLong5594 = Class251.method4508((byte) 8) * -4391342627814901797L;
	    Class229.method4381(5000L);
	    method8217(false, (byte) 20);
	}
    }
    
    void method8298(Container container) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class532.aCanvas7169);
	Class532.aCanvas7169.setSize(Class434.anInt4827 * -1445589163,
				     -1883654023 * Class696_Sub47.anInt11032);
	Class532.aCanvas7169.setVisible(true);
	if (container == Class198_Sub7.aFrame9932) {
	    Insets insets = Class198_Sub7.aFrame9932.getInsets();
	    Class532.aCanvas7169.setLocation((insets.left
					      + 288760183 * anInt5572),
					     (anInt5573 * -1061711907
					      + insets.top));
	} else
	    Class532.aCanvas7169.setLocation(288760183 * anInt5572,
					     -1061711907 * anInt5573);
	Class532.aCanvas7169.addFocusListener(this);
	Class532.aCanvas7169.requestFocus();
	Class280.aBool3001 = true;
	aBool5580 = true;
	Class532.aCanvas7169.setFocusTraversalKeysEnabled(false);
	aBool5591 = true;
	aBool5582 = false;
	aLong5578 = Class251.method4508((byte) 8) * -2565403161145424793L;
    }
    
    public void method8299(byte i) throws Exception_Sub2 {
	if (!aBool5599) {
	    Class525_Sub7_Sub13.method18248(-691734241).method385("jaclib",
								  -1291672469);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class396.aString4106.startsWith("win"))
		    throw new Exception_Sub2(128, "jaclib");
	    }
	    aBool5599 = true;
	}
    }
    
    abstract void method8300();
    
    public final void method8301(FocusEvent focusevent) {
	aBool5580 = false;
    }
    
    Class503() {
	/* empty */
    }
    
    public static final void method8302() {
	Class286.anImage3146 = null;
	Class642.aFont8329 = null;
    }
    
    public static final void method8303() {
	Class286.anImage3146 = null;
	Class642.aFont8329 = null;
    }
    
    void method8304(String string, String string_128_) {
	if (!aBool5596) {
	    aBool5596 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class67.method1442(Class281.anApplet3006, "loggedout",
				   -1520977430);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class281.anApplet3006.getAppletContext().showDocument
		    (new URL(Class281.anApplet3006.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_128_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void windowOpened(WindowEvent windowevent) {
	/* empty */
    }
    
    public void method8305() throws Exception_Sub2 {
	if (!aBool5599) {
	    Class525_Sub7_Sub13.method18248(-691734241).method385("jaclib",
								  -1336298555);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class396.aString4106.startsWith("win"))
		    throw new Exception_Sub2(128, "jaclib");
	    }
	    aBool5599 = true;
	}
    }
    
    void method8306(Class508 class508, boolean bool) {
	if (null == class508)
	    throw new NullPointerException();
	if (Class508.aClass508_5656 != class508
	    && Class508.aClass508_5657 != class508)
	    throw new IllegalStateException();
	aClass508_5593 = class508;
	if (Class508.aClass508_5657 != aClass508_5593) {
	    if (bool)
		aClass508_5593 = Class508.aClass508_5658;
	}
    }
    
    File method8307(String string, String string_129_, int i) {
	String string_130_
	    = (0 == i ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class570.aFile7634
	    = new File(Class199.aString2194,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_129_).append
			   (string_130_).append
			   (".dat").toString());
	String string_131_ = null;
	String string_132_ = null;
	boolean bool = false;
	if (Class570.aFile7634.exists()) {
	    try {
		Class42 class42
		    = new Class42(Class570.aFile7634, "rw", 10000L);
		int i_133_;
		RSBuffer class525_sub38;
		for (class525_sub38
			 = (new RSBuffer
			    ((int) class42.method1048(-2064334657)));
		     (-1133521593 * class525_sub38.pos
		      < class525_sub38.buffer.length);
		     class525_sub38.pos += 339428471 * i_133_) {
		    i_133_ = class42.method1049(class525_sub38.buffer,
						(-1133521593
						 * class525_sub38.pos),
						((class525_sub38
						  .buffer).length
						 - (class525_sub38.pos
						    * -1133521593)),
						(byte) 12);
		    if (i_133_ == -1)
			throw new IOException();
		}
		class525_sub38.pos = 0;
		i_133_ = class525_sub38.readUnsignedByte(1604106458);
		if (i_133_ < 1 || i_133_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_133_).toString());
		int i_134_ = 0;
		if (i_133_ > 1)
		    i_134_ = class525_sub38.readUnsignedByte(624499420);
		if (i_133_ <= 2) {
		    string_131_ = class525_sub38.method16637(-1998813485);
		    if (i_134_ == 1)
			string_132_ = class525_sub38.method16637(95277705);
		} else {
		    string_131_ = class525_sub38.method16638(2012257856);
		    if (1 == i_134_)
			string_132_ = class525_sub38.method16638(1869361460);
		}
		class42.method1047(268873154);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_131_ != null) {
		File file = new File(string_131_);
		if (!file.exists())
		    string_131_ = null;
	    }
	    if (null != string_131_) {
		File file = new File(string_131_, "test.dat");
		if (!method8239(file, true, 1449951188))
		    string_131_ = null;
	    }
	}
	if (string_131_ == null && 0 == i) {
	while_12_:
	    for (int i_135_ = 0;
		 i_135_ < Class696_Sub29.aStringArray10958.length; i_135_++) {
		for (int i_136_ = 0;
		     i_136_ < Class168_Sub1.aStringArray9113.length;
		     i_136_++) {
		    File file
			= new File(new StringBuilder().append
				       (Class168_Sub1.aStringArray9113[i_136_])
				       .append
				       (Class696_Sub29.aStringArray10958
					[i_135_])
				       .append
				       (File.separatorChar).append
				       (string).append
				       (File.separatorChar).toString());
		    if (file.exists() && method8239(new File(file, "test.dat"),
						    true, 1449951188)) {
			string_131_ = file.toString();
			bool = true;
			break while_12_;
		    }
		}
	    }
	}
	if (string_131_ == null) {
	    string_131_
		= new StringBuilder().append(Class199.aString2194).append
		      (File.separatorChar).append
		      ("jagexcache").append
		      (string_130_).append
		      (File.separatorChar).append
		      (string).append
		      (File.separatorChar).append
		      (string_129_).append
		      (File.separatorChar).toString();
	    bool = true;
	}
	if (null != string_132_) {
	    File file = new File(string_132_);
	    File file_137_ = new File(string_131_);
	    try {
		File[] files = file.listFiles();
		File[] files_138_ = files;
		for (int i_139_ = 0; i_139_ < files_138_.length; i_139_++) {
		    File file_140_ = files_138_[i_139_];
		    File file_141_ = new File(file_137_, file_140_.getName());
		    boolean bool_142_ = file_140_.renameTo(file_141_);
		    if (!bool_142_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8205(new File(string_131_), null, -16021401);
	return new File(string_131_);
    }
    
    static final void method8308(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2573
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * 1224255471;
    }
    
    static final void method8309(Class683 class683, int i) {
	if (Class453_Sub3.aClass309_Sub1_10316.method5484(-2120261940)
	    != Class298.aClass298_3275)
	    throw new RuntimeException();
	((Class704_Sub5)
	 Class453_Sub3.aClass309_Sub1_10316.method5482(-777873306))
	    .method17460
	    ((class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     -1953647785);
    }
    
    static final void method8310(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class21.aClass666_213.method80();
    }
    
    static final void method8311(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_143_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_144_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class88.method1665(i_143_, i_144_, true, (byte) -35);
    }
    
    public static final void method8312(Class656_Sub1 class656_sub1, int i,
					boolean bool, int i_145_) {
	Class532.method8838(class656_sub1, i, true, bool, 1123096061);
    }
}
