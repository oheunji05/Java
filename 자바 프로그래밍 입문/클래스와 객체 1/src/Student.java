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

    //메서드
    public String getStudentName(){ //get : 가져오다
        return studentName;
    }
    public void setStudentName(String name){ //set : 저장
        studentName=name;
    }

    public static void main(String[] args) {
        Student studentAhn=new Student(); //Student 클래스 생성
        studentAhn.studentName="안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
