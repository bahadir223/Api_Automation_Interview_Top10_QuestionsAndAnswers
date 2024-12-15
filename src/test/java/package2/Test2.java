package package2;

import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import static package1.Test1.*; //* sayesinde Test1 class'ının bütün static olan methodlarına erişecek

public class Test2 {
    public static void main(String[] args) {
        // method2();
        // method3();

        Response getResponse = given()
                .param("page", 2)
                .auth().none()
                .when().get("https://reqres.in/api/users");
        //         .then()
        //         .statusCode(200).body("page", equalTo(2));

        System.out.println("Time is = " + getResponse.getTime());
        System.out.println("Time is = " + getResponse.getTimeIn(TimeUnit.SECONDS));
        System.out.println("Time is = " + getResponse.time());
        System.out.println("Time is = " + getResponse.timeIn(TimeUnit.SECONDS));


        //Test1 t1 = new Test1();
        //t1.method1();
    }


}
