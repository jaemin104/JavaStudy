package jam.study.day21.dlist;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DLNode {
    private String data;
    private DLNode llink;
    private DLNode rlink;

    public DLNode(String data) {       // 생성자는 필드를 초기화하기 위해서 만든다.
        this.data = data;
        this.llink = null;
        this.rlink = null;
    }
}
