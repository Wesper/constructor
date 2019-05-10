package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitles;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.context.PageContext;
import ru.sbtqa.tag.pagefactory.environment.Environment;
import ru.sbtqa.tag.pagefactory.exceptions.PageException;
import ru.sbtqa.tag.pagefactory.find.FindUtils;

import java.util.List;

@PageEntry(title = "Базовая страница")
public class BasePage extends WebPage {

  @ElementTitle("Скачать браузер")
  @FindBy(id = "download-btn")
  WebElement download;

  @ElementTitle("Версия браузера")
  @FindBy(className = "preview-area__download-btn-version")
  WebElement download_version;

  @ElementTitle("Лицензионное соглашение")
  @FindBy(className = "preview-area__license-text")
  WebElement licenseText;

  @ElementTitle("Ссылка на лицензионное соглашение")
  @FindBy(xpath = ".//span[@class = 'preview-area__license-text']/a")
  WebElement licenseLink;

  @ElementTitle("Лого Яндекс")
  @FindBy(className = "logoaas__yandex-link")
  WebElement logoYandex;

  @ElementTitle("Лого Браузер")
  @FindBy(className = "logoaas__service-link")
  WebElement logoBrowser;

  @ElementTitle("Преимущества")
  @FindBy(xpath = ".//nav[@class = 'head__menu']/a[1]")
  WebElement advantages;

  @ElementTitle("Документация")
  @FindBy(xpath = ".//nav[@class = 'head__menu']/a[2]")
  WebElement documentation;

  @ElementTitle("Задать вопрос")
  @FindBy(xpath = ".//nav[@class = 'head__menu']/a[3]")
  WebElement ask;

  @ElementTitle("Превью")
  @FindBy(xpath = ".//div[@class = 'preview-area__browser-bg']")
  WebElement preview;

  @ElementTitle("Лого Яндекс в превью")
  @FindBy(xpath = ".//div[@class = 'preview-area__browser-bg']//*[local-name()='svg']")
  WebElement logoPreview;

  @ElementTitle("Поисковая строка в превью")
  @FindBy(className = "preview-area__arrow")
  WebElement searchPreview;

  @ElementTitle("Закладок в превью")
  @FindBy(xpath = ".//*[@class='tablo__tumba-bg']")
  List<WebElement> bookmarksPreview;

  @ElementTitle("Кнопка Все закладки в превью")
  @FindBy(xpath = ".//*[@data-reactid = '69']")
  WebElement allBookmarksPreview;

  @ElementTitle("Кнопка Недавно закрытые в превью")
  @FindBy(xpath = ".//*[@data-reactid = '70']")
  WebElement latestClosedPreview;

  @ElementTitle("Кнопка Добавить в превью")
  @FindBy(xpath = ".//*[@data-reactid = '71']")
  WebElement addPreview;

  @ElementTitle("Кнопка Настроить экран в превью")
  @FindBy(xpath = ".//*[@data-reactid = '72']")
  WebElement adjustScreenPreview;

  @ElementTitle("Кнопка Геларея фонов в превью")
  @FindBy(xpath = ".//*[@data-reactid = '73']")
  WebElement backgroundsGalleryPreview;

  @ElementTitle("Дзен в превью")
  @FindBy(xpath = ".//*[@data-reactid = '74']")
  WebElement dzenPreview;

  @ElementTitle("Кнопка Показать фон в превью")
  @FindBy(xpath = ".//*[@data-reactid = '85']")
  WebElement showBackgroundsPreview;

  @ElementTitle("Войти")
  @FindBy(xpath = ".//*[@data-reactid = '14']")
  WebElement enter;

  @ElementTitle("Сбросить настройки")
  @FindBy(id = "reset-btn")
  WebElement resetChangesButton;

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
