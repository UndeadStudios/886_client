/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source
{
    private int anInt1127;
    public NativeHeap aNativeHeap1128;
    private int anInt1129;
    private boolean aBool1130 = true;
    
    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
	aNativeHeap1128 = nativeheap;
	anInt1129 = 234589245 * i;
	anInt1127 = -1491021907 * i_0_;
    }
    
    private final synchronized boolean method1741() {
	return aNativeHeap1128.method1981() && aBool1130;
    }
    
    public final long method2() {
	return aNativeHeap1128.getBufferAddress(anInt1129 * 1036020501);
    }
    
    public final int method1() {
	return -1277596635 * anInt1127;
    }
    
    public final synchronized void method3(byte[] is, int i, int i_1_,
					   int i_2_) {
	if (!method1741() | is == null | i < 0 | i_2_ + i > is.length
	    | i_1_ < 0 | i_2_ + i_1_ > -1277596635 * anInt1127)
	    throw new RuntimeException();
	aNativeHeap1128.put(anInt1129 * 1036020501, is, i, i_1_, i_2_);
    }
    
    public final synchronized void method1742() {
	if (method1741())
	    aNativeHeap1128.deallocateBuffer(1036020501 * anInt1129);
	aBool1130 = false;
    }
    
    protected final synchronized void finalize() throws Throwable {
	super.finalize();
	method1742();
    }
    
    public final synchronized void method4(byte[] is, int i, int i_3_,
					   int i_4_) {
	if (!method1741() | is == null | i < 0 | i_4_ + i > is.length
	    | i_3_ < 0 | i_4_ + i_3_ > -1277596635 * anInt1127)
	    throw new RuntimeException();
	aNativeHeap1128.put(anInt1129 * 1036020501, is, i, i_3_, i_4_);
    }
    
    public final synchronized void method5(byte[] is, int i, int i_5_,
					   int i_6_) {
	if (!method1741() | is == null | i < 0 | i_6_ + i > is.length
	    | i_5_ < 0 | i_6_ + i_5_ > -1277596635 * anInt1127)
	    throw new RuntimeException();
	aNativeHeap1128.put(anInt1129 * 1036020501, is, i, i_5_, i_6_);
    }
    
    public final synchronized void method6(byte[] is, int i, int i_7_,
					   int i_8_) {
	if (!method1741() | is == null | i < 0 | i_8_ + i > is.length
	    | i_7_ < 0 | i_8_ + i_7_ > -1277596635 * anInt1127)
	    throw new RuntimeException();
	aNativeHeap1128.put(anInt1129 * 1036020501, is, i, i_7_, i_8_);
    }
    
    protected final synchronized void method1743() throws Throwable {
	super.finalize();
	method1742();
    }
    
    protected final synchronized void method1744() throws Throwable {
	super.finalize();
	method1742();
    }
    
    protected final synchronized void method1745() throws Throwable {
	super.finalize();
	method1742();
    }
    
    protected final synchronized void method1746() throws Throwable {
	super.finalize();
	method1742();
    }
    
    public final int method7() {
	return -1277596635 * anInt1127;
    }
    
    public final int method8() {
	return -1277596635 * anInt1127;
    }
    
    public final long method9() {
	return aNativeHeap1128.getBufferAddress(anInt1129 * 1036020501);
    }
    
    public final long method10() {
	return aNativeHeap1128.getBufferAddress(anInt1129 * 1036020501);
    }
    
    private final synchronized boolean method1747() {
	return aNativeHeap1128.method1981() && aBool1130;
    }
    
    public final synchronized void method1748() {
	if (method1741())
	    aNativeHeap1128.deallocateBuffer(1036020501 * anInt1129);
	aBool1130 = false;
    }
}
