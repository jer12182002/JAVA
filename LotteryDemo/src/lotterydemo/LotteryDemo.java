package lotterydemo;

public class LotteryDemo {

    public static void main(String[] args) {
        樂透產生器 lottery = new 樂透產生器();
        lottery.產生電腦選號();
        int [] 電腦選號 = lottery.取得電腦選號();
        System.out.println("您的電腦選號是: " );
        for(int n : 電腦選號 ) {
            System.out.print(n + " , ");
        }
    }
    
}
//--------------------------------------------------------
class 樂透產生器 {
    
    int [] randomNumber = new int[6];
    int number=0;    
    
    
    public void 產生電腦選號() {
        java.util.Random r = new java.util.Random();
        //產生六個號碼 放入 randomNumber[]
        for(int count=0; count < randomNumber.length ; count++) {
            //每產生一個號碼 丟給 checkDuplication 檢查,回傳 true 代表?, false 代表?
            do {
                number = r.nextInt(49) + 1;
            }while (是否重複(number));
            randomNumber[count] = number;
            
//            number = r.nextInt(49) + 1;
//            while(是否重複(number)) {
//                number = r.nextInt(49) + 1;
//            }
//            randomNumber[count] = number;
            
//            while(true) {
//                number = r.nextInt(49) + 1;
//                if( 是否重複(number) ) {   //有重複(回傳true)
//                    continue;
//                } else {    // 沒有重複
//                    randomNumber[count] = number;
//                    break;    //跳出 while 回到  for(count)
//                }
//            }
        }
    }
    public boolean 是否重複(int num) {
        for(int cn : randomNumber ) {
            if( num == cn ) 
                return true;
        }
        return false ; // 重複: true , 可用 false
    }
    
    public  int[]  取得電腦選號() {
        return randomNumber;
    }
}
//--------------------------------------------------------


//--------------------------------------------------------
