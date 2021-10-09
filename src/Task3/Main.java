package Task3;

import java.util.Scanner;

//Создайте класс DocumentWorker.
//        В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
//        В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
//        "Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
//        Создайте производный класс ProDocumentWorker.
//        Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
//        "Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
//        доступно в версии Эксперт".
//        Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
//        Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
//        "Документ сохранен в новом формате".
//        В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
//        Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
//        экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен
//        создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ключ доступа к программе: ");
        int key = sc.nextInt();
        DocumentWorker activeProgram = new DocumentWorker();
        switch(key) {
            case 1111: {
                System.out.println("Активирована ПРО версия");
                ProDocumentWorker upgradedProgram = (ProDocumentWorker) activeProgram;
                break;
            }
            case 2222: {
                System.out.println("Активирована Експертная версия");
                ExpertDocumentWorker upgradedProgram = (ExpertDocumentWorker) activeProgram;
                break;
            }
            default: System.out.println("Неверный код доступа, активирована базовая версия");
            }
        }
    }
