package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By Cookie = By.id("sp-cc-accept");
    static By Arama = By.id("twotabsearchtextbox");
    static By Buton = By.id("nav-search-submit-button");
    static By AmazonFiltreleme = By.xpath("//div[@id='deliveryRefinements']/ul[3]//i[@class='a-icon a-icon-checkbox']");
    static By MarkaSecimi = By.xpath("//span[.='Apple']");
    static By UrunSecimi = By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'] span:nth-child(1)");
    static By SepeteEkle = By.id("add-to-cart-button");
    static By Back = By.id("attach-close_sideSheet-link");
    static By SepeteGit = By.cssSelector("div[id='nav-cart-text-container'] span[class='nav-line-1']");
    static By SonKontrol = By.cssSelector(".a-truncate-cut");
    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void AnaSayfa() {
    }

    public static void Cookie() {
        elementHelper.click(Cookie);
    }

    public static void Arama() {
        elementHelper.click(Arama);
        elementHelper.anahtarGonder(Arama,"airpods");
        elementHelper.click(Buton);
    }

    public static void Filtreleme() {
        elementHelper.click(AmazonFiltreleme);
    }

    public static void MarkaSecimi() {
        elementHelper.click(MarkaSecimi);
    }

    public static void UrunSecimi() {
        elementHelper.click(UrunSecimi);
    }

    public static void SepeteEkleme() {
        elementHelper.click(SepeteEkle);
        elementHelper.click(Back);
    }

    public static void SepeteGit() {
        elementHelper.click(SepeteGit);
    }

    public static void Kontrol() {
        elementHelper.Kontrolet(SonKontrol);
    }
}
