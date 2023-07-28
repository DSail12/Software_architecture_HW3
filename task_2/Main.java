package task_2;

public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Hello, world!");
        TextPrinter myTextPrinter = new ConsoleTextPrinter();
        Printer myPrinter = new Printer(myTextPrinter);

        myPrinter.print(myText); // Вывод текста
    }
}