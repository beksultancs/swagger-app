package swaggerapp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/myController")
public class MyRestController {

    @GetMapping("/findAll")
    public List<Test> findAll() {
        return List.of(
                new Test(),
                new Test(),
                new Test()
        );
    }

    @GetMapping("/find/{testId}")
    public Test findById(@PathVariable Long testId) {
        System.out.println("testId = " + testId);
        return new Test();
    }

    @PostMapping("/save")
    public Test save(@RequestBody Test test) {
        System.out.println("test = " + test);
        return test;
    }

}
