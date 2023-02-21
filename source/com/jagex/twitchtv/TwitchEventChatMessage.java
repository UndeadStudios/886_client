/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import com.jagex.Class591;

public class TwitchEventChatMessage extends TwitchEvent
{
    public String name;
    public String message;
    public int nameColourARGB;
    public int modes;
    public int subscriptions;
    public boolean isAction;
    
    public TwitchEventChatMessage(int i, String string, String string_0_,
				  int i_1_, int i_2_, int i_3_, boolean bool) {
	super(i);
	name = string;
	message = string_0_;
	nameColourARGB = i_1_;
	modes = i_2_;
	subscriptions = i_3_;
	isAction = bool;
    }
    
    public void method6640(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public Class591 method6641() {
	return Class591.aClass591_7819;
    }
    
    public Class591 method6642() {
	return Class591.aClass591_7819;
    }
    
    public Class591 method6643() {
	return Class591.aClass591_7819;
    }
    
    public Class591 method6644() {
	return Class591.aClass591_7819;
    }
    
    public void method6645(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public void method6646(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public void method6647(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public void method6648(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
}
