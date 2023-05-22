import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Main {

            interface addition {
                void sum(int a, int b);
            }
            interface subtraction {
                void sub(int a, int b);
            }
            interface multiply {
                void mult(int a, int b);
            }
            interface divide {
                void div(int a, int b);
            }
            public static void main(String[] args) {

                addition add = (int a, int b) -> System.out.println(a + b);

                add.sum(5, 7);

                subtraction minus = (int a, int b) -> System.out.println(a - b);

                minus.sub(10, 7);

                multiply product = (int a, int b) -> System.out.println(a * b);

                product.mult(5, 6);

                divide divide = (int a, int b) -> System.out.println(a / b);

                divide.div(10, 5);

                Predicate<String> isLong = (str) -> str.length() > 10;
                System.out.println(isLong.test("Whats going on good people?"));

                Function<String, String> toUpperCase = str -> str.toUpperCase();
                String str = "Whats going on good people?";
                System.out.println(toUpperCase.apply(str));

                Consumer<String> text = texts -> System.out.println("WHat's up good people?");
                String test = "Hey";
                text.accept(test);

                Supplier<Double> randomPassword = () -> Math.random();
                double num = randomPassword.get();
                System.out.println(num);



            }

        }



