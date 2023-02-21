/* Class551_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class551_Sub1 extends Class551
    implements KeyListener, FocusListener
{
    Class709 aClass709_10747 = new Class709();
    static final int anInt10748 = 128;
    static final int anInt10749 = 112;
    Class709 aClass709_10750 = new Class709();
    boolean[] aBoolArray10751 = new boolean[112];
    Component aComponent10752;
    static int[] anIntArray10753
	= { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0,
	    0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96,
	    98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22,
	    23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39,
	    54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64,
	    0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0,
	    88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101,
	    128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140,
	    141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0,
	    0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    
    public synchronized void method9140(int i) {
	aClass709_10747.method14344(-2010498413);
	for (Class525_Sub39 class525_sub39
		 = (Class525_Sub39) aClass709_10750.method14423(-959168059);
	     class525_sub39 != null;
	     class525_sub39
		 = (Class525_Sub39) aClass709_10750.method14423(-1859756894)) {
	    class525_sub39.anInt10843 = method16533(-1234105755) * -1983531457;
	    if (class525_sub39.anInt10841 * 2031662781 == 0) {
		if (!aBoolArray10751[class525_sub39.anInt10838 * 1035920747]) {
		    Class525_Sub39 class525_sub39_0_ = new Class525_Sub39();
		    class525_sub39_0_.anInt10841 = 0;
		    class525_sub39_0_.aChar10840 = '\uffff';
		    class525_sub39_0_.anInt10838
			= class525_sub39.anInt10838 * 1;
		    class525_sub39_0_.aLong10842
			= class525_sub39.aLong10842 * 1L;
		    class525_sub39_0_.anInt10843
			= class525_sub39.anInt10843 * 1;
		    aClass709_10747.method14345(class525_sub39_0_, (byte) 0);
		    aBoolArray10751[class525_sub39.anInt10838 * 1035920747]
			= true;
		}
		class525_sub39.anInt10841 = -1138693846;
		aClass709_10747.method14345(class525_sub39, (byte) 0);
	    } else if (1 == 2031662781 * class525_sub39.anInt10841) {
		if (aBoolArray10751[1035920747 * class525_sub39.anInt10838]) {
		    aClass709_10747.method14345(class525_sub39, (byte) 0);
		    aBoolArray10751[1035920747 * class525_sub39.anInt10838]
			= false;
		}
	    } else if (class525_sub39.anInt10841 * 2031662781 == -1) {
		for (int i_1_ = 0; i_1_ < 112; i_1_++) {
		    if (aBoolArray10751[i_1_]) {
			Class525_Sub39 class525_sub39_2_
			    = new Class525_Sub39();
			class525_sub39_2_.anInt10841 = -569346923;
			class525_sub39_2_.aChar10840 = '\uffff';
			class525_sub39_2_.anInt10838 = i_1_ * 2051415875;
			class525_sub39_2_.aLong10842
			    = 1L * class525_sub39.aLong10842;
			class525_sub39_2_.anInt10843
			    = class525_sub39.anInt10843 * 1;
			aClass709_10747.method14345(class525_sub39_2_,
						    (byte) 0);
			aBoolArray10751[i_1_] = false;
		    }
		}
	    } else if (3 == 2031662781 * class525_sub39.anInt10841)
		aClass709_10747.method14345(class525_sub39, (byte) 0);
	}
    }
    
    void method16528(Component component, int i) {
	method16529(-1547820007);
	aComponent10752 = component;
	aComponent10752.addKeyListener(this);
	aComponent10752.addFocusListener(this);
    }
    
    void method16529(int i) {
	if (aComponent10752 != null) {
	    aComponent10752.removeKeyListener(this);
	    aComponent10752.removeFocusListener(this);
	    aComponent10752 = null;
	    for (int i_3_ = 0; i_3_ < 112; i_3_++)
		aBoolArray10751[i_3_] = false;
	    aClass709_10747.method14344(75271626);
	    aClass709_10750.method14344(860436788);
	}
    }
    
    static void method16530() {
	anIntArray10753[44] = 71;
	anIntArray10753[45] = 26;
	anIntArray10753[46] = 72;
	anIntArray10753[47] = 73;
	anIntArray10753[59] = 57;
	anIntArray10753[61] = 27;
	anIntArray10753[91] = 42;
	anIntArray10753[92] = 74;
	anIntArray10753[93] = 43;
	anIntArray10753[192] = 28;
	anIntArray10753[222] = 58;
	anIntArray10753[520] = 59;
    }
    
    public Interface64 method9142(int i) {
	return (Interface64) aClass709_10747.method14423(-696228179);
    }
    
    void method16531(KeyEvent keyevent, int i, int i_4_) {
	int i_5_ = keyevent.getKeyCode();
	if (0 != i_5_) {
	    if (i_5_ >= 0 && i_5_ < anIntArray10753.length) {
		i_5_ = anIntArray10753[i_5_];
		if (0 == i && 0 != (i_5_ & 0x80))
		    i_5_ = 0;
		else
		    i_5_ &= ~0x80;
	    } else
		i_5_ = 0;
	} else
	    i_5_ = 0;
	if (i_5_ != 0) {
	    method16532(i, '\uffff', i_5_, -589706414);
	    keyevent.consume();
	}
    }
    
    void method16532(int i, char c, int i_6_, int i_7_) {
	Class525_Sub39 class525_sub39 = new Class525_Sub39();
	class525_sub39.anInt10841 = -569346923 * i;
	class525_sub39.aChar10840 = c;
	class525_sub39.anInt10838 = 2051415875 * i_6_;
	class525_sub39.aLong10842
	    = Class251.method4508((byte) 8) * 6811420540624879955L;
	aClass709_10750.method14345(class525_sub39, (byte) 0);
    }
    
    int method16533(int i) {
	int i_8_ = 0;
	if (aBoolArray10751[81])
	    i_8_ |= 0x1;
	if (aBoolArray10751[82])
	    i_8_ |= 0x4;
	if (aBoolArray10751[86])
	    i_8_ |= 0x2;
	return i_8_;
    }
    
    public void method9139(int i) {
	method16529(1024045694);
    }
    
    public synchronized void method16534(KeyEvent keyevent) {
	char c = keyevent.getKeyChar();
	if (c != '\uffff' && Class176.method2906(c, -1323407602)) {
	    method16532(3, c, -1, 1627540131);
	    keyevent.consume();
	}
    }
    
    public synchronized void keyPressed(KeyEvent keyevent) {
	method16531(keyevent, 0, -1128872738);
    }
    
    public synchronized void keyReleased(KeyEvent keyevent) {
	method16531(keyevent, 1, -1128872738);
    }
    
    public synchronized void keyTyped(KeyEvent keyevent) {
	char c = keyevent.getKeyChar();
	if (c != '\uffff' && Class176.method2906(c, -1357565901)) {
	    method16532(3, c, -1, -1315125861);
	    keyevent.consume();
	}
    }
    
    public void focusGained(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void focusLost(FocusEvent focusevent) {
	method16532(-1, '\0', 0, 31504692);
    }
    
    public void method16535(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void method16536(KeyEvent keyevent) {
	method16531(keyevent, 0, -1128872738);
    }
    
    static void method16537() {
	anIntArray10753[44] = 71;
	anIntArray10753[45] = 26;
	anIntArray10753[46] = 72;
	anIntArray10753[47] = 73;
	anIntArray10753[59] = 57;
	anIntArray10753[61] = 27;
	anIntArray10753[91] = 42;
	anIntArray10753[92] = 74;
	anIntArray10753[93] = 43;
	anIntArray10753[192] = 28;
	anIntArray10753[222] = 58;
	anIntArray10753[520] = 59;
    }
    
    public synchronized void method16538(FocusEvent focusevent) {
	method16532(-1, '\0', 0, -1342208530);
    }
    
    public void method9141() {
	method16529(1056100636);
    }
    
    public synchronized void method16539(FocusEvent focusevent) {
	method16532(-1, '\0', 0, 1697792133);
    }
    
    public synchronized void method16540(FocusEvent focusevent) {
	method16532(-1, '\0', 0, 457457004);
    }
    
    static void method16541() {
	anIntArray10753[44] = 71;
	anIntArray10753[45] = 26;
	anIntArray10753[46] = 72;
	anIntArray10753[47] = 73;
	anIntArray10753[59] = 57;
	anIntArray10753[61] = 27;
	anIntArray10753[91] = 42;
	anIntArray10753[92] = 74;
	anIntArray10753[93] = 43;
	anIntArray10753[192] = 28;
	anIntArray10753[222] = 58;
	anIntArray10753[520] = 59;
    }
    
    Class551_Sub1(Component component) {
	Class665.method10998((byte) 1);
	method16528(component, 1141612641);
    }
    
    static void method16542() {
	anIntArray10753[44] = 71;
	anIntArray10753[45] = 26;
	anIntArray10753[46] = 72;
	anIntArray10753[47] = 73;
	anIntArray10753[59] = 57;
	anIntArray10753[61] = 27;
	anIntArray10753[91] = 42;
	anIntArray10753[92] = 74;
	anIntArray10753[93] = 43;
	anIntArray10753[192] = 28;
	anIntArray10753[222] = 58;
	anIntArray10753[520] = 59;
    }
    
    public synchronized void method16543(FocusEvent focusevent) {
	method16532(-1, '\0', 0, 2006128115);
    }
    
    static void method16544() {
	anIntArray10753[44] = 71;
	anIntArray10753[45] = 26;
	anIntArray10753[46] = 72;
	anIntArray10753[47] = 73;
	anIntArray10753[59] = 57;
	anIntArray10753[61] = 27;
	anIntArray10753[91] = 42;
	anIntArray10753[92] = 74;
	anIntArray10753[93] = 43;
	anIntArray10753[192] = 28;
	anIntArray10753[222] = 58;
	anIntArray10753[520] = 59;
    }
    
    void method16545(Component component) {
	method16529(-1645690767);
	aComponent10752 = component;
	aComponent10752.addKeyListener(this);
	aComponent10752.addFocusListener(this);
    }
    
    int method16546() {
	int i = 0;
	if (aBoolArray10751[81])
	    i |= 0x1;
	if (aBoolArray10751[82])
	    i |= 0x4;
	if (aBoolArray10751[86])
	    i |= 0x2;
	return i;
    }
    
    public synchronized void method16547(FocusEvent focusevent) {
	method16532(-1, '\0', 0, 912791071);
    }
    
    public Interface64 method9144() {
	return (Interface64) aClass709_10747.method14423(-888604605);
    }
    
    public Interface64 method9145() {
	return (Interface64) aClass709_10747.method14423(-1482727370);
    }
    
    public Interface64 method9143() {
	return (Interface64) aClass709_10747.method14423(-1643731743);
    }
    
    public boolean method9147(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return aBoolArray10751[i];
    }
    
    public synchronized void method9148() {
	aClass709_10747.method14344(-243194459);
	for (Class525_Sub39 class525_sub39
		 = (Class525_Sub39) aClass709_10750.method14423(-1569840105);
	     class525_sub39 != null;
	     class525_sub39
		 = (Class525_Sub39) aClass709_10750.method14423(-1681233813)) {
	    class525_sub39.anInt10843 = method16533(-213255940) * -1983531457;
	    if (class525_sub39.anInt10841 * 2031662781 == 0) {
		if (!aBoolArray10751[class525_sub39.anInt10838 * 1035920747]) {
		    Class525_Sub39 class525_sub39_9_ = new Class525_Sub39();
		    class525_sub39_9_.anInt10841 = 0;
		    class525_sub39_9_.aChar10840 = '\uffff';
		    class525_sub39_9_.anInt10838
			= class525_sub39.anInt10838 * 1;
		    class525_sub39_9_.aLong10842
			= class525_sub39.aLong10842 * 1L;
		    class525_sub39_9_.anInt10843
			= class525_sub39.anInt10843 * 1;
		    aClass709_10747.method14345(class525_sub39_9_, (byte) 0);
		    aBoolArray10751[class525_sub39.anInt10838 * 1035920747]
			= true;
		}
		class525_sub39.anInt10841 = -1138693846;
		aClass709_10747.method14345(class525_sub39, (byte) 0);
	    } else if (1 == 2031662781 * class525_sub39.anInt10841) {
		if (aBoolArray10751[1035920747 * class525_sub39.anInt10838]) {
		    aClass709_10747.method14345(class525_sub39, (byte) 0);
		    aBoolArray10751[1035920747 * class525_sub39.anInt10838]
			= false;
		}
	    } else if (class525_sub39.anInt10841 * 2031662781 == -1) {
		for (int i = 0; i < 112; i++) {
		    if (aBoolArray10751[i]) {
			Class525_Sub39 class525_sub39_10_
			    = new Class525_Sub39();
			class525_sub39_10_.anInt10841 = -569346923;
			class525_sub39_10_.aChar10840 = '\uffff';
			class525_sub39_10_.anInt10838 = i * 2051415875;
			class525_sub39_10_.aLong10842
			    = 1L * class525_sub39.aLong10842;
			class525_sub39_10_.anInt10843
			    = class525_sub39.anInt10843 * 1;
			aClass709_10747.method14345(class525_sub39_10_,
						    (byte) 0);
			aBoolArray10751[i] = false;
		    }
		}
	    } else if (3 == 2031662781 * class525_sub39.anInt10841)
		aClass709_10747.method14345(class525_sub39, (byte) 0);
	}
    }
    
    public synchronized void method9153() {
	aClass709_10747.method14344(-1746470501);
	for (Class525_Sub39 class525_sub39
		 = (Class525_Sub39) aClass709_10750.method14423(-1178963258);
	     class525_sub39 != null;
	     class525_sub39
		 = (Class525_Sub39) aClass709_10750.method14423(-1510359454)) {
	    class525_sub39.anInt10843 = method16533(776881385) * -1983531457;
	    if (class525_sub39.anInt10841 * 2031662781 == 0) {
		if (!aBoolArray10751[class525_sub39.anInt10838 * 1035920747]) {
		    Class525_Sub39 class525_sub39_11_ = new Class525_Sub39();
		    class525_sub39_11_.anInt10841 = 0;
		    class525_sub39_11_.aChar10840 = '\uffff';
		    class525_sub39_11_.anInt10838
			= class525_sub39.anInt10838 * 1;
		    class525_sub39_11_.aLong10842
			= class525_sub39.aLong10842 * 1L;
		    class525_sub39_11_.anInt10843
			= class525_sub39.anInt10843 * 1;
		    aClass709_10747.method14345(class525_sub39_11_, (byte) 0);
		    aBoolArray10751[class525_sub39.anInt10838 * 1035920747]
			= true;
		}
		class525_sub39.anInt10841 = -1138693846;
		aClass709_10747.method14345(class525_sub39, (byte) 0);
	    } else if (1 == 2031662781 * class525_sub39.anInt10841) {
		if (aBoolArray10751[1035920747 * class525_sub39.anInt10838]) {
		    aClass709_10747.method14345(class525_sub39, (byte) 0);
		    aBoolArray10751[1035920747 * class525_sub39.anInt10838]
			= false;
		}
	    } else if (class525_sub39.anInt10841 * 2031662781 == -1) {
		for (int i = 0; i < 112; i++) {
		    if (aBoolArray10751[i]) {
			Class525_Sub39 class525_sub39_12_
			    = new Class525_Sub39();
			class525_sub39_12_.anInt10841 = -569346923;
			class525_sub39_12_.aChar10840 = '\uffff';
			class525_sub39_12_.anInt10838 = i * 2051415875;
			class525_sub39_12_.aLong10842
			    = 1L * class525_sub39.aLong10842;
			class525_sub39_12_.anInt10843
			    = class525_sub39.anInt10843 * 1;
			aClass709_10747.method14345(class525_sub39_12_,
						    (byte) 0);
			aBoolArray10751[i] = false;
		    }
		}
	    } else if (3 == 2031662781 * class525_sub39.anInt10841)
		aClass709_10747.method14345(class525_sub39, (byte) 0);
	}
    }
    
    public void method16548(FocusEvent focusevent) {
	/* empty */
    }
    
    public void method9150() {
	method16529(1467050359);
    }
    
    void method16549(int i, char c, int i_13_) {
	Class525_Sub39 class525_sub39 = new Class525_Sub39();
	class525_sub39.anInt10841 = -569346923 * i;
	class525_sub39.aChar10840 = c;
	class525_sub39.anInt10838 = 2051415875 * i_13_;
	class525_sub39.aLong10842
	    = Class251.method4508((byte) 8) * 6811420540624879955L;
	aClass709_10750.method14345(class525_sub39, (byte) 0);
    }
    
    void method16550(KeyEvent keyevent, int i) {
	int i_14_ = keyevent.getKeyCode();
	if (0 != i_14_) {
	    if (i_14_ >= 0 && i_14_ < anIntArray10753.length) {
		i_14_ = anIntArray10753[i_14_];
		if (0 == i && 0 != (i_14_ & 0x80))
		    i_14_ = 0;
		else
		    i_14_ &= ~0x80;
	    } else
		i_14_ = 0;
	} else
	    i_14_ = 0;
	if (i_14_ != 0) {
	    method16532(i, '\uffff', i_14_, 802262706);
	    keyevent.consume();
	}
    }
    
    public synchronized void method16551(KeyEvent keyevent) {
	method16531(keyevent, 0, -1128872738);
    }
    
    public synchronized void method16552(KeyEvent keyevent) {
	method16531(keyevent, 0, -1128872738);
    }
    
    public synchronized void method16553(KeyEvent keyevent) {
	method16531(keyevent, 1, -1128872738);
    }
    
    public synchronized void method16554(KeyEvent keyevent) {
	method16531(keyevent, 0, -1128872738);
    }
    
    public synchronized void method16555(KeyEvent keyevent) {
	method16531(keyevent, 1, -1128872738);
    }
    
    public boolean method9149(int i, int i_15_) {
	if (i < 0 || i >= 112)
	    return false;
	return aBoolArray10751[i];
    }
    
    public synchronized void method16556(KeyEvent keyevent) {
	method16531(keyevent, 1, -1128872738);
    }
    
    public synchronized void method16557(KeyEvent keyevent) {
	char c = keyevent.getKeyChar();
	if (c != '\uffff' && Class176.method2906(c, -871922316)) {
	    method16532(3, c, -1, -1067543595);
	    keyevent.consume();
	}
    }
    
    void method16558() {
	if (aComponent10752 != null) {
	    aComponent10752.removeKeyListener(this);
	    aComponent10752.removeFocusListener(this);
	    aComponent10752 = null;
	    for (int i = 0; i < 112; i++)
		aBoolArray10751[i] = false;
	    aClass709_10747.method14344(2093253775);
	    aClass709_10750.method14344(-1702171766);
	}
    }
    
    public synchronized void method16559(KeyEvent keyevent) {
	char c = keyevent.getKeyChar();
	if (c != '\uffff' && Class176.method2906(c, -34427655)) {
	    method16532(3, c, -1, -126645831);
	    keyevent.consume();
	}
    }
    
    static final void method16560(Class683 class683, int i) {
	int i_16_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_16_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_16_ >> 16];
	Class465.method7666(class259, class245, class683, 2140021159);
    }
}
