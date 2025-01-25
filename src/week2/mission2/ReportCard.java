package week2.mission2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReportCard {
    public static void main(String[] args) {
        String path = "C:\\intelij\\CodeSquad-PreCourse\\input.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다. " + e.getMessage());
        }
    }
}
