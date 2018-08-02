/*
  日期: 2015-10-20
  作者: 梁國亮
  功能描述: 

 */
package demo2;

public class Demo2 {
    int x;
    byte y;
    
    public static void main(String[] args) {
        byte b1;   //8 位元長度
        short s1;  //16位元長度
        int   i1;  //32
        long  L1;  //64
        
        //使用 10進位 設定數值
        b1 = 10;
        b1 = 100;
        b1 = 127;
        //b1 = 128;
        b1 = -1;
        b1 = -128;
        //b1 = -129;
        // 二進位存入數值 前置 0b 符號
        b1 =  0b00000011;
        
        System.out.println("b1 = " + b1);        
        b1 = (byte) 0b10000000;
        System.out.println("b1 = " + b1);
        b1 = 0b01111111;
        System.out.println("b1 = " + b1);
        
        s1 = 32767;
        s1 =(short) 0b1000000000000000;
        System.out.println("s1 = " + s1);
        
        //浮點數類型
        int i = 0.3;
        float f;     // 單精數 32位元
        double d;    // 倍精數 64位元
        d = 0.3;
        d = 3;
        f = 0.3;
        f = 0.3f;
        f = 3;
        f = 3.0;
        f = 3.0f;
        
        
        //文字處理
        char ch ;   // 16位元 UTF 只能存放單字(使用單引號表示)
        ch = 'A';   // char 單字 使用單引號  字串 使用雙引號
        ch = "H";   // 不可以使用雙引號
        ch = 'aa';  // 不能存入兩個字
        ch = '好';
        
        //字串 
        String s = "hello";
        s = 'a';   //需要給予字串 非單字
        s = "a";
        
        
    }
    
}
