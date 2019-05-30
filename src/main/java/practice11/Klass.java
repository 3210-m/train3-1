package practice11;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Klass implements JoinKlass {
    //用来存放和记录观察者
    private List<Observer> observers = new ArrayList<Observer>();
    //记录状态的字符串
    private String info;

    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            leader = student;
            info="I am Tom. I know Jerry become Leader of Class "+number+".\n";
            this.notifyObserver();
        } else {
            System.out.printf("It is not one of us.\n");
        }

    }

    public void appendMember(Student student) {
        student.setKlass(this);
        info="I am Tom. I know Jerry has joined Class "+number+".\n";
        this.notifyObserver();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public void addObserver(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void deleteObserver(Observer obj) {
        if (observers.indexOf(obj) >= 0){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer o= observers.get(i);
            o.update(info);
        }
    }
}
