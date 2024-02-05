package day04;

import java.util.Scanner;

public class IfTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入税前工资：");
        int initMoney = sc.nextInt();
        // 三险一金比率
        double sxyj = 0.1;
        // 起征金额
        int startMoney = 5000;
        // 扣除三险一金后
        double discountMoney = initMoney * (1 - sxyj);
        double countMoney = discountMoney - startMoney;
        double needCost;

        if (discountMoney > startMoney) {
            if(countMoney <= 3000){
                needCost = countMoney*0.03;

            }else if(countMoney <= 12000){
                needCost = (3000- 0 )*0.03 + (countMoney - 3000)*0.1;

            }else if(countMoney <= 25000){
                needCost = (3000- 0 )*0.03 + (12000 - 3000)*0.1 + (countMoney - 12000)*0.2;
                
            }else if(countMoney <= 35000){
                needCost = (3000- 0 )*0.03 + (12000 - 3000)*0.1+ (25000 - 12000)*0.2 + (countMoney - 25000)*0.25;
                
            }else if(countMoney <= 55000){
                needCost = (3000- 0 )*0.03 + (12000 - 3000)*0.1+ (25000 - 12000)*0.2 + (35000 - 25000)*0.25 + (countMoney - 35000)*0.3;
                
            }else if(countMoney <= 8000){
                needCost = (3000- 0 )*0.03 + (12000 - 3000)*0.1+ (25000 - 12000)*0.2 + (35000 - 25000)*0.25 + (55000 - 35000)*0.3 + (countMoney - 55000)*0.35;

            }else{
                needCost = (3000- 0 )*0.03 + (12000 - 3000)*0.1+ (25000 - 12000)*0.2 + (35000 - 25000)*0.25 + (55000 - 35000)*0.3+ (80000 - 55000)*0.35+ (countMoney - 80000)*0.45;

            }

        } else {
            System.out.println("不用交税");
            needCost = 0 ;
        }
        System.out.println("需要交税：" + needCost);
        

        //second
        double c1= 0,c2= 0,c3= 0,c4= 0,c5= 0,c6= 0,c7 = 0;
        int i1= 0,i2= 0,i3= 0,i4= 0,i5= 0,i6= 0,i7 = 0;
        double needCost2;
        
        if (discountMoney > startMoney) {
            if(countMoney <= 3000){
                c1 = countMoney;i1 = 1;
                
                
            }else if(countMoney <= 12000){
                c1 = 3000;i1 = 1;
                c2 = countMoney;i2 = 1;
                
                
            }else if(countMoney <= 25000){
                c1 = 3000;i1 = 1;
                c2 = 12000;i2 = 1;
                c3 = countMoney;i3 = 1;
                  
            }else if(countMoney <= 35000){
                c1 = 3000;i1 = 1;
                c2 = 12000;i2 = 1;
                c3 = 25000;i3 = 1;
                c4 = countMoney;i4 = 1;
                
            }else if(countMoney <= 55000){
                c1 = 3000;i1 = 1;
                c2 = 12000;i2 = 1;
                c3 = 25000;i3 = 1;
                c4 = 35000;i4 = 1;
                c5 = countMoney;i5 = 1;
                  
            }else if(countMoney <= 80000){
                c1 = 3000;i1 = 1;
                c2 = 12000;i2 = 1;
                c3 = 25000;i3 = 1;
                c4 = 35000;i4 = 1;
                c5 = 55000;i5 = 1;
                c6 = countMoney;i6 = 1;
                
            }else{
                c1 = 3000;i1 = 1;
                c2 = 12000;i2 = 1;
                c3 = 25000;i3 = 1;
                c4 = 35000;i4 = 1;
                c5 = 55000;i5 = 1;
                c6 = 80000;i6 = 1;
                c7 = countMoney;i7 = 1;
               

            }

        } else {
            System.out.println("不用交税");
            needCost2 = 0 ;
        }

            needCost2 = i1*(c1- 0 )*0.03 + i2*(c2 - 3000)*0.1+ i3*(c3 - 12000)*0.2 + i4*(c4 - 25000)*0.25 + i5*(c5 - 35000)*0.3+ i6*(c6 - 55000)*0.35+ i7*(c7 - 80000)*0.45;
            System.out.println("需要交税：" + needCost2);

    }
}