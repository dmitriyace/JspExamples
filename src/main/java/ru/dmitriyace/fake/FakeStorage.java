package ru.dmitriyace.fake;

import ru.dmitriyace.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        User user = new User("a", "a", LocalDate.parse("1998-02-11"));
        User user1 = new User("y", "www", LocalDate.parse("1998-02-11"));
        User user2 = new User("b", "sss", LocalDate.parse("1998-02-11"));
        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public static FakeStorage storage(){
        return storage;
    }

    public List<User> users(){
        return users;
    }
}

