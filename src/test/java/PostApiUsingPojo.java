import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class PostApiUsingPojo {
    public static void main(String[] args) {
        EmployeePojo ep = new EmployeePojo("bahadir", "qa engineer",
                new String[]{"selenium", "java"}, "XYZ", "bahadir@test.com");

        Response response = given()
                .auth()
                .none()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .when()
                .body(ep).log().all()
                .post("https://regres.in/api/users");
        Assert.assertEquals(response.body().path("name"),"bahadir");
        Assert.assertEquals(response.body().path("job"),"qa engineer");
        Assert.assertEquals(response.body().path("skills[0]"),"selenium");
        Assert.assertEquals(response.body().path("skills[1]"),"java");
        Assert.assertEquals(response.body().path("details.companyName"),"XYZ");
        Assert.assertEquals(response.body().path("details.emailId"),"bahadir@test.com");
        Assert.assertEquals(response.body().path("name"),"bahadir");

        System.out.println(response.getHeaders());
        System.out.println(response.getCookies());
        System.out.println(response.getHeaders());
    }

}
