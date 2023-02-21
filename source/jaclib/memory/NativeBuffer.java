/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
    private int anInt2273 = 2130826579;
    private long aLong2274;
    
    protected NativeBuffer() {
	/* empty */
    }
    
    public final int method1() {
	return -989148891 * anInt2273;
    }
    
    public final long method2() {
	return -2019307727421030433L * aLong2274;
    }
    
    public void method3(byte[] is, int i, int i_0_, int i_1_) {
	if (-2019307727421030433L * aLong2274 == 0L | is == null | i < 0
	    | i_1_ + i > is.length | i_0_ < 0
	    | i_0_ + i_1_ > -989148891 * anInt2273)
	    throw new RuntimeException();
	put(-2019307727421030433L * aLong2274, is, i, i_0_, i_1_);
    }
    
    private final native void get(long l, byte[] is, int i, int i_2_,
				  int i_3_);
    
    private final native void put(long l, byte[] is, int i, int i_4_,
				  int i_5_);
    
    public void method4(byte[] is, int i, int i_6_, int i_7_) {
	if (-2019307727421030433L * aLong2274 == 0L | is == null | i < 0
	    | i_7_ + i > is.length | i_6_ < 0
	    | i_6_ + i_7_ > -989148891 * anInt2273)
	    throw new RuntimeException();
	put(-2019307727421030433L * aLong2274, is, i, i_6_, i_7_);
    }
    
    public void method5(byte[] is, int i, int i_8_, int i_9_) {
	if (-2019307727421030433L * aLong2274 == 0L | is == null | i < 0
	    | i_9_ + i > is.length | i_8_ < 0
	    | i_8_ + i_9_ > -989148891 * anInt2273)
	    throw new RuntimeException();
	put(-2019307727421030433L * aLong2274, is, i, i_8_, i_9_);
    }
    
    public void method6(byte[] is, int i, int i_10_, int i_11_) {
	if (-2019307727421030433L * aLong2274 == 0L | is == null | i < 0
	    | i_11_ + i > is.length | i_10_ < 0
	    | i_10_ + i_11_ > -989148891 * anInt2273)
	    throw new RuntimeException();
	put(-2019307727421030433L * aLong2274, is, i, i_10_, i_11_);
    }
    
    public final int method7() {
	return -989148891 * anInt2273;
    }
    
    public final int method8() {
	return -989148891 * anInt2273;
    }
    
    public final long method9() {
	return -2019307727421030433L * aLong2274;
    }
    
    public final long method10() {
	return -2019307727421030433L * aLong2274;
    }
}
