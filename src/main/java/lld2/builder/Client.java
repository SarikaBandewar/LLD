package lld2.builder;

//import lld2.builder.version1.Builder;

import lld2.builder.version1.Student;

public class Client {
    public static void main(String[] args) {
        Student.Builder builder = Student.getBuilder()
                .setName("Sarika")
                .setAge(43)
                .setEmail("abc@xyx.com")
                .setPsp(99.2)
                .setPhoneNumber("123123123")
                .setGradYear(2023);

        Student student = builder.build();

//        Student student = new Student(builder);
        System.out.println(student);
    }
}
