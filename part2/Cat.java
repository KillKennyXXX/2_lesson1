package lesson1.part2;

public class Cat {
    private Color color;

    static class A {}
    class B{}

    public Cat(Color color) {
        this.color = color;
    }

    private void foo(int a, int b) { //bar baz
        class Calculate {
            public int plus(int a, int b) {
                return a + b;
            }
            public int subtruct(int a, int b) {
                return a - b;
            }
        }
        Calculate calculate = new Calculate();
        Calculate calculate2 = new Calculate();
        System.out.println(calculate.plus(a, b));
        System.out.println(calculate.subtruct(a, b));
        System.out.println(calculate.subtruct(a, b));
        System.out.println(calculate.subtruct(a, b));
    }

    @Override
    public String toString() {
        return String.format("У кота цвет %s(%s)", color.getRussianColor(), color.getEnglishColor());
    }
}
