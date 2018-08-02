/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class condome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        if04();
//        duziliao();
//        闰年平年();
//        多条件判断();
//        if判断式变化();
//        switch判断式变化();
//        while判断式变化();
//        for回圈();
//          控制回圈();
        控制回圈for巢状();
    }

    public static void if04() {

        //多條件判斷
//        int x = 5;
//        if (x > 5) {
//            System.out.println("只有在  x 等於 5 才會看到這一行");
//        } else if (x == 1) {
//
//        } else if (x == 2) {
//
//        } else if (x == 3) {
//
//        } else if (x == 4) {
//
//        } else {
//            System.out.println("不符合条件上的情况 （x==5）会看到这一行");
//        }
//        System.out.println("无论是否符合都 會看到這一行");
        int x = 5;
        //
        if (x == 1) {
            if (x + 5 > 8) {
                System.out.println("1354");
                if (x * 3 - 4 > 2) {
                    System.out.println("x= :" + x);
                }
            }
        } else if (x == 5) {
            System.out.println("x= " + x);
        }
    }

    public static void duziliao() {
//        int data;
//        int b=10;
//        int a=b%2;
//        if(a==1){
//            System.out.printf("%d奇数%n",a);
//        }else{
//            System.out.printf("%d偶数%n",a);
//        }
        int data;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
//        System.out.println("输入年份，是闰年还是平年：");
        System.out.println("输入年份：");
//        System.out.print("请输入一组数值 （0-99）:");
        data = keyboard.nextInt();
//        System.out.println("使用者在键盘所输入的资料是：" + data);
//       int a=data%2;
//        if(a==1){
//            
//        System.out.printf("%d奇数%n",a);
//        } else {
//            System.out.printf("%d偶数%n", a);
//        }
        if (data % 4 == 0) {

            if (data % 100 == 0 && data % 400 != 0) {
                System.out.println(data + "平年");

            } else {
                System.out.println(data + "闰年");
            }
        } else {
            System.out.println(data + "平年");
        }
    }

    public static void 闰年平年() {
        int year;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("输入年份，1-2099：");
//        System.out.print("请输入一组数值 （0-99）:");
        year = keyboard.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "闰年");
                } else {

                    System.out.println(year + "平年");
                }
            } else {
                System.out.println(year + "闰年");
            }
        } else {
            System.out.println(year + "平年");
        }
    }

    public static void 多条件判断() {
        int x = 50;
        int y = 7;
        //多层次
        if (x % 2 == 0) {
            if (y % 2 == 0) {
                System.out.println("1 x与y 者是 偶数");
            }

        }

        //多条件替代  
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("3 x与y  都偶数");
        }

        if (x % 2 == 0 || y % 2 == 0) {
            System.out.println("3  x 或是 y 其中有(或全部)是偶數");
        }

        if (!(x >= 50)) {
            System.out.println("x 没有 >=50");
        } else {
            System.out.println(" x > = 50 ");
        }
        boolean 停止 = true;
        if (!停止) {
            System.out.println("看到這一行 代表原本 停止變數是 false,程式持續執行");
        } else {
            System.out.println("看到这一行，代表停止变数已经是 true，程式即将停止");
        }

    }

    public static void if判断式变化() {
        int x = 15;
        int y = 0;
        if (x == 5) {
            System.out.println("x==5");
        }
        System.out.println("其他");
        /*//  二元运算子
         if(x==15){
         y=1;
         }else{
         y=2;
         }
         */
        //三元运子
        y = 0;
        x = 1;
        y = (x == 15) ? 1 : 2; //問號為判斷是（x==15)是否為真,若為真 則執行冒號前的程式碼,若不為   
                                              真 則執行後面的
        System.out.println("y= " + y);
    }

    public static void switch判断式变化() {
        int x = 4;
        if (x == 1) {
            System.out.println("if x是 1");
        } else if (x == 2) {
            System.out.println("if x是 2");
        } else if (x == 3) {
            System.out.println("if x是 3");
        } else if (x == 4) {
            System.out.println("if x是 4");
        } else {
            System.out.println("其他");
        }
        switch (x) {
            case 0:
            case 1:
                System.out.println("x是0 or 1");

                break;
            //if(x==2||x==20||x==250)跟下面的是一样的

            case 2:
            case 20:
            case 250:
                System.out.println("x是2/20/250");
                break;
            case 3:
                System.out.println("x是 3");
                break;
            case 4:
                defaut:
                System.out.println("其他");

        }

    }

    public static void while判断式变化() {
        int x = 0;//x=-1下面显示0-10
        //while(x++ <10)是一样的，这样写比较多
        // while  0 ~ 多次
        while (x++ < 10) {//(++x<10)显示1-9  (x++<10)显示1-10
            System.out.println("x<10 待在回圈执行 x=" + x);
//            x++;//显示0-9
//            ++x;//显示0-9
        }

//            
        //1-多次
//            while (true){
//                
//            }
        //1-多次
        do {
            System.out.println("看到這一行(do---while ( x= " + x);
            x++;
        } while (x < 15);
        System.out.println("結束");

        int a = 1;
        while (a < 101) {

            System.out.print(a + "+");
            a++;
        }

    }

    public static void for回圈() {
        int x = 0;
        while (x < 10) {
            System.out.println("while 10次");
            x++;
        }

        //for
        x = 0;
        for (; x < 10;) {
            System.out.println("for 10次");
            x++;
        }

        //for
        for (int y = 0; y < 10; y++) {
            System.out.println("for 10次");
        }
        for (;;) {
            System.out.println("for 10次");
            x++;
        }

    }

    public static void 控制回圈() {
        int x = 0;
        while (true) {
            System.out.println("x= " + x++);
            if (x == 10) {
                break;
            }
        }

        for (x = 0; x < 20; x++) {
            //if(x%8!=0){   } 

            if (x % 7 != 0) {
                continue;
            }
            if (x == 17) {
                break;
            }
            System.out.println("for x=" + x);

        }
        int sum = 0;
        for (int a = 0; a <= 100; a++) {
            sum += a;
//            for(int b=0;b<a;b++)
//                sum+=a+b;
        }
        System.out.println(sum);
    }

    public static void 控制回圈for巢状() {
        aaa:
//        LOOPX:
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                if (y == 5) {
                    break aaa;
//                    break LOOPX;
                }
                System.out.println(x + "x" + y + "=" + (x * y));
            }
        }
    }

}
