package raymond.data;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadPool {

	protected static Logger logger = LoggerFactory.getLogger(ThreadPool.class);
	
	private static ExecutorService threadPool;
	
	static {
		logger.debug("init thread pool");
		threadPool = Executors.newFixedThreadPool(5);
	}	
	
	public ThreadPool() {
		
	}
	
	public static ExecutorService getThreadPool() {
		return threadPool;
	}
	
}
