package a;

import java.util.Random;

public class CallName {
	
	public static void main(String[] args) {
		System.out.println("-----------随机点名器-----------");
		// 创建一个可以存储多个同学姓名学号的容器（数组）
		String[][] students={{"陈磊","1710720041"},{"张永桥","1711610054"},{"王浩","1510711031"}};
		// 总览全班同学姓名		 
		printStudentName(students);
		// 随机点名	
		int num=students.length;
        int scope=students.length;
		int[] testArr=getRandomArrayByIndex(num, scope);
        System.out.println("------------------------------");
        
        for (int j = 1; j <=students.length;) {
        	for (int i = 0; i < students.length; i++) {
				String randomName = students[testArr[i]][0]+"-"+students[testArr[i]][1];
				System.out.println("第"+(i+1)+"个被点到名的同学是 :" + randomName);
			}
			break;
		}
        
	}

	public static void printStudentName(String[][] students) {
		for (int i = 0; i < students.length; i++) {
			String name = students[i][0];
			String number = students[i][1];
			System.out.println("第" + (i + 1) + "个学生姓名学号：" + name+'-'+number);
		}
	}
	
	public static int[] getRandomArrayByIndex(int num,int scope){
		
        //1.获取scope范围内的所有数值，并存到数组中
        int[] randomArray=new int[scope];
        for(int i=0;i<randomArray.length;i++){
            randomArray[i]=i;
        }
        
        //2.从数组random中取数据，取过后的数改为-1 
        int[] numArray=new int[num];//存储num个随机数
        int i=0;
        while(i<numArray.length){
            Random ran = new Random();
    		int index = ran.nextInt(scope);
            if(randomArray[index]!=-1){
                numArray[i]=randomArray[index];
                randomArray[index]=-1;
                i++;
            }
        }
        return numArray;
    }
	
}