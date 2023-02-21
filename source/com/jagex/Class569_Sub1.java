/* Class569_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class569_Sub1 extends Class569
    implements MouseListener, MouseMotionListener, MouseWheelListener
{
    Class709 aClass709_10657;
    static final int anInt10658 = 2;
    static final int anInt10659 = 4;
    int anInt10660;
    int anInt10661;
    int anInt10662;
    boolean aBool10663;
    int anInt10664;
    static final int anInt10665 = 1;
    Class709 aClass709_10666 = new Class709();
    int anInt10667;
    int anInt10668;
    Component aComponent10669;
    
    public synchronized void mouseMoved(MouseEvent mouseevent) {
	method16491(mouseevent.getX(), mouseevent.getY(), -1144015104);
    }
    
    void method16488(Component component, int i) {
	method16489((byte) -126);
	aComponent10669 = component;
	aComponent10669.addMouseListener(this);
	aComponent10669.addMouseMotionListener(this);
	aComponent10669.addMouseWheelListener(this);
    }
    
    void method16489(byte i) {
	if (aComponent10669 != null) {
	    aComponent10669.removeMouseWheelListener(this);
	    aComponent10669.removeMouseMotionListener(this);
	    aComponent10669.removeMouseListener(this);
	    aComponent10669 = null;
	    anInt10662 = 0;
	    anInt10661 = 0;
	    anInt10660 = 0;
	    anInt10667 = 0;
	    anInt10668 = 0;
	    anInt10664 = 0;
	    aClass709_10666 = null;
	    aClass709_10657 = null;
	}
    }
    
    void method16490(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
	Class525_Sub41_Sub1 class525_sub41_sub1
	    = Class350.method6158(i, i_0_, i_1_, Class251.method4508((byte) 8),
				  i_2_, (byte) 87);
	aClass709_10657.method14345(class525_sub41_sub1, (byte) 0);
    }
    
    void method16491(int i, int i_4_, int i_5_) {
	anInt10664 = i * 130069663;
	anInt10668 = i_4_ * -835414503;
	if (aBool10663)
	    method16490(-1, i, i_4_, 0, (byte) 0);
    }
    
    public boolean method9503() {
	return (2056873955 * anInt10662 & 0x4) != 0;
    }
    
    public synchronized void method9510(short i) {
	anInt10660 = anInt10664 * -616050539;
	anInt10661 = anInt10668 * 811663667;
	anInt10662 = anInt10667 * 746188933;
	Class709 class709 = aClass709_10666;
	aClass709_10666 = aClass709_10657;
	aClass709_10657 = class709;
	aClass709_10657.method14344(-2106398070);
    }
    
    public boolean method9494(byte i) {
	return (anInt10662 * 2056873955 & 0x1) != 0;
    }
    
    public boolean method9501(int i) {
	return (2056873955 * anInt10662 & 0x2) != 0;
    }
    
    public int method9498(int i) {
	return anInt10660 * 1566480163;
    }
    
    public int method9511() {
	return anInt10660 * 1566480163;
    }
    
    void method16492(Component component) {
	method16489((byte) -72);
	aComponent10669 = component;
	aComponent10669.addMouseListener(this);
	aComponent10669.addMouseMotionListener(this);
	aComponent10669.addMouseWheelListener(this);
    }
    
    public void method9506(int i) {
	method16489((byte) -75);
    }
    
    int method16493(MouseEvent mouseevent, int i) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    public int method9499(int i) {
	return 1229075251 * anInt10661;
    }
    
    public synchronized void mouseExited(MouseEvent mouseevent) {
	method16491(mouseevent.getX(), mouseevent.getY(), -1144015104);
    }
    
    public synchronized void mouseReleased(MouseEvent mouseevent) {
	int i = method16493(mouseevent, -942880963);
	if ((anInt10667 * -1587361553 & i) == 0)
	    i = anInt10667 * -1587361553;
	if ((i & 0x1) != 0)
	    method16490(3, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), (byte) 0);
	if (0 != (i & 0x4))
	    method16490(5, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), (byte) 0);
	if (0 != (i & 0x2))
	    method16490(4, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), (byte) 0);
	anInt10667
	    = 1296655887 * (anInt10667 * -1587361553 & (i ^ 0xffffffff));
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public synchronized void mouseEntered(MouseEvent mouseevent) {
	method16491(mouseevent.getX(), mouseevent.getY(), -1144015104);
    }
    
    public boolean method9496(int i) {
	return (2056873955 * anInt10662 & 0x4) != 0;
    }
    
    public synchronized void mouseDragged(MouseEvent mouseevent) {
	method16491(mouseevent.getX(), mouseevent.getY(), -1144015104);
    }
    
    public Class525_Sub41 method9500(byte i) {
	return (Class525_Sub41) aClass709_10666.method14423(-1390246972);
    }
    
    Class569_Sub1(Component component, boolean bool) {
	aClass709_10657 = new Class709();
	method16488(component, 1312407340);
	aBool10663 = bool;
    }
    
    public boolean method9507() {
	return (anInt10662 * 2056873955 & 0x1) != 0;
    }
    
    public boolean method9508() {
	return (2056873955 * anInt10662 & 0x2) != 0;
    }
    
    public boolean method9509() {
	return (2056873955 * anInt10662 & 0x2) != 0;
    }
    
    void method16494(int i, int i_6_, int i_7_, int i_8_) {
	Class525_Sub41_Sub1 class525_sub41_sub1
	    = Class350.method6158(i, i_6_, i_7_, Class251.method4508((byte) 8),
				  i_8_, (byte) 2);
	aClass709_10657.method14345(class525_sub41_sub1, (byte) 0);
    }
    
    public int method9515() {
	return anInt10660 * 1566480163;
    }
    
    public int method9514() {
	return 1229075251 * anInt10661;
    }
    
    public Class525_Sub41 method9517() {
	return (Class525_Sub41) aClass709_10666.method14423(-1124589423);
    }
    
    public int method9513() {
	return 1229075251 * anInt10661;
    }
    
    public synchronized void mousePressed(MouseEvent mouseevent) {
	int i = method16493(mouseevent, 113371913);
	if (i == 1)
	    method16490(0, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), (byte) 0);
	else if (4 == i)
	    method16490(2, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), (byte) 0);
	else if (i == 2)
	    method16490(1, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), (byte) 0);
	anInt10667 = 1296655887 * (-1587361553 * anInt10667 | i);
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public int method9492() {
	return 1229075251 * anInt10661;
    }
    
    public Class525_Sub41 method9516() {
	return (Class525_Sub41) aClass709_10666.method14423(-2130352755);
    }
    
    public synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public Class525_Sub41 method9518() {
	return (Class525_Sub41) aClass709_10666.method14423(-2060774319);
    }
    
    public void method9519() {
	method16489((byte) -44);
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
	int i = mousewheelevent.getX();
	int i_9_ = mousewheelevent.getY();
	int i_10_ = mousewheelevent.getWheelRotation();
	method16490(6, i, i_9_, i_10_, (byte) 0);
	mousewheelevent.consume();
    }
    
    void method16495() {
	if (aComponent10669 != null) {
	    aComponent10669.removeMouseWheelListener(this);
	    aComponent10669.removeMouseMotionListener(this);
	    aComponent10669.removeMouseListener(this);
	    aComponent10669 = null;
	    anInt10662 = 0;
	    anInt10661 = 0;
	    anInt10660 = 0;
	    anInt10667 = 0;
	    anInt10668 = 0;
	    anInt10664 = 0;
	    aClass709_10666 = null;
	    aClass709_10657 = null;
	}
    }
    
    public int method9512() {
	return 1229075251 * anInt10661;
    }
    
    int method16496(MouseEvent mouseevent) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
}
