package demo4;

public class Demo4 {


    public static void main(String[] args) {
        
        int x;   //宣告一個記憶體空間(32位元),將位址放在變數 x
        int y;
        int z;
        //指派運算子
        x = 13;        // = 的右邊單位必須小於或等於 左邊的變數
        //算術運算子
        x = x + 10;
        x = x + 5 *2 + 8 -4 *5;
        
        x = 10;
        y = 3;
        z = x / y;
        System.out.println("z = x / y 結果: " + z);
        
        z = x % y;
        System.out.println("z = x % y 結果: " + z);
        
        //算術運算延伸運算子
        x = x + 1;     
        x += 1;
        
        x = x + 20;
        x += 20;
        
        x -=5;
        
        x=2;
        System.out.println("x=" +x);        
        x *=3;
        System.out.println(" x*=3 : " + x);   // x = x * 3;
        
        x = 13;
        x %= 5;     // x = x%5;
        System.out.println("x%= 5  -->" + x);
        
        //遞增減運算子
        x=x+1;
        x+=1;
        
        x = 5;
        System.out.println("x=" + x);
        x++;
        System.out.println("x++ =" + x);
        
        x--;
        System.out.println("x-- =" + x);
        
        ++x;
        System.out.println("++x =" + x);
        
        --x;
        System.out.println("--x =" + x);
        
        z=0;
        y=5;
        x=5;
        z = x+ ++y;
        
        y=y+1;
        z=x+y;
        
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        
        z=0;
        x=5;
        y=5;        
        z = x + y-- ;
        
        z = x+y;
        y = y-1;
        
        z = ++x + y--;
        
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        
        y = 5;
        System.out.println("y=" + y++);
        
        //關係運算子: 提供條件比對與判斷結果
        x=5;
        y=7;
        System.out.println("-------------------- 比較運算式 --------------------------");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("x > y ?" + ( x > y ) );  // false
        System.out.println("x < y ?" + (x < y));  // true
        System.out.println("x != y ?" + (x != y));  // true
        System.out.println("x == y ?" + (x == y));  // true
        System.out.println("x = y ?" + (x = y));  // true
    }

    public static void demo2() {
        int x ;
        
        x = 2147483648;    // int 範圍( -2147483648 ~  2147483647 )
        
        long x2 = 2147483648L;
        x2 = 2147483650;   // 等號的右邊 有問題,int 放不下 2147483650
        
        byte b1 , b2 , b3;
        b1 = 5; b2 = 5 ; b3=0;
        b3 =  (byte) (b1+b2);
        
        
    }
}
