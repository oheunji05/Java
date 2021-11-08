public class Method {

    //메서드(method) : 클래스 내부에서 사용하는 멤버 함수

    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){ //학생의 이름을 반환하는 메서드
        //클래스에서 학생 이름을 가져오는(get) 기능을 제공하는 메서드 이름 : getStudentName
        return studentName; //studentName의 자료형이 String이니까 반환형도 String
    }

    public void setStudentName(String name){ //학생 이름을 매개변수로 전달달
       studentName=name;
    }
}