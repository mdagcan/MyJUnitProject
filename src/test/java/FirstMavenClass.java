import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMavenClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
    }
}
