/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.zip.Inflater;

public class Class74
{
    Inflater anInflater820;
    public static byte aByte821;
    
    public void method1542(RSBuffer class525_sub38, byte[] is, int i) {
	if ((class525_sub38.buffer
	     [-1133521593 * class525_sub38.index]) != 31
	    || -117 != (class525_sub38.buffer
			[-1133521593 * class525_sub38.index + 1]))
	    throw new RuntimeException("");
	if (anInflater820 == null)
	    anInflater820 = new Inflater(true);
	try {
	    anInflater820.setInput(class525_sub38.buffer,
				   (-1133521593 * class525_sub38.index
				    + 10),
				   (class525_sub38.buffer.length
				    - (10 + (class525_sub38.index
					     * -1133521593) + 8)));
	    anInflater820.inflate(is);
	} catch (Exception exception) {
	    anInflater820.reset();
	    throw new RuntimeException("");
	}
	anInflater820.reset();
    }
    
    public void method1543(RSBuffer class525_sub38, byte[] is) {
	if ((class525_sub38.buffer
	     [-1133521593 * class525_sub38.index]) != 31
	    || -117 != (class525_sub38.buffer
			[-1133521593 * class525_sub38.index + 1]))
	    throw new RuntimeException("");
	if (anInflater820 == null)
	    anInflater820 = new Inflater(true);
	try {
	    anInflater820.setInput(class525_sub38.buffer,
				   (-1133521593 * class525_sub38.index
				    + 10),
				   (class525_sub38.buffer.length
				    - (10 + (class525_sub38.index
					     * -1133521593) + 8)));
	    anInflater820.inflate(is);
	} catch (Exception exception) {
	    anInflater820.reset();
	    throw new RuntimeException("");
	}
	anInflater820.reset();
    }
    
    public byte[] method1544(byte[] is, byte i) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 4) * 339428471;
	int i_0_ = class525_sub38.method16790((short) 10776);
	byte[] is_1_ = new byte[i_0_];
	class525_sub38.index = 0;
	method1542(class525_sub38, is_1_, -2001577710);
	return is_1_;
    }
    
    public byte[] method1545(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 4) * 339428471;
	int i = class525_sub38.method16790((short) 17386);
	byte[] is_2_ = new byte[i];
	class525_sub38.index = 0;
	method1542(class525_sub38, is_2_, 479605005);
	return is_2_;
    }
    
    public byte[] method1546(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 4) * 339428471;
	int i = class525_sub38.method16790((short) 27929);
	byte[] is_3_ = new byte[i];
	class525_sub38.index = 0;
	method1542(class525_sub38, is_3_, 1651254608);
	return is_3_;
    }
    
    public Class74() {
	this(-1, 1000000, 1000000);
    }
    
    public byte[] method1547(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	class525_sub38.index = (is.length - 4) * 339428471;
	int i = class525_sub38.method16790((short) 23508);
	byte[] is_4_ = new byte[i];
	class525_sub38.index = 0;
	method1542(class525_sub38, is_4_, 702930229);
	return is_4_;
    }
    
    public void method1548(RSBuffer class525_sub38, byte[] is) {
	if ((class525_sub38.buffer
	     [-1133521593 * class525_sub38.index]) != 31
	    || -117 != (class525_sub38.buffer
			[-1133521593 * class525_sub38.index + 1]))
	    throw new RuntimeException("");
	if (anInflater820 == null)
	    anInflater820 = new Inflater(true);
	try {
	    anInflater820.setInput(class525_sub38.buffer,
				   (-1133521593 * class525_sub38.index
				    + 10),
				   (class525_sub38.buffer.length
				    - (10 + (class525_sub38.index
					     * -1133521593) + 8)));
	    anInflater820.inflate(is);
	} catch (Exception exception) {
	    anInflater820.reset();
	    throw new RuntimeException("");
	}
	anInflater820.reset();
    }
    
    public void method1549(RSBuffer class525_sub38, byte[] is) {
	if ((class525_sub38.buffer
	     [-1133521593 * class525_sub38.index]) != 31
	    || -117 != (class525_sub38.buffer
			[-1133521593 * class525_sub38.index + 1]))
	    throw new RuntimeException("");
	if (anInflater820 == null)
	    anInflater820 = new Inflater(true);
	try {
	    anInflater820.setInput(class525_sub38.buffer,
				   (-1133521593 * class525_sub38.index
				    + 10),
				   (class525_sub38.buffer.length
				    - (10 + (class525_sub38.index
					     * -1133521593) + 8)));
	    anInflater820.inflate(is);
	} catch (Exception exception) {
	    anInflater820.reset();
	    throw new RuntimeException("");
	}
	anInflater820.reset();
    }
    
    Class74(int i, int i_5_, int i_6_) {
	/* empty */
    }
    
    static final void method1550(Class683 class683, byte i) {
	int i_7_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_7_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_7_ >> 16];
	Class176.method2908(class259, class245, class683, (short) 2014);
    }
    
    static final void method1551(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub11_10688
		  .method17066(102172973) ? 1 : 0;
    }
}
