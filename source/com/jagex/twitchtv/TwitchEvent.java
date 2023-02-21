/* TwitchEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import com.jagex.Class591;

public abstract class TwitchEvent
{
    public int eventType;
    
    public TwitchEvent(int i) {
	eventType = i;
    }
    
    public abstract void method6640(int[] is, long[] ls, Object[] objects);
    
    public abstract Class591 method6641();
    
    public abstract Class591 method6642();
    
    public abstract Class591 method6643();
    
    public abstract Class591 method6644();
    
    public abstract void method6645(int[] is, long[] ls, Object[] objects);
    
    public abstract void method6646(int[] is, long[] ls, Object[] objects);
    
    public abstract void method6647(int[] is, long[] ls, Object[] objects);
    
    public abstract void method6648(int[] is, long[] ls, Object[] objects);
}
