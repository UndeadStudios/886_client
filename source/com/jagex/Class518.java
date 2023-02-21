/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class518
{
    public int anInt7059;
    public int anInt7060;
    public int anInt7061;
    public int anInt7062;
    
    Class518(int i, int i_0_, int i_1_, int i_2_) {
	anInt7062 = 1973555763 * i;
	anInt7060 = i_0_ * 760040223;
	anInt7061 = i_1_ * -33699687;
	anInt7059 = i_2_ * 1619987579;
    }
    
    Class518() {
	anInt7062 = (32 + (int) (Math.random() * 4.0)) * 1973555763;
	anInt7060 = (3 + (int) (Math.random() * 2.0)) * 760040223;
	anInt7061 = (16 + (int) (Math.random() * 3.0)) * -33699687;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		.method16985(67571762)
	    == 1)
	    anInt7059 = (int) (Math.random() * 6.0) * 1619987579;
	else
	    anInt7059 = (int) (Math.random() * 12.0) * 1619987579;
    }
    
    public static int method8637(int i) {
	return Class285.aTwitchTV3143.GetStreamState();
    }
    
    static final void method8638(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -1020682347 * class259.anInt2665;
    }
    
    static final void method8639(Class683 class683, byte i) {
	Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
	    = ((Class656_Sub1_Sub3_Sub1_Sub2)
	       class683.aClass656_Sub1_Sub3_Sub1_8654);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 550404207 * class656_sub1_sub3_sub1_sub2.anInt12260;
    }
    
    static byte[] method8640(InputStream inputstream, int i, int i_3_)
	throws IOException {
	byte[] is = new byte[5];
	if (inputstream.read(is, 0, 5) != 5)
	    throw new IOException("2");
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream(i);
	synchronized (Class537.aClass526_7178) {
	    if (!Class537.aClass526_7178.method8765(is, -1407739045))
		throw new IOException("3");
	    Class537.aClass526_7178
		.method8766(inputstream, bytearrayoutputstream, (long) i);
	}
	bytearrayoutputstream.flush();
	return bytearrayoutputstream.toByteArray();
    }
    
    public static int[][] method8641(int i, int i_4_, int i_5_, int i_6_,
				     int i_7_, int i_8_, float f, boolean bool,
				     int i_9_) {
	int[][] is = new int[i_4_][i];
	Class525_Sub40_Sub1 class525_sub40_sub1 = new Class525_Sub40_Sub1();
	class525_sub40_sub1.aBool11855 = bool;
	class525_sub40_sub1.anInt11842 = i_6_ * -111738613;
	class525_sub40_sub1.anInt11852 = i_7_ * 806466245;
	class525_sub40_sub1.anInt11853 = i_8_ * 1547080483;
	class525_sub40_sub1.anInt11849 = -150373995 * (int) (f * 4096.0F);
	class525_sub40_sub1.method18464((byte) 1);
	Class60.method1229(i, i_4_, 1236561177);
	for (int i_10_ = 0; i_10_ < i_4_; i_10_++)
	    class525_sub40_sub1.method18457(i_10_, is[i_10_], 2143675907);
	return is;
    }
}
