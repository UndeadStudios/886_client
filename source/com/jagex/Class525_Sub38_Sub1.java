/* Class525_Sub38_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Stream;

public class Class525_Sub38_Sub1 extends RSBuffer
{
    void method18262(float f) {
	int i = Stream.floatToRawIntBits(f);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
    }
    
    void method18263(float f) {
	int i = Stream.floatToRawIntBits(f);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    Class525_Sub38_Sub1(int i) {
	super(i);
    }
    
    void method18264(float f) {
	int i = Stream.floatToRawIntBits(f);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
    
    void method18265(float f) {
	int i = Stream.floatToRawIntBits(f);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 24);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 16);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) (i >> 8);
	buffer[(pos += 339428471) * -1133521593 - 1]
	    = (byte) i;
    }
}
