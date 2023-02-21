/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class278
{
    String aString2987;
    boolean aBool2988 = false;
    LinkedList aLinkedList2989 = new LinkedList();
    static final int anInt2990 = 10;
    
    public final boolean method5116(String string, int i, int i_0_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class188.method3683(string.charAt(0), 2118768080)) {
	    Class285 class285 = method5121(string, (byte) 8);
	    if (class285 != null)
		aLinkedList2989.remove(class285);
	    aLinkedList2989.add(new Class285(string, i, i_0_));
	    method5125(1211423052);
	    return true;
	}
	return false;
    }
    
    public boolean method5117(byte i) {
	return aBool2988;
    }
    
    public void method5118(boolean bool, int i) {
	aBool2988 = bool;
    }
    
    public int method5119(int i) {
	return aLinkedList2989.size();
    }
    
    public boolean method5120() {
	return aBool2988;
    }
    
    final Class285 method5121(String string, byte i) {
	Iterator iterator = aLinkedList2989.iterator();
	while (iterator.hasNext()) {
	    Class285 class285 = (Class285) iterator.next();
	    if (class285.aString3141.equals(string))
		return class285;
	}
	return null;
    }
    
    public final boolean method5122(String string, int i, int i_1_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class188.method3683(string.charAt(0), 1806442433)) {
	    Class285 class285 = method5121(string, (byte) 8);
	    if (class285 != null)
		aLinkedList2989.remove(class285);
	    aLinkedList2989.add(new Class285(string, i, i_1_));
	    method5125(365672923);
	    return true;
	}
	return false;
    }
    
    public final void method5123(int i) {
	aLinkedList2989.clear();
	aString2987 = "";
    }
    
    public final String method5124(String string, byte i) {
	if (aLinkedList2989.isEmpty())
	    return string;
	StringBuilder stringbuilder = new StringBuilder(string.length());
	int i_2_ = string.length();
	boolean bool = false;
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    boolean bool_4_ = false;
	    char c = string.charAt(i_3_);
	    if (bool) {
		if (c == '>')
		    bool = false;
	    } else if ('<' == c)
		bool = true;
	    else if (aString2987.indexOf(c) != -1) {
		for (int i_5_ = 0; i_5_ < aLinkedList2989.size(); i_5_++) {
		    Class285 class285 = (Class285) aLinkedList2989.get(i_5_);
		    int i_6_ = class285.aString3141.length();
		    if (i_3_ <= i_2_ - i_6_
			&& string.substring(i_3_, i_3_ + i_6_)
			       .equals(class285.aString3141)) {
			String string_7_;
			if (class285.anInt3140 * 992495423 > 0)
			    string_7_
				= (String.format
				   ("<sprite=%d,%d>",
				    (new Object[]
				     { Integer.valueOf(-1045095201
						       * class285.anInt3139),
				       Integer.valueOf(992495423
						       * (class285
							  .anInt3140)) })));
			else
			    string_7_
				= String.format("<sprite=%d>",
						(new Object[]
						 { Integer.valueOf
						   (-1045095201
						    * class285.anInt3139) }));
			stringbuilder.append(string_7_);
			bool_4_ = true;
			i_3_ += i_6_ - 1;
			break;
		    }
		}
	    }
	    if (!bool_4_)
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    final void method5125(int i) {
	aString2987 = "";
	for (int i_8_ = 0; i_8_ < aLinkedList2989.size(); i_8_++) {
	    Class285 class285 = (Class285) aLinkedList2989.get(i_8_);
	    char c = class285.aString3141.charAt(0);
	    if (aString2987.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class278 class278_9_ = this;
		class278_9_.aString2987
		    = stringbuilder.append(class278_9_.aString2987).append
			  (c).toString();
	    }
	}
    }
    
    public boolean method5126() {
	return aBool2988;
    }
    
    public static final boolean method5127(char c) {
	return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c
		|| c >= '[' && c <= '_' || c >= '{');
    }
    
    public final void method5128(String string, byte i) {
	Iterator iterator = aLinkedList2989.iterator();
	while (iterator.hasNext()) {
	    Class285 class285 = (Class285) iterator.next();
	    if (class285.aString3141.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    public boolean method5129() {
	return aBool2988;
    }
    
    public void method5130(boolean bool) {
	aBool2988 = bool;
    }
    
    public final boolean method5131(String string, int i, int i_10_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class188.method3683(string.charAt(0), 1298825066)) {
	    Class285 class285 = method5121(string, (byte) 8);
	    if (class285 != null)
		aLinkedList2989.remove(class285);
	    aLinkedList2989.add(new Class285(string, i, i_10_));
	    method5125(2097248922);
	    return true;
	}
	return false;
    }
    
    public int method5132() {
	return aLinkedList2989.size();
    }
    
    public static final boolean method5133(char c) {
	return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c
		|| c >= '[' && c <= '_' || c >= '{');
    }
    
    public void method5134(boolean bool) {
	aBool2988 = bool;
    }
    
    public static final boolean method5135(char c) {
	return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c
		|| c >= '[' && c <= '_' || c >= '{');
    }
    
    public final String method5136(String string) {
	if (aLinkedList2989.isEmpty())
	    return string;
	StringBuilder stringbuilder = new StringBuilder(string.length());
	int i = string.length();
	boolean bool = false;
	for (int i_11_ = 0; i_11_ < i; i_11_++) {
	    boolean bool_12_ = false;
	    char c = string.charAt(i_11_);
	    if (bool) {
		if (c == '>')
		    bool = false;
	    } else if ('<' == c)
		bool = true;
	    else if (aString2987.indexOf(c) != -1) {
		for (int i_13_ = 0; i_13_ < aLinkedList2989.size(); i_13_++) {
		    Class285 class285 = (Class285) aLinkedList2989.get(i_13_);
		    int i_14_ = class285.aString3141.length();
		    if (i_11_ <= i - i_14_
			&& string.substring(i_11_, i_11_ + i_14_)
			       .equals(class285.aString3141)) {
			String string_15_;
			if (class285.anInt3140 * 992495423 > 0)
			    string_15_
				= (String.format
				   ("<sprite=%d,%d>",
				    (new Object[]
				     { Integer.valueOf(-1045095201
						       * class285.anInt3139),
				       Integer.valueOf(992495423
						       * (class285
							  .anInt3140)) })));
			else
			    string_15_
				= String.format("<sprite=%d>",
						(new Object[]
						 { Integer.valueOf
						   (-1045095201
						    * class285.anInt3139) }));
			stringbuilder.append(string_15_);
			bool_12_ = true;
			i_11_ += i_14_ - 1;
			break;
		    }
		}
	    }
	    if (!bool_12_)
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    public boolean method5137() {
	return aBool2988;
    }
    
    public final boolean method5138(String string, int i, int i_16_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class188.method3683(string.charAt(0), 1211204182)) {
	    Class285 class285 = method5121(string, (byte) 8);
	    if (class285 != null)
		aLinkedList2989.remove(class285);
	    aLinkedList2989.add(new Class285(string, i, i_16_));
	    method5125(862015741);
	    return true;
	}
	return false;
    }
    
    public final boolean method5139(String string, int i, int i_17_,
				    int i_18_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class188.method3683(string.charAt(0), 1466137470)) {
	    Class285 class285 = method5121(string, (byte) 8);
	    if (class285 != null)
		aLinkedList2989.remove(class285);
	    aLinkedList2989.add(new Class285(string, i, i_17_));
	    method5125(462435517);
	    return true;
	}
	return false;
    }
    
    public final void method5140(String string) {
	Iterator iterator = aLinkedList2989.iterator();
	while (iterator.hasNext()) {
	    Class285 class285 = (Class285) iterator.next();
	    if (class285.aString3141.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    public final void method5141() {
	aLinkedList2989.clear();
	aString2987 = "";
    }
    
    public final void method5142() {
	aLinkedList2989.clear();
	aString2987 = "";
    }
    
    final void method5143() {
	aString2987 = "";
	for (int i = 0; i < aLinkedList2989.size(); i++) {
	    Class285 class285 = (Class285) aLinkedList2989.get(i);
	    char c = class285.aString3141.charAt(0);
	    if (aString2987.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class278 class278_19_ = this;
		class278_19_.aString2987
		    = stringbuilder.append(class278_19_.aString2987).append
			  (c).toString();
	    }
	}
    }
    
    final void method5144() {
	aString2987 = "";
	for (int i = 0; i < aLinkedList2989.size(); i++) {
	    Class285 class285 = (Class285) aLinkedList2989.get(i);
	    char c = class285.aString3141.charAt(0);
	    if (aString2987.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class278 class278_20_ = this;
		class278_20_.aString2987
		    = stringbuilder.append(class278_20_.aString2987).append
			  (c).toString();
	    }
	}
    }
    
    static final void method5145(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	Class684 class684
	    = ((Class684)
	       Class539.method8888(Class684.method11241(-1333367202),
				   (class683.anIntArray8661
				    [class683.anInt8662 * 501271953]),
				   1908505851));
	Class600 class600 = new Class600(class683.anIntArray8661
					 [1 + 501271953 * class683.anInt8662]);
	if (class600.anInt7859 * 1801040619 == -1)
	    throw new RuntimeException("");
	if (class684 != Class684.aClass684_8667
	    && Class684.aClass684_8668 != class684
	    && class684 != Class684.aClass684_8669)
	    throw new RuntimeException("");
	if (null != client.aClass96_11085) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4343,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16664(class600.anInt7860 * 1429253007, -574773923);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16735(class684.method80(), -2036779088);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16666(-1227002079 * class600.anInt7858, -223364585);
	    client.aClass96_11085.method1794(class525_sub15, (short) 12635);
	}
    }
    
    static final void method5146(Class683 class683, int i) {
	int i_21_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_21_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_21_ >> 16];
	Class594.method9830(class259, class245, class683, -2095589525);
    }
    
    static final void method5147(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class492.method7990(class259, class245, class683, -380649282);
    }
    
    static Class531_Sub4 method5148(int i) {
	Class531_Sub4 class531_sub4
	    = ((Class531_Sub4)
	       Class531_Sub4.aClass708_10322.method14327(1713964113));
	if (class531_sub4 != null) {
	    Class531_Sub4.anInt10323 -= -1536986157;
	    return class531_sub4;
	}
	return new Class531_Sub4();
    }
}
