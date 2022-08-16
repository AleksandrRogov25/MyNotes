package com.example.mynotes;

import androidx.annotation.NonNull;

public class Notes {

    private final String name;
    private final String description;
    private final String date;



    public static final Notes[] note = {
            new Notes("Понедельник",
                    "Фрукты\nОвощи\nМолоко",
                    "05.05.2022"),
            new Notes("Вторник",
                    "Отредактировать первое задание\nВыполнить второе задание",
                    "06.06.2022"),
            new Notes("Среда",
                    "Варшавское шоссе\nул.Грина",
                    "16.05.2022"),
            new Notes("Четверг",
                    "Сделать что-нибудь",
                    "07.06.2022"),
            new Notes("Пятница",
                    "Сделать еще что-нибудь",
                    "07.06.2022")
    };

    private Notes(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    @NonNull
    public String toString() {
        return this.name;
    }
}

