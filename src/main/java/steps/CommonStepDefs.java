package steps;

import cucumber.api.java.ru.И;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ru.sbtqa.tag.pagefactory.context.PageContext;
import ru.sbtqa.tag.pagefactory.environment.Environment;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;
import ru.sbtqa.tag.pagefactory.find.FindUtils;
import ru.sbtqa.tag.pagefactory.junit.CoreSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonStepDefs {

  private final CoreSteps coreSteps = new CoreSteps();

  @И("^(?:открывается раздел|появляется меню) \"([^\"]*)\"$")
  public void openPage(String title) throws PageInitializationException {
    coreSteps.openPage(title);
  }

  @И("^(?:пользователь |он |)(?:проверяет что отображается кнопка|проверяет что отображается|отображается кнопка|отображается элемент|отображается|отображается поле|отображается меню|отображается ссылка) \"([^\"]*)\"(?: с текстом|) \"([^\"]*)\"$")
  public void checkDisplayElement(String arg, String text) throws PageException {
    WebElement el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    Assert.assertTrue("Элемент " + arg + " не найден на странице", el.isDisplayed());
    Assert.assertEquals("Ожидание: " + text + ", реальность: " + el.getText().replaceAll("\n", " "), text, el.getText().replaceAll("\n", " "));
  }

  @И("^(?:ссылка )?\"([^\"]*)\" (?:равна|равен) \"([^\"]*)\"$")
  public void compareLink(String arg, String link) throws PageException {
    WebElement el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    Assert.assertEquals("Ожидание: " + link + ", реальность: " + el.getAttribute("href"), link, el.getAttribute("href"));
  }

  @И("^(?:отображается|отображается поле|отображается кнопка|отображается ссылка) \"([^\"]*)\"$")
  public void checkDisplayElement(String arg) throws PageException {
    WebElement el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    Assert.assertTrue("Элемент " + arg + " не найден на странице", el.isDisplayed());
  }

  @И("^отображаются \"([^\"]*)\"$")
  public void checkDisplayElements(String arg) throws PageException {
    List<WebElement> el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    Assert.assertTrue(el.size() > 1);
    for(WebElement element : el) {
      element.isDisplayed();
    }
  }

  @И("^отображаются \"([^\"]*)\" \"([^\"]*)\"$")
  public void checkCountElement(String count, String arg) throws PageException {
    List<WebElement> el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    Assert.assertEquals("Ожидание: " + Integer.parseInt(count) + ", реальность: " + el.size(), Integer.parseInt(count), el.size());
  }

  @И("^нажимает на(?: кнопку | ссылку | элемент | поле | )\"([^\"]*)\"$")
  public void click(String arg) throws PageException {
    WebElement el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    el.click();
  }

  @И("^(?:пользователь |он |)отображается многострочный \"([^\"]*)\"(?: c текстом|) \"([^\"]*)\"$")
    public void checkDisplayArrayElement(String arg, String text) throws PageException {
    String elementText = "";
    List<WebElement> el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
    for (WebElement element : el){
    Assert.assertTrue("Элемент " + arg + " не найден на странице", element.isDisplayed());
    elementText = elementText + element.getText();
    }
    elementText.replaceAll("\n", " ");
    Assert.assertEquals("Ожидание: " + text + ", реальность: " + elementText, text, elementText);
    }

}
