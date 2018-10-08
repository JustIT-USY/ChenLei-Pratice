/*
	键盘录入月份的值，输出对应的季节。
*/
import java.util.Scanner;

class IfTest3 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请你输入一个月份:");
		int month = sc.nextInt();
		
		//第三种格式实现即可
		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month == 1) {
			System.out.println("冬季");
		}else if(month == 2) {
			System.out.println("冬季");
		}else if(month == 3) {
			System.out.println("春季");
		}else if(month == 4) {
			System.out.println("春季");
		}else if(month == 5) {
			System.out.println("春季");
		}else if(month == 6) {
			System.out.println("夏季");
		}else if(month == 7) {
			System.out.println("夏季");
		}else if(month == 8) {
			System.out.println("夏季");
		}else if(month == 9) {
			System.out.println("秋季");
		}else if(month == 10) {
			System.out.println("秋季");
		}else if(month == 11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
		
		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month==3 || month==4 || month==5) {
			System.out.println("春季");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("夏季");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
		

		if(month<1 || month>12) {
			System.out.println("你输入的月份有误");
		}else if(month>=3 && month<=5) {
			System.out.println("春季");
		}else if(month>=6 && month<=8) {
			System.out.println("夏季");
		}else if(month>=9 && month<=11) {
			System.out.println("秋季");
		}else {
			System.out.println("冬季");
		}
		System.out.println("--------------");
	}
}
