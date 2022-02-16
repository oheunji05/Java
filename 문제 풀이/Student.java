//https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
public class Student {

    String className;
    int classNum;

    public static void main(String[] args) {
        Student student = new Student();
        student.className="컴퓨터과";
        student.classNum=1202;

        System.out.printf("학과: %s\n",student.className);
        System.out.printf("학번: %d\n",student.classNum);
    }
}
