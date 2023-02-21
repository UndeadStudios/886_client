/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import java.util.LinkedList;

public class TwitchWebcamDevice
{
    public String aString1148;
    public String aString1149;
    public int anInt1150;
    public int anInt1151;
    private LinkedList aLinkedList1152 = new LinkedList();
    
    public TwitchWebcamDevice(int i, int i_0_, String string,
			      String string_1_) {
	anInt1150 = -712184859 * i;
	anInt1151 = -987304411 * i_0_;
	aString1148 = string;
	aString1149 = string_1_;
    }
    
    public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
	aLinkedList1152.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_,
							     i_4_, i_5_));
    }
    
    public TwitchWebcamDeviceCapability method1752(int i) {
	if (i < 0 || i >= aLinkedList1152.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1152.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1753(int i) {
	for (int i_6_ = 0; i_6_ < aLinkedList1152.size(); i_6_++) {
	    if ((((TwitchWebcamDeviceCapability) aLinkedList1152.get(i_6_))
		 .anInt1160) * 1797575109
		== i)
		return ((TwitchWebcamDeviceCapability)
			aLinkedList1152.get(i_6_));
	}
	return null;
    }
    
    public int method1754() {
	return aLinkedList1152.size();
    }
    
    public TwitchWebcamDeviceCapability method1755(int i) {
	if (i < 0 || i >= aLinkedList1152.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1152.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1756(int i) {
	if (i < 0 || i >= aLinkedList1152.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1152.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1757(int i) {
	if (i < 0 || i >= aLinkedList1152.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1152.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1758(int i) {
	for (int i_7_ = 0; i_7_ < aLinkedList1152.size(); i_7_++) {
	    if ((((TwitchWebcamDeviceCapability) aLinkedList1152.get(i_7_))
		 .anInt1160) * 1797575109
		== i)
		return ((TwitchWebcamDeviceCapability)
			aLinkedList1152.get(i_7_));
	}
	return null;
    }
    
    public int method1759() {
	return aLinkedList1152.size();
    }
    
    public int method1760() {
	return aLinkedList1152.size();
    }
    
    public int method1761() {
	return aLinkedList1152.size();
    }
}
