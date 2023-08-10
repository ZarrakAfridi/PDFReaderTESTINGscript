import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;

/*
 * open app
 * click start
 * press done
 * scroller
 */

public class FirstTestcase {
    AndroidDriver driver;
    WebElement Menu;
    WebElement fot;
    int flag=0;
    int flag_interstitial=0;
    ///////////////////////////////////language verfication variables////////////

    String arabic ="كل الملفات";
    String bengali = "সকল নথি";
    String chinese ="所有文件";
    String czech ="Všechny soubory";
    String english = "All Files";
    String french = "Tous les fichiers";
    String german ="Všechny soubory";
    String hindi = "सारे दस्तावेज";
    String indonesia = "Semua data";
    String italian = "Tutti i files";
    String japnese ="すべてのファイル";
    String korean = "모든 파일";
    String malaysia = "Semua fail";
    String  netherland_dutch = "Alle bestanden";
    String persian="تمام فایل های";
    String polish="Wszystkie pliki";
    String portuguse = "Todos os arquivos";
    String russian="Все файлы";
    String spanish ="Todos los archivos";
    String swedish = "Alla filer";
    String tamil ="அனைத்து கோப்புகள்";
    String thai="เอกสารทั้งหมด";
    String turkish = "Tüm dosyalar";
    String ukrain="Всі файли";
    String udru="تمام فائلیں";
    String vetnam="Tất cả các tệp";








    @BeforeClass(alwaysRun = true)
    public void init() throws Exception {

        System.out.println("control inserted in testcases file");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 10A");
        // cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 9A");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        cap.setCapability("udid", "QGOV6LJBAIRSCI9D");

        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

        cap.setCapability("appPackage", "com.pdfviewer.pdfreader.eagle.apps");
        cap.setCapability("appActivity", "com.pdfReaderApp.activities.MainActivity");
        cap.setCapability("autoGrantPermissions", "true");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);











    }

    @Test(priority = 1)
    void applicationopen()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        WebElement start = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvLetsStart"));
        start.click();
        System.out.println("open app");
    }
    /*   @Test(priority =2)
       void AddClose()
       {
           flag_interstitial++;
           if(flag_interstitial!=0){
               try {
                   Thread.sleep(4000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
              }
           else{
               System.out.println("\nBy default add hanling function call\n");
           }
       } */
    @Test(priority = 2)
    void AppClickDone()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        WebElement done = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/btnApply"));
        done.click();
        System.out.println("click on start ");
    }

/////////////////////////////////////////////////app open test cases complete///////////////////////////////

/*@Test(priority = 3)
void Add_Banner()
{
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
try
    {
        if(driver.findElement((By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView"))).isDisplayed())
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView")).click();
    }
catch (Exception e)
    {
    System.out.println("\nfull banner ad not found");
    }
}
*/





    @Test(priority = 3)
    void AppScroll()
    {


        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Dimension dim =driver.manage().window().getSize();
        int startsee_x=(int)(dim.width*0.5);
        int startsee_y=(int)(dim.height*0.9);

        int endsee_x=(int)(dim.width*0.5);
        int endsee_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee=new TouchAction(driver);
        //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee.press(PointOption.point(startsee_x,startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee_x,endsee_y)).release().perform();

    }







    @Test(priority = 5)
    void AppMenutoggleImport()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvImportPDF"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.navigate().back();
    }



    @Test(priority = 6)
    void AppMenutoggleShareApp()
    {
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvShare"));
        Menu.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
    }

    //    @Test(priority = 7)
//    void AppMenutoggleRate5stars()
//    {
//        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
//        Menu.click();
//
//        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvRateUs"));
//        Menu.click();
//        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
//        //    driver.navigate().back();
//        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ratingBar"));
//        Menu.click();
//    }
    @Test(priority = 8)
    void AppMenutoggleRateUs()
    {
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvRateUs"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
        //    driver.navigate().back();
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivClose"));
        Menu.click();
    }



    @Test(priority = 9)
    void AppMenutoggleShareBtn(){
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvFeedBack"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
    }
    @Test(priority = 10)
    void AppMenutoggleFeedback()
    {

//        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvFeedBack"));
//        Menu.click();
//        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/check1"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);



        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/feedback_send_button"));
        Menu.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

        driver.navigate().back();

        driver.navigate().back();
    }


    @Test(priority = 11)
    void AppMenutoggleNightMode()
    {
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        String status= "00000000-0000-00b0-ffff-ffff0000058e";

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/switchDayNight"));
        Menu.click();

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        //    String modename = Menu.getText();
        driver.navigate().back();
    }



    @Test(priority = 12)
    void AppFooterRecent() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement fot = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Recent\"]/android.view.ViewGroup/android.widget.TextView"));
        fot.click();

    }

    @Test(priority = 13)
    void AppFooterBookmarks() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        fot = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Bookmarks\"]/android.view.ViewGroup/android.widget.TextView"));
        fot.click();
    }
    @Test(priority = 14)
    void AppFooterOptions()
    {

        WebElement head = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivMainSearch"));
        head.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/etSearch")).sendKeys("sa");//put word  in search bar
        WebElement last = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout"));
        last.click();

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        driver.navigate().back();
    }

    //////////////////Language change and tests "LOCALIZATION CHECK"//////////////////////////////////
    @Test(priority = 15)
    void AppMenutoggleLanguage()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvLanguage"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<2;i++) {
            Dimension dim = driver.manage().window().getSize();
            int startsee_x = (int) (dim.width * 0.5);
            int startsee_y = (int) (dim.height * 0.9);

            int endsee_x = (int) (dim.width * 0.5);
            int endsee_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tssee = new TouchAction(driver);
            //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        }
        Menu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]"));
        Menu.click();

        WebElement language = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/btnApply"));
        language.click();
        // driver.navigate().back();
        AppSwipe();
    }
    @Test(priority = 16)
    void LanguageVerification()
    {
        WebElement element = (WebElement) driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/navigation_bar_item_large_label_view"));
        String elText = element.getText();
        if(arabic.equals(elText))
        {
            System.out.println("\nUser selected arabic language\n");
        }
        else if (bengali.equals(elText)) {
            System.out.println("\nUser selected bengali language\n");

        }
        else if (chinese.equals(elText))
        {
            System.out.println("\nUser selected chinese language\n");
        }
        else if (czech.equals(elText))
        {
            System.out.println("\nUser selected czech language\n");
        }
        else if (english.equals(elText))
        {
            System.out.println("\nUser selected english language\n");
        }
        else if (french.equals(elText))
        {
            System.out.println("\nUser selected french language\n");
        }
        else if (german.equals(elText))
        {
            System.out.println("\nUser selected german language\n");
        }
        else if (hindi.equals(elText))
        {
            System.out.println("\nUser selected hindi language\n");
        }
        else if (indonesia.equals(elText))
        {
            System.out.println("\nUser selected indonesian language\n");
        }
        else if (italian.equals(elText))
        {
            System.out.println("\nUser selected italian language\n");
        }
        else if (japnese.equals(elText))
        {
            System.out.println("\nUser selected japnese language\n");
        }
        else if (elText==korean)
        {
            System.out.println("\nUser selected korean language\n");
        }
        else if (malaysia.equals(elText))
        {
            System.out.println("\nUser selected Malaysia language\n");
        }
        else if (netherland_dutch.equals(elText))
        {
            System.out.println("\nUser selected Netherland dutch language\n");
        }
        else if (persian.equals(elText))
        {
            System.out.println("\nUser selected persian language\n");
        }
        else if (polish.equals(elText))
        {
            System.out.println("\nUser selected polish language\n");
        }
        else if (portuguse.equals(elText))
        {
            System.out.println("\nUser selected portuguse language\n");
        }
        else if (russian.equals(elText))
        {
            System.out.println("\nUser selected russian language\n");
        }
        else if (spanish.equals(elText))
        {
            System.out.println("\nUser selected spanish language\n");
        }
        else if (swedish.equals(elText))
        {
            System.out.println("\nUser selected swedish language\n");
        }
        else if (tamil.equals(elText))
        {
            System.out.println("\nUser selected tamil language\n");
        }
        else if (thai.equals(elText))
        {
            System.out.println("\nUser selected thailand language\n");
        }
        else if (turkish.equals(elText))
        {
            System.out.println("\nUser selected turkish language\n");
        }
        else if (ukrain.equals(elText))
        {
            System.out.println("\nUser selected ukrain language\n");
        }
        else if (udru.equals(elText))
        {
            System.out.println("\nUser selected urdu language\n");
        }
        else if (vetnam.equals(elText))
        {
            System.out.println("\nUser selected vetnam language\n");
        }
        else{
            System.out.println("\nNo language is match with the dictionary\nAs a result test failed: ");
            Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvShare"));
            Menu.click();

        }
    }




/////////////////////////////swipe testcase//////////////////////


    @Test(priority = 16)
    void AppMenutoggleLanguagePolish()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvLanguage"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<2;i++) {
            Dimension dim = driver.manage().window().getSize();
            int startsee_x = (int) (dim.width * 0.5);
            int startsee_y = (int) (dim.height * 0.9);

            int endsee_x = (int) (dim.width * 0.5);
            int endsee_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tssee = new TouchAction(driver);
            //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        }
        Menu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
        Menu.click();

        WebElement language = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/btnApply"));
        language.click();
        // driver.navigate().back();
        AppSwipe();
    }


    ////////////////////Task for all languages//////////////////////////////////

/*
    @Test(priority = 18)
    void AppMenutoggleLanguageSpanish()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvLanguage"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<2;i++) {
            Dimension dim = driver.manage().window().getSize();
            int startsee_x = (int) (dim.width * 0.5);
            int startsee_y = (int) (dim.height * 0.9);

            int endsee_x = (int) (dim.width * 0.5);
            int endsee_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tssee = new TouchAction(driver);
            //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        }
        Menu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]"));
        Menu.click();

        WebElement language = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/btnApply"));
        language.click();
        // driver.navigate().back();
        AppSwipe();
    }*/
/*
    @Test(priority = 19)
    void AppMenutoggleLanguageSwedish()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvLanguage"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<2;i++) {
            Dimension dim = driver.manage().window().getSize();
            int startsee_x = (int) (dim.width * 0.5);
            int startsee_y = (int) (dim.height * 0.9);

            int endsee_x = (int) (dim.width * 0.5);
            int endsee_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tssee = new TouchAction(driver);
            //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        }
        Menu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]"));
        Menu.click();

        WebElement language = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/btnApply"));
        language.click();
        // driver.navigate().back();
        AppSwipe();
    }

    @Test(priority = 20)
    void AppMenutoggleLanguageThai()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivDrawerToggle"));
        Menu.click();

        Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvLanguage"));
        Menu.click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<2;i++) {
            Dimension dim = driver.manage().window().getSize();
            int startsee_x = (int) (dim.width * 0.5);
            int startsee_y = (int) (dim.height * 0.9);

            int endsee_x = (int) (dim.width * 0.5);
            int endsee_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tssee = new TouchAction(driver);
            //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        }
        Menu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]"));
        Menu.click();

        WebElement language = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/btnApply"));
        language.click();
        // driver.navigate().back();
        AppSwipe();
    }

*/

    @Test(priority = 18)
    void AppSort() {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        WebElement sort_selection;
        WebElement option;
        WebElement sort_btn;

        for (int i = 1; i <= 6; i++) {
            option = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivSort"));
            option.click();

            switch(i){
                case 1:
                    sort_selection = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/rbNameSortAToZ"));
                    sort_selection.click();
                    sort_btn = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvSort"));
                    sort_btn.click();
                    try {
                        Thread.sleep(6000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    break;

                case 2:
                    sort_selection =   driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/cbNameSortZToA"));
                    sort_selection.click();
                    sort_btn = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvSort"));
                    sort_btn.click();
                    driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

                    break;

                case 3:
                    sort_selection =    driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/rbSizeLowToHigh"));
                    sort_selection.click();
                    sort_btn = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvSort"));
                    sort_btn.click();

                    break;

                case 4:
                    sort_selection =    driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/rbSizeHighToLow"));
                    sort_selection.click();
                    sort_btn = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvSort"));
                    sort_btn.click();

                    break;

                case 5:
                    sort_selection =   driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/rbDateOldToNew"));
                    sort_selection.click();
                    sort_btn = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvSort"));
                    sort_btn.click();

                    break;

                case 6:
                    sort_selection =    driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/rbDateNewToOld"));
                    sort_selection.click();
                    sort_btn = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvSort"));
                    sort_btn.click();
                    AppSwipe();
                    break;
            }

        }
    }

    @Test(priority = 140)
    void AppSwipe()
    {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);


        for(int i=0;i<=6;i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Dimension dim = driver.manage().window().getSize();
            int startsee_x = (int) (dim.width * 0.9);
            int startsee_y = (int) (dim.height * 0.5);

            int endsee_x = (int) (dim.width * 0.3);
            int endsee_y = (int) (dim.height * 0.5);
            @SuppressWarnings("rawtypes")
            TouchAction tssee = new TouchAction(driver);
            //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        }

    }
    @Test(priority = 19)
    void gridview()
    {
        WebElement  grid_selection =   driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/ivGrid"));
        grid_selection.click();



        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Dimension dim = driver.manage().window().getSize();
        int startsee_x = (int) (dim.width * 0.3);
        int startsee_y = (int) (dim.height * 0.5);

        int endsee_x = (int) (dim.width * 0.9);
        int endsee_y = (int) (dim.height * 0.5);
        @SuppressWarnings("rawtypes")
        TouchAction tssee = new TouchAction(driver);
        //  ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();


    }

}