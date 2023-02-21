/* Class525_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.BitSet;

public class Class525_Sub25 extends Class525
{
    public byte aByte10597;
    boolean aBool10598 = true;
    boolean aBool10599;
    public int anInt10600 = 0;
    int[] anIntArray10601;
    long aLong10602;
    public Class341[] aClass341Array10603;
    public byte aByte10604;
    public String aString10605 = null;
    
    public int[] method16344() {
	if (anIntArray10601 == null) {
	    String[] strings = new String[1745938009 * anInt10600];
	    anIntArray10601 = new int[1745938009 * anInt10600];
	    for (int i = 0; i < anInt10600 * 1745938009; i++) {
		strings[i] = aClass341Array10603[i].aString3654;
		anIntArray10601[i] = i;
	    }
	    Class610.method10025(strings, anIntArray10601, (byte) -88);
	}
	return anIntArray10601;
    }
    
    public Class525_Sub25(RSBuffer class525_sub38) {
	method16349(class525_sub38, 1211803840);
    }
    
    public int[] method16345(byte i) {
	if (anIntArray10601 == null) {
	    String[] strings = new String[1745938009 * anInt10600];
	    anIntArray10601 = new int[1745938009 * anInt10600];
	    for (int i_0_ = 0; i_0_ < anInt10600 * 1745938009; i_0_++) {
		strings[i_0_] = aClass341Array10603[i_0_].aString3654;
		anIntArray10601[i_0_] = i_0_;
	    }
	    Class610.method10025(strings, anIntArray10601, (byte) 32);
	}
	return anIntArray10601;
    }
    
    void method16346(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(574113654);
	if (0 != (i & 0x1))
	    aBool10599 = true;
	if (0 != (i & 0x2))
	    aBool10598 = true;
	int i_1_ = 2;
	if ((i & 0x4) != 0)
	    i_1_ = class525_sub38.readUnsignedByte(858131216);
	aLong7113
	    = class525_sub38.method16603(-614138602) * 2638983450515767383L;
	aLong10602
	    = class525_sub38.method16603(-386781856) * -6538747259597446471L;
	aString10605 = class525_sub38.readString((byte) 69);
	class525_sub38.readUnsignedByte(1208085978);
	aByte10597 = class525_sub38.readByte(-1150098071);
	aByte10604 = class525_sub38.readByte(-1150098071);
	anInt10600 = class525_sub38.readUnsignedShort((byte) 18) * 1853358569;
	if (1745938009 * anInt10600 > 0) {
	    aClass341Array10603 = new Class341[anInt10600 * 1745938009];
	    for (int i_2_ = 0; i_2_ < anInt10600 * 1745938009; i_2_++) {
		Class341 class341 = new Class341();
		if (aBool10599)
		    class525_sub38.method16603(-37248443);
		if (aBool10598)
		    class341.aString3654
			= class525_sub38.readString((byte) -35);
		class341.aByte3652 = class525_sub38.readByte(-1150098071);
		class341.anInt3653
		    = class525_sub38.readUnsignedShort((byte) 100) * -225662749;
		if (i_1_ >= 3)
		    class525_sub38.readUnsignedByte(1804536165);
		aClass341Array10603[i_2_] = class341;
	    }
	}
    }
    
    void method16347(int i, int i_3_) {
	anInt10600 -= 1853358569;
	if (0 == 1745938009 * anInt10600)
	    aClass341Array10603 = null;
	else
	    System.arraycopy(aClass341Array10603, 1 + i, aClass341Array10603,
			     i, 1745938009 * anInt10600 - i);
	anIntArray10601 = null;
    }
    
    public int method16348(String string, int i) {
	for (int i_4_ = 0; i_4_ < anInt10600 * 1745938009; i_4_++) {
	    if (aClass341Array10603[i_4_].aString3654.equalsIgnoreCase(string))
		return i_4_;
	}
	return -1;
    }
    
    void method16349(RSBuffer class525_sub38, int i) {
	int i_5_ = class525_sub38.readUnsignedByte(1706834404);
	if (0 != (i_5_ & 0x1))
	    aBool10599 = true;
	if (0 != (i_5_ & 0x2))
	    aBool10598 = true;
	int i_6_ = 2;
	if ((i_5_ & 0x4) != 0)
	    i_6_ = class525_sub38.readUnsignedByte(1616178075);
	aLong7113
	    = class525_sub38.method16603(-262144374) * 2638983450515767383L;
	aLong10602
	    = class525_sub38.method16603(-452484796) * -6538747259597446471L;
	aString10605 = class525_sub38.readString((byte) -110);
	class525_sub38.readUnsignedByte(333722328);
	aByte10597 = class525_sub38.readByte(-1150098071);
	aByte10604 = class525_sub38.readByte(-1150098071);
	anInt10600 = class525_sub38.readUnsignedShort((byte) 33) * 1853358569;
	if (1745938009 * anInt10600 > 0) {
	    aClass341Array10603 = new Class341[anInt10600 * 1745938009];
	    for (int i_7_ = 0; i_7_ < anInt10600 * 1745938009; i_7_++) {
		Class341 class341 = new Class341();
		if (aBool10599)
		    class525_sub38.method16603(-356472602);
		if (aBool10598)
		    class341.aString3654
			= class525_sub38.readString((byte) -30);
		class341.aByte3652 = class525_sub38.readByte(-1150098071);
		class341.anInt3653
		    = class525_sub38.readUnsignedShort((byte) 87) * -225662749;
		if (i_6_ >= 3)
		    class525_sub38.readUnsignedByte(131936752);
		aClass341Array10603[i_7_] = class341;
	    }
	}
    }
    
    void method16350(Class341 class341, byte i) {
	if (aClass341Array10603 == null
	    || 1745938009 * anInt10600 >= aClass341Array10603.length)
	    method16357(1745938009 * anInt10600 + 5, -189550685);
	aClass341Array10603[(anInt10600 += 1853358569) * 1745938009 - 1]
	    = class341;
	anIntArray10601 = null;
    }
    
    void method16351(int i) {
	if (aClass341Array10603 != null)
	    System.arraycopy(aClass341Array10603, 0,
			     aClass341Array10603 = new Class341[i], 0,
			     anInt10600 * 1745938009);
	else
	    aClass341Array10603 = new Class341[i];
    }
    
    static {
	new BitSet(65536);
    }
    
    void method16352(int i) {
	anInt10600 -= 1853358569;
	if (0 == 1745938009 * anInt10600)
	    aClass341Array10603 = null;
	else
	    System.arraycopy(aClass341Array10603, 1 + i, aClass341Array10603,
			     i, 1745938009 * anInt10600 - i);
	anIntArray10601 = null;
    }
    
    public int[] method16353() {
	if (anIntArray10601 == null) {
	    String[] strings = new String[1745938009 * anInt10600];
	    anIntArray10601 = new int[1745938009 * anInt10600];
	    for (int i = 0; i < anInt10600 * 1745938009; i++) {
		strings[i] = aClass341Array10603[i].aString3654;
		anIntArray10601[i] = i;
	    }
	    Class610.method10025(strings, anIntArray10601, (byte) 3);
	}
	return anIntArray10601;
    }
    
    public int[] method16354() {
	if (anIntArray10601 == null) {
	    String[] strings = new String[1745938009 * anInt10600];
	    anIntArray10601 = new int[1745938009 * anInt10600];
	    for (int i = 0; i < anInt10600 * 1745938009; i++) {
		strings[i] = aClass341Array10603[i].aString3654;
		anIntArray10601[i] = i;
	    }
	    Class610.method10025(strings, anIntArray10601, (byte) -3);
	}
	return anIntArray10601;
    }
    
    void method16355(int i) {
	anInt10600 -= 1853358569;
	if (0 == 1745938009 * anInt10600)
	    aClass341Array10603 = null;
	else
	    System.arraycopy(aClass341Array10603, 1 + i, aClass341Array10603,
			     i, 1745938009 * anInt10600 - i);
	anIntArray10601 = null;
    }
    
    void method16356(int i) {
	anInt10600 -= 1853358569;
	if (0 == 1745938009 * anInt10600)
	    aClass341Array10603 = null;
	else
	    System.arraycopy(aClass341Array10603, 1 + i, aClass341Array10603,
			     i, 1745938009 * anInt10600 - i);
	anIntArray10601 = null;
    }
    
    void method16357(int i, int i_8_) {
	if (aClass341Array10603 != null)
	    System.arraycopy(aClass341Array10603, 0,
			     aClass341Array10603 = new Class341[i], 0,
			     anInt10600 * 1745938009);
	else
	    aClass341Array10603 = new Class341[i];
    }
    
    public int method16358(String string) {
	for (int i = 0; i < anInt10600 * 1745938009; i++) {
	    if (aClass341Array10603[i].aString3654.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
    
    public int method16359(String string) {
	for (int i = 0; i < anInt10600 * 1745938009; i++) {
	    if (aClass341Array10603[i].aString3654.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
    
    void method16360(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1046313029);
	if (0 != (i & 0x1))
	    aBool10599 = true;
	if (0 != (i & 0x2))
	    aBool10598 = true;
	int i_9_ = 2;
	if ((i & 0x4) != 0)
	    i_9_ = class525_sub38.readUnsignedByte(1838816025);
	aLong7113
	    = class525_sub38.method16603(-305118142) * 2638983450515767383L;
	aLong10602
	    = class525_sub38.method16603(-1810808138) * -6538747259597446471L;
	aString10605 = class525_sub38.readString((byte) 98);
	class525_sub38.readUnsignedByte(1843061211);
	aByte10597 = class525_sub38.readByte(-1150098071);
	aByte10604 = class525_sub38.readByte(-1150098071);
	anInt10600 = class525_sub38.readUnsignedShort((byte) 44) * 1853358569;
	if (1745938009 * anInt10600 > 0) {
	    aClass341Array10603 = new Class341[anInt10600 * 1745938009];
	    for (int i_10_ = 0; i_10_ < anInt10600 * 1745938009; i_10_++) {
		Class341 class341 = new Class341();
		if (aBool10599)
		    class525_sub38.method16603(-1493582695);
		if (aBool10598)
		    class341.aString3654
			= class525_sub38.readString((byte) 5);
		class341.aByte3652 = class525_sub38.readByte(-1150098071);
		class341.anInt3653
		    = class525_sub38.readUnsignedShort((byte) 17) * -225662749;
		if (i_9_ >= 3)
		    class525_sub38.readUnsignedByte(1248266102);
		aClass341Array10603[i_10_] = class341;
	    }
	}
    }
    
    void method16361(int i) {
	if (aClass341Array10603 != null)
	    System.arraycopy(aClass341Array10603, 0,
			     aClass341Array10603 = new Class341[i], 0,
			     anInt10600 * 1745938009);
	else
	    aClass341Array10603 = new Class341[i];
    }
    
    void method16362(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1817690199);
	if (0 != (i & 0x1))
	    aBool10599 = true;
	if (0 != (i & 0x2))
	    aBool10598 = true;
	int i_11_ = 2;
	if ((i & 0x4) != 0)
	    i_11_ = class525_sub38.readUnsignedByte(705758365);
	aLong7113
	    = class525_sub38.method16603(-1279421614) * 2638983450515767383L;
	aLong10602
	    = class525_sub38.method16603(-1619266601) * -6538747259597446471L;
	aString10605 = class525_sub38.readString((byte) -75);
	class525_sub38.readUnsignedByte(1900322201);
	aByte10597 = class525_sub38.readByte(-1150098071);
	aByte10604 = class525_sub38.readByte(-1150098071);
	anInt10600 = class525_sub38.readUnsignedShort((byte) 27) * 1853358569;
	if (1745938009 * anInt10600 > 0) {
	    aClass341Array10603 = new Class341[anInt10600 * 1745938009];
	    for (int i_12_ = 0; i_12_ < anInt10600 * 1745938009; i_12_++) {
		Class341 class341 = new Class341();
		if (aBool10599)
		    class525_sub38.method16603(-2039449842);
		if (aBool10598)
		    class341.aString3654
			= class525_sub38.readString((byte) 18);
		class341.aByte3652 = class525_sub38.readByte(-1150098071);
		class341.anInt3653
		    = class525_sub38.readUnsignedShort((byte) 23) * -225662749;
		if (i_11_ >= 3)
		    class525_sub38.readUnsignedByte(1757644789);
		aClass341Array10603[i_12_] = class341;
	    }
	}
    }
    
    void method16363(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1375157883);
	if (0 != (i & 0x1))
	    aBool10599 = true;
	if (0 != (i & 0x2))
	    aBool10598 = true;
	int i_13_ = 2;
	if ((i & 0x4) != 0)
	    i_13_ = class525_sub38.readUnsignedByte(448974516);
	aLong7113
	    = class525_sub38.method16603(-1359305147) * 2638983450515767383L;
	aLong10602
	    = class525_sub38.method16603(-95479998) * -6538747259597446471L;
	aString10605 = class525_sub38.readString((byte) 50);
	class525_sub38.readUnsignedByte(2099464081);
	aByte10597 = class525_sub38.readByte(-1150098071);
	aByte10604 = class525_sub38.readByte(-1150098071);
	anInt10600 = class525_sub38.readUnsignedShort((byte) 44) * 1853358569;
	if (1745938009 * anInt10600 > 0) {
	    aClass341Array10603 = new Class341[anInt10600 * 1745938009];
	    for (int i_14_ = 0; i_14_ < anInt10600 * 1745938009; i_14_++) {
		Class341 class341 = new Class341();
		if (aBool10599)
		    class525_sub38.method16603(-479231772);
		if (aBool10598)
		    class341.aString3654
			= class525_sub38.readString((byte) -24);
		class341.aByte3652 = class525_sub38.readByte(-1150098071);
		class341.anInt3653
		    = class525_sub38.readUnsignedShort((byte) 34) * -225662749;
		if (i_13_ >= 3)
		    class525_sub38.readUnsignedByte(498339256);
		aClass341Array10603[i_14_] = class341;
	    }
	}
    }
}
