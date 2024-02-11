package jam.study.day20.circlelist;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MyNode {
    String data;
    MyNode link;

    public MyNode(String data) {
        this.data = data;
        this.link = null;
    }
}
