package classtypevariable;

public class ClassTypeVariable {

    public static void main(String[] args) {
        int x;
        int y;
        float f;
        int [] datas;    //目前只單純是宣告,尚未配置記憶體
        學生 student1;   //目前只單純是宣告,尚未配置記憶體
        學生 student2;
        
        datas = new int[100];
        student1 = new 學生();
        
        datas[0]=100;
        student1.姓名 =  "小明" ;
        student1.身高 = 175.5f;
        student1.我是誰();
        
        student2 = new 學生();
        student2.姓名 = "曉華";
        student2.身高 = 165.5f;
        //student2.年齡 = 13;
        student2.set年齡(15);
        student2.我是誰();
        student2.show身高();
        int age = student2.get年齡();
        System.out.println("Student2 的年齡是: " + age);
    }    
    
}

class 學生 {
    String 班級;
    String 姓名;
    int 年齡;
    float 身高;
    int 體重;
    boolean 性別;   //男生 true, 女生 false
    
    public void show身高() {
        System.out.println("身高是: " + 身高);
        我是誰();
    }
    protected void 我是誰() {
        System.out.println("我是: " + 姓名);
    }
    public int get年齡() {
        return 年齡;
    }
    public void set年齡(int age) {
        年齡 = age;
    }
}
