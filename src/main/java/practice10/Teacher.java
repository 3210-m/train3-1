package practice10;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Setter
@Getter
public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public String introduce() {
        String s = super.introduce() + " I am a Teacher. I teach ";
        if (classes == null||classes.size() == 0) {
            s = s + "No Class.";
        } else {
            s += "Class ";
            for (int i = 0; i < classes.size(); i++) {
                s = s + classes.get(i).getNumber();
                s += i == classes.size() - 1 ? "." : ", ";
            }
        }
        return s;
    }

    public String introduceWith(Student student) {
        String s = "My name is Tom. I am 21 years old. I am a Teacher. I ";
        s += isIn(student.getKlass().getNumber()) ? "teach Jerry." : "don't teach Jerry.";
        //return isIn(student.getKlass().getNumber()) ? s + "teach Jerry." : s + "don't teach Jerry.";
        return s;
    }

    public boolean isTeaching(Student student) {
        return isIn(student.getKlass().getNumber());
    }

    public boolean isIn(int number) {
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).getNumber() == number) {
                return true;
            }
        }
        return false;
    }
}
