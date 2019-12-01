/**
 * @program: MyExceptionDemo->MyException
 * @description: 我的自定义异常类
 * @author: hao
 * @create: 2019-11-29 11:15
 **/
public class MyException extends Exception {
    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}
