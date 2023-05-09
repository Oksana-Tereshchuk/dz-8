public class Main {
    public static void main(String[] args) {
        Student student=new Student(0,"Kolia","Moldovan");
        Student student1=new Student(1,"Peter","Roy");
        Student student2=new Student(2,"Nick","Piterson");
        Student_group AV21=new Student_group(student1);
        AV21.changeLeader(2);
        AV21.addStudent(student);
        AV21.addStudent(student1);
        AV21.addStudent(student2);
        Student student2rename=new Student(2,"Max","Piterson");
        AV21.renameStudent(student2rename);
        AV21.deleteStudent(student);
        AV21.addTasktoStudent("Read boring book");
        AV21.updateTaskStatus(1,"Read boring book");
    }
}