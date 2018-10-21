package ru.dmitriyace.repos;

import ru.dmitriyace.models.Act;

import java.util.ArrayList;

public class ActsRepoMemoryImpl implements ActsRepo {

    private ArrayList<Act> acts;

    public ActsRepoMemoryImpl() {
        this.acts = new ArrayList<>();
        acts.add(new Act("рейвы", "Дима"));

        acts.add(new Act("улыбаться","Лиза"));
        acts.add(new Act("косячить", "Дима"));
        acts.add(new Act("быть зайкой","Лиза"));
    }

    @Override
    public ArrayList<Act> checkoutAllActs() {
        return this.acts;
    }
}
