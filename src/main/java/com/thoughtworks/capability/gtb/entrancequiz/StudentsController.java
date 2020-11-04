package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//TODO GTB-完成度: * 只实现了返回学员列表的 API

@RestController
public class StudentsController {

    @GetMapping("/studentList")
    public ResponseEntity getStudentList() {
        return ResponseEntity.ok(StudentsRepository.getStudentList());
    }
}
