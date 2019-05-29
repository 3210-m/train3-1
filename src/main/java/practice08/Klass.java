package practice08;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        leader = student;
    }
}
