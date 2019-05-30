package practice11;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;


@Setter
@Getter
public class Teacher extends Person implements Observer {
    private Klass t;

    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, Klass t) {
        super(id, name, age);
        this.t = t;
    }

    public String introduce() {
        String s = super.introduce() + " I am a Teacher. I teach ";
        if (classes == null || classes.size() == 0) {
            s += "No Class.";
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

    @Override
    public void update(String info) {
        System.out.printf(info);
    }

}
