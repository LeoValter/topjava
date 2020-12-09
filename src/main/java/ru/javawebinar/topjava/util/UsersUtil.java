package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.List;

public class UsersUtil {

    private static final int START_SEQUENCE = 100_000;

    private static final int ADMIN_ID = START_SEQUENCE;
    private static final int USER_ID = START_SEQUENCE + 1;

    private static final User ADMIN = new User(ADMIN_ID, "Admin", "admin@mail.ru", "admin", Role.ADMIN);
    private static final User USER = new User(USER_ID, "User", "user@mail.ru", "user", Role.USER);
    public static List<User> users = Arrays.asList(
            new User(ADMIN),
            new User(USER)
    );

}
