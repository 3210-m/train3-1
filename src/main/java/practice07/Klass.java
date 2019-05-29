package practice07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Klass {
    private int number;

    public String getDisplayName(){
        return "Class "+number;
    }
}
