package practice08;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        String s = super.introduce()+" I am a Teacher. I teach ";
        return klass==null?s+"No Class.":s+klass.getDisplayName()+".";
    }

    public String introduceWith(Student student){
        String s = "My name is Tom. I am 21 years old. I am a Teacher. I ";
        return student.getKlass().getNumber()==(klass.getNumber())?s+"teach Jerry.":s+"don't teach Jerry.";
    }
}
