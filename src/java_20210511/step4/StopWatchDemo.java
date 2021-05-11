package java_20210511.step4;


public class StopWatchDemo {
	public static void run(StopMilliWatch s1) {
		s1.startTime = System.currentTimeMillis();
		for(long i =0; i<30_000_000_000l;i++) {
			
		}
		s1.endTime = System.currentTimeMillis();
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %,.3f",elapsedTime);		
	}
	public static void run(StopNanoWatch s1) {
		s1.startTime = System.nanoTime();
		for(long i =0; i<30_000_000_000l;i++) {
			
		}
		s1.endTime = System.nanoTime();
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %,.9f",elapsedTime);		
	}
	public static void main(String[] args) {
//		StopNanoWatch s1 = new StopNanoWatch();
		StopMilliWatch s1 = new StopMilliWatch();
	}
}
