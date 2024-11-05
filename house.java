public class house {
    private int floors;//свойство

    public house(int floors) {//конструктор для этажей
        this.floors = floors;
    }

    public String toString() {//метод toString
        String str = "дом с "+floors+" этаж";
        if (floors % 10 == 1 && floors != 11) return str+"ом";//заканчиваются на 1, без 11
        else return str+"ами";// все остальные случаи
    }
}