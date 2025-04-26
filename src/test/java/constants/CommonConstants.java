package constants;

import dto.User;

public class CommonConstants {
    public static final String BASE_URI = "https://petstore.swagger.io/v2/";

    //test data
    public static final User DEFAULT_USER = User.builder()
            .username("username")
            .firstName("firstName")
            .lastName("lastName")
            .email("email")
            .password("password")
            .phone("phone")
            .userStatus(0)
            .build();

    public static final User USER_1 = User.builder()
            .username("chursovg")
            .firstName("Gena")
            .lastName("Chursov")
            .email("mentor.com")
            .password("123qwerty")
            .phone("1231123")
            .userStatus(0)
            .build();

    public static final User USER_2 = User.builder()
            .username("chursovg2")
            .firstName("Gena2")
            .lastName("Chursov2")
            .email("mentor.com")
            .password("123qwerty")
            .phone("1231123")
            .userStatus(0)
            .build();

    public static final User INVALID_USER = User.builder().build();
}
