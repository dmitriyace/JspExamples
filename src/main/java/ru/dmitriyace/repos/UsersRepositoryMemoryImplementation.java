package ru.dmitriyace.repos;

import ru.dmitriyace.models.User;

import javax.servlet.http.HttpServlet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryMemoryImplementation implements UsersRepository {
    private List<User> users;

    public UsersRepositoryMemoryImplementation() {
        this.users = new ArrayList<>();
        User user = new User("frae", "qwert", LocalDate.parse("1998-02-11"));
        User user1 = new User("frae", "qwert", LocalDate.parse("1998-02-11"));
        User user2 = new User("frae", "qwert", LocalDate.parse("1998-02-11"));
        users.add(user);
        users.add(user1);
        users.add(user2);

    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
        for (User userr: users){
            System.out.println(userr.getName());
            System.out.println(userr.getBirthDate());
            System.out.println(userr.getPassword());
            System.out.println("------------------------");
        }
    }
}
