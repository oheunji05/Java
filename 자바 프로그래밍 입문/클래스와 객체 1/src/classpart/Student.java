package classpart;

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

    //디폴트 생성자
    //특징 : 매개변수가 없다
    //생성자가 하나도 없을 때 자바 컴파일러가 알아서 제공
    public Student(){}

    public Student(int id, String name) {
        studentID=id;
        studentName=name;
    }

    public void showStudentInfor(){
        System.out.println(studentName+","+address);
    }

    //메서드
    public String getStudentName(){ //get : 가져오다
        return studentName;
    }

    public void setStudentName(String name){ //set : 저장
        studentName=name; //studentName을 name으로 바꿈꿈
    }

}
