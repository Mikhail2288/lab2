import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        main m = new main();
        //1.3
        out.println("1.3");
        name1 cleopatra = new name1(null, "Клеопатра", null);
        name1 pushkin = new name1("Пушкин", "Александр", "Сергеевич");
        name1 mayakovsky = new name1("Маяковский", "Владимир", null);
        out.println(cleopatra); // Клеопатра
        out.println(pushkin); // Пушкин Александр Сергеевич
        out.println(mayakovsky);//Маяковский Владимир
        //1.5
        out.println("1.5");
        house house1 = new house(1);
        house house2 = new house(5);
        house house3 = new house(23);
        out.println(house1);
        out.println(house2);
        out.println(house3);
        //2.4
        out.println("2.4");
        Department IT = new Department("IT"); //создание нового отдела IT

        Employee Petrov = new Employee("Петров", IT);//Петров
        Employee Kozlov = new Employee("Козлов", IT);//Козлов
        Employee Sidorov = new Employee("Сидоров", IT);//Сидоров

        IT.head = Kozlov; //объявляем Козлова начальником отдела IT

        out.println(Petrov);
        out.println(Kozlov);
        out.println(Sidorov);

        //3.4
        out.println("3.4");
        List<Employee> itEmployees = Petrov.getDepartmentEmployees();// Получение списка сотрудников отдела через ссылку на Петрова

        out.println("Список сотрудников отдела IT:");
        for (Employee employee : itEmployees) {
            out.println(employee.getName());
        }
        //4.5
        out.println("4.5");
        Name cleopatra2 = new Name("Клеопатра");
        Name pushkin2 = new Name("Александр", "Пушкин", "Сергеевич");
        Name mayakovsky2 = new Name("Владимир", "Маяковский");
        Name christodor2 = new Name("Христофор", "Бонифатьевич");
        out.println(cleopatra2); // Клеопатра
        out.println(pushkin2); // Пушкин Александр Сергеевич
        out.println(mayakovsky2);
        out.println(christodor2);

        //5.5
        out.println("5.5");
        try{
          out.print("Введите числитель первой дроби: ");
          int numerator1 = in.nextInt();
          out.print("Введите знаменатель первой дроби: ");
          int denominator1 = in.nextInt();
          if (denominator1 == 0) throw new IllegalArgumentException("Знаменатель не может быть равен 0! Неверный ввод.");
          fraction f1 = new fraction(numerator1, denominator1);
          out.print("Введите числитель второй дроби: ");
          int numerator2 = in.nextInt();
          out.print("Введите знаменатель второй дроби: ");
          int denominator2 = in.nextInt();
          if (denominator2 == 0) throw new IllegalArgumentException("Знаменатель не может быть равен 0! Неверный ввод.");
          fraction f2 = new fraction(numerator2, denominator2);
          out.print("Введите числитель третьтей дроби: ");
          int numerator3 = in.nextInt();
          out.print("Введите знаменатель третьтей дроби: ");
          int denominator3 = in.nextInt();
          if (denominator3 == 0) throw new IllegalArgumentException("Знаменатель не может быть равен 0! Неверный ввод.");
          fraction f3 = new fraction(numerator3, denominator3);
          fraction result = f1.sum(f2).divide(f3).minus(5);
          // Выводим результаты операций с дробями:
          out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
          out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
          out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
          out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
          // Выводим результаты операций с целыми числами:
          out.println(f1 + " + " + 5 + " = " + f1.sum(5));
          out.println(f1 + " - " + 5 + " = " + f1.minus(5));
          out.println(f1 + " * " + 5 + " = " + f1.multiply(5));
          out.println(f1 + " / " + 5 + " = " + f1.divide(5));
          // Выводим результат примера
          out.println(f1 + " + " + f2 + " / " + f3 + " - " + 5 + " = " + result);
        }
        catch (InputMismatchException e) {//catch для проверки на ввод целых чисел
            out.println("Ошибка ввода! Введите целое число.");
        } 
        catch (IllegalArgumentException e) { //catch для проверки на 0 в знаменателе
            out.println("Знаменатель не может быть равен 0! Введите другое значение.");
        }
        catch (ArithmeticException e){ //catch для проверки на 0 в числителе второй дроби при делении
            out.println("Числитель не может быть равен 0 в функции деления! Введите другое значение.");
        }
    }
}
