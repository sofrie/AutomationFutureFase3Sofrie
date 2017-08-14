package group.future.id.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://www.blibli.com")
public class BlibliHomePage extends PageObject{
    @FindBy(id="gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy(id="gdn-login-modal-body")
    private WebElementFacade popopLoginForm;

    @FindBy(id="loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id="loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id="gdn-submit-login")
    private WebElementFacade submitLoginButton;

    @FindBy(id="gdn-already-login-label")
    private WebElementFacade alreadyLogin;

    @FindBy(name="s")
    private WebElementFacade inputSearch;

    @FindBy(id="gdn-search-button")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//*[@id=\"catalogProductListContentDiv\"]/div[1]/div/a")
    private WebElementFacade listProduk;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade gojekButton;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/section/div/div/div[1]/div[1]/h1")
    private WebElementFacade TerimaKasihTezt;

    @FindBy(id = "gdn-add-to-cart-top")
    private WebElementFacade cardButton;

    @FindBy(id="gdn-pop-up-shopping-bag")
    private WebElementFacade blibliCart;

    @FindBy(id="gdn-sb-popup-continue-checkout")
    private  WebElementFacade lanjutkanButton;


    @FindBy(id = "gdn-next-step")
    private WebElementFacade lanjutkan2Button;

    @FindBy(id = "gdn-payment-category-InternetBanking")
    private WebElementFacade InternetBankingRadioButton;

    @FindBy(id="gdn-payment-option-KlikBCA")
    private  WebElementFacade KlikBCA;

    @FindBy(id="payment_userid")
    private WebElementFacade BCAid;

    @FindBy(className="submit-checkout__label")
    private  WebElementFacade BayarSekarangButton;

    @FindBy(className = "payment-section")
    private WebElementFacade paymentSection;

    public WebElementFacade getTerimaKasihTezt() {
        return TerimaKasihTezt;
    }

    public void setTerimaKasihTezt(WebElementFacade terimaKasihTezt) {
        TerimaKasihTezt = terimaKasihTezt;
    }

    public Select selectInternetBanking()
    {
        Select select = new Select(getDriver().findElement(By.id("gdn-payment-option-KlikBCA")));
        return select;
    }

    public WebElementFacade getPaymentSection() {
        return paymentSection;
    }

    public void setPaymentSection(WebElementFacade paymentSection) {
        this.paymentSection = paymentSection;
    }

    public WebElementFacade getBayarSekarangButton() {
        return BayarSekarangButton;
    }

    public void setBayarSekarangButton(WebElementFacade bayarSekarangButton) {
        BayarSekarangButton = bayarSekarangButton;
    }

    public WebElementFacade getBCAid() {
        return BCAid;
    }

    public void setBCAid(WebElementFacade BCAid) {
        this.BCAid = BCAid;
    }

    public WebElementFacade getKlikBCA() {
        return KlikBCA;
    }

    public void setKlikBCA(WebElementFacade klikBCA) {
        KlikBCA = klikBCA;
    }

    public WebElementFacade getInternetBankingRadioButton() {
        return InternetBankingRadioButton;
    }

    public void setInternetBankingRadioButton(WebElementFacade internetBankingRadioButton) {
        InternetBankingRadioButton = internetBankingRadioButton;
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.className("cart-product-block"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }

    public WebElementFacade getLanjutkan2Button() {
        return lanjutkan2Button;
    }

    public void setLanjutkan2Button(WebElementFacade lanjutkan2Button) {
        this.lanjutkan2Button = lanjutkan2Button;
    }

    public WebElementFacade getLanjutkanButton() {
        return lanjutkanButton;
    }

    public void setLanjutkanButton(WebElementFacade lanjutkanButton) {
        this.lanjutkanButton = lanjutkanButton;
    }

    public WebElementFacade getBlibliCart() {
        return blibliCart;
    }

    public void setBlibliCart(WebElementFacade blibliCart) {
        this.blibliCart = blibliCart;
    }

    public WebElementFacade getCardButton() {
        return cardButton;
    }

    public void setCardButton(WebElementFacade cardButton) {
        this.cardButton = cardButton;
    }

    public WebElementFacade getGojekButton() {
        return gojekButton;
    }

    public void setGojekButton(WebElementFacade gojekButton) {
        this.gojekButton = gojekButton;
    }

    public WebElementFacade getListProduk() {
        return listProduk;
    }

    public void setListProduk(WebElementFacade listProduk) {
        this.listProduk = listProduk;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElementFacade loginButton) {
        this.loginButton = loginButton;
    }

    public WebElementFacade getPopopLoginForm() {
        return popopLoginForm;
    }

    public void setPopopLoginForm(WebElementFacade popopLoginForm) {
        this.popopLoginForm = popopLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public void setInputLoginEmail(WebElementFacade inputLoginEmail) {
        this.inputLoginEmail = inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public void setInputLoginPassword(WebElementFacade inputLoginPassword) {
        this.inputLoginPassword = inputLoginPassword;
    }

    public WebElementFacade getSubmitLoginButton() {
        return submitLoginButton;
    }

    public void setSubmitLoginButton(WebElementFacade submitLoginButton) {
        this.submitLoginButton = submitLoginButton;
    }

    public WebElementFacade getAlreadyLogin() {
        return alreadyLogin;
    }

    public void setAlreadyLogin(WebElementFacade alreadyLogin) {
        this.alreadyLogin = alreadyLogin;
    }

    public WebElementFacade getInputSearch() {
        return inputSearch;
    }

    public void setInputSearch(WebElementFacade inputSearch) {
        this.inputSearch = inputSearch;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElementFacade searchButton) {
        this.searchButton = searchButton;
    }
}
