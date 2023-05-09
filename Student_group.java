import java.util.LinkedList;

public class Student_group {
    private Student starosta;
    private LinkedList<Student> group_list;
    private LinkedList<Task> StudentsTasks;


    public Student_group(Student leader){
        this.starosta=leader;
        this.group_list= new LinkedList<Student>();
        this.group_list.add(leader);
        this.StudentsTasks=new LinkedList<Task>();
    }
    public boolean changeLeader(int StudentId){
        for (Student student : group_list) {
            if (StudentId == student.getId()) {
                this.starosta = student;
                return true;
            }
        }
        return false;
    }
    public boolean addStudent(Student student){
        boolean result=false;
        for (Student st : group_list) {
            if (student.getId() == st.getId()) {
                result=true;
                break;
            }
        }
        if (result==false){
            group_list.add(student);
            result=true;
        }
        return result;
    }
    public boolean deleteStudent(Student student){
        boolean result=false;
        for (Student st : group_list) {
            if (student.getId() == st.getId()) {
                result=true;
                break;
            }
        }
        if (result==true){
            group_list.remove(student);
        }
        return result;
    }
    public boolean renameStudent(Student student){
        boolean result=false;
        if (deleteStudent(student)){
            addStudent(student);
            result=true;
        }
        return result;
    }
    public void addTasktoStudent(String TaskName){
        for (Student st : group_list) {
            Task task=new Task(TaskName,st.getId());
            StudentsTasks.add(task);
            }
    }
    public void updateTaskStatus(int StudentId,String TaskName){
        for (Task task : StudentsTasks){
            if (task.getStudentId()==StudentId && task.getName()==TaskName ) {
                task.Is_Completed();
            }
            }
        }
    }
