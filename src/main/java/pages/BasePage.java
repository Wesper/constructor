package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitles;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.context.PageContext;
import ru.sbtqa.tag.pagefactory.environment.Environment;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;
import ru.sbtqa.tag.pagefactory.find.FindUtils;

@PageEntry(title = "Базовая страница")
public class BasePage extends WebPage {

//  @ActionTitles({
//          @ActionTitle(value = "отображается кнопка"),
//          @ActionTitle(value = "отображается текст"),
//          @ActionTitle(value = "отображается поле"),
//          @ActionTitle(value = "отображается надпись"),
//          @ActionTitle(value = "проверяет что отображается кнопка"),
//          @ActionTitle(value = "проверяет что отображается текст"),
//          @ActionTitle(value = "проверяет что отображается поле"),
//          @ActionTitle(value = "проверяет что отображается надпись")
//  })
//  public void checkDisplayElement(String arg) throws PageException {
//    WebElement el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
//    Assert.assertTrue("Элемент " + arg + " не найден на странице", el.isDisplayed());
//    Assert.assertEquals("Ожидание: " + arg + ", реальность: " + el.getText(), arg, el.getText());
//  }

//  @ActionTitles({
//          @ActionTitle(value = "отображается")
//  })
//  public void checkDisplayElement(String arg) throws PageException {
//    WebElement el = ((FindUtils) Environment.getFindUtils()).getElementByTitle(PageContext.getCurrentPage(), arg);
//    Assert.assertTrue("Элемент " + arg + " не найден на странице", el.isDisplayed());
//  }

}
