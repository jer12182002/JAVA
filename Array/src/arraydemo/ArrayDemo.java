package arraydemo;

public class ArrayDemo {

    public static void main(String[] args) {
//陣列示範();        
亂數示範2();
//lotteryDemo();
    }

    public static void 陣列示範() {
        //宣告 但尚未指定資料筆數
        int[] datas1;    //官方標準定義
        int datas2[];    //相容舊規格

        //指定存放筆數
        datas1 = new int[2000];   //配置兩千個 int 空間 準備存放資料,配置後 大小無法修改 2000*4(bytes)

        // 宣告同時設定大小
        int[] datas3 = new int[2000];

        //必須在宣告的同時 設定資料(直接使用資料設定)
        int[] datas4 = {1, 5, 12, 458, 582, 4582, 119, 532, 6, 7, 8, 2890, 29, 98, 91};
        // 23宣告,24 設定資料 是錯誤的動作 必須同一時間完成 如 21
        int[] datas5;
        //datas5 = {1,2,3,4,5};
        int[] datas6 = new int[5];
        datas6[0] = 51;
        datas6[1] = 52;
        datas6[2] = 53;
        datas6[3] = 54;
        datas6[4] = 55;
        // datas6[5] = 56;   // 觸發 ArrayIndexOutofBoundsException
        System.out.println("datas6[3] = " + datas6[3]);
        System.out.println("datas6 長度為: " + datas6.length);
        System.out.println("datas3 長度為: " + datas3.length);
        System.out.println("datas4 長度為: " + datas4.length);
        System.out.println("datas4[7] = " + datas4[7]);
        //int [] datas6 = new int[1024*1024*1024];

        //顯示 datas4 所有的資料集合:
        System.out.println("-------------------------------------------------");
        int total = 0;
        for (int index = 0; index < datas4.length; index++) {
            System.out.println("datas4[" + index + "] = " + datas4[index]);
            total += datas4[index];
        }
        System.out.println("陣列總和: " + total);
        System.out.println("結束");
    }

    public static void 亂數示範() {

        java.util.Random r = new java.util.Random();  //可以產生亂數的物件(工具)
        for (int count = 0; count < 35; count++) {
            //System.out.println( "亂數: " + r.nextInt() );
            //System.out.println("亂數: " + r.nextFloat() );
            System.out.print(" ," + r.nextInt(50));  // 0~49
            
        }
    }

    public static void 亂數示範2() {
        int[] rnums = new int[500];
        int[] board = new int[100];  //0~99 記錄每一個號碼出現的次數
        int num;
        java.util.Random r = new java.util.Random();

        for (int c = 0; c < rnums.length; c++) {
            num = r.nextInt(100);  // num 範圍 0~99
            rnums[c] = num;
            board[num]++;//紀錄出現過的亂數的次數
        }

        int maxNumber = 0;  //出現的頻率
        int rNumber = -1;    //目前的數字
        for (int i = 0; i < board.length; i++) {
            System.out.println("board[" + i + "]= " + board[i]);
            if (board[i] > maxNumber) {
                rNumber = i;
                maxNumber = board[i];
            }
        }
        System.out.println("===============================================");
        System.out.println("出現最多次的數字是: " + rNumber + " 一共: " + maxNumber + " 次");

    }

    //產生一組六個 1~49 不重複的號碼
    public static void lotteryDemo() {
        java.util.Random r = new java.util.Random();
        int[] lottery = {0, 0, 0, 0, 0, 0};
        int num = 0;
        boolean repeatFlag = false;
        int matchCount = 0;

        for (int n = 0; n < lottery.length; n++) {

            while (true) {
                num = r.nextInt(49) + 1;   // 0~48 + 1 --> 1~49

                //for( int c=0; c< lottery.length ; c++ ) {
                for (int c = 0; c < n; c++) {                  // ************
                    if (num == lottery[c]) {   // c 範圍: 0~5 , 若 lottery[c] 是 0 , 有必要繼續比下去嗎 ?
                        //找到重複 重新產生 (93行)
                        repeatFlag = true; //找到重複, 若迴圈c = 2 的話 有必要再比 3,4,5 ? 
                        break;                                 //******************************
                    }
                    matchCount++;
                    //能執行到 c迴圈最後代表沒有重複 因此可以把數值存入 lottery[n] 當中
                }

                if (repeatFlag) {
                    //重新產生號碼,  清除重複的旗號判斷變數
                    repeatFlag = false;
                } else {
                    lottery[n] = num;  // 此數字可以用,儲存並且離開 while(true)迴圈
                    break;
                }
            }
        }

        for (int i = 0; i < lottery.length; i++) {
            System.out.println("Lottery[" + i + "]= " + lottery[i]);
        }
        // foreach 迴圈
        for (int t : lottery) {
            System.out.println(t);
        }

        System.out.println("本次號碼產生比對次數: " + matchCount);

    }
}
