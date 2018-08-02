package demo1;


public class Demo1 {////这是主要类别，程序只执行主要类别，基他的类别暂时不会在这里执行

    //入口
    public static void main(String[] test) {
        System.out.println("Hello World 1"); 
        Main();
        MAIN();
    }
    
    public static void Main() {
        System.out.println("Hello World 2");
    }
    public static void MAIN() {
        System.out.println("Hello World 3");
    }

    //这是不对的，没有方法，在类别里没有办法执行
    System.out.println ("Hello World 4");
    
    
    public static void main2() {
        
    }
    
}


class Demo2 {
    public static void main(String[] test) {
        System.out.println("Demo2 Hello World ");
    }
}

class demo3 {
    public static void main(String[] test) {
        System.out.println("Demo3 Hello World 1");
    }
}