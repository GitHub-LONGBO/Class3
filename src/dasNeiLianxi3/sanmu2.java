package dasNeiLianxi3;

/**
 * Created by asus on 2016/4/28.
 */import java.util.Scanner;
public class sanmu2 {

    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("�����뵥�ۣ�");
        double danJan = scanner.nextDouble();
        System.out.println("�����������");
        double count =  scanner.nextDouble();
        System.out.println("�������");
        double moneny = scanner.nextDouble();
        double  sum =   danJan*count;
      if (sum>=500){  double result  =  moneny-danJan*count*0.8;
        System.out.println("�ϼ�����"+sum+"  Ӧ���㣺"+result);
    }else{

          double result  =  moneny-danJan*count;
          System.out.println("�ϼ�����"+sum+"  Ӧ���㣺"+result);
      }
    }
}
