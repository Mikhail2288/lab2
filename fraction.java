public class fraction { // сущность дробь
    private int numerator;
    private int denominator;//свойства

    public fraction(int numerator, int denominator) {//конструктор
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {//строковое представление вида “числитель/знаменатель”
        return numerator + "/" + denominator;
    }

    public fraction sum(fraction otherfraction) {//сложение дробей
        return new fraction(this.numerator * otherfraction.denominator + this.denominator * otherfraction.numerator, this.denominator * otherfraction.denominator);
    }

    public fraction minus(fraction otherfraction) {//вычитание
        return new fraction(this.numerator * otherfraction.denominator - this.denominator * otherfraction.numerator, this.denominator * otherfraction.denominator);
    }

    public fraction multiply(fraction otherfraction) {//умножение
        return new fraction(this.numerator * otherfraction.numerator, this.denominator * otherfraction.denominator);
    }

    public fraction divide(fraction otherfraction) {//деление
        return new fraction(this.numerator * otherfraction.denominator, this.denominator * otherfraction.numerator);
    }

    public fraction sum(int integer) {//сумма с целым числом
        return new fraction(this.numerator + integer * this.denominator, this.denominator);
    }

    public fraction minus(int integer) { //вычитание с целым числом
        return new fraction(this.numerator - integer * this.denominator, this.denominator);
    }

    public fraction multiply(int integer) {//умножениес целым числом
        return new fraction(this.numerator * integer, this.denominator);
    }

    public fraction divide(int integer) {//деление с целым числом
        return new fraction(this.numerator, this.denominator * integer);
    }
}