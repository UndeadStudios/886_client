/* Class106_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class106_Sub1_Sub1 extends Class106_Sub1 implements Interface13
{
    Class200 aClass200_11397 = new Class200(64);
    JS5 aClass458_11398;
    
    public void method17962() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3809((byte) 13);
	}
    }
    
    public Interface12 method76(int i, int i_0_) {
	Class163_Sub2 class163_sub2;
	synchronized (aClass200_11397) {
	    class163_sub2
		= (Class163_Sub2) aClass200_11397.method3785((long) i);
	    if (class163_sub2 == null) {
		class163_sub2 = method17963(i, -1011351119);
		aClass200_11397.method3788(class163_sub2, (long) i);
	    }
	}
	return class163_sub2;
    }
    
    Class163_Sub2 method17963(int i, int i_1_) {
	byte[] is
	    = aClass458_11398.getFile((aClass453_8986.method7344(-928711003)
					  .anInt8553) * -1918643565,
					 i, 447402416);
	Class163_Sub2 class163_sub2 = new Class163_Sub2(aClass453_8986, i);
	if (is != null)
	    class163_sub2.method66(new RSBuffer(is), -412916016);
	return class163_sub2;
    }
    
    public void method17964(int i) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3791((byte) -25);
	}
    }
    
    public Interface12 method73(int i) {
	Class163_Sub2 class163_sub2;
	synchronized (aClass200_11397) {
	    class163_sub2
		= (Class163_Sub2) aClass200_11397.method3785((long) i);
	    if (class163_sub2 == null) {
		class163_sub2 = method17963(i, -1011351119);
		aClass200_11397.method3788(class163_sub2, (long) i);
	    }
	}
	return class163_sub2;
    }
    
    public Iterator iterator() {
	return new Class249(this);
    }
    
    public void method17965(int i) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3809((byte) 32);
	}
    }
    
    public int method72(int i) {
	return super.method72(838215714);
    }
    
    public void method17966() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3791((byte) -22);
	}
    }
    
    public void method17967(int i) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3805(i, 2087992498);
	}
    }
    
    public int method57() {
	return super.method72(-1629130449);
    }
    
    public int method75() {
	return super.method72(-1610415952);
    }
    
    public int method7() {
	return super.method72(533834496);
    }
    
    public int method8() {
	return super.method72(-1488393292);
    }
    
    Class163_Sub2 method17968(int i) {
	byte[] is = aClass458_11398.getFile(((aClass453_8986.method7344
						 (-1215580511).anInt8553)
						* -1918643565),
					       i, 805536165);
	Class163_Sub2 class163_sub2 = new Class163_Sub2(aClass453_8986, i);
	if (is != null)
	    class163_sub2.method66(new RSBuffer(is), -412916016);
	return class163_sub2;
    }
    
    public int method71() {
	return super.method72(-245632392);
    }
    
    public Interface12 method74(int i) {
	Class163_Sub2 class163_sub2;
	synchronized (aClass200_11397) {
	    class163_sub2
		= (Class163_Sub2) aClass200_11397.method3785((long) i);
	    if (class163_sub2 == null) {
		class163_sub2 = method17963(i, -1011351119);
		aClass200_11397.method3788(class163_sub2, (long) i);
	    }
	}
	return class163_sub2;
    }
    
    public void method17969(int i, int i_2_) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3805(i, 1875532849);
	}
    }
    
    public void method17970() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3791((byte) -37);
	}
    }
    
    public Class106_Sub1_Sub1(Class668 class668, Class453 class453,
			      Class666 class666, JS5 class458) {
	super(class668, class453, class666,
	      (null != class458
	       ? class458.method7487((class453.method7344(-656260011).anInt8553
				      * -1918643565),
				     2118028277)
	       : 0));
	aClass458_11398 = class458;
    }
    
    public int method77() {
	return super.method72(811528900);
    }
    
    public void method17971(int i) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3805(i, 2077852246);
	}
    }
    
    public void method17972(int i) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3805(i, 2092087741);
	}
    }
    
    public void method17973() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3809((byte) 127);
	}
    }
    
    public void method17974() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3809((byte) 82);
	}
    }
    
    public void method17975(int i) {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3805(i, 1972759939);
	}
    }
    
    public void method17976() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3809((byte) 68);
	}
    }
    
    public void method17977() {
	synchronized (aClass200_11397) {
	    aClass200_11397.method3809((byte) 91);
	}
    }
    
    public Iterator method17978() {
	return new Class249(this);
    }
    
    public Iterator method17979() {
	return new Class249(this);
    }
}
