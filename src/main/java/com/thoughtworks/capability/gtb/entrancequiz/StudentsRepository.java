package com.thoughtworks.capability.gtb.entrancequiz;

import java.util.Arrays;
import java.util.List;

public class StudentsRepository {
    public static List<String> getStudentList() {
        String[] studentList = {"成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰", "雅典娜", "芈月",
                "白起", "刘禅", "庄周", "马超", "刘备", "哪吒", "大乔", "蔡文姬"};
        return Arrays.asList(studentList);
    }
}
