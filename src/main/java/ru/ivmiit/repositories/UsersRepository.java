package ru.ivmiit.repositories;

import ru.ivmiit.models.User;

import java.util.List;

//Интерфейс, описывающий поведение объекта, предоставляющего доступ к данным (паттерн DAO)

public interface UsersRepository {
    List<User> findAll();
    void save(User user);
    boolean isExist(String name, String password);
}
