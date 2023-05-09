import java.util.LinkedList;

public class Task {
    private String Name;
    private int StudentId;
    private TaskStatus Status;
    public Task (String name,int studentId){
        this.Name=name;
        this.StudentId=studentId;
        this.Status=TaskStatus.IN_PROGRESS;
    }
    public void Is_Completed(){
        this.Status=TaskStatus.COMPLETED;
    }
    public int getStudentId(){
        return StudentId;
    }
    public String getName(){
        return Name;
    }
    public TaskStatus getStatus(){
        return Status;
    }
}
