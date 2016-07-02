/**
 * Created by shendongdong on 2016/6/30.
 */
public class Test {
    public static void main(String[] arg) {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        System.out.println(student.getId() + ":" + student.getName());
        System.out.print("第一个intellij程序！");
    }
}
 class Student {
     private Integer id;
     private String name;

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
