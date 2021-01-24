package priv.lyb.study.base.exception;

/**
 * @author LiuYingBo 2021/01/24 16:16
 */
public class WhoCalled {
    static void f(){
        try {
            throw new Exception();
        }catch (Exception e){
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.getMethodName());
            }
        }
    }

    static void g(){
        f();
    }

    static void h(){
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("-------------------");
        g();
        System.out.println("-------------------");
        h();
    }
}
