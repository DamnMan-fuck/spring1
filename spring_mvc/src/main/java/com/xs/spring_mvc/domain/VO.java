package com.xs.spring_mvc.domain;
import java.util.List;

public class VO {
    private List<User> userlist;

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userlist=" + userlist +
                '}';
    }
}
