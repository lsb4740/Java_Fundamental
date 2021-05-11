package java_20210511.Step5;


public class StopWatchDemo {
	public static void run(StopWatch s) {
		s.execute();
	}
	public static void main(String[] args) {
//		StopNanoWatch s = new StopNanoWatch();
//		StopMilliWatch s = new StopMilliWatch();
		StopMicroWatch s = new StopMicroWatch();
		run(s);
	}
}
