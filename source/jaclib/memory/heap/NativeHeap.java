/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap
{
    long peer;
    private int anInt1376;
    private boolean aBool1377;
    
    public NativeHeap(int i) {
	anInt1376 = -1441068139 * i;
	allocateHeap(1526851517 * anInt1376);
	aBool1377 = true;
    }
    
    synchronized boolean method1981() {
	return aBool1377;
    }
    
    public NativeHeapBuffer method1982(int i, boolean bool) {
	if (!aBool1377)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public synchronized void method1983() {
	if (aBool1377)
	    deallocateHeap();
	aBool1377 = false;
    }
    
    private native void allocateHeap(int i);
    
    private native void deallocateHeap();
    
    synchronized native int allocateBuffer(int i, boolean bool);
    
    synchronized native long getBufferAddress(int i);
    
    synchronized native void get(int i, byte[] is, int i_0_, int i_1_,
				 int i_2_);
    
    synchronized native void put(int i, byte[] is, int i_3_, int i_4_,
				 int i_5_);
    
    synchronized native void deallocateBuffer(int i);
    
    public synchronized native void copy(long l, long l_6_, int i);
    
    protected synchronized void finalize() throws Throwable {
	super.finalize();
	method1983();
    }
    
    protected synchronized void method1984() throws Throwable {
	super.finalize();
	method1983();
    }
    
    protected synchronized void method1985() throws Throwable {
	super.finalize();
	method1983();
    }
    
    protected synchronized void method1986() throws Throwable {
	super.finalize();
	method1983();
    }
    
    protected synchronized void method1987() throws Throwable {
	super.finalize();
	method1983();
    }
    
    synchronized boolean method1988() {
	return aBool1377;
    }
    
    public synchronized void method1989() {
	if (aBool1377)
	    deallocateHeap();
	aBool1377 = false;
    }
    
    public synchronized void method1990() {
	if (aBool1377)
	    deallocateHeap();
	aBool1377 = false;
    }
    
    public synchronized void method1991() {
	if (aBool1377)
	    deallocateHeap();
	aBool1377 = false;
    }
}
