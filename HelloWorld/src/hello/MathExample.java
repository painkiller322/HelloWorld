package hello;

public class MathExample {
	public static void main(String[] args) {
		//int a=75;
		int a=(int) (Math.random()*100); //무작위
		a=a/10;
		switch(a) { //해당값과 일치해야 함. break랑 같이 사용
		case 9: //순서대로 내려감.
			System.out.println(a+" A등급");
			break; //해당하면 출력하고 빠져나가라
		case 8:
			System.out.println(a+" B등급");
			break;
		case 7:
			System.out.println(a+" C등급");
			break;
		case 6:
			System.out.println(a+" D등급");
			break;
		default:
			System.out.println(a+" F등급");
				
		}
		//System.out.println(b);
//		if(a>=90) {
//			System.out.println(a + " A등급");
//		}else if(a>=80) {
//			System.out.println(a + " B등급");
//		}else if(a>=70) {
//			System.out.println(a + " C등급");
//		}else if(a>=60) {
//			System.out.println(a + " D등급");
//		}else {
//			System.out.println(a + " F등급");
//		}
	}
}
