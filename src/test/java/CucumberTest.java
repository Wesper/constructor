import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.pagefactory.Tag;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty"},
        glue = {"ru.sbtqa.tag.stepdefs", "steps"},
        features = {"src/test/resources/features/"}
//        tags = {"@all"}
)

public class CucumberTest extends Tag {
}
