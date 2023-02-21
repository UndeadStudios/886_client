/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Dimension;
import java.lang.reflect.Array;
import java.util.Iterator;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class47 implements Interface13
{
    Interface12[] anInterface12Array357;
    protected int anInt358;
    Class458 aClass458_359;
    Class663 aClass663_360;
    Interface12 anInterface12_361;
    Interface5 anInterface5_362;
    public static Class458 aClass458_363;
    
    public int method71() {
	return anInterface12Array357.length;
    }
    
    public Iterator method1097() {
	return new Class35(this);
    }
    
    void method1098(int i, int i_0_) {
	if (null == anInterface12Array357[i]) {
	    try {
		anInterface12Array357[i]
		    = anInterface5_362.method42(i, this, -1302403941);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class293.method5307(aClass458_359, aClass663_360, i,
					    (short) 255);
	    if (is != null)
		anInterface12Array357[i].method66(new RSBuffer(is),
						  -412916016);
	    anInterface12Array357[i].method67(-1336287103);
	}
    }
    
    public int method72(int i) {
	return anInterface12Array357.length;
    }
    
    Class47(Class668 class668, Class666 class666, Class663 class663,
	    Class458 class458, Interface5 interface5, boolean bool) {
	anInterface5_362 = interface5;
	aClass663_360 = class663;
	aClass458_359 = class458;
	anInt358 = Class417.method6723(aClass458_359, aClass663_360,
				       -262985332) * 663982315;
	anInterface12Array357
	    = ((Interface12[])
	       Array.newInstance(anInterface5_362.method40(-1479800703),
				 953849795 * anInt358));
	if (bool) {
	    for (int i = 0; i < anInt358 * 953849795; i++)
		method1098(i, -938792170);
	}
    }
    
    public Interface12 method73(int i) {
	if (i < 0) {
	    if (null == anInterface12_361)
		anInterface12_361
		    = anInterface5_362.method42(-1, this, -1979417669);
	    return anInterface12_361;
	}
	if (null == anInterface12Array357[i])
	    method1098(i, 599283702);
	return anInterface12Array357[i];
    }
    
    public Interface12 method74(int i) {
	if (i < 0) {
	    if (null == anInterface12_361)
		anInterface12_361
		    = anInterface5_362.method42(-1, this, -1262557887);
	    return anInterface12_361;
	}
	if (null == anInterface12Array357[i])
	    method1098(i, 1383016470);
	return anInterface12Array357[i];
    }
    
    public int method57() {
	return anInterface12Array357.length;
    }
    
    public int method75() {
	return anInterface12Array357.length;
    }
    
    public Interface12 method76(int i, int i_1_) {
	if (i < 0) {
	    if (null == anInterface12_361)
		anInterface12_361
		    = anInterface5_362.method42(-1, this, -1452009020);
	    return anInterface12_361;
	}
	if (null == anInterface12Array357[i])
	    method1098(i, 645578098);
	return anInterface12Array357[i];
    }
    
    public int method8() {
	return anInterface12Array357.length;
    }
    
    public int method77() {
	return anInterface12Array357.length;
    }
    
    public int method7() {
	return anInterface12Array357.length;
    }
    
    public Iterator method1099() {
	return new Class35(this);
    }
    
    void method1100(int i) {
	if (null == anInterface12Array357[i]) {
	    try {
		anInterface12Array357[i]
		    = anInterface5_362.method42(i, this, 1796304566);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class293.method5307(aClass458_359, aClass663_360, i,
					    (short) 255);
	    if (is != null)
		anInterface12Array357[i].method66(new RSBuffer(is),
						  -412916016);
	    anInterface12Array357[i].method67(1433570536);
	}
    }
    
    public Iterator iterator() {
	return new Class35(this);
    }
    
    public static Class525_Sub16_Sub16 method1101(byte i) {
	return Class307.aClass525_Sub16_Sub16_3418;
    }
    
    static void method1102(byte i) {
	if (Class501.aClass182_5564.method3268()) {
	    Class501.aClass182_5564.method3283(Class532.aCanvas7169,
					       234487564);
	    Class453_Sub2.method15916(-230264319);
	    Dimension dimension = Class532.aCanvas7169.getSize();
	    Class501.aClass182_5564.method3153(Class532.aCanvas7169,
					       dimension.width,
					       dimension.height, 1295362795);
	    Class501.aClass182_5564.method3317(Class532.aCanvas7169,
					       -1122506974);
	} else
	    Class217.method4146(Class198_Sub13.aClass525_Sub30_9973
				    .aClass696_Sub20_10708
				    .method17160(992923923),
				false, (byte) 14);
	Class83.method1604(-1861005783);
    }
    
    static byte method1103(int i, int i_2_, byte i_3_) {
	if (i != -1214990409 * Class608.aClass608_7980.anInt7995)
	    return (byte) 0;
	if ((i_2_ & 0x1) == 0)
	    return (byte) 1;
	return (byte) 2;
    }
    
    static final void method1104(Class683 class683, short i) {
	class683.anInt8662 -= -1189665054;
	int i_4_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4356(i_4_, 2108899332)
		  .method3946(i_5_, -1193419006);
    }
    
    static void method1105(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class541.method8901(i_6_, -546569034);
	if (twitchwebcamdevice == null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= twitchwebcamdevice.method1754();
    }
    
    static final void method1106(Class683 class683, byte i) {
	if (Class7.aClass278_54.method5119(169217778) > 0) {
	    String string
		= (String) (class683.anObjectArray8636
			    [(class683.anInt8644 -= 1285561025) * 1373599041]);
	    String string_7_
		= Class7.aClass278_54.method5124(string, (byte) 3);
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= string_7_;
	}
    }
    
    static int[] method1107(Class525_Sub15 class525_sub15, byte i) {
	RSBuffer class525_sub38 = new RSBuffer(518);
	int[] is = new int[4];
	for (int i_8_ = 0; i_8_ < 4; i_8_++)
	    is[i_8_] = (int) (Math.random() * 9.9999999E7);
	class525_sub38.method16735(10, -419793537);
	class525_sub38.method16605(is[0], -1048351226);
	class525_sub38.method16605(is[1], -896106007);
	class525_sub38.method16605(is[2], -1413401806);
	class525_sub38.method16605(is[3], -439118176);
	for (int i_9_ = 0; i_9_ < 10; i_9_++)
	    class525_sub38.method16605((int) (Math.random() * 9.9999999E7),
				       -1836917784);
	class525_sub38.method16602((int) (Math.random() * 9.9999999E7),
				   550996696);
	class525_sub38.method16671(Class38.aBigInteger326,
				   Class38.aBigInteger324, (short) 24926);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16614
	    (class525_sub38.buffer, 0,
	     -1133521593 * class525_sub38.pos, -430494844);
	return is;
    }
}
