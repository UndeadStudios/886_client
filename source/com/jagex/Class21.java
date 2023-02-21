/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class21 implements Iterator
{
    Class525 aClass525_209 = null;
    Class525 aClass525_210;
    Class10 aClass10_211;
    int anInt212;
    public static Class666 aClass666_213;
    
    public Class525 method810() {
	method814((byte) 64);
	return (Class525) next();
    }
    
    public void method811() {
	if (aClass525_209 == null)
	    throw new IllegalStateException();
	aClass525_209.method8755(-1933461091);
	aClass525_209 = null;
    }
    
    public Class525 method812(int i) {
	method814((byte) 55);
	return (Class525) next();
    }
    
    public Class21(Class10 class10) {
	aClass10_211 = class10;
	method814((byte) 53);
    }
    
    public boolean hasNext() {
	if (aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]
	    != aClass525_210)
	    return true;
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    if ((aClass10_211.aClass525Array141
		 [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112)
		!= aClass10_211.aClass525Array141[anInt212 * 1597363621 - 1]) {
		aClass525_210 = (aClass10_211.aClass525Array141
				 [1597363621 * anInt212 - 1].aClass525_7112);
		return true;
	    }
	    aClass525_210
		= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1];
	}
	return false;
    }
    
    public void remove() {
	if (aClass525_209 == null)
	    throw new IllegalStateException();
	aClass525_209.method8755(-1933461091);
	aClass525_209 = null;
    }
    
    public boolean method813() {
	if (aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]
	    != aClass525_210)
	    return true;
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    if ((aClass10_211.aClass525Array141
		 [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112)
		!= aClass10_211.aClass525Array141[anInt212 * 1597363621 - 1]) {
		aClass525_210 = (aClass10_211.aClass525Array141
				 [1597363621 * anInt212 - 1].aClass525_7112);
		return true;
	    }
	    aClass525_210
		= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1];
	}
	return false;
    }
    
    void method814(byte i) {
	aClass525_210 = aClass10_211.aClass525Array141[0].aClass525_7112;
	anInt212 = 664603181;
	aClass525_209 = null;
    }
    
    public boolean method815() {
	if (aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]
	    != aClass525_210)
	    return true;
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    if ((aClass10_211.aClass525Array141
		 [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112)
		!= aClass10_211.aClass525Array141[anInt212 * 1597363621 - 1]) {
		aClass525_210 = (aClass10_211.aClass525Array141
				 [1597363621 * anInt212 - 1].aClass525_7112);
		return true;
	    }
	    aClass525_210
		= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1];
	}
	return false;
    }
    
    public Object method816() {
	if (aClass525_210
	    != aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
	    Class525 class525 = aClass525_210;
	    aClass525_210 = class525.aClass525_7112;
	    aClass525_209 = class525;
	    return class525;
	}
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    Class525 class525
		= (aClass10_211.aClass525Array141
		   [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112);
	    if (class525
		!= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
		aClass525_210 = class525.aClass525_7112;
		aClass525_209 = class525;
		return class525;
	    }
	}
	return null;
    }
    
    public Object method817() {
	if (aClass525_210
	    != aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
	    Class525 class525 = aClass525_210;
	    aClass525_210 = class525.aClass525_7112;
	    aClass525_209 = class525;
	    return class525;
	}
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    Class525 class525
		= (aClass10_211.aClass525Array141
		   [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112);
	    if (class525
		!= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
		aClass525_210 = class525.aClass525_7112;
		aClass525_209 = class525;
		return class525;
	    }
	}
	return null;
    }
    
    public Object method818() {
	if (aClass525_210
	    != aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
	    Class525 class525 = aClass525_210;
	    aClass525_210 = class525.aClass525_7112;
	    aClass525_209 = class525;
	    return class525;
	}
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    Class525 class525
		= (aClass10_211.aClass525Array141
		   [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112);
	    if (class525
		!= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
		aClass525_210 = class525.aClass525_7112;
		aClass525_209 = class525;
		return class525;
	    }
	}
	return null;
    }
    
    void method819() {
	aClass525_210 = aClass10_211.aClass525Array141[0].aClass525_7112;
	anInt212 = 664603181;
	aClass525_209 = null;
    }
    
    public boolean method820() {
	if (aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]
	    != aClass525_210)
	    return true;
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    if ((aClass10_211.aClass525Array141
		 [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112)
		!= aClass10_211.aClass525Array141[anInt212 * 1597363621 - 1]) {
		aClass525_210 = (aClass10_211.aClass525Array141
				 [1597363621 * anInt212 - 1].aClass525_7112);
		return true;
	    }
	    aClass525_210
		= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1];
	}
	return false;
    }
    
    public Object next() {
	if (aClass525_210
	    != aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
	    Class525 class525 = aClass525_210;
	    aClass525_210 = class525.aClass525_7112;
	    aClass525_209 = class525;
	    return class525;
	}
	while (1597363621 * anInt212 < aClass10_211.anInt140 * -1391706339) {
	    Class525 class525
		= (aClass10_211.aClass525Array141
		   [(anInt212 += 664603181) * 1597363621 - 1].aClass525_7112);
	    if (class525
		!= aClass10_211.aClass525Array141[1597363621 * anInt212 - 1]) {
		aClass525_210 = class525.aClass525_7112;
		aClass525_209 = class525;
		return class525;
	    }
	}
	return null;
    }
    
    public Class525 method821() {
	method814((byte) 107);
	return (Class525) next();
    }
}
