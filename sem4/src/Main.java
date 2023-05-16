import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex4();
    }

    static void ex4() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.empty());
        System.out.println("количество элементов в стеке: " + stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
    static void ex2() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите строку: ");
            String line = scanner.nextLine();

            switch (line) {
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.printf("%s", iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                case "exit":
                    System.out.println("До скорой встречи");
                    work = false;
                    break;
                default:
            }
        }
    }

    static void ex1() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];

            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("До скорой встречи");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }

    static void ex0() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }

}

