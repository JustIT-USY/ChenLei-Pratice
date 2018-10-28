package a;
import java.util.Random;
public class Text11 {
	
	public static void main(String[] args) {
	    double ave;//记录平均值
	    int num_1 = 0;//记录总分
	    int fail = 0;//记录不及格
	    int pass = 0;//记录及格
	    int[] x=new int[11];//记录人数
		for (int i = 1; i <=10; i++) {
			int student_num=new Random().nextInt(100);
			System.out.println(student_num);
			x[i]=student_num;
		}
	       for(int i = 1;i<=10;i++){	           
			   num_1 += x[i];
	           if (x[i] < 60){
	               fail ++;
	           }
	           else{
	               pass ++;
	           }
	       }
	       ave = (double) num_1 / 10;
	       System.out.println("及格人数有:" + pass);
	       System.out.println("不及格人数有:" + fail);
	       System.out.println("平均成绩为:" + ave);
	}
}
