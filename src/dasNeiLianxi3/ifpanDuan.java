package dasNeiLianxi3;

/**
 * Created by asus on 2016/4/28.
 */
 import java.util.Scanner;
public class ifpanDuan {
    public  static  void   main(String[] args){
        Scanner scanner =  new Scanner(System.in);
            System.out.println("请输入成绩：");
        int achiment = scanner.nextInt();
        if (achiment>80){
            System.out.println("优秀");
        }else if (achiment>=70){
            System.out.println("良");
        }else if (achiment>=60){
            System.out.println("差");
        }else{
            System.out.println("不是我的学生");
        }


    }
}
