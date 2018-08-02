
package demo3;

public class Demo3 {


    public static void main(String[] args) {
        int x ;
        System.out.println("x="+x);
        x= x+ 5;
        
        int _x;
        int $x;
        int 9x;
        int #x;
        int x5;
        int thePrice;
        int unitPrice;        
        int UNITPRICE;
        int unitPrice;
        x = 3;   // x 是 int(32位元) ,  3 ?
        x = 5 + 118; // 5 ,118, 3 都是 int
     
        float f;
        double d;
        d = 0.35;
        
        //整數部分 , 編譯器部分介入
        //因為 53沒有超過 byte可儲存的範圍,自動轉成 byte存入 b
        byte b;
        b = 53; // b是byte, 53是int , byte = int, 8位元 存入32位元的資料???
        b = (byte)53;
        x= 100;
        b =  (x + 53);  //包含不確定因素 x , 無法推論是否會超過 127,因此編譯器暫停自動處理機制
        
        x = x + 53;
        
        System.out.println("b = x+53 =" +  b);
        
        //浮點數倍精數的轉換一律由 programmer 自行處理
        f = 0.345;    //  float = double ,  double數值存入 float ????  64位元放入32位元        
        f = 0.345f;   // 透過 f 將 0.345轉換成 float 型別
        f = 0.345F;        
        f =(float) 0.345;  //將 0.345強制轉換成 float
        
    }
    
    public void demo3_1() {
        int x ;        
        System.out.println("x= " +x);
        x = x+3;
        
    }
}
