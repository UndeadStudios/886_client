/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class86
{
    static Calendar aCalendar888;
    static String[][] aStringArrayArray889
	= { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug",
	      "Sep", "Okt", "Nov", "Dez" },
	    { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil",
	      "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
	    { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set",
	      "out", "nov", "dez" },
	    { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep",
	      "okt", "nov", "dec" },
	    { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep",
	      "oct", "nov", "dic" } };
    static Calendar aCalendar890 = Calendar.getInstance();
    
    static String method1623(long l, int i) {
	Class677.method11134(l);
	int i_0_ = aCalendar890.get(5);
	int i_1_ = aCalendar890.get(2) + 1;
	int i_2_ = aCalendar890.get(1);
	return new StringBuilder().append(Integer.toString(i_0_ / 10)).append
		   (i_0_ % 10).append
		   ("/").append
		   (i_1_ / 10).append
		   (i_1_ % 10).append
		   ("/").append
		   (i_2_ % 100 / 10).append
		   (i_2_ % 10).toString();
    }
    
    static void method1624(long l) {
	aCalendar890.setTime(new Date(l));
    }
    
    public static String method1625(long l, int i) {
	Class677.method11134(l);
	int i_3_ = aCalendar890.get(5);
	int i_4_ = aCalendar890.get(2);
	int i_5_ = aCalendar890.get(1);
	if (3 == i)
	    return Class540.method8892(l, i, (short) -4891);
	return new StringBuilder().append(Integer.toString(i_3_ / 10)).append
		   (i_3_ % 10).append
		   ("-").append
		   (aStringArrayArray889[i][i_4_]).append
		   ("-").append
		   (i_5_).toString();
    }
    
    static void method1626(long l) {
	aCalendar890.setTime(new Date(l));
    }
    
    public static String method1627(long l, int i) {
	Class677.method11134(l);
	int i_6_ = aCalendar890.get(5);
	int i_7_ = aCalendar890.get(2);
	int i_8_ = aCalendar890.get(1);
	if (3 == i)
	    return Class540.method8892(l, i, (short) -20448);
	return new StringBuilder().append(Integer.toString(i_6_ / 10)).append
		   (i_6_ % 10).append
		   ("-").append
		   (aStringArrayArray889[i][i_7_]).append
		   ("-").append
		   (i_8_).toString();
    }
    
    public static String method1628(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class61.method1371(l);
	    calendar = aCalendar888;
	} else {
	    Class677.method11134(l);
	    calendar = aCalendar890;
	}
	int i_9_ = calendar.get(5);
	int i_10_ = calendar.get(2);
	int i_11_ = calendar.get(1);
	int i_12_ = calendar.get(11);
	int i_13_ = calendar.get(12);
	if (i == 3)
	    return Class85.method1622(l, i, bool, (byte) 117);
	return new StringBuilder().append(Integer.toString(i_9_ / 10)).append
		   (i_9_ % 10).append
		   ("-").append
		   (aStringArrayArray889[i][i_10_]).append
		   ("-").append
		   (i_11_).append
		   (" ").append
		   (i_12_ / 10).append
		   (i_12_ % 10).append
		   (":").append
		   (i_13_ / 10).append
		   (i_13_ % 10).toString();
    }
    
    static String method1629(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class61.method1371(l);
	    calendar = aCalendar888;
	} else {
	    Class677.method11134(l);
	    calendar = aCalendar890;
	}
	int i_14_ = calendar.get(5);
	int i_15_ = calendar.get(2) + 1;
	int i_16_ = calendar.get(1);
	int i_17_ = calendar.get(11);
	int i_18_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_14_ / 10)).append
		   (i_14_ % 10).append
		   ("/").append
		   (i_15_ / 10).append
		   (i_15_ % 10).append
		   ("/").append
		   (i_16_ % 100 / 10).append
		   (i_16_ % 10).append
		   (" ").append
		   (i_17_ / 10).append
		   (i_17_ % 10).append
		   (":").append
		   (i_18_ / 10).append
		   (i_18_ % 10).toString();
    }
    
    static String method1630(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class61.method1371(l);
	    calendar = aCalendar888;
	} else {
	    Class677.method11134(l);
	    calendar = aCalendar890;
	}
	int i_19_ = calendar.get(5);
	int i_20_ = calendar.get(2) + 1;
	int i_21_ = calendar.get(1);
	int i_22_ = calendar.get(11);
	int i_23_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_19_ / 10)).append
		   (i_19_ % 10).append
		   ("/").append
		   (i_20_ / 10).append
		   (i_20_ % 10).append
		   ("/").append
		   (i_21_ % 100 / 10).append
		   (i_21_ % 10).append
		   (" ").append
		   (i_22_ / 10).append
		   (i_22_ % 10).append
		   (":").append
		   (i_23_ / 10).append
		   (i_23_ % 10).toString();
    }
    
    public static int method1631(long l) {
	Class677.method11134(l);
	return aCalendar890.get(1);
    }
    
    public static String method1632(long l, int i) {
	Class677.method11134(l);
	int i_24_ = aCalendar890.get(11);
	int i_25_ = aCalendar890.get(12);
	int i_26_ = aCalendar890.get(13);
	return new StringBuilder().append(Integer.toString(i_24_ / 10)).append
		   (i_24_ % 10).append
		   (":").append
		   (i_25_ / 10).append
		   (i_25_ % 10).append
		   (":").append
		   (i_26_ / 10).append
		   (i_26_ % 10).toString();
    }
    
    static void method1633(long l) {
	aCalendar888.setTime(new Date(l));
    }
    
    public static String method1634(long l, int i) {
	Class677.method11134(l);
	int i_27_ = aCalendar890.get(11);
	int i_28_ = aCalendar890.get(12);
	int i_29_ = aCalendar890.get(13);
	return new StringBuilder().append(Integer.toString(i_27_ / 10)).append
		   (i_27_ % 10).append
		   (":").append
		   (i_28_ / 10).append
		   (i_28_ % 10).append
		   (":").append
		   (i_29_ / 10).append
		   (i_29_ % 10).toString();
    }
    
    public static int[] method1635(int i) {
	int[] is = new int[3];
	Class677.method11134(Class77.method1565(i, (byte) 100));
	is[0] = aCalendar890.get(5);
	is[1] = aCalendar890.get(2);
	is[2] = aCalendar890.get(1);
	return is;
    }
    
    static void method1636(long l) {
	aCalendar888.setTime(new Date(l));
    }
    
    static void method1637(long l) {
	aCalendar888.setTime(new Date(l));
    }
    
    static {
	aCalendar888 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
    
    static void method1638(long l) {
	aCalendar890.setTime(new Date(l));
    }
    
    Class86() throws Throwable {
	throw new Error();
    }
    
    public static int method1639(long l) {
	Class677.method11134(l);
	return aCalendar890.get(1);
    }
    
    public static int[] method1640(int i) {
	int[] is = new int[3];
	Class677.method11134(Class77.method1565(i, (byte) 2));
	is[0] = aCalendar890.get(5);
	is[1] = aCalendar890.get(2);
	is[2] = aCalendar890.get(1);
	return is;
    }
    
    public static int[] method1641(int i) {
	int[] is = new int[3];
	Class677.method11134(Class77.method1565(i, (byte) 19));
	is[0] = aCalendar890.get(5);
	is[1] = aCalendar890.get(2);
	is[2] = aCalendar890.get(1);
	return is;
    }
    
    public static int method1642(long l) {
	Class677.method11134(l);
	return aCalendar890.get(1);
    }
    
    public static long method1643(int i) {
	return (long) (i + 11745) * 86400000L;
    }
    
    public static int method1644(long l) {
	Class677.method11134(l);
	return aCalendar890.get(1);
    }
    
    public static long method1645(int i, int i_30_, int i_31_, int i_32_,
				  int i_33_, int i_34_) {
	aCalendar888.clear();
	aCalendar888.set(i_34_, i_33_, i_32_, i_31_, i_30_, i);
	return aCalendar888.getTime().getTime();
    }
    
    public static String method1646(long l, int i) {
	Class677.method11134(l);
	int i_35_ = aCalendar890.get(11);
	int i_36_ = aCalendar890.get(12);
	int i_37_ = aCalendar890.get(13);
	return new StringBuilder().append(Integer.toString(i_35_ / 10)).append
		   (i_35_ % 10).append
		   (":").append
		   (i_36_ / 10).append
		   (i_36_ % 10).append
		   (":").append
		   (i_37_ / 10).append
		   (i_37_ % 10).toString();
    }
    
    public static String method1647(long l, int i) {
	Class677.method11134(l);
	int i_38_ = aCalendar890.get(5);
	int i_39_ = aCalendar890.get(2);
	int i_40_ = aCalendar890.get(1);
	if (3 == i)
	    return Class540.method8892(l, i, (short) 16164);
	return new StringBuilder().append(Integer.toString(i_38_ / 10)).append
		   (i_38_ % 10).append
		   ("-").append
		   (aStringArrayArray889[i][i_39_]).append
		   ("-").append
		   (i_40_).toString();
    }
    
    static final void method1648(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static Class294 method1649(int i, byte i_41_) {
	if (i == Class294.aClass294_3242.anInt3241 * 2119762053)
	    return Class294.aClass294_3242;
	if (2119762053 * Class294.aClass294_3240.anInt3241 == i)
	    return Class294.aClass294_3240;
	return null;
    }
    
    static final void method1650(Class683 class683, byte i) {
	int i_42_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class453_Sub3.aClass309_Sub1_10316.method5530(i_42_, -1413545728);
    }
}
