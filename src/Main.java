public class Main {
    public static void main(String[] args) {

        // Задача 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName + " ";
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void Task2() {

        // Задача 2
        String fullName = "Ivanov Ivan Ivanovich";

        String apperFulneim = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + apperFulneim);

    }
    public static void Task3() {

        //Задача 3
        String fullName = "Иванов Семён Семёнович";
        String fixName = fullName.replace("ё", " ");
        System.out.println("Данные ФИО сотрудника — " + fixName);
    }
    }
