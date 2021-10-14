/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Author;
import entity.Book;
import entity.History;
import entity.UserData;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class App {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        UserData userData = new UserData();
        Book book = new Book();
        String repeat = "yes";
        do{
            System.out.println("Для продолжения прошу зарегестрируйтесь...");
            System.out.println("");
            System.out.println("Введите ваше имя");
            userData.setFirstName(scanner.nextLine());
            System.out.println("Введите вашу фамилию");
            userData.setLastName(scanner.nextLine());
            System.out.println("Введите ваш номер телефона");
            userData.setTelNumber(scanner.nextInt());
            System.out.println("Юзер иниирован как: "+userData.toString());
            System.out.println("");
            System.out.println("Выберете номер задачи: ");
            System.out.println("0: закрыть программу");
            System.out.println("1: Добавить книгу в вашу библиотеку");
            int task = scanner.nextInt(); scanner.nextLine();
            switch(task){
                case 0:
                    repeat = "no";
                    break;
                case 1:
                    book.setBookName("Voina i mir");
                    book.setReleaseYear(2010);
                    Author[] authors = new Author[1];
                    Author author = new Author();
                    author.setFirstName("Lev");
                    author.setLastName("Tolstoy");
                    author.setBirthYear(1828);
                    authors[0] = author;
                    book.setAuthors(authors);
                    System.out.printf("Добавлена книга в вашу библеотеку: "+book.toString()+"\n");
                default:
                    System.out.println("Выберете номер из списка!");
            }
        }while("yes".equals(repeat));
        System.out.println("Пока! :)");
    }
    
}
