package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    @GetMapping("/studentList")
    public ResponseEntity getStudentList() {
        return ResponseEntity.ok(StudentsRepository.getStudentList());
    }
}
