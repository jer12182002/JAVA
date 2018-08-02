I
package conditiondemo;


public class ConditionDemo {

 
    public static void main(String[] args) {
        控制迴圈2();
    }
    
    public static void ifDemo() {
        int x = 25;
        
        if( x==5 ) {
            System.out.println("只有在  x 等於 5 才會看到這一行");    
        } else {
            System.out.println("不符合條件的情況(x==5) 會看到這一行");
        }
        
        System.out.println("無論是否符合 都會看到這一行");
        //多條件判斷
        if( x==1 ) {
            
        } else if ( x == 2) {
            
        } else if ( x == 3) {
            
        } else if ( x == 4) {
            
        } else {
            
        }
        
        //巢狀判斷式
        if( x == 1 ) {
            if( x+5 > 8) {
                if( (x * 3 -4 ) > 2) {
                    
                }
            }
        } else if ( x == 5 ) {
            if( x * 2+7 > 19) {
                
            }
        }
        
    }
    
    public static void 讀取鍵盤資料() {
        int data;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        
        System.out.println("請輸入一組數值(0~99): ");
        data = keyboard.nextInt();  //回傳使用者在鍵盤所輸入的數值
        System.out.println("使用者在鍵盤所輸入的資料是: " + data);
        
        if( data % 2 == 0 ) {
            System.out.println(data + " 為偶數");
        } else {
            System.out.println(data + " 為奇數");
        }
    }
    
    public static void 閏年判斷() {
        int year;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.println("請輸入一年分(1~2099): ");
        year = keyboard.nextInt();  //回傳使用者在鍵盤所輸入的數值
       
        //閏年條件
        // 1. 4的倍數 ,非100倍數
        // 2. 4的倍數,100,400的倍數
        if( year % 4 == 0 ) {
            if(year %100 == 0 ) {                               
                if( year % 400 == 0) {
                    System.out.println(year + " 為閏年");                
                } else {
                    System.out.println(year + " 為平年");
                }
            } else  {
                System.out.println(year + " 為閏年");
            }
        } else {
            System.out.println(year + " 為平年");
        }
    }
    
    public static void 多條件判斷() {
        int x = 50;
        int y = 7;
        
        // 多層次
        if( x % 2 == 0) {
            if( y % 2 == 0 ) {
                System.out.println("1 x與y 都是 偶數");
            }
        }
        //多條件替代
        if( x % 2 == 0  &&  y % 2 == 0 ) {
            System.out.println("2 x與y 都是 偶數");
        }
        // 
        if (x % 2 == 0 || y % 2 == 0) {
            System.out.println("3  x 或是 y 其中有(或全部)是偶數");
        }
        
        // 單元運算子 !
        if(!( x >= 50 ) ) {
            System.out.println(" x 沒有 >= 50 ");
        } else {
            System.out.println(" x > = 50 ");
        }
        
        boolean 停止 = true;
        if( ! 停止 ) {
            System.out.println("看到這一行 代表原本 停止變數是 false,程式持續執行");
        } else {
            System.out.println("看到這一行 代表 停止變數已經是 true,程式即將停止");
        }
        
        
    }
    
    public static void if判斷式變化() {
        int x = 15;
        int y = 0;
        
        if( x == 5) 
            System.out.println("x == 5");        
        
        System.out.println("其他");
       
        /*
        if ( x == 15 ) { 
            y = 1;
        } else {
            y = 2;
        }
        */
        // 三元運算子
        y = 0;
        x = 20;
        y= (x==15) ?  1 :  2;
        
        System.out.println("y = " + y);
    }
    
    public static void swtichDemo() {
        int x = 0;
        
        if( x == 1 ) {
            System.out.println("if x是 1");
        } else if ( x == 2) {
            System.out.println("if x是 2");
        } else if ( x == 3) {
            System.out.println("if x是 3");
        } else if ( x == 4) {
            System.out.println("if x是 4");
        } else {
            System.out.println("if x是 其他");
        }
        // switch 
        switch( x )  {
            case 0:
            case 1: 
                System.out.println("x是0 or 1");  
                break;
            case 2:
            case 20:
            case 200:
                System.out.println("x是 2/20/200");
                break;
            case 3:    
                System.out.println("x是 3");
                break;
            case 4:
                System.out.println("x是 4");
                break;
            default:
                System.out.println("x是 其他");
        }
        
    }
    
    public static void while迴圈() {
        int x = -1;
        
        // while  0 ~ 多次
        while( ++x < 10 ) {
            System.out.println("x < 10 待在回圈內執行 x=" + x);
        }
        // 1~多次
        //while( true ) {
            
        //}
        //  do--while   1~多次
        do {
            System.out.println("看到這一行(do---while ( x= " + x);
            x++;
        }while( x < 15 );
        
        System.out.println("結束");
    }
    public static void for迴圈() {
        int x=0;
        while(x<10) {
            System.out.println("while 10次");
            x++;
        }
        
        // for 
        for (int y = 0; y < 10; y++) {
            System.out.println("for 10次");
        }
        
        x=0;
        for ( ; x < 10 ; x++ ) {
            System.out.println("for 10次");            
        }
        
        // for版無窮迴圈
        for( ; ; ) {
            System.out.println("for 10次");
            x++;
        }
        
        
    }
    public static void 控制迴圈() {
        int x =0 ;
        while( true ) {            
            System.out.println("x= " + x++) ;
            if( x == 20 ) break;
        }
        
        for(x=0; x<20; x++ ) {
            //if( x % 8 != 0 ) { 
                
            //}
            if ( x % 7 ==0 ) 
                continue;
            if ( x == 17 ) 
                break;
            
            System.out.println("for x= " + x);
        }
    }
    
    public static void 控制迴圈2() {
        
        LOOPX:
        for(int x= 1 ; x < 10 ; x++ ) {
            LOOPY:
            for(int y= 1; y < 10 ; y++ ) {
                if ( y == 5 )  
                    break LOOPX;
                
                System.out.println( x + " x " +  y + " = " + (x*y));
            }
            
        }
    }
    public void main() {

        java.util.Random r = new java.util.Random();
        for (int count = 0; count < 500; count++) {
            int[] data = new int[500];
            System.out.println(r.nextInt(100));
        }
    }
}
