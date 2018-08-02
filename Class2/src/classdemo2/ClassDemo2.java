package classdemo2;

public class ClassDemo2 {

    public static void main(String[] args) {
        RGenerator rg = new RGenerator();

        int num = rg.get亂數();
        System.out.println("取得的亂數為: " + num);

        num = rg.get亂數2(100);
        System.out.println("取得的亂數2為: " + num);

        int[] result = rg.get亂數3(10, 100, 1000);
        //int[] result = new int[3];
        //result = rg.get亂數3(10, 100, 1000);
        for (int r : result) {
            System.out.println("結果: " + r);
        }

        學生 s = rg.get學生();//
        System.out.println(" 学生：" + s.姓名);
        System.out.println(" 学生：" + s.身高);
        System.out.println(" 学生：" + s.體重);
        SumClass sc = new SumClass();
        System.out.println(" 5+3 = " + sc.sum(5, 3));
        System.out.println(" 5+3 = " + sc.sum(5, 3, 2));
        System.out.println(" 5+3 = " + sc.sum(0.5, 0.3, 0.2));
        System.out.println(" 5+3 = " + sc.sum(0.5f, 0.3f, 0.2f));
        System.out.println(" 5, 3, 2,7,8 = " + sc.sum3(5, 3, 2, 7, 8));
        System.out.println(" 5, 3, 2,2,45,23,9 = " + sc.sum3(5, 3, 2, 2, 45, 23, 9));
        System.out.println(" 5, 3, 2,11,27,37,25,45, 27, 37, 25, 45 = " + sc.sum3(5, 3, 2, 11, 27, 37, 25, 45, 27, 37, 25, 45));
        
    }

}

// 
class SumClass {

    public int sum(int x, int y) {
        return x + y;
    }
//    public float sum(float x , float y) {//这个与54行一样的变数是不行的，多截不通过 
//        return x+y;
//    }

    public float sum(float x, int y) {
        return x + y;
    }

    public float sum(int x, float y) {
        return x + y;
    }

    public int sum(float x, float y) {
        return 1;
    }

    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    public float sum(float f1, float f2, float f3) {
        return f1 + f2 + f3;
    }

    public double sum(double f1, double f2, double f3) {
        return f1 + f2 + f3;
    }

    public int sum3(int... nums) {   //nums 視為一個陣列
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

        }
        for (int n : nums) {
            sum += n;
        }

        return sum;
    }
}

//開發一個 class 提供亂數產生 並將亂數回傳給呼叫者
class RGenerator {

    public int get亂數() {
        java.util.Random r = new java.util.Random();

        return r.nextInt();
    }

    public int get亂數2(int range) {
        java.util.Random r = new java.util.Random();
        int n = r.nextInt(range);
        return n;
        //return r.nextInt(range);
    }

    public int[] get亂數3(int r1, int r2, int r3) {
        java.util.Random r = new java.util.Random();
        int[] arrays = new int[3];
        arrays[0] = r.nextInt(r1);
        arrays[1] = r.nextInt(r2);
        arrays[2] = r.nextInt(r3);

        return arrays;
    }

    public 學生 get學生() {
        學生 data = new 學生();
        data.姓名 = "王曉華";
        data.身高 = 168;
        data.體重 = 49;

        return data;
    }
}

class 學生 {

    String 姓名;
    int 體重;
    float 身高;
}
