import entity.GoodStudent;
import entity.NormalStudent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // DEMO cho câu 14 yêu cầu 3
        List<GoodStudent> goodStudent = Arrays.asList(
                new GoodStudent("Nguyễn Văn D","", "", "", "", "",  7.3f, ""),
                new GoodStudent("Nguyễn Văn B","", "", "", "", "", 7.2f, ""),
                new GoodStudent("Nguyễn Văn A", "", "", "", "", "", 7.2f, ""),
                new GoodStudent("Nguyễn Văn C","", "", "", "", "",  7.3f, "")
        );
        System.out.println("abc");
        List<GoodStudent> lgs = getSortedGoodStudentList(goodStudent).subList(0, 2);
        lgs.forEach(System.out::println);
    }


    public static List<GoodStudent> getSortedGoodStudentList(List<GoodStudent> playerList) {
        return playerList.stream().sorted(Comparator.comparing(GoodStudent::getGpa).reversed()
                .thenComparing(GoodStudent::getLastName)).collect(Collectors.toList());
    }

    public static List<NormalStudent> getSortedNormalStudentList(List<NormalStudent> playerList) {
        return playerList.stream().sorted(Comparator.comparing(NormalStudent::getEnglishScore).reversed()
                .thenComparing(NormalStudent::getLastName)).collect(Collectors.toList());
    }
}
