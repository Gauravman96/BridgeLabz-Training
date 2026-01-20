public class BrowserBuddyMain {

    public static void main(String[] args) {

        BrowserTab browser = new BrowserTab();

        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");

        browser.back();
        browser.back();
        browser.forward();

        browser.closeTab();
        browser.showCurrentPage();

        browser.restoreTab();
        browser.showCurrentPage();
    }
}