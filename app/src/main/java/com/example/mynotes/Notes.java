package com.example.mynotes;

public class Notes {

    private String name;
    private String description;
    private String date;



    public static final Notes[] note = {
            new Notes("Магазин",
                    "Фрукты\nОвощи\nМолоко",
                    "05.05.2022"),
            new Notes("Учеба",
                    "Отредактировать первое задание\nВыполнить второе задание",
                    "06.06.2022"),
            new Notes("Адреса",
                    "Варшавское шоссе\nул.Грина",
                    "16.05.2022"),
            new Notes("Должники",
                    "Иванов\nПетров\nСмирнов",
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
    public String toString() {
        return this.name;
    }
}

