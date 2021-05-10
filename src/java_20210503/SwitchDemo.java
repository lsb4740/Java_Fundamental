package java_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
//		Run Configurations => Arguments => Program Arguments (여기에 숫자 입력)
		int month = Integer.parseInt(args[0]);
		String season = " ";
		switch (month) {
//		Switch문의 가장 마지막은 break가 필요없다 / Default가 필요없는 것이 아니라 
		case 12 : season = "겨울"; break;
		case 1 : season = "겨울"; break;
		case 2 : season = "겨울"; break;
		case 3 : season = "봄"; break;
		case 4 : season = "봄"; break;
		case 5 : season = "봄"; break;
		case 6 : season = "여름"; break;
		case 7 : season = "여름"; break;
		case 8 : season = "여름"; break;
		case 9 : season = "가을"; break;
		case 10 : season = "가을"; break;
		case 11 : season = "가을"; break;
		default : season = "없는 계절";
		
//		이렇게 중복되는 값들은 생략이 가능하다.
//		case 12 :
//		case 1 :
//		case 2 : season = "겨울"; break;
//		case 3 : 
//		case 4 : 
//		case 5 : season = "봄"; break;
//		case 6 :
//		case 7 : 
//		case 8 : season = "여름"; break;
//		case 9 : 
//		case 10 :
//		case 11 : season = "가을"; break;
//		default : season = "없는 계절";
//		
//		동일한 Output이 나오면 밑에 처럼 사용이 가능하다.
//		원래는 각 case에 하나씩만 사용이 가능하지만, Java가 업그레이드되면서 복수의 값을 넣는것이 가능하다.
//		원칙은 케이스에 하나의 중복되지 않는 값을 넣어야한다.
//		case 12,1,2 : season = "겨울"; break;
//		case 3,4,5 : season = "봄"; break;
//		case 6,7,8 : season = "여름"; break;
//		case 9,10,11 : season = "가을"; break;
//		default : season = "없는 계절";
//		
		}
		System.out.println(month + "월은 "+ season + "입니다");
	}

}
