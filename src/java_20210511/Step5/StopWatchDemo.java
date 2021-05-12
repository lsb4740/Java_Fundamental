package java_20210511.Step5;

import java.util.*;

public class StopWatchDemo {
	public static Scanner keyboard = new Scanner(System.in);
	public static void run(StopWatch s) {
		s.execute();
	}

	public static StopWatch timeInfo() {
		System.out.print("밀리 세컨드 : 1번 \n나노 세컨드 : 2번 \n마이크로 세컨드 : 3번\n원하는 숫자를 입력하세요:");
		int num = keyboard.nextInt();
		if (1 <= num && num <= 3) {
			if (num == 1) {
				StopNanoWatch s = new StopNanoWatch();
				return s;
			} else if (num == 2) {
				StopMilliWatch s = new StopMilliWatch();
				return s;
			} else if (num == 3) {
				StopMicroWatch s = new StopMicroWatch();
				return s;
			}
		} else {
			System.out.println("잘못 입력하셨습니다");
//			run(timeInfo());
			System.exit(0);
		}
		return null;
	}

	public static void main(String[] args) {
		run(timeInfo());

//		StopNanoWatch s = new StopNanoWatch();
//		StopMilliWatch s = new StopMilliWatch();
//		StopMicroWatch s = new StopMicroWatch();
//		run(s);
	}
}
