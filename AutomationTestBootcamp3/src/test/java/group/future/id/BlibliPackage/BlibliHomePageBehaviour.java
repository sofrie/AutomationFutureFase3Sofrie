package group.future.id.BlibliPackage;

import group.future.id.pages.BlibliHomePage;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class BlibliHomePageBehaviour extends ScenarioSteps {
    BlibliHomePage blibliHomePage;

    @Step
    public void open()
    {
        getDriver().get("https://www.blibli.com/");
    }

    @Step
    public void clickUserLogin()
    {
        blibliHomePage.getLoginButton().click();
        blibliHomePage.getPopopLoginForm().waitUntilPresent().withTimeoutOf(500,TimeUnit.SECONDS);
        blibliHomePage.getInputLoginEmail().type("jetz1996@gmail.com");
        blibliHomePage.getInputLoginPassword().type("sqare0505");
        blibliHomePage.getSubmitLoginButton().click();
    }

    @Step
    public void chechUserAlreadyLogin()
    {
        blibliHomePage.getAlreadyLogin().isCurrentlyVisible();
    }


    @Step
    public void searchMinyakGoreng()
    {
        blibliHomePage.getInputSearch().type("totoro");
        blibliHomePage.getSearchButton().click();
        blibliHomePage.getGojekButton().click();

    }

    @Step
    public void chooseMinyakGoreng()
    {
        blibliHomePage.getListProduk().click();
    }

    @Step
    public void addMinyakGorengToBag()
    {
        blibliHomePage.getCardButton().click();
    }

    @Step
    public void goToBagPage()
    {
        blibliHomePage.getBlibliCart().isCurrentlyVisible();
        blibliHomePage.getLanjutkanButton().click();

    }

    @Step
    public void lanjutkanPembayaran()
    {
        blibliHomePage.getLanjutkan2Button().click();
    }

    @Step
    public void chooseInternetBanking()
    {
        blibliHomePage.selectInternetBanking();
    }

    @Step
    public void chooseKlikBCA()
    {
        blibliHomePage.getKlikBCA().selectByValue("KlikBCA");
    }

    @Step
    public void inputUserBCA()
    {
        blibliHomePage.getBCAid().type("paymentuserid");
    }


    @Step
    public void bayarSekarang()
    {
        blibliHomePage.getBayarSekarangButton().waitUntilPresent().withTimeoutOf(5, TimeUnit.SECONDS).click();

    }

    @Step
    public void TerimaKasihPage()
    {
        blibliHomePage.getTerimaKasihTezt().isCurrentlyVisible();
    }
}
