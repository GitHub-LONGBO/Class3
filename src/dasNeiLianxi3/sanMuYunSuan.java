package dasNeiLianxi3;/** * Created by asus on 2016/4/28. */ import java.util.Scanner;public class sanMuYunSuan {    public static  void main (String[]   args){        Scanner scanner = new Scanner(System.in);        System.out.println("请输入年份: ");            int year = scanner.nextInt();            boolean str1 = year%400==0;                String str = str1?"闰年":"不是闰年";        System.out.println(str);        System.out.println("我是天才");    }}