package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Информационная")
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

  @ElementTitle("Секция Установка и управление в домене")
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

  @ElementTitle("Секция Обратная связь")
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

}
