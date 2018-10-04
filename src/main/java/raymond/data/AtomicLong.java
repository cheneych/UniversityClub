package raymond.data;

@SuppressWarnings("serial")
public class AtomicLong extends java.util.concurrent.atomic.AtomicLong {
	
	public AtomicLong(int i) {
		super(i);
	}

	/**
	 * {@link #getAndIncrement()} and resets if >= to a threshold.
	 * @return
	 */
	public long getNext() {
		long next = getAndIncrement();
		if (next >= 1000000) {
			this.set(0);
		}
		return next;
	}
	
}
