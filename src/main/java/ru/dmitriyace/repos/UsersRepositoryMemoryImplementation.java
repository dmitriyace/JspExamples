package ru.dmitriyace.repos;

import ru.dmitriyace.fake.FakeStorage;
import ru.dmitriyace.models.User;

import java.util.List;

public class UsersRepositoryMemoryImplementation implements UsersRepository {


    @Override
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
       FakeStorage.storage().users().add(user);

//        for (User userr: users){
//            System.out.println(userr.getName());
//            System.out.println(userr.getBirthDate());
//            System.out.println(userr.getPassword());
//            System.out.println("------------------------");
//        }
    }

    @Override
    public boolean isExist(String name, String password) {
        System.out.println("----------------------");
        System.out.println();
        for (User user: FakeStorage.storage().users()){
            System.out.println(user.getPassword()+":"+user.getName());
            if (user.getName().equals(name) &&
                    user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
