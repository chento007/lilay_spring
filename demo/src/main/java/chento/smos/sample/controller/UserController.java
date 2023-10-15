package chento.smos.sample.controller;

import chento.smos.sample.base.BaseRest;
import chento.smos.sample.model.User;
import chento.smos.sample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public BaseRest<?> findAll() {

        List<User> userList = userService.findAll();

        return BaseRest.builder()
                .status(true)
                .code(HttpStatus.OK.value())
                .message("Users have been found successfully.")
                .timestamp(LocalDateTime.now())
                .data(userList)
                .build();
    }
}
