package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

import java.util.List;

@PageEntry(title = "Главная")
public class MainPage extends BasePage {

  @ElementTitle("Скачать браузер")
  @FindBy(className = "y-button__text")
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

  @ElementTitle("Секция Визуальные закладки")
  @FindBy(xpath = ".//*[@data-reactid = '90']")
  WebElement visualBookmarksSection;

  @ElementTitle("Заголовок в секции Визуальные закладки")
  @FindBy(xpath = ".//*[@data-reactid = '91']")
  WebElement visualBookmarksSectionHeadline;

  @ElementTitle("Текст в секции Визуальные закладки")
  @FindBy(xpath = ".//*[@data-reactid = '92']")
  WebElement visualBookmarksSectionText;

  @ElementTitle("Добавить в секции Визуальные закладки")
  @FindBy(id = "tablo-add-btn")
  WebElement visualBookmarksSectionAddButton;

  @ElementTitle("Секция Фон")
  @FindBy(xpath = ".//*[@data-reactid = '96']")
  WebElement backgroundsSection;

  @ElementTitle("Заголовок в секции Фон")
  @FindBy(xpath = ".//*[@data-reactid = '97']")
  WebElement backgroundsSectionHeadline;

  @ElementTitle("Текст в секции Фон")
  @FindBy(xpath = ".//*[@data-reactid = '98']")
  WebElement backgroundsSectionText;

  @ElementTitle("Превью фонов в секции Фон")
  @FindBy(xpath = ".//*[@data-reactid='99']/div")
  List<WebElement> backgroundsSectionPreview;

  @ElementTitle("Загрузить свой фон в секции Фон")
  @FindBy(id = "background-upload")
  WebElement backgroundsSectionUploadButton;

  @ElementTitle("Подсказка по загрузке своего фона в секции Фон")
  @FindBy(xpath = ".//*[@data-reactid = '122']")
  WebElement backgroundsSectionUploadHint;

  @ElementTitle("Секция Персональная лента")
  @FindBy(id = "zen-section")
  WebElement dzenSection;

  @ElementTitle("Заголовок в секции Персональная лента")
  @FindBy(xpath = ".//*[@data-reactid = '125']")
  WebElement dzenSectionHeadline;

  @ElementTitle("Текст в секции Персональная лента")
  @FindBy(xpath = ".//*[@data-reactid = '126']")
  WebElement dzenSectionText;

  @ElementTitle("Свитч в секции Персональная лента")
  @FindBy(xpath = ".//*[@data-reactid = '132']")
  WebElement dzenSectionSwitch;

  @ElementTitle("Секция Дополнения")
  @FindBy(id = "extensions-section")
  WebElement extensionsSection;

  @ElementTitle("Заголовок в секции Дополнения")
  @FindBy(xpath = ".//*[@data-reactid = '144']")
  WebElement extensionsSectionHeadline;

  @ElementTitle("Текст в секции Дополнения")
  @FindBy(xpath = ".//*[@data-reactid = '145']")
  WebElement extensionsSectionText;

  @ElementTitle("Добавить в секции Дополнения")
  @FindBy(id = "extensions-add-btn")
  WebElement extensionsSectionAddButton;

  @ElementTitle("Секция Статистика использования")
  @FindBy(id = "send_statistics-section")
  WebElement statisticSection;

  @ElementTitle("Заголовок в секции Статистика использования")
  @FindBy(xpath = ".//*[@data-reactid = '151']")
  WebElement statisticSectionHeadline;

  @ElementTitle("Текст в секции Статистика использования")
  @FindBy(xpath = ".//*[@data-reactid = '152']")
  WebElement statisticSectionText;

  @ElementTitle("Свитч в секции Статистика использования")
  @FindBy(xpath = ".//*[@data-reactid = '153']")
  WebElement statisticSectionSwitch;

  @ElementTitle("Количество выбранных дополнений")
  @FindBy(className = "edit-area__ext-count")
  WebElement extensionsCount;

  @ElementTitle("Сбросить настройки")
  @FindBy(id = "reset-btn")
  WebElement resetChangesButton;

}
