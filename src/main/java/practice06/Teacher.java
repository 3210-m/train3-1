package practice06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        String s = super.introduce()+" I am a Teacher. I teach ";
        return klass==null?s+"No Class.":s+"Class "+klass+".";
    }
}
