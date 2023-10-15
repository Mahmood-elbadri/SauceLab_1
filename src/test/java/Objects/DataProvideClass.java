package Objects;

import org.testng.annotations.DataProvider;

public class DataProvideClass {
    @DataProvider(name = "IDS")
    public Object[][] users() {
        return new Object[][]{{"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"}, {
                "problem_user", "secret_sauce"
        }};
    }
}
