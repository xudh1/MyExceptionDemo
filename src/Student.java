/**
 * @program: MyExceptionDemo->Student
 * @description: 学生类
 * @author: hao
 * @create: 2019-11-29 11:17
 **/
public class Student {
    private int id;
    public
    void regist(int id) throws MyException {
        if(id>0){
            this.id=id;
        }
        else{
            throw new MyException("不能输入负数");
        }
    }
}
