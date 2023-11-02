package lld2.prototypeRegistry;

public class Client {
    private final static StudentRegistry sr = new StudentRegistry();

    private static void fillRegistry() {
        Student student = new Student();
        student.setName("Sarika");
        student.setAge(44);
        student.setPsp(88);
        student.setBatchName("Dec22Mor");
        student.setAvgPspOfBatch(99.9);

        sr.setProperty("Dec22Mor", student);

        IntelligentStudent student1 = new IntelligentStudent();
        student1.setName("Sarika");
        student1.setAge(44);
        student1.setPsp(88);
        student1.setBatchName("Dec22Mor");
        student1.setAvgPspOfBatch(99.9);
        student1.setIq(90);

        sr.setProperty("Dec22Eve", student1);
    }

    public static void main(String[] args) {
        fillRegistry();

        Student student = sr.getProperty("Dec22Mor").copy();
        student.setName("Sarika");
        student.setAge(44);
        student.setPsp(88);

        System.out.println("Student 1 : " + student);

        Student st = sr.getProperty("Dec22Eve").copy();
        st.setName("Nidhi");
        System.out.println("Copied Student : " + st);
    }
}
