package com.ebizu.zoukebc.scenario.ebc;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import net.thucydides.core.annotations.Steps;
import com.ebizu.zoukebc.steps.EbcSteps;

public class EbcScenarioSteps {
	
	@Steps
	private EbcSteps ebcSteps;
	
	@Given ("on page view")
	public void openLoginPage(){
		ebcSteps.openLoginPage();
	}
	
	@When ("insert username <$username>")
	public void insertUsername(String username) {
		
		ebcSteps.insertUsername(username);
	}
	
	@When("insert password <$password>")
	public void insertPassword(String password){
		ebcSteps.insertPassword(password);
	}
	
	@When("click login")
	public void clickLogin(){
		ebcSteps.clickLogin();
	}
	
	@When("assert dashboard")
	public void assertDashboard(){
		ebcSteps.assertDasboard();
	}
	
	 @Then("login success")
	    public void loginsuccess(){
	        System.out.println("LOGIN SUCCESSFUL!!");
	    }
	
	 //new promotion scenario
	 @Given ("click promotions")
	 public void clickPromotionsMenu(){
		 ebcSteps.clickPromotionsMenu();
	 }
	 @When ("click manage promotions")
	 public void clickManagePromotions(){
		 ebcSteps.clickManagePromotions();
	 }
	 
	 @When( "click new promotions")
	 public void clickNewPromotions(){
		 ebcSteps.clickNewPromotion();
	 }
	 
	 @When ("insert room <$room>")
	 public void insertPromoRoom(String room) throws Exception{
		 Thread.sleep(3000);
		 ebcSteps.insertPromoRoom(room);
	 }
	
	 @When ("insert offer name <$offername>")
	 public void insertOfferName(String offername){
		 ebcSteps.insertOfferName(offername);
	 }
	 
	 @When ("insert start date <$startdate>")
	 public void insertPromoStartDate(String startdate){
		 ebcSteps.insertPromoStartDate(startdate);
	 }
	 
	 @When ("insert end date <$enddate>")
	 public void insertPromoEndDate(String enddate){
		 ebcSteps.insertPromoEndDate(enddate);
	 }
	 
	 @When ("insert description <$description>")
	 public void insertPromoDesc(String description){
		 ebcSteps.insertPromoDesc(description);
	 }
	
	 @When ("insert terms")
	 public void insertPromoTerms(){
		 ebcSteps.insertPromoTerms();
	 }
	 
	 @When ("select banner <$banner>")
	 public void selectPromoBanner(String banner) {
		 ebcSteps.selectPromoBanner(banner);
		
		 
	 }
	 
	 @When ("click save")
	 public void clickSavePromo() {
		 ebcSteps.clickSavePromo();
		 
	 }
	 
	 @When ("notif save showup")
	 public void assertPromoSaveNotif(){
		 ebcSteps.assertSavePromoNotif();
	 }
	 
	//the end of new promotions
	 
	 @Given ("search promotions <$offernameedt>")
	 public void searchPromoByTitle(String offernameedt) throws Exception{
		 ebcSteps.searchPromoByTitle(offernameedt);
		 Thread.sleep(5000);
	 }
	 
	 @When("click edit promotions")
	 public void clickEditPromo(){
		 ebcSteps.clickEditPromo();
	 }
	 
	 @When("click save for edit promo")
	 public void clickSaveEditPromo() throws Exception{
		
		 ebcSteps.clickSaveEditPromo();
		 
		 
	 }
	 
	 //the end of edit promotions
	 
	 @When("click delete promotions")
	 public void clickDeletePromo()throws Exception{
		 ebcSteps.clickDeletePromo();
	 }
	 
	//the end of delete promotions
	 
	 @Given ("click menu events")
	 public void clickMenuEvents()throws Exception{
		 Thread.sleep(3000);
		 ebcSteps.clickEventsMenu();
	 }
	 @When ("click manage menu")
	 public void clickManageEvents() throws Exception{
		 Thread.sleep(3000);
		 ebcSteps.clickManageEvents();
	 }
	 @When ("click new event")
	 public void clickNewEvent(){
		 ebcSteps.clickNewEvent();
	 }
	 @When ("insert room event <$room>")
	 public void insertRoomEvent(String room){
		 ebcSteps.selectRoomEvent(room);
	 }
	 @When ("insert category event <$category>")
	 public void insertCategoryEvent(String category){
		 ebcSteps.selectCategoryEvent(category);
	 }
	 @When ("insert date event <$date>")
	 public void insertDateEvent(String date){
		 ebcSteps.insertDateEvent(date);
	 }
	 @When ("insert name event <$name>")
	 public void insertEventName(String name){
		 ebcSteps.insertNameEvent(name);
	 }
	 @When ("insert body event <$body>")
	 public void insertBodyEvent(String body){
		 ebcSteps.insertBodyEvent(body);
	 }
	 @When ("insert supportby event <$supportby>")
	 public void insertSupportEvent(String supportby){
		 ebcSteps.insertSupportEvent(supportby);
	 }
	 @When ("insert ticketprice event <$ticketprice>")
	 public void insertTicketPrice(String ticketprice){
		 ebcSteps.insertTicketPrice(ticketprice);
	 }
	 @When ("select banner event <$banner>")
	 public void seectBannerEvent(String banner){
		 ebcSteps.selectBannerEvent(banner);
	 }
	 @When ("insert website event <$website>")
	 public void insertWebsite(String website){
		 ebcSteps.insertWebsiteEvent(website);
	 }
	 @When ("insert video event <$video>")
	 public void insertVideo(String video){
		 ebcSteps.insertVideoEvent(video);
	 }
	 @When ("insert category price event <$categoryprice>")
	 public void selectCategoryPrice(String categoryprice){
		 ebcSteps.selectCategoryPrice(categoryprice);
	 }
	 @When ("insert guestlist event <$guestlist>")
	 public void selectGuestList(String guestlist){
		 ebcSteps.selectGuestlist(guestlist);
	 }
	 @When ("insert guestlisturl event <$guestlisturl>")
	 public void insertGuestlistUrl(String guestlisturl){
		 ebcSteps.insertGuestlistUrl(guestlisturl);
	 }
	 @When ("click save event")
	 public void clickSaveEvent() throws Exception{
		 ebcSteps.clickSaveEvent();
	 }
	 
	 //this is the end of add new event
	 
	 @Given ("search event <$nameedt>")
	 public void searchEventbyName(String nameedt) throws Exception{
		 Thread.sleep(5000);
		 ebcSteps.searchEventbyName(nameedt);
		 Thread.sleep(9000);
	 }
	 @When ("click edit event")
	 public void clickEditEvent(){
		 ebcSteps.clickEditEvent();
	 }
	 @When("assert event edit <$nameedt>")
	 public void assertEditEvent(String nameedt){
		 
		 ebcSteps.assertEditEvent(nameedt);
	 }
	 
	 
	 @When ("click save edit event")
	 public void clickSaveEditEvent() {
		 ebcSteps.clickSaveEditEvent();
	 }
	 
	 //this is the end of edit event
	 
	 @When("event selected <$nameedt>")
	 public void assertEventtoDelete(String nameedt){
		 ebcSteps.assertEventtoDelete(nameedt);
	 }
	 @When ("click delete event")
	 public void clickDeleteEvent()throws Exception{
		 ebcSteps.clickDeleteEvent();
	
	 }
	 
	 //this is the end of delete event
	 
	 @Given ("click event category menu")
	 public void clickEventCatMenu(){
		 ebcSteps.clickEventCatMenu();
		 
	 }
	 @When ("click new event category")
	 public void clickNewEventCat(){
		 ebcSteps.clickNewEventCat();
	 }
	 @When ("insert name event category <$name>")
	 public void insertNameEventCat(String name){
		 ebcSteps.insertNameEventCat(name);
	 }
	 @When ("insert description event category <$description>")
	 public void insertDescEventCat(String description){
		 ebcSteps.insertDescEventCat(description);
	 }
	 
	 @When("click save event category")
	 public void clickSaveEventCat() throws Exception{
		 ebcSteps.clickSaveEventCat();
		 
	 }
	 
	 //this is the end of new event category
	 
	 @Given("click edit event category")
	 public void clickEditEventCat(){
		 ebcSteps.clickEditEventCat();
	 }
	 @When ("assert edit event category <$nameedt>")
	 public void assertEditEventCat(String nameedt)throws Exception{
		 ebcSteps.assertEditEventCat(nameedt);
		
	 }
	 
	 //this is the end of edit event category
	 
	 @Given ("assert delete event category <$name>")
	 public void assertDeleteEventCat(String name){
		 ebcSteps.assertEventCatforDelete(name);
	 }
	 @When ("click delete event category")
	 public void clickDeleteEventCat() throws Exception{
		 ebcSteps.clickDeleteEventCat();
	 }
	 
	 //this is the end of delete event category
	 
	 @Given ("click products menu")
	 public void clickProductsMenu()throws Exception{
		 Thread.sleep(3000);
		 ebcSteps.clickProductsMenu();
	 }
	 @When ("click manage products menu")
	 public void clickManageProducts(){
		 ebcSteps.clickManageProducts();
	 }
	 @When("click new product")
	 public void  clickNewProduct(){
		 ebcSteps.clickNewProduct();
	 }
	 @When("insert product name <$name>")
	 public void insertProductName(String name){
		 ebcSteps.insertProductName(name);
	 }
	 @When("select prod category <$category>")
	 public void selectProdCat(String category){
		 ebcSteps.selectProdCat(category);
	 }
	 @When("insert prod mixer <$mixer>")
	 public void insertProdMixer(String mixer){
		 ebcSteps.insertProdMixer(mixer);
	 }
	 @When("insert prod description <$description>")
	 public void insertProdDesc(String description){
		 ebcSteps.insertProdDesc(description);
	 }
	 @When("insert prod brand <$brand>")
	 public void  insertProdBrand(String brand){
		 ebcSteps.insertProdBrand(brand);
	 }
	 @When("insert prod curtype <$curtype>")
	 public void  insertProdCurrencyType(String curtype){
		 ebcSteps.insertCurrencyType(curtype);
	 }
	 @When("insert prod categoryprice <$categoryprice>")
	 public void insertProdCategoryPrice(String categoryprice){
		 ebcSteps.insertCatPrice(categoryprice);
	 }
	 @When("insert prod size <$size>")
	 public void insertProdSize(String size){
		 ebcSteps.insertProdSize(size);
	 }
	 @When("insert prod color <$color>")
	 public void inserTProdColor(String color){
		 ebcSteps.insertProdColor(color);
		 
	 }
	 @When("insert prod sku <$sku>")
	 public void insertProdSku(String sku){
		 ebcSteps.insertProdSKU(sku);
	 }
	 @When("insert prod barcode <$barcode>")
	 public void insertProdBarcode(String barcode){
		 ebcSteps.insertBardcode(barcode);
	 }
	 @When("insert prod sellprice <$sellprice>")
	 public void insertProdSellprice(String sellprice){
		 ebcSteps.insertSellinngPrice(sellprice);
	 }
	 @When("insert prod remark <$remark>")
	 public void  insertProdRemark(String remark){
		 ebcSteps.insertProdRemark(remark);
	 }
	 @When("select prod custodystatus <$custodystatus>")
	 public void selectProdCustodyStat(String custodystatus){
		 ebcSteps.selectCustodyStatus(custodystatus);
	 }
	 @When("select prod rsvnstatus <$rsvnstatus>")
	 public void  selectProdRSVNStat(String rsvnstatus){
		 ebcSteps.selectRSVNStatu(rsvnstatus);
	 }
	 @When("assert prod costprice <$costprice>")
	 public void assertProdCostPrice(String costprice){
		 ebcSteps.assertCostPrice(costprice);
	 }
	 @When("assert prod profitmargin <$profitmargin>")
	 public void assertProfitMargin(String profitmargin){
		 ebcSteps.assertProfitMargin(profitmargin);
	 }
	 @When("click save product")
	 public void  clickSaveProduct(){
		 ebcSteps.clickSaveProduct();
	 }
	 @Then ("save product success")
	 public void assertNotifProdSave(){
		 ebcSteps.assertSaveProductNotif();
	 }
	 //this is the end of new product
	 
	 @Given ("search product name <$nameedt>") 
	 public void searchProductbyName(String nameedt) throws Exception{
		 ebcSteps.searchProductByName(nameedt);
	 }
	 @When ("click edit products") 
	 public void clickEditProduct(){
		 ebcSteps.clickEditProduct();
	 }
	 @When ("assert product edited <$nameedt>")
	 public void assertProductEdit(String nameedt){
		 ebcSteps.assertProductEdited(nameedt);
	 }
	 @When ("click save edit product")
	 public void clickSaveEditProd() throws Exception{
		 ebcSteps.clickSaveEditProduct();
	 }
	 
	 @When ("edit prod sku <$sku>")
	 public void editProdSKU(String sku){
		 ebcSteps.editProdSKU(sku);
	 }
	 @When ("edit prod barcode <$barcode>")
	 public void editProdBarcode(String barcode){
		 ebcSteps.editBardcode(barcode);
	 }
	 
	 @Then ("edit product success")
	 public void assertSaveEditProduct(){
		 ebcSteps.assertSaveEditProd();
	 }

	 //this is the end of edit product
	 
	 @When ("assert delete product <$nameedt>")
	 public void assertProductwantDelete(String nameedt){
		 ebcSteps.assertProductwantDelete(nameedt);
	 }
	 @When ("click delete product")
	 public void clickDeleteProd()throws Exception{
		 ebcSteps.clickDeleteProduct();
	 }
	 @Then ("assert delete success")
	 public void assertDeleteSuccess(){
		 ebcSteps.assertDeleteProdSuccess();
	 }
	 
	 //this is the end of delete product
	 
	 @Given ("click categories")
	 public void clickCategoriesMenu(){
		 ebcSteps.clickCategoriesMenu();
	 }
	 @When ("click new category")
	 public void clickNewCategory(){
		 ebcSteps.clickNewCategory();
	 }
	 @When ("click save category")
	 public void clickSaveCat()throws Exception{
		 ebcSteps.clickSaveCat();
	 }
	 @When ("insert category name <$catname>")
	 public void insertCategoryName(String catname){
		 ebcSteps.insertCategoryName(catname);
	 }
	 @Then("save category success")
	 public void assertSaveCat(){
		 ebcSteps.assertSaveCatNotif();
	 }
	 
	 //this is the end new category
	 
	 @Given("click edit <$catnameedt>")
	 public void searchcategoryxpath(String catnameedt){
		 ebcSteps.searchCategoryxpath(catnameedt);
	 }
	 @Then("edit category success")
	 public void assertEditCat(){
		 ebcSteps.assertEditCatNotif();
	 }
	 
	 //this is the end edit category
	 @Given ("click delete <$catname>")
	 public void clickDeleteCat(String catname)throws Exception{
		 ebcSteps.deleteCategory(catname);
	 }
	 @Then ("delete category success")
	 public void assertDeleteCat(){
		 ebcSteps.assertDeleteCat();
	 }
	 //this is the end delete category
	 
	 @When ("click category price")
	 public void clickCatPriceMenu(){
		 ebcSteps.clickCatPriceMenu();
	 }
	 @When ("click new category price")
	 public void clickNewCatPrice(){
		 ebcSteps.clickNewCatPrice();
	 }
	 @When ("insert catprice name <$name>")
	 public void insertCatPriceName(String name){
		 ebcSteps.insertCatPriceName(name);
	 }
	 @When ("insert catprice desc <$desc>")
	 public void insertCatPriceDesc(String desc){
		 ebcSteps.insertCatPriceDesc(desc);
	 }
	 
	 @When ("assert bottle name")
	 public void assertBottleName(){
		 ebcSteps.assertBottleName();
	 }
	 @When ("insert bottle price <$bottleprice>")
	 public void insertBottlePrice(String bottleprice){
		 ebcSteps.insertBottlePrice(bottleprice);
	 }
	 @When ("click save catprice")
	 public void clickSaveCatPrice()throws Exception{
		 ebcSteps.clickSaveCatPrice();
	 }
	 @Then ("save catprice success")
	 public void assertSaveCatPrice(){
		 ebcSteps.assertSaveCatPriceSuccess();
	 }
	 
	 //this is the end of new category price
	 @Given ("search category price <$nameedt>")
	 public void searchCatPrice(String nameedt){
		 ebcSteps.searchCatPricebyName(nameedt);
	 }
	 @When ("click edit category price")
	 public void clickEditCatPrice(){
		 ebcSteps.clickEditCatPrice();
	 }
	 @Then ("edit catprice success")
	 public void assertEditCatPrice(){
		 ebcSteps.assertEditCatPrice();
	 }
	 
	 //this is the end of edit category price
	 
	 @When ("click delete category price")
	 public void clickDeleteCatPrce() throws Exception{
		 ebcSteps.deleteCatPrice();
	 }
	 @Then ("delete catprice success")
	 public void assertDeleteCatPrice(){
		 ebcSteps.assertDeleteCatPrice();
	 }
	 
	 //this is the end of new genre
	 
	 @Given ("click rooms menu")
	 public void clickRoomsMenu(){
		 ebcSteps.clickRoomsMenu();
	 }
	 @When ("click manage genre")
	 public void clickManageGenre(){
		 ebcSteps.clickManageGenre();
	 }
	 @When ("click new genre")
	 public void clickNewGenre(){
		 ebcSteps.clickNewGenre();
	 }
	 
	 @When ("insert genre name <$name>")
	 public void insertGenreName(String name){
		 ebcSteps.insertGenreName(name);
	 }
	 @When ("insert genre color <$color>")
	 public void insertGenreCol(String color){
		 ebcSteps.insertGenreColor(color);
	 }
	 @When ("click save genre")
	 public void clickSaveGenre()throws Exception{
		 ebcSteps.clickSaveGenre();
	 }
	 @Then ("save genre success")
	 public void assertSaveGenre(){
		 ebcSteps.assertSaveGenre();
	 }
	 
	 //this is the end of new genre
	 
	 @Given ("click Edit genre menu") 
	 public void clickEditGenre(){
		 ebcSteps.clickEditGenre();
	 }
	 @When ("assert edited genre correct <$nameedt>") 
	 public void assertEditedGenre(String nameedt){
		 ebcSteps.assertEditedGenre(nameedt);
	 }
	 
	 @Then ("edit genre success")
	 public void assertSaveEditGenre(){
		 ebcSteps.assertSaveEditGenre();
	 }
	 
	 //this is the end of edit genre
	 @Given ("assert delete genre correct <$nameedt>") 
	 public void assertDeleteGenre(String nameedt){
		 ebcSteps.assertDeleteGenre(nameedt);
	 }
	 @When ("click delete genre menu") 
	 public void clickDeleteGenre()throws Exception{
		 ebcSteps.clickDeleteGenre();
	 }
	 
	 @Then ("delete genre success")
	 public void clickSaveDeleteGenre(){
		 ebcSteps.assertSaveDeleteGenre();
	 }
	 
	 //this is the end of delete genre
	 
	 @Given ("click manage room menu") 
	 public void clickManageRoom(){
		 ebcSteps.clikManageRoom();
	 }
	 @When ("click new room")
	 public void clickNewRoom(){
		 ebcSteps.clickNewRoom();
	 }
	 @When ("insert room name <$name>")
	 public void insertRoomName(String name){
		 ebcSteps.insertRoomName(name);
	 }
	 @When ("insert room description <$description>")
	 public void insertRoomDesc(String description){
		 ebcSteps.insertRoomDesc(description);
	 }
	 @When ("insert room genre <$genre>")
	 public void insertRoomGenre(String genre){
		 ebcSteps.insertRoomGenre(genre);
	 }
	 @When ("select room bookable <$bookable>")
	 public void selectRoomBookable(String bookable){
		 ebcSteps.selectRoomBookable(bookable);
	 }
	 @When ("insert room schedule <$schedule>")
	 public void insertRoomSchedule(String schedule){
		 ebcSteps.insertRoomScedule(schedule);
	 }
	 @When ("insert room open time <$opentime>")
	 public void insertRoomOpentime(String opentime){
		 ebcSteps.insertRoomOpentime(opentime);
	 }
	 @When ("insert room close time <$closetime>")
	 public void insertRoomClosetime(String closetime){
		 ebcSteps.insertRoomClosetime(closetime);
	 }
	 @When ("click save room") 
	 public void clickSaveRoom()throws Exception{
		 ebcSteps.clickSaveRoom();
	 }
	 @Then ("save room success")
	 public void assertSaveRoom(){
		 ebcSteps.assertSaveRoom();
	 }
	 
	 //this is the end of new room
	 
	 @Given ("click edit room menu")
	 public void clickEditRoom(){
		 ebcSteps.clickEditRoom();
	 }
	 @When ("assert edited room <$nameedt>")
	 public void assertEditedRoom(String nameedt){
		 ebcSteps.assertEditedRoom(nameedt);
	 }
	 @Then ("edit room success")
	 public void assertSaveEditRoom(){
		 ebcSteps.assertSaveEditRoom();
	 }
	 
	 //this is the end of edit Room
	 @Given ("assert delete room <$nameedt>")
	 public void assertDeleteRoom(String nameedt){
		 ebcSteps.assertDeleteRoom(nameedt);
	 }
	 @When ("click delete room menu")
	 public void clickDeleteRoom()throws Exception{
		 ebcSteps.clickDeleteRoom();
	 }
	 @Then ("delete room success")
	 public void assertSaveDelRoom(){
		 ebcSteps.assertSaveDeleteRoom();
	 }
	 
	 //this is the end of delete room
	 
	 @Given ("click rooms setting")
	 public void clickRoomSettingMenu(){
		 ebcSteps.clickRoomSettingMenu();
	 }
	 @When ("select room setting room <$room>")
	 public void selectRoomRS(String room){
		 ebcSteps.selectRoomRS(room);
	 }
	 @When ("insert room setting startdate <$startdate>")
	 public void insertStartDateRS(String startdate){
		 ebcSteps.insertStartDateRS(startdate);
	 }
	 @When ("insert room setting enddatae <$enddate>")
	 public void insertEndDateRS(String enddate){
		 ebcSteps.insertEndDateRS(enddate);
	 }
	 @When ("select room setting openday <$openday>")
	 public void selectOpenDayRS(String openday){
		 ebcSteps.selectOpenDayRS(openday);
	 }
	 @When ("select room setting event <$event>")
	 public void selectEventRS(String event){
		 ebcSteps.selectEventRS(event);
	 }
	 @When("insert room setting ticket price <$ticketprice>")
	 public void insertTicketPriceRS(String ticketprice){
		 ebcSteps.insertTicketPriceRS(ticketprice);
	 }
	 @When ("insert room setting bottleratio <$bottleratio>")
	 public void insertBottleRatioRS(String bottleratio){
		 ebcSteps.insertBottleRatioRS(bottleratio);
	 }
	 @When ("insert room setting opentime <$opentime>")
	 public void insertOpenTimeRS(String opentime){
		 ebcSteps.insertOpenTimeRS(opentime);
	 }
	 @When ("insert room setting closetime <$closetime>")
	 public void insertCloseTimeRS(String closetime){
		 ebcSteps.insertCloseTimeRS(closetime);
	 }
	 @When ("select room setting catprice <$catprice>")
	 public void selectCatPriceRS(String catprice){
		 ebcSteps.selectCatPriceRS(catprice);
	 }
	 @When ("click save room setting")
	 public void clickSaveRS()throws Exception{
		 ebcSteps.clickSaveRS();
	 }
	 @When("check on room calendar <$startdate> <$room>")
	 public void checkRSCalendar(String startdate, String room)throws Exception{
		 ebcSteps.checkRoomCalendar(startdate, room);
		 Thread.sleep(5000);
	 }
	 @When("assert room setting pop up <$opentime> <$closetime> <$bottleratio> <$ticketprice> <$catprice>")
	 public void assertRoomSettingPopUp(String opentime,String closetime,String bottleratio,String ticketprice,String catprice) {
		 ebcSteps.assertRoomSettingPopUp(opentime, closetime, bottleratio, ticketprice, catprice);
		 
	 }
	 
	//this is the end of new room setting
	 @When ("edit room setting opentime <$opentime>")
	 public void editOpenTimeRS(String opentime){
		 ebcSteps.editOpenTimeRS(opentime);
	 }
	 @When ("edit room setting closetime <$closetime>")
	 public void editCloseTime(String closetime){
		 ebcSteps.editCloseTimeRS(closetime);
	 }
	 @When ("edit room setting bottleratio <$bottleratio>")
	 public void editBottleRatioRS(String bottleratio){
		 ebcSteps.editBottleRatioRS(bottleratio);
	 }
	 @When ("click update room setting button")
	 public void clickUpdateRS() throws Exception{
		 ebcSteps.clickUpdatePopUpRS();
		 Thread.sleep(5000);
	 }
	 
	 //this is the end of edit room setting
	 
	 @When("click delete room setting button")
	 public void clickDeleteRS()throws Exception{
		 ebcSteps.clickDeleteRS();
		 Thread.sleep(5000);
	 }
	 
	 //this is the end of delete room setting
	 
	 @When ("click manage tables")
	 public void clickManageTables(){
		 ebcSteps.clickManageTable();
	 }
	 @When ("click new table")
	 public void clickNewTable(){
		 ebcSteps.clickNewTable();
	 }
	 @When ("insert area id <$areaid>")
	 public void insertAreaID(String areaid){
		 ebcSteps.selectAreaID(areaid);
	 }
	 @When ("insert table name <$name>")
	 public void insertTableName(String name){
		 ebcSteps.insertTableName(name);
	 }
	 @When ("insert table type <$type>")
	 public void insertTableType(String type){
		 ebcSteps.insertTableType(type);
	 }
	 @When ("click save table")
	 public void clickSaveTable(){
		 ebcSteps.clickSaveTable();
	 }
	 @Then ("save table success")
	 public void assertSaveTable(){
		 ebcSteps.assertSaveTable();
	 }
	 
	 //this is the end of new table
	 
	 @Given ("search table by name <$nameedt>")
	 public void searchTablebyName(String nameedt){
		 ebcSteps.searchTablebyName(nameedt);
	 }
	 @When ("click edit table")
	 public void clickEditTable(){
		 ebcSteps.clickEditTable();
	 }
	 
	 // this is the end of edit table
	 
	 @When ("click delete table")
	 public void clickDeleteTable() throws Exception{
		 ebcSteps.clickDeleteTable();
	 }
	 @Then ("delete table success")
	 public void assertDeleteTable(){
		 ebcSteps.assertDeleteTable();
	 }
}
