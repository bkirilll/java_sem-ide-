import java.util.*;

public class Main {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Asus", 4, 250, "Windows", "Black");
        Notebook notebook2 = new Notebook("Huawei", 8, 500, "Windows", "Grey");
        Notebook notebook3 = new Notebook("Macbook", 8, 250, "MacOS", "White");
        Notebook notebook4 = new Notebook("Asus", 16, 1000, "Windows", "Red");
        Notebook notebook5 = new Notebook("Macbook", 6, 500, "MacOS", "White");
        Notebook notebook6 = new Notebook("Acer", 4, 250, "Linux", "Black");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        Set<Notebook> listNotebooks = result(filters(), notebooks);
        if (listNotebooks.isEmpty()) {
            System.out.println("Таких ноутбуков в наличии нет");
        } else {
            System.out.println(listNotebooks.toString());
        }

    }

    static Map<String, String> filters() {
        Map<String, String> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру или цифры, соответствующие необходимому критерию через пробел:" +
                "1 - Type, " +
                "2 - Ram, " +
                "3 - HDD, " +
                "4 - OS, " +
                "5 - Color, " +
                "6 - начать поиск, ");
        Integer number = scanner.nextInt();
        scanner.nextLine();

        while (number != 6) {
            if (number == 1) {
                System.out.println("Введите производителя ноутбука(Asus, Huawei, Macbook, Acer): ");
                String type = scanner.nextLine();
                filters.put("name", type);
            }
            if (number == 2) {
                System.out.println("Введите минимальное количество оперативной памяти: ");
                String num = scanner.nextLine();
                filters.put("ram", num);
            }
            if (number == 3) {
                System.out.println("Введите минимальный объем HDD: ");
                String num = scanner.nextLine();
                filters.put("hdd", num);
            }
            if (number == 4) {
                System.out.println("Введите тип OS(Windows, MasOS, Linux: ");
                String os = scanner.nextLine();
                filters.put("os", os);
            }
            if (number == 5) {
                System.out.println("Введите цвет ноутбука(Black, Grey, White, Red): ");
                String color = scanner.nextLine();
                filters.put("color", color);
            }
            System.out.println("Введите цифру или цифры, соответствующие необходимому критерию через пробел:" +
                    "1 - Type, " +
                    "2 - Ram, " +
                    "3 - HDD, " +
                    "4 - OS, " +
                    "5 - Color, " +
                    "6 - начать поиск, ");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        return filters;
    }

    static Set<Notebook> result(Map<String, String> filters, Set<Notebook> notebooks) {
        Set<Notebook> result = new HashSet<>(notebooks);
        if (filters.containsKey("name")) {
            for (Notebook notebook : notebooks) {
                if (!(notebook.getName().equals(filters.get("name")))) {
                    result.remove(notebook);
                }
            }
        }
        if (filters.containsKey("ram")) {
            for (Notebook notebook : notebooks) {
                int ram = Integer.parseInt(filters.get("ram"));
                if (notebook.getRam() < ram) {
                    result.remove(notebook);
                }
            }
        }
        if (filters.containsKey("hdd")) {
            for (Notebook notebook : notebooks) {
                int hdd = Integer.parseInt(filters.get("hdd"));
                if (notebook.getHdd() < hdd) {
                    result.remove(notebook);
                }
            }
        }
        if (filters.containsKey("os")) {
            for (Notebook notebook : notebooks) {
                if (!notebook.getOperationSystem().equals(filters.get("os"))) {
                    result.remove(notebook);
                }
            }
        }
        if (filters.containsKey("color")) {
            for (Notebook notebook : notebooks) {
                if (!notebook.getColor().equals(filters.get("color"))) {
                    result.remove(notebook);
                }
            }
        }
        return result;
    }
}