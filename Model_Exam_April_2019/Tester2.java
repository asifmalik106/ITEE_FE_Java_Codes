public class Tester2 {
    public static void main(String[] args) {
        Person person1 = new Student();
        Person person2 = new PostGradStudent();

        Student student1 = new Student();
        Student student2 = new PostGradStudent();

        Staff staff1 = new Staff();

        Object obj = new Student();
        
        // Answer F
        //This Line will Produce Compiler Error
        //((PostGradStudent)staff1).depositAllowance();

        // Answer G
        ((Student)person2).depositAllowance();
        
        //Answer H
        //This Line will Produce Compiler Error
        //((PostGradStudent)obj1).sendEmail();
        
    }
    
}