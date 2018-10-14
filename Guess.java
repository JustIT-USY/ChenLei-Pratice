package 猜数游戏;
import java.util.Random;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入1-100之间的数据：");
		
		//创建Random类变量
		Random ran = new Random();
		int ranNumber = ran.nextInt(100)+1;
		
		//创建Scanner类变量
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int number = in.nextInt();
			if(number>ranNumber) {
				System.out.println("您猜测得数字较大，请继续猜测！");
			}else if(number<ranNumber) {
				System.out.println("您猜测得数字较小，请继续猜测！");
			}else {
				System.out.println("恭喜你，猜对了！");
				System.out.println("游戏结束！");
				break;
			}
		}

	}

}
