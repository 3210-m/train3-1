package practice09;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        String s = super.introduce()+" I am a Student. I am ";
        return klass.getLeader()!=null&&klass.getLeader().equals(this)?s+"Leader of Class 2.":s+"at Class 2.";
    }
}
