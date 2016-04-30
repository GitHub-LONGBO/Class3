package dasNeiLianxi3;

/**
 * Created by asus on 2016/4/29.
 */import  java.util.Scanner;
public class SwitchCase {
    public static void  main(String[]  args){
        Scanner  scanner =  new Scanner(System.in);
        System.out.println("inCount: ");
        int umberlla =  scanner.nextInt();
        switch(umberlla){
            case 1:
                System.out.println("liSi");
                break;
            case 2:
                System.out.println("zhangSan");
                break;
            case 3:
                System.out.println("schoolmaster");
            case 4:
                System.out.println("ZhongYuGaoDinGl");
            default:
                System.out.println("outMan");
        }

    }

}
