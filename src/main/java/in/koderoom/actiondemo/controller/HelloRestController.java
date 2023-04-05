package in.koderoom.actiondemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/hello")
public class HelloRestController {

    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllRecords() {
        List<String> list = List.of("delhi", "calcutta", "chennai");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
