public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Car lada = new Car("Лада", "Гранта", "2015", "Россия", 5, "Хетчбэк", "изумрудный","1,5 л", "Автомат", "х000хх000",false,null,null,175.5, 57.49);
        lada.setTypeOfRubber(true);
        lada.changeTiresForSeasonalOnes();
        System.out.println(lada);
        lada.refill("бензином");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "2020", "Германия",  5, " ","чёрный", "3,0 л", "", "х000хх000",true,null,null, 329.9, 0.00);
        System.out.println(audi);
        System.out.println();
        System.out.println("Task 2");
        Train lastochka = new Train("Ласточка", "B-901", "2011", "Россия", null, 301, 3500, null, "Белорусский вокзал", "Минск-Пассажирский", 11, 57.47999);
        System.out.println(lastochka);
        Train leningrad = new Train("Ленинград", "D-125", "2019", "Россия", null, 270, 1700, null, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 0.01);
        System.out.println(leningrad);
        leningrad.refill("дизелем");
        System.out.println();
        System.out.println("Task 3");
        Bus paz3237 = new Bus("ПАЗ", "3237", "2017", "Россия", null, 135.9, 57);
        System.out.println(paz3237);
        Bus pazV = new Bus("ПАЗ", "Вектор", null, "Россия", "серый", 170, 0.00);
        System.out.println(pazV);
        pazV.refill("бензином ");
        Bus neman = new Bus("Неман", "420211-10", "2015", "Россия", "зеленый", 149, 57.49);
        System.out.println(neman);


    }
}