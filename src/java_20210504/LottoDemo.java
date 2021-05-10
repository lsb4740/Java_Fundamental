package java_20210504;
public class LottoDemo {
	public static int[] getLotto(int x) {
		System.out.printf("\t로또 예상번호 : ");
		int[] lottoNumber = new int[x];
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int) (Math.random() * 45+ 1);
			for (int j = 0; j < i; j++) {
				if (lottoNumber[i] == lottoNumber[j]) {
					i--;
					break;
				}
			}
		}
		return lottoNumber;
	}
	public static void ascendLotto(int[]lottoNumber) {
		int numberStorage;
		int x = lottoNumber.length-1;
		for (int i = 0; i < x; i++) {
			for (int j = i; j < x; j++) {
				if (lottoNumber[i] > lottoNumber[j]) {
					numberStorage = lottoNumber[i];
					lottoNumber[i] = lottoNumber[j];
					lottoNumber[j] = numberStorage;
				}
			}
			System.out.print(lottoNumber[i] + " ");
		}
//		보너스 숫자 구하기 (중복 X & 오름차순 X)
		System.out.println("+ "+lottoNumber[x]);
	}
	public static void main(String[] args) {
		int num = 7;
		ascendLotto(getLotto(num));
	}
}
