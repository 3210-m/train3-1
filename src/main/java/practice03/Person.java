package practice03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }
}
