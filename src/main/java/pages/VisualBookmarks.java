package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Визуальные закладки")
public class VisualBookmarks extends BasePage{

  @ElementTitle("Секция Визуальные закладки")
  @FindBy(className = "edit-area__side-view-group")
  WebElement visualBookmarksSection;

  @ElementTitle("Заголовок в секции Визуальные закладки")
  @FindBy(xpath = ".//*[@class = 'edit-area__side-view-group']/*[@class = 'edit-area__section-header']")
  WebElement visualBookmarksSectionHeadline;

  @ElementTitle("Текст в секции Визуальные закладки")
  @FindBy(xpath = ".//*[@class = 'edit-area__side-view-group']/*[@class = 'edit-area__section-text']")
  WebElement visualBookmarksSectionText;

  @ElementTitle("Кнопка Добавить закладку в секции Визуальные закладки")
  @FindBy(className = "y-button__text")
  WebElement visualBookmarksSectionAddButton;

  @ElementTitle("Крестик выхода")
  @FindBy(className = "edit-area__close-view")
  WebElement exit;

  @ElementTitle("Закладок")
  @FindBy(xpath = ".//*[@class = 'y-input__control'  and not(contains(@placeholder, 'URL страницы'))]")
  WebElement bookmarks;

  @ElementTitle("Крестики удаления закладок")
  @FindBy(className = "edit-area__remove")
  WebElement deleteBookmark;

  @ElementTitle("Элементы для перемещения закладок")
  @FindBy(xpath = ".//*[@draggable='true']")
  WebElement draggableElement;

  @ElementTitle("Попап с текстом")
  @FindBy(xpath = ".//*[@class = 'validation-popup']")
  WebElement validateBookmark;

  @ElementTitle("Секция Стартовая страница")
  @FindBy(xpath = "(.//div[contains(., 'Стартовая страница')])[last()]")
  WebElement startPageSection;

  @ElementTitle("Заголовок в секции Стартовая страница")
  @FindBy(xpath = "(.//div[contains(., 'Стартовая страница')])[last()]/*[@class = 'edit-area__section-header']")
  WebElement startPageSectionHeadline;

  @ElementTitle("Текст в секции Стартовая страница")
  @FindBy(xpath = "(.//div[contains(., 'Стартовая страница')])[last()]/*[@class = 'edit-area__section-text']")
  WebElement startPageSectionText;

  @ElementTitle("Адрес стартовой страницы")
  @FindBy(xpath = ".//*[@placeholder = 'URL страницы']")
  WebElement startPageSectionAddress;

  @ElementTitle("Кнопка сохранить изменения")
  @FindBy(id = "tablo-sidebar-save-btn")
  WebElement saveChangesButton;


}
