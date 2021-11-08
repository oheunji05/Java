//class 이름은 대문자로 시작

// (접근 제어자) class 클래스 이름{
//      멤버 변수;
//      메서드
// }

public class Student {
    //멤버 변수
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo(){
        System.out.println(studentName+","+address);
    }
}
