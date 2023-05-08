package org.spring.Service;

public class USER1 {
    private int id;
    private String name;
    private String password;
    public USER1(int id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    @Override
    public String toString() {
        return "USER1 [id=" + id + ", name=" + name + ", password=" + password + "]";
    }

}
