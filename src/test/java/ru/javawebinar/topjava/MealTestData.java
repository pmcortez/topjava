package ru.javawebinar.topjava;



import ru.javawebinar.topjava.matcher.ModelMatcher;
import ru.javawebinar.topjava.model.BaseEntity;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;

public class MealTestData {

    public static final int MEAL1_ID = BaseEntity.START_SEQ + 2;

    public static final Meal MEAL1 = new Meal(MEAL1_ID, LocalDateTime.of(2015, 1, 6, 9, 0), "Завтрак", 500);
    public static final Meal MEAL2 = new Meal(MEAL1_ID + 1, LocalDateTime.of(2015, 1, 6, 13, 0), "Завтрак", 1000);
    public static final Meal MEAL3 = new Meal(MEAL1_ID + 2, LocalDateTime.of(2015, 1, 7, 0, 0), "Завтрак", 500);
    public static final Meal MEAL4 = new Meal(MEAL1_ID + 3, LocalDateTime.of(2015, 1, 7, 13, 0), "Завтрак", 1000);
    public static final Meal ADMIN_MEAL = new Meal(MEAL1_ID + 4, LocalDateTime.of(2015, 1, 6, 14, 0), "Завтрак", 510);

    public static Meal getCreated(){return new Meal(null, LocalDateTime.of(2015, 1, 8, 18, 0), "created", 300);}

    public static Meal getUpdated(){
        return new Meal(MEAL1_ID, MEAL1.getDateTime(), "updated", 200);
    }

    public static final ModelMatcher<Meal> MATCHER = new ModelMatcher<>();

}
