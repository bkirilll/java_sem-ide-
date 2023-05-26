public class Notebook {

    private String name;
    private int ram;
    private int hdd;
    private String operationSystem;
    private String color;

    public Notebook(String name, int ram, int hdd, String operationSystem, String color) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + "Тип: " + name +", ОЗУ: " + ram + ", Объем HDD: " + hdd + ", OS: " + operationSystem + ", Цвет: " + color;
    }
}

