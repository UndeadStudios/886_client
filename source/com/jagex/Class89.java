/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class89
{
    static Class709 aClass709_896 = new Class709();
    
    public static void method1668() {
	aClass709_896 = new Class709();
    }
    
    Class89() throws Throwable {
	throw new Error();
    }
    
    public static void method1669() {
	aClass709_896 = new Class709();
    }
    
    public static void method1670() {
	aClass709_896 = new Class709();
    }
    
    public static void method1671() {
	aClass709_896 = new Class709();
    }
    
    public static void method1672() {
	aClass709_896 = new Class709();
    }
    
    public static void method1673(Class525_Sub38_Sub2 class525_sub38_sub2) {
	Class525_Sub27 class525_sub27
	    = (Class525_Sub27) aClass709_896.method14372((short) -9224);
	if (class525_sub27 != null) {
	    int i = -1133521593 * class525_sub38_sub2.pos;
	    class525_sub38_sub2.method16605((-1305362359
					     * class525_sub27.anInt10612),
					    -730763948);
	    for (int i_0_ = 0; i_0_ < 1985284219 * class525_sub27.anInt10607;
		 i_0_++) {
		if (0 != class525_sub27.anIntArray10609[i_0_])
		    class525_sub38_sub2.method16735((class525_sub27
						     .anIntArray10609[i_0_]),
						    -1503640475);
		else {
		    try {
			int i_1_ = class525_sub27.anIntArray10608[i_0_];
			if (i_1_ == 0) {
			    Field field
				= class525_sub27.aFieldArray10610[i_0_];
			    int i_2_ = field.getInt(null);
			    class525_sub38_sub2.method16735(0, -1954794215);
			    class525_sub38_sub2.method16605(i_2_, -458982920);
			} else if (1 == i_1_) {
			    Field field
				= class525_sub27.aFieldArray10610[i_0_];
			    field.setInt(null,
					 class525_sub27.anIntArray10611[i_0_]);
			    class525_sub38_sub2.method16735(0, -1814883737);
			} else if (i_1_ == 2) {
			    Field field
				= class525_sub27.aFieldArray10610[i_0_];
			    int i_3_ = field.getModifiers();
			    class525_sub38_sub2.method16735(0, -1292354652);
			    class525_sub38_sub2.method16605(i_3_, -1383209705);
			}
			if (3 == i_1_) {
			    Method method
				= class525_sub27.aMethodArray10606[i_0_];
			    byte[][] is = (class525_sub27
					   .aByteArrayArrayArray10613[i_0_]);
			    Object[] objects = new Object[is.length];
			    for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_4_])));
				objects[i_4_] = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class525_sub38_sub2.method16735(0, -674966895);
			    else if (object instanceof Number) {
				class525_sub38_sub2.method16735(1,
								-1139465404);
				class525_sub38_sub2.method16609
				    (((Number) object).longValue());
			    } else if (object instanceof String) {
				class525_sub38_sub2.method16735(2, -274846972);
				class525_sub38_sub2
				    .method16700((String) object, -40011755);
			    } else
				class525_sub38_sub2.method16735(4,
								-1383532077);
			} else if (i_1_ == 4) {
			    Method method
				= class525_sub27.aMethodArray10606[i_0_];
			    int i_5_ = method.getModifiers();
			    class525_sub38_sub2.method16735(0, -1402307076);
			    class525_sub38_sub2.method16605(i_5_, -1045996283);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class525_sub38_sub2.method16735(-10, -754976099);
		    } catch (InvalidClassException invalidclassexception) {
			class525_sub38_sub2.method16735(-11, -953300784);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class525_sub38_sub2.method16735(-12, -223060113);
		    } catch (OptionalDataException optionaldataexception) {
			class525_sub38_sub2.method16735(-13, -1810794969);
		    } catch (IllegalAccessException illegalaccessexception) {
			class525_sub38_sub2.method16735(-14, -374177605);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class525_sub38_sub2.method16735(-15, -471380688);
		    } catch (InvocationTargetException invocationtargetexception) {
			class525_sub38_sub2.method16735(-16, -1756770346);
		    } catch (SecurityException securityexception) {
			class525_sub38_sub2.method16735(-17, -390003556);
		    } catch (IOException ioexception) {
			class525_sub38_sub2.method16735(-18, -368067934);
		    } catch (NullPointerException nullpointerexception) {
			class525_sub38_sub2.method16735(-19, -1908718900);
		    } catch (Exception exception) {
			class525_sub38_sub2.method16735(-20, -1931448799);
		    } catch (Throwable throwable) {
			class525_sub38_sub2.method16735(-21, -1243484147);
		    }
		}
	    }
	    class525_sub38_sub2.method16797(i, 947563517);
	    class525_sub27.method8755(-1933461091);
	}
    }
    
    static Class method1674(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static final void method1675(int i, int i_6_) {
	client.anIntArray11214 = new int[i];
	client.anIntArray11215 = new int[i];
	client.anIntArray11316 = new int[i];
	client.anIntArray11321 = new int[i];
	client.anIntArray11218 = new int[i];
    }
    
    public static void method1676(int i) {
	Class259.aClass200_2581.method3791((byte) 44);
	Class259.aClass200_2584.method3791((byte) -18);
	Class259.aClass200_2605.method3791((byte) 2);
	Class259.aClass200_2583.method3791((byte) -58);
    }
}
