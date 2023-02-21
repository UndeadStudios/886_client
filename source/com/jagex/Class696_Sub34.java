/* Class696_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class696_Sub34 extends Class696
{
    public static final int anInt10971 = 0;
    static final int anInt10972 = 1;
    
    public Class696_Sub34(Class525_Sub30 class525_sub30) {
	super(class525_sub30);
    }
    
    public Class696_Sub34(int i, Class525_Sub30 class525_sub30) {
	super(i, class525_sub30);
    }
    
    public void method17278(int i) {
	if (0 != -1757849351 * anInt8760 && 1 != -1757849351 * anInt8760)
	    anInt8760 = method14168(-604189137) * 1908664649;
    }
    
    int method14172(int i) {
	return 1;
    }
    
    int method14167(int i, byte i_0_) {
	return 1;
    }
    
    void method14169(int i, int i_1_) {
	anInt8760 = 1908664649 * i;
    }
    
    public int method17279(short i) {
	return -1757849351 * anInt8760;
    }
    
    int method14175() {
	return 1;
    }
    
    public void method17280() {
	if (0 != -1757849351 * anInt8760 && 1 != -1757849351 * anInt8760)
	    anInt8760 = method14168(684247313) * 1908664649;
    }
    
    void method14173(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    void method14174(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    public int method17281() {
	return -1757849351 * anInt8760;
    }
    
    public void method17282() {
	if (0 != -1757849351 * anInt8760 && 1 != -1757849351 * anInt8760)
	    anInt8760 = method14168(961048041) * 1908664649;
    }
    
    public int method17283() {
	return -1757849351 * anInt8760;
    }
    
    int method14168(int i) {
	return 1;
    }
    
    public static void method17284(RSBuffer class525_sub38, int i,
                                   int i_2_) {
	Class525_Sub27 class525_sub27 = new Class525_Sub27();
	class525_sub27.anInt10607
	    = class525_sub38.readUnsignedByte(961511368) * 633968307;
	class525_sub27.anInt10612
	    = class525_sub38.readInt(2025892338) * 626930169;
	class525_sub27.anIntArray10608
	    = new int[1985284219 * class525_sub27.anInt10607];
	class525_sub27.anIntArray10609
	    = new int[1985284219 * class525_sub27.anInt10607];
	class525_sub27.aFieldArray10610
	    = new Field[class525_sub27.anInt10607 * 1985284219];
	class525_sub27.anIntArray10611
	    = new int[1985284219 * class525_sub27.anInt10607];
	class525_sub27.aMethodArray10606
	    = new Method[1985284219 * class525_sub27.anInt10607];
	class525_sub27.aByteArrayArrayArray10613
	    = new byte[class525_sub27.anInt10607 * 1985284219][][];
	for (int i_3_ = 0; i_3_ < class525_sub27.anInt10607 * 1985284219;
	     i_3_++) {
	    try {
		int i_4_ = class525_sub38.readUnsignedByte(1926005505);
		if (0 == i_4_ || 1 == i_4_ || i_4_ == 2) {
		    String string = class525_sub38.readString((byte) 49);
		    String string_5_ = class525_sub38.readString((byte) 91);
		    int i_6_ = 0;
		    if (1 == i_4_)
			i_6_ = class525_sub38.readInt(1842503565);
		    class525_sub27.anIntArray10608[i_3_] = i_4_;
		    class525_sub27.anIntArray10611[i_3_] = i_6_;
		    if (Class504.method8315(string, 864863166).getClassLoader()
			== null)
			throw new SecurityException();
		    class525_sub27.aFieldArray10610[i_3_]
			= Class504.method8315(string, -284903436)
			      .getDeclaredField(string_5_);
		} else if (3 == i_4_ || i_4_ == 4) {
		    String string = class525_sub38.readString((byte) -73);
		    String string_7_ = class525_sub38.readString((byte) 66);
		    int i_8_ = class525_sub38.readUnsignedByte(193910490);
		    String[] strings = new String[i_8_];
		    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
			strings[i_9_] = class525_sub38.readString((byte) -45);
		    String string_10_ = class525_sub38.readString((byte) 37);
		    byte[][] is = new byte[i_8_][];
		    if (i_4_ == 3) {
			for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
			    int i_12_ = class525_sub38.readInt(1718754669);
			    is[i_11_] = new byte[i_12_];
			    class525_sub38.method16639(is[i_11_], 0, i_12_,
						       400111122);
			}
		    }
		    class525_sub27.anIntArray10608[i_3_] = i_4_;
		    Class[] var_classes = new Class[i_8_];
		    for (int i_13_ = 0; i_13_ < i_8_; i_13_++)
			var_classes[i_13_]
			    = Class504.method8315(strings[i_13_], 1995669633);
		    Class var_class
			= Class504.method8315(string_10_, 1123834376);
		    if (Class504.method8315(string, -1266203047)
			    .getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class504.method8315
					   (string, -1195708777)
					   .getDeclaredMethods();
		    Method[] methods_14_ = methods;
		    for (int i_15_ = 0; i_15_ < methods_14_.length; i_15_++) {
			Method method = methods_14_[i_15_];
			if (method.getName().equals(string_7_)) {
			    Class[] var_classes_16_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_16_.length) {
				boolean bool = true;
				for (int i_17_ = 0; i_17_ < var_classes.length;
				     i_17_++) {
				    if (var_classes[i_17_]
					!= var_classes_16_[i_17_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class525_sub27.aMethodArray10606[i_3_]
					= method;
			    }
			}
		    }
		    class525_sub27.aByteArrayArrayArray10613[i_3_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class525_sub27.anIntArray10609[i_3_] = -1;
	    } catch (SecurityException securityexception) {
		class525_sub27.anIntArray10609[i_3_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class525_sub27.anIntArray10609[i_3_] = -3;
	    } catch (Exception exception) {
		class525_sub27.anIntArray10609[i_3_] = -4;
	    } catch (Throwable throwable) {
		class525_sub27.anIntArray10609[i_3_] = -5;
	    }
	}
	Class89.aClass709_896.method14345(class525_sub27, (byte) 0);
    }
    
    static final void method17285(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]) == 1 ? 1 : 0,
	     (byte) -71);
	Class424.method6769(-1852050786);
	client.aClass507_11137.method8361((byte) 59).method10398(-1982314801);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
}
