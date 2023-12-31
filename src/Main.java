import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import model.City;

public class Main {
  public static void main(String[] args) throws IOException {
    List<City> listCity = new ArrayList<>();

    try (FileInputStream fileInputStream =
            new FileInputStream("/Users/User/Downloads/Задача ВС Java Сбер.csv");
        final Scanner scanner = new Scanner(fileInputStream)) {

      while (scanner.hasNext()) {
        List<String> splitListString = Stream.of(scanner.nextLine().split(";")).skip(1).toList();
        Iterator<String> it = splitListString.iterator();
        listCity.add(
            new City(
                it.next(),
                it.next(),
                it.next(),
                Integer.parseInt(it.next()),
                it.hasNext() ? it.next() : ""));
      }
    }
    Map<String, Long> cityInRegion =
        listCity.stream().collect(Collectors.groupingBy(City::getRegion, Collectors.counting()));
    System.out.println(cityInRegion);
  }
}
