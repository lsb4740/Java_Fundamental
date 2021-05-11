package java_20210511.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		s1.startTime = System.currentTimeMillis();
		for(long i =0; i<30_000_000_000l;i++) {
			
		}
		s1.endTime = System.currentTimeMillis();
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %,.3f",elapsedTime);
	}
}
