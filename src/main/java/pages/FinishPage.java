package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

import java.util.List;

@PageEntry(title = "Информационный")
public class FinishPage extends BasePage {

  @ElementTitle("Крестик выхода")
  @FindBy(className = "edit-area__close-view")
  WebElement exit;

  @ElementTitle("Заголовок")
  @FindBy(className = "edit-area__section-title")
  WebElement headline;

  @ElementTitle("Текст про ссылку")
  @FindBy(xpath = "(.//*[@class = 'edit-area__section-text'])[1]")
  WebElement textAboutLink;

  @ElementTitle("Поле с сформированной ссылкой на сборку")
  @FindBy(id = "thankyou-direct-download-link")
  WebElement downloadLinkField;

  @ElementTitle("Скопировать")
  @FindBy(xpath = ".//div[@class = 'thankyou__direct-link-wrap']/button")
  WebElement copyButton;

  @ElementTitle("Подзаголовок Установка и управление в домене")
  @FindBy(xpath = "(.//*[@class = 'edit-area__section-header'])[1]")
  WebElement installSection;

  @ElementTitle("Текст про установку")
  @FindBy(xpath = "(.//div[@class = 'thankyou__install-group']/*[@class = 'edit-area__section-text'])[1]")
  WebElement installSectionInstallText;

  @ElementTitle("Ссылка на инструкцию")
  @FindBy(xpath = "(.//div[@class = 'thankyou__install-group']/*[@class = 'edit-area__section-text']/a)[1]")
  WebElement installSectionInstallLink;

  @ElementTitle("Текст про управление")
  @FindBy(xpath = "(.//div[@class = 'thankyou__install-group']/*[@class = 'edit-area__section-text'])[2]")
  WebElement installSectionManageText;

  @ElementTitle("Ссылка на Групповые политики")
  @FindBy(xpath = "(.//div[@class = 'thankyou__install-group']/*[@class = 'edit-area__section-text']/a)[2]")
  WebElement installSectionManageGroupLink;

  @ElementTitle("Ссылка на admx")
  @FindBy(xpath = "(.//div[@class = 'thankyou__install-group']/*[@class = 'edit-area__section-text']/a)[3]")
  WebElement installSectionManageAdmxLink;

  @ElementTitle("Ссылка на adml")
  @FindBy(xpath = "(.//div[@class = 'thankyou__install-group']/*[@class = 'edit-area__section-text']/a)[4]")
  WebElement installSectionManageAdmlLink;

  @ElementTitle("Подзаголовок Обратная связь")
  @FindBy(xpath = "(.//*[@class = 'edit-area__section-header'])[2]")
  WebElement feedbackSection;

  @ElementTitle("Текст про обратную связь")
  @FindBy(xpath = "(.//*[@class = 'edit-area__section-text'])[4]")
  WebElement feedbackSectionText;

  @ElementTitle("Поле для ввода текста обратной связи")
  @FindBy(id = "thankyou-comment-text")
  WebElement feedbackSectionField;

  @ElementTitle("Текст про ввод почты")
  @FindBy(xpath = "(.//*[@class = 'edit-area__section-text'])[5]")
  WebElement feedbackSectionMailText;

  @ElementTitle("Поле для ввода почты")
  @FindBy(xpath = ".//*[@type = 'email']")
  WebElement feedbackSectionMailField;

  @ElementTitle("Отправить")
  @FindBy(id = "thankyou-send-btn")
  WebElement feedbackSectionSendButton;
//-----------------------

  @ElementTitle("Крестик закрытия попапа")
  @FindBy(className = "preview-area__popup-close")
  WebElement popupSectionExit;

  @ElementTitle("Ок")
  @FindBy(xpath = ".//button/span[@class = 'y-button__text']")
  WebElement popupSectionOkButton;

  @ElementTitle("Попап скачивания браузера")
  @FindBy(xpath = ".//div[contains(@class, 'y-popup__overlay_visible')]")
  WebElement popupSection;

  @ElementTitle("Заголовок попапа")
  @FindBy(xpath = ".//*[@class = 'preview-area__popup-close']/../div[2]/div")
  WebElement popupSectionHeadline;

  @ElementTitle("Текст попапа")
  @FindBy(xpath = ".//*[@class = 'preview-area__popup-close']/../div[2]/div/..//p")
  List<WebElement> popupSectionText;

  @ElementTitle("Ссылка на инструкцию в попапе")
  @FindBy(xpath = "(.//*[@class = 'preview-area__popup-close']/../div[2]/div/..//p/a)[1]")
  WebElement popupSectionInstallLink;

  @ElementTitle("Ссылка на Групповые политики в попапе")
  @FindBy(xpath = "(.//*[@class = 'preview-area__popup-close']/../div[2]/div/..//p/a)[2]")
  WebElement popupSectionManageGroupLink;

  @ElementTitle("Ссылка на admx в попапе")
  @FindBy(xpath = "(.//*[@class = 'preview-area__popup-close']/../div[2]/div/..//p/a)[3]")
  WebElement popupSectionManageAdmxLink;

  @ElementTitle("Ссылка на adml в попапе")
  @FindBy(xpath = "(.//*[@class = 'preview-area__popup-close']/../div[2]/div/..//p/a)[4]")
  WebElement popupSectionManageAdmlLink;

}
