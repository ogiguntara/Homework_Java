public class Academician {
    String name;
    int age;
    Academician(String paramName, int paramAge) {
        this.name = paramName;
        this.age = paramAge;
    }
    void studentSubject(String subject){
        System.out.println("Your name : " + this.name);
        System.out.println("Your age : " + this.age);
        System.out.println("Your subject : " + subject);
    }
}