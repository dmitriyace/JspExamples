package ru.dmitriyace.repos;

import ru.dmitriyace.models.Act;

import java.util.ArrayList;

public interface ActsRepo {
    ArrayList<Act> checkoutAllActs();
}
