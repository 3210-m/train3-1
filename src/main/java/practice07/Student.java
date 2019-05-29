package practice07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person{
    private Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce()+" I am a Student. I am at "+this.klass.getDisplayName()+".";
    }
}
