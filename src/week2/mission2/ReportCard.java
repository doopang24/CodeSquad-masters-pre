package week2.mission2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Student {
    private String name;
    private int studentID;
    private String major;
    private int koreanGrade;
    private int mathGrade;
    private int englishGrade;
    int totalScore;
    double average;

    public Student(String name, int studentID, String major, int koreanGrade, int mathGrade, int englishGrade) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.koreanGrade = koreanGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        totalScore = koreanGrade + mathGrade + englishGrade;
        average = totalScore / 3.0;
    }
}

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
