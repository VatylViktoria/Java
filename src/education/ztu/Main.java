package education.ztu;

import java.awt.desktop.SystemSleepEvent;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Task 2
        Printable printable = (String text) -> System.out.println(text);
        printable.print("text to print");

        // Task 3
        Predicate<String> predicate1 = (String string) -> string.matches("[0-9]+");
        Predicate<String> predicate2 = (String string) -> !string.matches("[_]*");
        System.out.printf("Text: %s%n", predicate1.and(predicate2).test("help"));
        System.out.printf("Number 666: %s%n", predicate1.and(predicate2).test("666"));
        Consumer<String> consumer1 = (String string) -> System.out.println("Пара почалася о 8:30");
        Consumer<String> consumer2 = (String string) -> System.out.println("Пара закінчилася о 9:50");
        Consumer<String> composedConsumer = (String string) -> consumer1.andThen(consumer2).accept(string);
        composedConsumer.accept("help");
        String text = "help for supplier";
        Supplier supplier = () -> System.out.printf(text.toUpperCase());
        supplier.get();
        Function<String, Integer> function = (String string) -> Arrays.stream(string.split(" "))
                .mapToInt(Integer::parseInt).reduce((x, y) -> x * y).orElse(0);
        System.out.printf("%n%s", function.apply("1 3 5 7 9 11"));

        // Task 4
        Product[] productsList = new Product[] {
                new Product("Продукт1", "Бренд1", 6, 6.66),
                new Product("Продукт2", "Бренд2", 66, 66.66),
                new Product("Продукт3", "Бренд3", 666, 666.66),
        };
        Stream<Product> products = Stream.of(productsList);
        System.out.println();
        System.out.println("Бренди");
        products.map(Product::getBrand).forEach(System.out::println);
        products = Stream.of(productsList);
        products.filter(x -> x.price < 1000).limit(2).forEach(x -> System.out.println(x.name));
        products = Stream.of(productsList);
        System.out.printf("Сума: %s", products.map(Product::getCount).reduce((x, y) -> x + y).orElse(0));
        products = Stream.of(productsList);
        products.collect(Collectors.groupingBy(Product::getBrand)).forEach((x, y) -> System.out.printf("Group: %s, Count: %s%n", x, y.size()));
        products = Stream.of(productsList);
        List<Product> sortedProducts = products.sorted(Comparator.comparing(x -> x.price)).collect(Collectors.toList());
        sortedProducts.forEach(x -> System.out.printf("%n%s: %s", x.name, x.price));

        // Task 6
        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 6};
        Optional<Integer[]> optional = Optional.ofNullable(numbers1);
        optional.ifPresentOrElse(nums -> System.out.printf("Максимальне значення: %s", Collections.max(Arrays.asList(nums))), () -> System.out.println("Числа відсутні"));
        System.out.println();
        Integer[] numbers2 = null;
        Optional<Integer[]> optionalEmpty = Optional.ofNullable(numbers2);
        optionalEmpty.ifPresentOrElse(nums -> System.out.printf("Максимальне значення: %s", Collections.max(Arrays.asList(nums))), () -> { System.out.println("Числа відсутні"); });


    }
}