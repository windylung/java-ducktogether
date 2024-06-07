package ducktogether.ducktogether.controller;

import ducktogether.ducktogether.service.MemberService;
import ducktogether.ducktogether.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(originPatterns = "*")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<Member> signUp(@RequestBody Member member) {
        Member savedMember = memberService.signUp(member);
        return new ResponseEntity<>(savedMember, HttpStatus.CREATED);
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}