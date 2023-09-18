public class Main {
    public static void main(String[] args) {

        Main p = new Main();
        p.Task_1();
        System.out.println();
        p.Task_2();
        System.out.println();
        p.Task_3();
        System.out.println();

    }

    private void Task_1(){
    /*
        Представьте, что вы работаете в небольшой компании. Данные сотрудников
    хранятся в неструктурированном формате. Бухгалтерия попросила написать
    программу, в которой  можно работать с Ф. И. О. сотрудников.
    Напишите четыре строки:
    С именем firstName  — для хранения имени.
    С именем middleName  — для хранения отчества.
    С именем lastName  — для хранения фамилии.
    С именем fullName  — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
    Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
    В качестве данных для задачи используйте Ivanov Ivan Ivanovich.
    */
        System.out.println("Задача 1.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }

    private void Task_2(){
        /*
        Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О.
        сотрудников, полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan
        Ivanovich на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: «Данные Ф. И. О. сотрудника
        для заполнения отчета — …».
         */
        System.out.println("Задача 2.");
        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());
    }

    private void Task_3(){
        /*
        Система, в которой мы работаем, не принимает символ «ё». Напишите программу,
        которая заменяет символ «ё» на символ «е».
        В качестве исходных данных используйте строку fullName и данные в ней —
        «Иванов Семён Семёнович».
        Выведите результат программы в консоль в формате: «Данные Ф. И. О. сотрудника — ...».
         */
        System.out.println("Задача 3.");
        String fullName = "Иванов Семён Семёнович";
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fixedFullName);
    }



}