/* Class106_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class106_Sub1_Sub2 extends Class106_Sub1 implements Interface13
{
    Class200 aClass200_11399 = new Class200(64);
    JS5 aClass458_11400;
    
    public int method57() {
	return super.method72(1148782235);
    }
    
    public Interface12 method76(int i, int i_0_) {
	Class163_Sub1 class163_sub1;
	synchronized (aClass200_11399) {
	    class163_sub1
		= (Class163_Sub1) aClass200_11399.method3785((long) i);
	    if (class163_sub1 == null) {
		class163_sub1 = method17985(i, -1698393340);
		aClass200_11399.method3788(class163_sub1, (long) i);
	    }
	}
	return class163_sub1;
    }
    
    public int method75() {
	return super.method72(-2023611537);
    }
    
    public int method71() {
	return super.method72(-1855638461);
    }
    
    public void method17980(int i, short i_1_) {
	synchronized (aClass200_11399) {
	    aClass200_11399.method3805(i, 2135194608);
	}
    }
    
    public void method17981(int i) {
	synchronized (aClass200_11399) {
	    aClass200_11399.method3809((byte) 115);
	}
    }
    
    public void method17982(int i) {
	synchronized (aClass200_11399) {
	    aClass200_11399.method3805(i, 1896658203);
	}
    }
    
    public Iterator method17983() {
	return new Class615(this);
    }
    
    public Interface12 method73(int i) {
	Class163_Sub1 class163_sub1;
	synchronized (aClass200_11399) {
	    class163_sub1
		= (Class163_Sub1) aClass200_11399.method3785((long) i);
	    if (class163_sub1 == null) {
		class163_sub1 = method17985(i, 1212188230);
		aClass200_11399.method3788(class163_sub1, (long) i);
	    }
	}
	return class163_sub1;
    }
    
    public Interface12 method74(int i) {
	Class163_Sub1 class163_sub1;
	synchronized (aClass200_11399) {
	    class163_sub1
		= (Class163_Sub1) aClass200_11399.method3785((long) i);
	    if (class163_sub1 == null) {
		class163_sub1 = method17985(i, -1551514485);
		aClass200_11399.method3788(class163_sub1, (long) i);
	    }
	}
	return class163_sub1;
    }
    
    public void method17984(byte i) {
	synchronized (aClass200_11399) {
	    aClass200_11399.method3791((byte) 78);
	}
    }
    
    public int method72(int i) {
	return super.method72(-490733801);
    }
    
    public int method7() {
	return super.method72(1843925602);
    }
    
    public int method8() {
	return super.method72(29958387);
    }
    
    public int method77() {
	return super.method72(877444615);
    }
    
    public Iterator iterator() {
	return new Class615(this);
    }
    
    Class163_Sub1 method17985(int i, int i_2_) {
	byte[] is = aClass458_11400.getFile(((aClass453_8986.method7344
						 (-1649976785).anInt8553)
						* -1918643565),
					       i, 1950163677);
	Class163_Sub1 class163_sub1 = new Class163_Sub1(aClass453_8986, i);
	if (is != null)
	    class163_sub1.method66(new RSBuffer(is), -412916016);
	return class163_sub1;
    }
    
    public Iterator method17986() {
	return new Class615(this);
    }
    
    Class163_Sub1 method17987(int i) {
	byte[] is = aClass458_11400.getFile(((aClass453_8986.method7344
						 (-1542336513).anInt8553)
						* -1918643565),
					       i, 763659919);
	Class163_Sub1 class163_sub1 = new Class163_Sub1(aClass453_8986, i);
	if (is != null)
	    class163_sub1.method66(new RSBuffer(is), -412916016);
	return class163_sub1;
    }
    
    Class163_Sub1 method17988(int i) {
	byte[] is = aClass458_11400.getFile(((aClass453_8986.method7344
						 (-1523480490).anInt8553)
						* -1918643565),
					       i, 1296027297);
	Class163_Sub1 class163_sub1 = new Class163_Sub1(aClass453_8986, i);
	if (is != null)
	    class163_sub1.method66(new RSBuffer(is), -412916016);
	return class163_sub1;
    }
    
    Class163_Sub1 method17989(int i) {
	byte[] is = aClass458_11400.getFile(((aClass453_8986.method7344
						 (-1028960747).anInt8553)
						* -1918643565),
					       i, 682954886);
	Class163_Sub1 class163_sub1 = new Class163_Sub1(aClass453_8986, i);
	if (is != null)
	    class163_sub1.method66(new RSBuffer(is), -412916016);
	return class163_sub1;
    }
    
    public Class106_Sub1_Sub2(Class668 class668, Class453 class453,
			      Class666 class666, JS5 class458) {
	super(class668, class453, class666,
	      null != class458 ? class458.getFileCountForArchive(((class453.method7344
						       (-1987980265).anInt8553)
						      * -1918643565),
						     2054384785) : 0);
	aClass458_11400 = class458;
    }
}
