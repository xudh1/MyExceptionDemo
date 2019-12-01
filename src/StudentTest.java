/**
 * @program: MyExceptionDemo->StudentTest
 * @description: 学生测试类
 * @author: hao
 * @create: 2019-11-29 11:20
 **/
public class StudentTest {
    public static void main(String args[]){
        try{
            Student s = new Student();
            s.regist(-1001);
            // 对Student类throws的异常进行try-catch处理；
            System.out.println("aaaaaaaa");
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
