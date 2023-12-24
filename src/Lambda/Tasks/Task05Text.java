package Lambda.Tasks;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Task05Text {

    public static void main(String[] args) throws IOException {
        Path erisilecekDosya2=Path.of("src/Lambda/Tasks/Task05TextFile");
        System.out.println("***TaskS1***");
        // S1:TextFile dosyasini yazdiralim
        Files.lines(erisilecekDosya2)
                .forEach(System.out::println);

        System.out.println("***TaskS2***");
        //S2: textFile dosyasinin tum harflari buyuk harf ile yazdiralim
        Files.lines(erisilecekDosya2)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("***TaskS3***");
        // S3: textFile dosyasinin son satirini buyuk harfle yazdiralim
        Files.lines(erisilecekDosya2)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("***TaskS4***");
        //S4: textFile dosyasinin 2.ve 3. satirlari yazdiralim
        Files.lines(erisilecekDosya2)
                .skip(1)
                .limit(2)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("***TaskS5***");
        //S5: textFile dosyasinda kac tane "icin" kelimesi vardir
        System.out.println(Files.lines(erisilecekDosya2)
                .filter(t -> t.contains("icin"))
                .count());

        System.out.println("***TaskS6***");
        //S6: textFile dosyasinin tum kelimeleri natural order  yazdiriniz.
        Files.lines(erisilecekDosya2)
                .map(t -> t.replaceAll(" ","").split(""))
                .flatMap(Arrays::stream)
                .sorted()
                .forEach(System.out::print);

        System.out.println("***TaskS6***");
        // S7: textFile dosyasinda kac tane "n" vardir
        System.out.println(Files.lines(erisilecekDosya2)
                .filter(t -> t.contains("n"))
                .count());
    }

}
