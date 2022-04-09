package example.springframework.api.domain;

import java.io.Serializable;
import java.util.List;

public class UserData implements Serializable {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
