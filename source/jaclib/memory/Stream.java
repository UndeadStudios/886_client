/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream
{
    private Buffer aBuffer1153;
    private int anInt1154;
    private int anInt1155;
    private int anInt1156;
    private byte[] aByteArray1157;
    private static boolean aBool1158 = getLSB(-65536) == -1;
    
    public Stream() {
	this(4096);
    }
    
    private Stream(int i) {
	aByteArray1157 = new byte[i];
    }
    
    public Stream(Buffer buffer) {
	this(buffer, 0, buffer.method1());
    }
    
    private Stream(Buffer buffer, int i, int i_0_) {
	this(buffer.method1() < 4096 ? buffer.method1() : 4096);
	method1762(buffer, i, i_0_);
    }
    
    private void method1762(Buffer buffer, int i, int i_1_) {
	method1768();
	aBuffer1153 = buffer;
	anInt1155 = i * 460680103;
	anInt1154 = 548610617 * (i + i_1_);
	if (-1503515639 * anInt1154 > buffer.method1())
	    throw new RuntimeException();
    }
    
    public int method1763() {
	return -472149915 * anInt1156 + anInt1155 * 1145867287;
    }
    
    public void method1764(int i) {
	method1768();
	anInt1155 = 460680103 * i;
    }
    
    public void method1765(int i) {
	if (anInt1156 * -472149915 >= aByteArray1157.length)
	    method1768();
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
    }
    
    public void method1766(float f) {
	if (anInt1156 * -472149915 + 3 >= aByteArray1157.length)
	    method1768();
	int i = floatToRawIntBits(f);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 24);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 16);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 8);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
    }
    
    public void method1767(float f) {
	if (anInt1156 * -472149915 + 3 >= aByteArray1157.length)
	    method1768();
	int i = floatToRawIntBits(f);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 8);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 16);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method1768() {
	if (-472149915 * anInt1156 > 0) {
	    if (anInt1155 * 1145867287 + anInt1156 * -472149915
		> -1503515639 * anInt1154)
		throw new RuntimeException();
	    aBuffer1153.method3(aByteArray1157, 0, anInt1155 * 1145867287,
				anInt1156 * -472149915);
	    anInt1155 += anInt1156 * 247359715;
	    anInt1156 = 0;
	}
    }
    
    public static final boolean method1769() {
	return aBool1158;
    }
    
    public static native int floatToRawIntBits(float f);
    
    private static final native byte getLSB(int i);
    
    private void method1770(Buffer buffer, int i, int i_2_) {
	method1768();
	aBuffer1153 = buffer;
	anInt1155 = i * 460680103;
	anInt1154 = 548610617 * (i + i_2_);
	if (-1503515639 * anInt1154 > buffer.method1())
	    throw new RuntimeException();
    }
    
    private void method1771(Buffer buffer, int i, int i_3_) {
	method1768();
	aBuffer1153 = buffer;
	anInt1155 = i * 460680103;
	anInt1154 = 548610617 * (i + i_3_);
	if (-1503515639 * anInt1154 > buffer.method1())
	    throw new RuntimeException();
    }
    
    private void method1772(Buffer buffer, int i, int i_4_) {
	method1768();
	aBuffer1153 = buffer;
	anInt1155 = i * 460680103;
	anInt1154 = 548610617 * (i + i_4_);
	if (-1503515639 * anInt1154 > buffer.method1())
	    throw new RuntimeException();
    }
    
    public int method1773() {
	return -472149915 * anInt1156 + anInt1155 * 1145867287;
    }
    
    public int method1774() {
	return -472149915 * anInt1156 + anInt1155 * 1145867287;
    }
    
    public int method1775() {
	return -472149915 * anInt1156 + anInt1155 * 1145867287;
    }
    
    public int method1776() {
	return -472149915 * anInt1156 + anInt1155 * 1145867287;
    }
    
    public int method1777() {
	return -472149915 * anInt1156 + anInt1155 * 1145867287;
    }
    
    public void method1778(int i) {
	method1768();
	anInt1155 = 460680103 * i;
    }
    
    public void method1779(int i) {
	method1768();
	anInt1155 = 460680103 * i;
    }
    
    public void method1780(int i) {
	method1768();
	anInt1155 = 460680103 * i;
    }
    
    public void method1781(int i) {
	if (anInt1156 * -472149915 >= aByteArray1157.length)
	    method1768();
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
    }
    
    public void method1782(float f) {
	if (anInt1156 * -472149915 + 3 >= aByteArray1157.length)
	    method1768();
	int i = floatToRawIntBits(f);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 24);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 16);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 8);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
    }
    
    public void method1783(float f) {
	if (anInt1156 * -472149915 + 3 >= aByteArray1157.length)
	    method1768();
	int i = floatToRawIntBits(f);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 24);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 16);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 8);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
    }
    
    public void method1784(float f) {
	if (anInt1156 * -472149915 + 3 >= aByteArray1157.length)
	    method1768();
	int i = floatToRawIntBits(f);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 24);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 16);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1]
	    = (byte) (i >> 8);
	aByteArray1157[(anInt1156 += 27566445) * -472149915 - 1] = (byte) i;
    }
    
    public void method1785() {
	if (-472149915 * anInt1156 > 0) {
	    if (anInt1155 * 1145867287 + anInt1156 * -472149915
		> -1503515639 * anInt1154)
		throw new RuntimeException();
	    aBuffer1153.method3(aByteArray1157, 0, anInt1155 * 1145867287,
				anInt1156 * -472149915);
	    anInt1155 += anInt1156 * 247359715;
	    anInt1156 = 0;
	}
    }
    
    public void method1786() {
	if (-472149915 * anInt1156 > 0) {
	    if (anInt1155 * 1145867287 + anInt1156 * -472149915
		> -1503515639 * anInt1154)
		throw new RuntimeException();
	    aBuffer1153.method3(aByteArray1157, 0, anInt1155 * 1145867287,
				anInt1156 * -472149915);
	    anInt1155 += anInt1156 * 247359715;
	    anInt1156 = 0;
	}
    }
    
    public static final boolean method1787() {
	return aBool1158;
    }
    
    public static final boolean method1788() {
	return aBool1158;
    }
    
    public static final boolean method1789() {
	return aBool1158;
    }
    
    public static final boolean method1790() {
	return aBool1158;
    }
}
