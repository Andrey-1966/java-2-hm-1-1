class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int c;

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        if (b != 0) {
            c = calc.devide.apply(a, b);
        } else {
            c = -1;
        }

        calc.println.accept(a);

    }
}