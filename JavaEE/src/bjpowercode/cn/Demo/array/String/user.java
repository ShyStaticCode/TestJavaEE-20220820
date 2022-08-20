package bjpowercode.cn.Demo.array.String;

import java.util.Objects;

public class user {
    private int id;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return id == user.id &&
                age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age);
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }

    public user(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
