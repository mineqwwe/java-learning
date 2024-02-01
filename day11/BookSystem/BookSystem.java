package day11.BookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BookSystem {

    public static void main(String[] args) {

        Book b1 = new Book(
                "9787519876531",
                "Head First Java 实战(第三版)",
                "[美]凯西·希拉(Kathy Sierra),[美]伯特·贝茨(Bert Bates),[英]特丽莎·吉(Trisha Gee)",
                65);
        Book b2 = new Book(
                "9787115521644",
                "C++ Primer Plus 第6版 中文版",
                "[美] 史蒂芬·普拉达",
                59);
        Book b3 = new Book(
                "9787115615039",
                "R语言实战(第3版)",
                "[美]罗伯特 · I. 卡巴科弗(Robert I. Kabacoff)",
                60);

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------图书管理系统---------");
            System.out.println("1:添加图书");
            System.out.println("2:查询所有图书信息");
            System.out.println("3:查询单本图书信息");
            System.out.println("4:删除图书");
            System.out.println("5:修改图书的信息");
            System.out.println("6:退出系统");
            System.out.println();

            System.out.println("请输入数字：");
            String inCode = sc.next();
            loop: switch (inCode) {
                case "1" -> {
                    System.out.println("请输入图书ISBN:");
                    String ID = sc.next();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getID().equals(ID)) {
                            System.out.println("图库中存在相同ISBN的书籍!");
                            break loop;
                        }
                    }
                    System.out.println("请输入图书名字:");
                    String name = sc.next();
                    System.out.println("请输入图书作者:");
                    String author = sc.next();
                    System.out.println("请输入图书价格:");
                    int price = sc.nextInt();
                    Book newBook = new Book(ID, name, author, price);
                    books.add(newBook);
                    System.out.println("添加成功!");
                }
                case "2" -> {
                    System.out.println("编号\t书名\t作者\t价格");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i).toString());
                    }
                }
                case "3" -> {
                    System.out.println("请输入图书的ISBN:");
                    String ID = sc.next();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getID().equals(ID)) {
                            System.out.println(books.get(i).toString());
                            break loop;
                        }

                    }
                    System.out.println("没有对应ID的书籍");

                }
                case "4" -> {
                    System.out.println("请输入要删除图书的ISBN:");
                    String ID = sc.next();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getID().equals(ID)) {
                            books.remove(i);
                            System.out.println("删除成功!");
                            break loop;
                        }

                    }
                    System.out.println("没有对应ID的书籍");
                }
                case "5" -> {
                    System.out.println("请输入要修改图书的ISBN:");
                    String ID = sc.next();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getID().equals(ID)) {
                            System.out.println("请输入图书名字:");
                            String newName = sc.next();
                            books.get(i).setName(newName);
                            System.out.println("请输入图书作者:");
                            String newAuthor = sc.next();
                            books.get(i).setAuthor(newAuthor);
                            System.out.println("请输入图书价格:");
                            int newPrice = sc.nextInt();
                            books.get(i).setPrice(newPrice);
                            System.out.println("修改成功!");
                            break loop;
                        }

                    }
                    System.out.println("没有对应ID的书籍");
                }
                case "6" -> {
                    sc.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("没有对应操作");
                }
            }

        }

    }

}
