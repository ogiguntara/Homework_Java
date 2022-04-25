public class Student extends Academician{

    Student(String paramName, int paramAge) {
        super(paramName, paramAge);
        
        
    }
    void studentSubject(String subject){
        System.out.println("Your name : " + this.name);
        System.out.println("Your age : " + this.age);
        System.out.println("Your subject : " + subject);
        System.out.println("I am a Student");

    }
}
