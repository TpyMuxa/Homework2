public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog - 3.5 = " + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper);

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2; // +2
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7; // /7
        System.out.println("friend / 7 = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10; // * 10
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5; // / 3.5
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4; // + 4
        System.out.println("frog + 4 = " + frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightBoxer = firstBoxer + secondBoxer;
        System.out.println("Масса двух боксеров = " + weightBoxer + " кг");
        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница между массами бойцов = " + differenceWeight + " кг");

        differenceWeight = secondBoxer - firstBoxer; // из большей массы вычитаем меньшую
        System.out.println("Разница между массами бойцов = " + differenceWeight + " кг");
        differenceWeight = secondBoxer % firstBoxer; // находим разницу с помощью остаток от деления
        System.out.println("Разница между массами бойцов = " + differenceWeight + " кг");

        var openHour = 640; // всего часов работы
        var employeeHour = 8; // часы работы одного сотрудника
        var employeeNumber = openHour / employeeHour; // количество сотрудников в компании
        System.out.println("Всего работников в компании - " + employeeNumber + " человек");
        employeeNumber = employeeNumber + 94; // если в компании работает на 94 сотрудника больше
        openHour = employeeNumber * employeeHour; // всего часов работы, если в штате сотрудников больше на 94
        System.out.println("Если в компании работает " + employeeNumber + " человек, то всего " + openHour + " часов " +
                "работы может быть поделено между сотрудниками");



    }
}