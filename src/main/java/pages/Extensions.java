package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Дополнения")
public class Extensions extends BasePage {

  @ElementTitle("Заголовок в секции Дополнения")
  @FindBy(className = "edit-area__section-header")
  WebElement extensionsHeadline;

  @ElementTitle("Текст в секции Дополнения")
  @FindBy(xpath = ".//*[@class = 'edit-area__section-text'][1]")
  WebElement extensionsText;

  @ElementTitle("Заголовок в секции Загрузить расширение")
  @FindBy(className = "edit-area__section-subheader")
  WebElement uploadExtensionHeadline;

  @ElementTitle("Текст в секции Загрузить расширение")
  @FindBy(xpath = ".//*[@class = 'edit-area__section-text'][2]")
  WebElement uploadExtensionText;

  @ElementTitle("ID расширения")
  @FindBy(className = "y-input__control")
  WebElement idExtension;

  @ElementTitle("Крестик выхода")
  @FindBy(className = "edit-area__close-view")
  WebElement exit;

  @ElementTitle("Секция Загрузки")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[1]")
  WebElement downloadSection;

  @ElementTitle("Дополнение SaveFrom.net")
  @FindBy(xpath = ".//div[contains(text(), 'Загрузки')]/..//div[@class = 'edit-area__ext-title']")
  WebElement saveFromNet;

  @ElementTitle("Текст дополнения SaveFrom.net")
  @FindBy(xpath = ".//div[contains(text(), 'Загрузки')]/..//span[@class = 'edit-area__ext-subtitle']")
  WebElement saveFromNetText;

  @ElementTitle("Свитч дополнения SaveFrom.net")
  @FindBy(xpath = ".//div[contains(text(), 'Загрузки')]/..//td[@class = 'edit-area__ext-tumblr']/span")
  WebElement saveFromNetSwitch;
//-------

  @ElementTitle("Секция Удобные инструменты")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[2]")
  WebElement handyToolsSection;

  @ElementTitle("Дополнение Turn Off The Lights")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//div[@class = 'edit-area__ext-title'])[1]")
  WebElement turnOffTheLights;

  @ElementTitle("Текст дополнения Turn Off The Lights")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//span[@class = 'edit-area__ext-subtitle'])[1]")
  WebElement turnOffTheLightsText;

  @ElementTitle("Свитч дополнения Turn Off The Lights")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//td[@class = 'edit-area__ext-tumblr']/span)[1]")
  WebElement turnOffTheLightsSwitch;
//-------

  @ElementTitle("Дополнение Турбо")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//div[@class = 'edit-area__ext-title'])[2]")
  WebElement turbo;

  @ElementTitle("Текст дополнения Турбо")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//span[@class = 'edit-area__ext-subtitle'])[2]")
  WebElement turboText;

  @ElementTitle("Свитч дополнения Турбо Авто")
  @FindBy(xpath = ".//div[contains(text(), 'Удобные инструменты')]/..//button[@value = 'auto']")
  WebElement turboSwitchAuto;

  @ElementTitle("Свитч дополнения Турбо Вкл")
  @FindBy(xpath = ".//div[contains(text(), 'Удобные инструменты')]/..//button[@value = 'on']")
  WebElement turboSwitchOn;

  @ElementTitle("Свитч дополнения Турбо Выкл")
  @FindBy(xpath = ".//div[contains(text(), 'Удобные инструменты')]/..//button[@value = 'off']")
  WebElement turboSwitchOff;
//-------

  @ElementTitle("Дополнение Lightshot")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//div[@class = 'edit-area__ext-title'])[3]")
  WebElement lightshot;

  @ElementTitle("Текст дополнения Lightshot")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//span[@class = 'edit-area__ext-subtitle'])[3]")
  WebElement lightshotText;

  @ElementTitle("Свитч дополнения Lightshot")
  @FindBy(xpath = "(.//div[contains(text(), 'Удобные инструменты')]/..//td[@class = 'edit-area__ext-tumblr']/span)[2]")
  WebElement lightshotSwitch;
//-------

  @ElementTitle("Секция Безопасность в сети")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[3]")
  WebElement networkSecurity;

  @ElementTitle("Дополнение Антишок")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//div[@class = 'edit-area__ext-title'])[1]")
  WebElement antishock;

  @ElementTitle("Текст дополнения Антишок")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//span[@class = 'edit-area__ext-subtitle'])[1]")
  WebElement antishockText;

  @ElementTitle("Свитч дополнения Антишок")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//td[@class = 'edit-area__ext-tumblr']/span)[1]")
  WebElement antishockSwitch;
//-------

  @ElementTitle("Дополнение Блокировка флеш-данных")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//div[@class = 'edit-area__ext-title'])[2]")
  WebElement flashBlock;

  @ElementTitle("Текст дополнения Блокировка флеш-данных")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//span[@class = 'edit-area__ext-subtitle'])[2]")
  WebElement flashBlockText;

  @ElementTitle("Свитч дополнения Блокировка флеш-данных")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//td[@class = 'edit-area__ext-tumblr']/span)[2]")
  WebElement flashBlockSwitch;
  //-------

  @ElementTitle("Дополнение Adguard")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//div[@class = 'edit-area__ext-title'])[3]")
  WebElement adguard;

  @ElementTitle("Текст дополнения Adguard")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//span[@class = 'edit-area__ext-subtitle'])[3]")
  WebElement adguardText;

  @ElementTitle("Свитч дополнения Adguard")
  @FindBy(xpath = "(.//div[contains(text(), 'Безопасность в сети')]/..//td[@class = 'edit-area__ext-tumblr']/span)[3]")
  WebElement adguardSwitch;
//-------

  @ElementTitle("Секция Покупки")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[4]")
  WebElement buy;

  @ElementTitle("Дополнение Советник")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//div[@class = 'edit-area__ext-title'])[1]")
  WebElement advisor;

  @ElementTitle("Текст дополнения Советник")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//span[@class = 'edit-area__ext-subtitle'])[1]")
  WebElement advisorText;

  @ElementTitle("Свитч дополнения Советник")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//td[@class = 'edit-area__ext-tumblr']/span)[1]")
  WebElement advisorSwitch;
//-------

  @ElementTitle("Дополнение Letyshops")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//div[@class = 'edit-area__ext-title'])[2]")
  WebElement letyshops;

  @ElementTitle("Текст дополнения Letyshops")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//span[@class = 'edit-area__ext-subtitle'])[2]")
  WebElement letyshopsText;

  @ElementTitle("Свитч дополнения Letyshops")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//td[@class = 'edit-area__ext-tumblr']/span)[2]")
  WebElement letyshopsSwitch;
//-------

  @ElementTitle("Дополнение AliTools")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//div[@class = 'edit-area__ext-title'])[3]")
  WebElement aliTools;

  @ElementTitle("Текст дополнения AliTools")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//span[@class = 'edit-area__ext-subtitle'])[3]")
  WebElement aliToolsText;

  @ElementTitle("Свитч дополнения AliTools")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//td[@class = 'edit-area__ext-tumblr']/span)[3]")
  WebElement aliToolsSwitch;
//-------

  @ElementTitle("Дополнение ГдеПосылка")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//div[@class = 'edit-area__ext-title'])[4]")
  WebElement  whereParcel;

  @ElementTitle("Текст дополнения ГдеПосылка")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//span[@class = 'edit-area__ext-subtitle'])[4]")
  WebElement whereParcelText;

  @ElementTitle("Свитч дополнения ГдеПосылка")
  @FindBy(xpath = "(.//div[contains(text(), 'Покупки')]/..//td[@class = 'edit-area__ext-tumblr']/span)[4]")
  WebElement whereParcelSwitch;
//-------

  @ElementTitle("Секция Управление")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[5]")
  WebElement control;

  @ElementTitle("Дополнение Evernote")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//div[@class = 'edit-area__ext-title'])[1]")
  WebElement evernote;

  @ElementTitle("Текст дополнения Evernote")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//span[@class = 'edit-area__ext-subtitle'])[1]")
  WebElement evernoteText;

  @ElementTitle("Свитч дополнения Evernote")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//td[@class = 'edit-area__ext-tumblr']/span)[1]")
  WebElement evernoteSwitch;
//-------

  @ElementTitle("Дополнение LastPass")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//div[@class = 'edit-area__ext-title'])[2]")
  WebElement lastPass;

  @ElementTitle("Текст дополнения LastPass")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//span[@class = 'edit-area__ext-subtitle'])[2]")
  WebElement lastPassText;

  @ElementTitle("Свитч дополнения LastPass")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//td[@class = 'edit-area__ext-tumblr']/span)[2]")
  WebElement lastPassSwitch;
//-------

  @ElementTitle("Дополнение Pocket")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//div[@class = 'edit-area__ext-title'])[3]")
  WebElement pocket;

  @ElementTitle("Текст дополнения Pocket")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//span[@class = 'edit-area__ext-subtitle'])[3]")
  WebElement pocketText;

  @ElementTitle("Свитч дополнения Pocket")
  @FindBy(xpath = "(.//div[contains(text(), 'Управление')]/..//td[@class = 'edit-area__ext-tumblr']/span)[3]")
  WebElement pocketSwitch;
//-------

  @ElementTitle("Секция Сервисы Яндекса")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[6]")
  WebElement yandexServices;

  @ElementTitle("Дополнение Музыка и Радио")
  @FindBy(xpath = "(.//div[contains(text(), 'Сервисы Яндекса')]/..//div[@class = 'edit-area__ext-title'])[1]")
  WebElement musicAndRadio;

  @ElementTitle("Текст дополнения Музыка и Радио")
  @FindBy(xpath = "(.//div[contains(text(), 'Сервисы Яндекса')]/..//span[@class = 'edit-area__ext-subtitle'])[1]")
  WebElement musicAndRadioText;

  @ElementTitle("Свитч дополнения Музыка и Радио")
  @FindBy(xpath = "(.//div[contains(text(), 'Сервисы Яндекса')]/..//td[@class = 'edit-area__ext-tumblr']/span)[1]")
  WebElement musicAndRadioSwitch;
//-------

  @ElementTitle("Дополнение Карточка")
  @FindBy(xpath = "(.//div[contains(text(), 'Сервисы Яндекса')]/..//div[@class = 'edit-area__ext-title'])[2]")
  WebElement card;

  @ElementTitle("Текст дополнения Карточка")
  @FindBy(xpath = "(.//div[contains(text(), 'Сервисы Яндекса')]/..//span[@class = 'edit-area__ext-subtitle'])[2]")
  WebElement cardText;

  @ElementTitle("Свитч дополнения Карточка")
  @FindBy(xpath = "(.//div[contains(text(), 'Сервисы Яндекса')]/..//td[@class = 'edit-area__ext-tumblr']/span)[2]")
  WebElement cardSwitch;
//-------

  @ElementTitle("Секция Каталог Opera")
  @FindBy(xpath = "(.//div[@class = 'edit-area__ext-group'])[6]")
  WebElement operaCatalog;

  @ElementTitle("Дополнение КриптоПро ЭЦП")
  @FindBy(xpath = "(.//div[contains(text(), 'Каталог Opera')]/..//div[@class = 'edit-area__ext-title'])[1]")
  WebElement criptoPro;

  @ElementTitle("Текст дополнения КриптоПро ЭЦП")
  @FindBy(xpath = "(.//div[contains(text(), 'Каталог Opera')]/..//span[@class = 'edit-area__ext-subtitle'])[1]")
  WebElement criptoProText;

  @ElementTitle("Свитч дополнения КриптоПро ЭЦП")
  @FindBy(xpath = "(.//div[contains(text(), 'Каталог Opera')]/..//td[@class = 'edit-area__ext-tumblr']/span)[1]")
  WebElement criptoProSwitch;
//-------

  @ElementTitle("Кнопка Сохранить изменения")
  @FindBy(id = "extensions-save-btn")
  WebElement saveChangesButton;

}
