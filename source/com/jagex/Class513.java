/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;
import java.awt.Desktop;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.net.URI;
import java.net.URL;

public class Class513
{
    static Applet anApplet5688 = null;
    static final int anInt5689 = 2;
    static final int anInt5690 = 0;
    public static final int anInt5691 = 1;
    static String aString5692 = null;
    static final int anInt5693 = 3;
    
    public static boolean method8538(String string, int i, String string_0_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString5692.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_1_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
		    if (string_1_.indexOf(string.charAt(i_2_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (1 == i) {
	    boolean bool;
	    try {
		Object object
		    = Class67.method1443(anApplet5688, string_0_,
					 (new Object[]
					  { new URL(anApplet5688.getCodeBase(),
						    string).toString() }),
					 -1773034298);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet5688.getAppletContext().showDocument
		    (new URL(anApplet5688.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class67.method1442(anApplet5688, "loggedout", 548451986);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet5688.getAppletContext().showDocument
		    (new URL(anApplet5688.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    public static void method8539(Applet applet, String string) {
	anApplet5688 = applet;
	aString5692 = string;
    }
    
    public static boolean method8540(String string, int i, String string_3_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString5692.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_4_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_5_ = 0; i_5_ < string.length(); i_5_++) {
		    if (string_4_.indexOf(string.charAt(i_5_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (1 == i) {
	    boolean bool;
	    try {
		Object object
		    = Class67.method1443(anApplet5688, string_3_,
					 (new Object[]
					  { new URL(anApplet5688.getCodeBase(),
						    string).toString() }),
					 329989256);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet5688.getAppletContext().showDocument
		    (new URL(anApplet5688.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class67.method1442(anApplet5688, "loggedout", -266298679);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet5688.getAppletContext().showDocument
		    (new URL(anApplet5688.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    public static void method8541(String string, boolean bool,
				  boolean bool_6_) {
	Class644.method10614(string, bool, "openjs", bool_6_, -1427669113);
    }
    
    public static void method8542(String string, boolean bool,
				  String string_7_, boolean bool_8_) {
	if (bool) {
	    do {
		if (!bool_8_ && Desktop.isDesktopSupported()
		    && Desktop.getDesktop()
			   .isSupported(Desktop.Action.BROWSE)) {
		    try {
			Desktop.getDesktop().browse(new URI(string));
		    } catch (Exception exception) {
			break;
		    }
		    return;
		}
	    } while (false);
	    if (aString5692.startsWith("win") && !bool_8_)
		Class313.method5644(string, 0, -2102037518);
	    else if (aString5692.startsWith("mac"))
		Class413.method6685(string, 1, string_7_, (byte) 126);
	    else
		Class313.method5644(string, 2, -1904829086);
	} else
	    Class313.method5644(string, 3, -1741086453);
    }
    
    static boolean method8543(String string, int i) {
	return Class413.method6685(string, i, "openjs", (byte) 126);
    }
    
    static boolean method8544(String string, int i) {
	return Class413.method6685(string, i, "openjs", (byte) 126);
    }
    
    public static void method8545(Applet applet, String string) {
	anApplet5688 = applet;
	aString5692 = string;
    }
    
    public static boolean method8546(String string, int i, String string_9_) {
	if (i == 0) {
	    boolean bool;
	    try {
		if (!aString5692.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_10_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_11_ = 0; i_11_ < string.length(); i_11_++) {
		    if (string_10_.indexOf(string.charAt(i_11_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (1 == i) {
	    boolean bool;
	    try {
		Object object
		    = Class67.method1443(anApplet5688, string_9_,
					 (new Object[]
					  { new URL(anApplet5688.getCodeBase(),
						    string).toString() }),
					 665253680);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet5688.getAppletContext().showDocument
		    (new URL(anApplet5688.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class67.method1442(anApplet5688, "loggedout", 137623141);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet5688.getAppletContext().showDocument
		    (new URL(anApplet5688.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    Class513() throws Throwable {
	throw new Error();
    }
    
    static final void method8547(Class683 class683, short i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class683.aClass525_Sub25_8653.aByte10604;
    }
    
    static final void method8548(Class683 class683, int i) {
	int i_12_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub16_10670
		  .method14167(i_12_, (byte) -28);
    }
    
    public static int method8549(int i, byte i_13_) {
	Class525_Sub16_Sub8 class525_sub16_sub8
	    = (Class525_Sub16_Sub8) Class281.aClass10_3003.method684((long) i);
	if (null == class525_sub16_sub8)
	    return -1;
	if (Class281.aClass697_3002.aClass525_Sub16_8766
	    == class525_sub16_sub8.aClass525_Sub16_10552)
	    return -1;
	return (-1767900299
		* ((Class525_Sub16_Sub8)
		   class525_sub16_sub8.aClass525_Sub16_10552).anInt11782);
    }
    
    public static void method8550
	(Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1, int i) {
	Class525_Sub2 class525_sub2
	    = ((Class525_Sub2)
	       (Class525_Sub2.aClass10_10412.method684
		((long) (2032864281
			 * class656_sub1_sub3_sub1_sub1.anInt11964))));
	if (null == class525_sub2)
	    Class610.method10024(class656_sub1_sub3_sub1_sub1.aByte10867,
				 (class656_sub1_sub3_sub1_sub1.anIntArray12014
				  [0]),
				 (class656_sub1_sub3_sub1_sub1.anIntArray12017
				  [0]),
				 0, null, null, class656_sub1_sub3_sub1_sub1,
				 (short) -30372);
	else
	    class525_sub2.method16073((byte) 1);
    }
    
    static void method8551(int i) {
	if (Class116.anInt1417 * 2052312063 < 102)
	    Class116.anInt1417 += 581515258;
	if (-1 != 183011601 * Class116.anInt1419
	    && (-7767321204468129803L * Class41.aLong337
		< Class251.method4508((byte) 8))) {
	    for (int i_14_ = 183011601 * Class116.anInt1419;
		 i_14_ < Class95.aStringArray1126.length; i_14_++) {
		if (Class95.aStringArray1126[i_14_].startsWith("pause")) {
		    int i_15_ = 5;
		    try {
			i_15_ = Integer.parseInt(Class95.aStringArray1126
						     [i_14_].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class268.method4961(new StringBuilder().append
					    ("Pausing for ").append
					    (i_15_).append
					    (" seconds...").toString(),
					1644380786);
		    Class116.anInt1419 = 1709148145 * (1 + i_14_);
		    Class41.aLong337
			= (Class251.method4508((byte) 8)
			   + (long) (1000 * i_15_)) * -3188431922941586339L;
		    return;
		}
		Class116.aString1414 = Class95.aStringArray1126[i_14_];
		Class655.method10814(false, 1820759850);
	    }
	    Class116.anInt1419 = -1709148145;
	}
	if (0 != client.anInt11100 * 542098735) {
	    Class116.anInt1413 -= 1010045755 * client.anInt11100;
	    if (545098001 * Class116.anInt1413
		>= Class116.anInt1412 * -592886281)
		Class116.anInt1413
		    = -301588857 * Class116.anInt1412 - 501909489;
	    if (Class116.anInt1413 * 545098001 < 0)
		Class116.anInt1413 = 0;
	    client.anInt11100 = 0;
	}
	for (int i_16_ = 0; i_16_ < client.anInt11102 * 1230768119; i_16_++) {
	    Interface64 interface64 = client.anInterface64Array11103[i_16_];
	    int i_17_ = interface64.method413(1643455019);
	    char c = interface64.method420((byte) 15);
	    int i_18_ = interface64.method427((byte) 85);
	    if (84 == i_17_)
		Class655.method10814(false, 1204163874);
	    if (80 == i_17_)
		Class655.method10814(true, 2069230511);
	    else if (i_17_ == 66 && (i_18_ & 0x4) != 0) {
		if (Class661.aClipboard8474 != null) {
		    String string = "";
		    for (int i_19_ = Class116.aStringArray1411.length - 1;
			 i_19_ >= 0; i_19_--) {
			if (null != Class116.aStringArray1411[i_19_]
			    && Class116.aStringArray1411[i_19_].length() > 0)
			    string
				= new StringBuilder().append(string).append
				      (Class116.aStringArray1411[i_19_]).append
				      ('\n').toString();
		    }
		    Class661.aClipboard8474
			.setContents(new StringSelection(string), null);
		}
	    } else if (i_17_ == 67 && 0 != (i_18_ & 0x4)) {
		if (Class661.aClipboard8474 != null) {
		    try {
			Transferable transferable
			    = Class661.aClipboard8474.getContents(null);
			if (transferable != null) {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (string != null) {
				String[] strings
				    = Class481.method7829(string, '\n',
							  -1138024535);
				Class707.method14322(strings, 970070671);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_17_ == 85 && -675240623 * Class116.anInt1420 > 0) {
		Class116.aString1414
		    = new StringBuilder().append
			  (Class116.aString1414.substring(0,
							  (Class116.anInt1420
							   * -675240623) - 1))
			  .append
			  (Class116.aString1414
			       .substring(Class116.anInt1420 * -675240623))
			  .toString();
		Class116.anInt1420 -= -2087599183;
	    } else if (i_17_ == 101 && (Class116.anInt1420 * -675240623
					< Class116.aString1414.length()))
		Class116.aString1414
		    = new StringBuilder().append
			  (Class116.aString1414
			       .substring(0, -675240623 * Class116.anInt1420))
			  .append
			  (Class116.aString1414
			       .substring(1 + -675240623 * Class116.anInt1420))
			  .toString();
	    else if (96 == i_17_ && Class116.anInt1420 * -675240623 > 0)
		Class116.anInt1420 -= -2087599183;
	    else if (97 == i_17_ && (Class116.anInt1420 * -675240623
				     < Class116.aString1414.length()))
		Class116.anInt1420 += -2087599183;
	    else if (102 == i_17_)
		Class116.anInt1420 = 0;
	    else if (i_17_ == 103)
		Class116.anInt1420
		    = Class116.aString1414.length() * -2087599183;
	    else if (i_17_ == 104 && (1919934461 * Class116.anInt1415
				      < Class116.aStringArray1411.length)) {
		Class116.anInt1415 += -533957291;
		Class116.method2058(185336011);
		Class116.anInt1420
		    = Class116.aString1414.length() * -2087599183;
	    } else if (105 == i_17_ && 1919934461 * Class116.anInt1415 > 0) {
		Class116.anInt1415 -= -533957291;
		Class116.method2058(-1773198184);
		Class116.anInt1420
		    = Class116.aString1414.length() * -2087599183;
	    } else if (Class560.method9410(c, 836468447)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		Class116.aString1414
		    = new StringBuilder().append
			  (Class116.aString1414
			       .substring(0, -675240623 * Class116.anInt1420))
			  .append
			  (client.anInterface64Array11103[i_16_]
			       .method420((byte) 60))
			  .append
			  (Class116.aString1414
			       .substring(-675240623 * Class116.anInt1420))
			  .toString();
		Class116.anInt1420 += -2087599183;
	    }
	}
	client.anInt11102 = 0;
	client.anInt11273 = 0;
	Class83.method1604(-1842862208);
    }
}
