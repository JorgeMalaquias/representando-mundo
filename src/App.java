import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Class classOne = new Class();
        classOne.setId(1);
        classOne.setName("Introdução à disciplina");
        classOne.setTeacher(8,"Jubiscleiton","55487677744","jubiscleiton@yahoo.com");
        System.out.println(classOne.getId());
        System.out.println(classOne.getName());
        System.out.println(classOne.getTeacher());
        System.out.println(classOne.getTeacher().getName());
    }
}
