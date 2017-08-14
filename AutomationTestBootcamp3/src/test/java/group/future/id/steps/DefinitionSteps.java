package group.future.id.steps;

import group.future.id.BlibliPackage.BlibliHomePageBehaviour;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import group.future.id.steps.serenity.EndUserSteps;

public class DefinitionSteps {

//    @Steps
//    EndUserSteps endUser;

    @Steps
    BlibliHomePageBehaviour blibliHomePageBehaviour;

//    @Given("the user is on the Wikionary home page")
//    public void givenTheUserIsOnTheWikionaryHomePage() {
//        endUser.is_the_home_page();
//    }
//
//    @When("the user looks up the definition of the word '$word'")
//    public void whenTheUserLooksUpTheDefinitionOf(String word) {
//        endUser.looks_for(word);
//    }
//
//    @Then("they should see the definition '$definition'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        endUser.should_see_definition(definition);
//    }


    @Given("open home page")
    public void givenOpenHomePage() {
        blibliHomePageBehaviour.open();
    }

    @When("I login to blibli")
    public void  loginToBlibli() {
        blibliHomePageBehaviour.clickUserLogin();
    }

    @Then("I can see my name in the site")
    public void thenSeeMyName()
    {
        blibliHomePageBehaviour.chechUserAlreadyLogin();
    }


    @Given("something page")
    public void minyakGorengPage() {
        blibliHomePageBehaviour.open();
    }

    @When("I search something")
    public void  searchMinyakGoreng() {
        blibliHomePageBehaviour.searchMinyakGoreng();
    }

    @When("I choose something")
    public void chooseMinyakGoreng() {
        blibliHomePageBehaviour.chooseMinyakGoreng();
    }

    @When("I can see something")
    public void seeMinyakGoreng()
    {
        blibliHomePageBehaviour.addMinyakGorengToBag();
        blibliHomePageBehaviour.goToBagPage();
    }

    @When("Lanjutkan Pembayaran")
    public void lanjutkaPembayaran()
    {
        blibliHomePageBehaviour.lanjutkanPembayaran();
    }

    @When("Pilih Internet Banking")
    public void pilihInternetBanking()
    {
        blibliHomePageBehaviour.chooseInternetBanking();
    }

    @When("Pilih KlikBCA")
    public void pilijKlikBCA()
    {blibliHomePageBehaviour.chooseKlikBCA();
    }

    @When("Input User BCA")
    public void inputUserBCA()
    {blibliHomePageBehaviour.inputUserBCA();
    }

    @When("Bayar Sekarang")
    public void bayarSekarang()
    {blibliHomePageBehaviour.bayarSekarang();
    }

    @Then("Go to Terima Kasih Page")
    public void terimaKasihPage()
    {
        blibliHomePageBehaviour.TerimaKasihPage();
    }

}
