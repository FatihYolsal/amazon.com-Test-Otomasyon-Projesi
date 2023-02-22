package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);
    @Given("Amazon.com sitesine git.")
    public void amazonComSitesineGit() {
        AmazonPages.AnaSayfa();
    }

    @When("Cookie kabul edilir.")
    public void cookieKabulEdilir() {
        AmazonPages.Cookie();
    }

    @When("Aramaya Airpods yazilir ve aranir.")
    public void aramayaAirpodsYazilirVeAranir() {
        AmazonPages.Arama();
    }

    @When("Urun sadece Amazon tarafindan gonderilir filtresi secilir.")
    public void urunSadeceAmazonTarafindanGonderilirFiltresiSecilir() {
        AmazonPages.Filtreleme();
    }

    @When("Marka Apple secilir.")
    public void markaAppleSecilir() {
        AmazonPages.MarkaSecimi();
    }

    @When("İlk urun secilir.")
    public void ilkUrunSecilir() {
        AmazonPages.UrunSecimi();
    }

    @When("Sepete eklenir.")
    public void sepeteEklenir() {
        AmazonPages.SepeteEkleme();
    }

    @When("Sepete gidilir.")
    public void sepeteGidilir() {
        AmazonPages.SepeteGit();
    }

    @Then("Urunun sepete geldigi kontrol edilir.")
    public void urununSepeteGeldigiKontrolEdilir() {
        AmazonPages.Kontrol();
    }
}
