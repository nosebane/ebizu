package com.ebizu.zoukebc.steps;

import net.thucydides.core.annotations.Step;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.ebizu.zoukebc.pages.HomePage;

public class EbcSteps {

	private HomePage homePage;
	String getticketprice;
	
	@Step
	public void openLoginPage(){
		homePage.open();
		homePage.getDriver().manage().window().maximize();
	}
	
	@Step
	public void insertUsername(String username){
		homePage.waitFor(homePage.username);
		homePage.username.type(username);
	}
	
	@Step
	public void insertPassword(String password){
		homePage.password.type(password);
	}
	
	@Step
	public void clickLogin(){
		homePage.loginbtn.click();
	}
	
	@Step
	public void assertDasboard(){
		homePage.waitFor(homePage.dashboardmenu);
		if(homePage.dashboardmenu.isPresent()){
			assert true;
		}
		else {
			assert false;
		}
	}
	
	
	//New promotion scenario
	@Step
	public void clickPromotionsMenu(){
		homePage.promotionsmenu.click();
	}
	
	@Step
	public void clickManagePromotions(){
		homePage.managepromotionsmenu.click();
	}
	
	@Step
	public void clickNewPromotion(){
		homePage.newpromotionsbtn.click();
	}
	
	@Step
	public void insertPromoRoom(String room){
		homePage.slcpromoroom.typeAndEnter(room);
		
	}
	
	@Step
	public void insertOfferName(String offername){
		homePage.offername.type(offername);
	}
	
	@Step
	public void insertPromoStartDate(String startdate){
		homePage.promostartdate.typeAndEnter(startdate);
		homePage.promostartdate.sendKeys(Keys.ENTER);
		homePage.promostartdate.sendKeys(Keys.ENTER);
		
	}
	
	@Step
	public void insertPromoEndDate(String enddate){
		homePage.promoenddate.typeAndEnter(enddate);
		homePage.promoenddate.sendKeys(Keys.ENTER);
		homePage.promoenddate.sendKeys(Keys.ENTER);
	}
	
	@Step
	public void insertPromoDesc(String description){
		homePage.promodesc.type(description);
	}
	
	@Step
	public void selectPromoBanner(String banner){
		homePage.promobanner.selectByVisibleText(banner);
	}
	
	@Step
	public void insertPromoTerms(){
		
		homePage.getDriver().switchTo().frame(homePage.getDriver().findElement(By.cssSelector("iframe[title='Rich Text Editor, deal-del_term']")));
		WebElement tinymcebody = homePage.getDriver().findElement(By.cssSelector("body"));
		tinymcebody.sendKeys("auto fill");
		homePage.getDriver().switchTo().defaultContent();
	}
	
	@Step
	public void clickSavePromo(){
		homePage.newpromosavebtn.click();
	}
	
	@Step
	public void assertSavePromoNotif(){
		String savepromonotif = homePage.savepromonotif.getText();
		System.out.println(savepromonotif);
		if("Your offer data has been saved!".equals(savepromonotif)){
			assert true;
		}
		else{
			assert false;
		}			
		
	}
	//the end of new promotions
	
	@Step
	public void searchPromoByTitle(String offername){
		homePage.searchpromobytitle.typeAndEnter(offername);
		
	}
	
	@Step 
	public void clickEditPromo(){
		homePage.editbtnpromo.click();
	}
	
	@Step
	public void assertEditPromo(String offernameedt){
		String offernameedts = homePage.offername.getText();
		if (offernameedt.equals(offernameedts)){
			assert true;
		}
		else {
			assert false;			
		}		
	}
	
	@Step
	public void clickSaveEditPromo() throws Exception{
		
		homePage.editsavebtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
	
		
	}
	
	//the end of edit promotions
	
	@Step
	public void clickDeletePromo() throws Exception{
		homePage.deletebtnpromo.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
			
		
	}
	
	//the end of delete promotions
	
	@Step
	public void clickEventsMenu(){
		homePage.eventsmenu.click();
	}
	
	@Step
	public void clickManageEvents(){
		homePage.manageeventmenu.click();
	}
	
	@Step
	public void clickNewEvent(){
		homePage.neweventbtn.click();
	}
	
	@Step
	public void selectRoomEvent(String room){
		homePage.roomevent.selectByVisibleText(room);
	}
	
	@Step
	public void selectCategoryEvent(String category){
		homePage.categoryevent.selectByVisibleText(category);
	}
	
	@Step
	public void insertDateEvent(String date){
		homePage.dateevent.typeAndEnter(date);
		homePage.dateevent.sendKeys(Keys.ENTER);
		homePage.dateevent.sendKeys(Keys.ENTER);
	}
	
	@Step
	public void insertNameEvent(String name){
		homePage.nameevent.type(name);
	}
	
	@Step
	public void insertBodyEvent(String body){
		homePage.bodyevent.type(body);
	}
	
	@Step
	public void insertSupportEvent(String supportby){
		homePage.supportevent.type(supportby);
	}
	
	@Step
	public void insertTicketPrice(String ticketprice){
		homePage.priceevent.type(ticketprice);
	}
	
	@Step
	public void selectBannerEvent(String banner){
		homePage.bannerevent.selectByVisibleText(banner);
	}
	
	@Step
	public void insertWebsiteEvent(String website){
		homePage.websiteevent.type(website);
	}
	
	@Step
	public void insertVideoEvent(String video){
		homePage.videoevent.type(video);
	}
	
	@Step
	public void selectCategoryPrice(String categoryprice){
		homePage.categorypriceevent.selectByVisibleText(categoryprice);
	}
	
	@Step
	public void selectGuestlist(String guestlist){
		homePage.guestlistevent.selectByVisibleText(guestlist);
	}
	
	@Step
	public void insertGuestlistUrl(String guestlisturl){
		homePage.guestlisturlevent.type(guestlisturl);
	}
	
	@Step
	public void clickSaveEvent() throws Exception{
		homePage.saveeventbtn.click();
		Thread.sleep(10000);
	}
	
	//this is the end of add new event
	
	@Step
	public void searchEventbyName(String nameedt){
		homePage.searcheventbyname.typeAndEnter(nameedt);
	}
	
	@Step
	public void clickEditEvent(){
		
		homePage.editeventbtn.click();
	}
	
	@Step
	public void assertEditEvent(String nameedt){
		String nameedts = homePage.nameevent.getTextValue();
		System.out.println(nameedt);
		System.out.println(nameedts);
		if (nameedt.equals(nameedts)){
			assert true;
		}
		else {
			assert false;			
		}		
	}
	
	@Step
	public void clickSaveEditEvent() {
		homePage.saveediteventbtn.click();
		
		
	}
	
	//this is end of edit event
	
	@Step 
	public void assertEventtoDelete(String nameedt){
		String nameedts = homePage.firstgridrowname.getTextValue();
		System.out.println(nameedt);
		System.out.println(nameedts);
		if (nameedt.equals(nameedts)){
			assert true;
		}
		else {
			assert false;			
		}	
	}
	
	@Step
	public void clickDeleteEvent() throws Exception{
		homePage.deleteeventbtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
		homePage.waitFor(homePage.notifdeleventsuccess);
		String ceknotif = homePage.notifdeleventsuccess.getTextValue();
		System.out.println(ceknotif);
		if("Your event data successfully deleted!".equals(ceknotif)){
			assert true;
		}
		else {
			assert false;			
		}	
	}
		//this is the end of delete event
		
	@Step
	public void clickEventCatMenu(){
		homePage.eventcatmenu.click();
		homePage.waitFor(homePage.neweventcatbtn);
	}
	
	@Step
	public void clickNewEventCat(){
		homePage.neweventcatbtn.click();
		homePage.waitFor(homePage.nameeventcat);
	}
	
	@Step
	public void insertNameEventCat(String name){
		homePage.nameeventcat.type(name);
	}
	
	@Step
	public void insertDescEventCat(String description){
		homePage.desceventcat.type(description);
	}
	
	@Step
	public void clickSaveEventCat(){
		homePage.saveeventcatbtn.click();
		homePage.waitFor(homePage.editeventcatbtn);
		
	}
	
		//this is the end of new event category
	@Step
	public void clickEditEventCat(){
		homePage.editeventcatbtn.click();
		homePage.waitFor(homePage.nameeventcat);
	}
	
	@Step
	public void assertEditEventCat(String nameedt){
		String nameedts = homePage.nameeventcat.getTextValue();
		System.out.println(nameedt);
		System.out.println(nameedts);
		if(nameedt.equals(nameedts)){
			assert true;
		}
		else{
			assert false;
		}
	}
	//this is the end of edit event category
	
	@Step
	public void assertEventCatforDelete(String name){
		String cekname = homePage.firstrownameeventcat.getTextValue();
		System.out.println(cekname);
		System.out.println(name);
		if(name.equals(cekname)){
			assert true;
		}
		else{
			assert false;
		}
		
	}
	
	@Step
	public void clickDeleteEventCat() throws Exception{
		homePage.deleteeventcatbtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
		homePage.waitFor(homePage.notifdeleventsuccess);
		String ceknotif = homePage.notifdeleventsuccess.getTextValue();
		System.out.println(ceknotif);
		if("Your event data successfully deleted!".equals(ceknotif)){
			assert true;
		}
		else {
			assert false;			
		}	
	}
	
	//this is the end of delete category price
	
	@Step
	public void clickProductsMenu(){
		homePage.waitFor(homePage.productsmenu);
		homePage.productsmenu.click();
	}
	
	@Step
	public void clickManageProducts(){
		homePage.waitFor(homePage.manageproductsmenu);
		homePage.manageproductsmenu.click();
	}
	@Step
	public void clickNewProduct(){
		homePage.waitFor(homePage.newproductbtn);
		homePage.newproductbtn.click();
	}
	@Step
	public void insertProductName(String name){
		homePage.waitFor(homePage.prodname);
		homePage.prodname.type(name);
	}
	@Step
	public void selectProdCat(String category){
		homePage.prodcat.selectByVisibleText(category);
	}
	@Step
	public void insertProdMixer(String mixer){
		homePage.prodmix.typeAndEnter(mixer);
	}
	@Step
	public void insertProdDesc(String description){
		homePage.proddesc.type(description);
	}
	@Step
	public void insertProdBrand(String brand){
		homePage.prodbrand.type(brand);
	}
	@Step
	public void insertCurrencyType(String curtype){
		homePage.prodcurtype.type(curtype);
	}
	@Step
	public void insertCatPrice(String categoryprice){
		homePage.prodcatprice.typeAndEnter(categoryprice);
		
	}
	@Step
	public void insertProdSize(String size){
		homePage.prodsize.type(size);
	}
	@Step
	public void insertProdColor(String color){
		homePage.prodcol.type(color);
	}
	@Step
	public void insertProdSKU(String sku){
		homePage.prodsku.type(sku);
	}
	@Step
	public void insertBardcode(String barcode){
		homePage.prodcode.type(barcode);
	}
	@Step
	public void insertSellinngPrice(String sellprice){
		homePage.prodselprice.type(sellprice);
	}
	@Step
	public void assertCostPrice(String costprice){
		String costprices = homePage.prodcostprice.getTextValue();
		System.out.println(costprice);
		System.out.println(costprices);
		if(costprices.equals(costprice)){
			assert true;
		}
		else {
			assert false;
		}
	}
	@Step
	public void assertProfitMargin(String profitmargin){
		String profitmargins = homePage.prodmargin.getTextValue();
		System.out.println(profitmargin);
		System.out.println(profitmargins);
		if(profitmargins.equals(profitmargin)){
			assert true;
		}
		else {
			assert false;
		}
	}
	@Step
	public void insertProdRemark(String remark){
		homePage.prodremark.type(remark);
	}
	@Step
	public void selectCustodyStatus(String custodystatus){
		homePage.prodcustodystat.selectByVisibleText(custodystatus);
	}
	@Step
	public void selectRSVNStatu(String rsvnstatus){
		homePage.prodrsvnstat.selectByVisibleText(rsvnstatus);
	}
	@Step
	public void clickSaveProduct(){
		homePage.savenewproductbtn.click();
		
	}
	@Step
	public void assertSaveProductNotif(){
		String notif = homePage.notifsaveproduct.getTextValue();
		if("Your product data has been saved!".equals(notif)){
			assert true;
		}
		else{
			assert false;
		}
	}
	
	//this is the end of new products
	@Step
	public void searchProductByName(String nameedt) throws Exception{
		homePage.searchprodbyname.typeAndEnter(nameedt);
		Thread.sleep(5000);
	}
	
	@Step
	public void clickEditProduct(){
		homePage.editproductbtn.click();
		homePage.waitFor(homePage.prodname);
	}
	
	@Step
	public void assertProductEdited(String nameedt){
		String nameedts = homePage.prodname.getTextValue();
		System.out.println(nameedt);
		System.out.print(nameedts);
		if(nameedt.equals(nameedts)){
			assert true;
			
		}
		else{
			assert false;
		}
	}
	
	@Step
	public void clickSaveEditProduct() throws Exception{
		homePage.savenewproductbtn.click();
		Thread.sleep(5000);
	}
		
	@Step
	public void assertSaveEditProd(){	
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if ("Your product data successfully updated!".equals(notif)){
			assert true;
		}
		else{
			assert false;
		}
			
	}
	@Step
	public void editProdSKU(String sku){
		homePage.editprodsku.type(sku);
	}
	@Step
	public void editBardcode(String barcode){
		homePage.editprodcode.type(barcode);
	}
	
	//this is the end of edit product
	@Step
	public void assertProductwantDelete(String nameedt){
		String prodname = homePage.productgridname.getTextValue();
		System.out.println(nameedt); 
		System.out.println(prodname);
		if(prodname.equals(nameedt)){
			assert true;
		}
		else{
			assert false;
		}
		 
	}
	@Step
	public void clickDeleteProduct() throws Exception{
		homePage.deleteprodbtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
	}
	@Step
	public void assertDeleteProdSuccess(){
		String notif = homePage.notifsaveproduct.getTextValue();
		System.out.println(notif);
		
		if(notif.contains("Your Product data successfully deleted!"))
		{
			assert true;
			
		}
		else{
			assert false;
		}
	}
	// this is the end of delete product
	
	@Step
	public void clickCategoriesMenu(){
		homePage.categoriesmenu.click();
	}
	@Step
	public void clickNewCategory(){
		homePage.newcategory.click();
	}
	@Step
	public void insertCategoryName(String catname){
		homePage.categoryname.type(catname);
	}
	@Step
	public void clickSaveCat()throws Exception{
		homePage.saveeventcatbtn.click();
		Thread.sleep(5000);
		
	
	}
	@Step
	public void assertSaveCatNotif(){
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Data has been saved!")){
			assert true;
		}
		else{
			assert false;
		}
	}
	//this is the end of new category
	@Step
	public void searchCategoryxpath(String catnameedt){
		String a = "//div[@id='w0']/table/tbody/tr[";
		String b = "]/td[2]";
		String edita = "//div[@id='w0']/table/tbody/tr[";
		String editb = "]/td[5]/a/i";		
		int row = 1;
		String find= a+row+b;
		String element1 = homePage.getDriver().findElement(By.xpath(find)).getText();
		System.out.println(element1);
		while (!element1.equalsIgnoreCase (catnameedt)){
			row++;
			find= a+row+b;
			 element1 = homePage.getDriver().findElement(By.xpath(find)).getText();
			 System.out.println(element1);
			
		}
		String found=edita+row+editb;
		homePage.getDriver().findElement(By.xpath(found)).click();
		homePage.waitFor(homePage.categoryname);
	}
	@Step
	public void assertEditCatNotif(){
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Data successfully updated!")){
			assert true;
		}
		else{
			assert false;
		}
	}
	// this is the end edit category
	@Step
	public void deleteCategory(String catname)throws Exception{
		String a = "//div[@id='w0']/table/tbody/tr[";
		String b = "]/td[2]";
		String edita = "//div[@id='w0']/table/tbody/tr[";
		String editb = "]/td[5]/a[2]/i";		
		int row = 1;
		String find= a+row+b;
		String element1 = homePage.getDriver().findElement(By.xpath(find)).getText();
		System.out.println(element1);
		while (!element1.equalsIgnoreCase (catname)){
			row++;
			find= a+row+b;
			 element1 = homePage.getDriver().findElement(By.xpath(find)).getText();
			 System.out.println(element1);
			
		}
		String found=edita+row+editb;
		homePage.getDriver().findElement(By.xpath(found)).click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
	}
	@Step
	public void assertDeleteCat(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Data successfully deleted!")){
			assert true;
				
			}
		else{
			assert false;
		}
	}
	//this is the end delete category
	
	@Step
	public void clickCatPriceMenu(){
		homePage.catpricemenu.click();
	}
	@Step
	public void clickNewCatPrice(){
		homePage.newcatpricebtn.click();
	}
	@Step
	public void insertCatPriceName(String name){
		homePage.catpricename.type(name);
	}
	@Step
	public void insertCatPriceDesc(String desc){
		homePage.catprocedesc.type(desc);
	}
	@Step
	public void assertBottleName(){
		String cekbottlename = homePage.bottlename1.getTextValue();
		if(!cekbottlename.equals("")){
			assert true;
		}
		else{
			assert false;
		}
			
	}
	@Step
	public void insertBottlePrice(String bottleprice){
		homePage.bottleprice1.type(bottleprice);
	}
	@Step
	public void clickSaveCatPrice() throws Exception{
		homePage.saveeventcatbtn.click();
		homePage.waitFor(homePage.notifsaveproduct);
		Thread.sleep(5000);
	}
	@Step
	public void assertSaveCatPriceSuccess(){
		String notif=homePage.notifsaveproduct.getTextValue();
		System.out.println(notif);
				if (notif.contains("Your Category Price data has been saved!")){
					assert true;
				}
				else{
					assert false;
					
				}
					
	}
	 
	//this is the end of edit category price
	@Step 
	public void searchCatPricebyName(String nameedt){
		homePage.searchcatpricebyname.typeAndEnter(nameedt);
	}
	@Step 
	public void clickEditCatPrice(){
		homePage.editeventcatbtn.click();
	}
	@Step
	public void assertEditCatPrice(){
		String notif=homePage.notifsaveproduct.getTextValue();
				if(notif.contains("Your Category Price data has been saved!")){
					assert true;
				}
				else{
					assert false;
				}
	}
	 
	@Step
	public void deleteCatPrice() throws Exception{
		homePage.deleteeventcatbtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
		
	}
	@Step 
	public void assertDeleteCatPrice(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if (notif.equals("Your Category Price data successfully deleted!")){
			assert true;
			
		}
		else{
			assert false;
		}
	}
	
//this is the end of delete category price
	
	@Step
	public void clickRoomsMenu(){
		homePage.roomsmenu.waitUntilClickable();
		homePage.roomsmenu.click();
	}
	@Step
	public void clickManageGenre(){
		homePage.managegenremenu.click();
	}
	@Step
	public void clickNewGenre(){
		homePage.neweventbtn.click();
	}
	@Step
	public void insertGenreName(String name){
		homePage.genrename.waitUntilClickable();
		homePage.genrename.type(name);
	}
	@Step
	public void insertGenreColor(String color){
		homePage.genrecolor.type(color);
	}
	@Step
	public void clickSaveGenre()throws Exception{
		homePage.saveeventcatbtn.click();
		Thread.sleep(5000);
		
	}
	@Step
	public void assertSaveGenre(){
		String notif=homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Your genre data has been saved!")){
			assert true;
			
		}
		else{
			assert false;
		}
			
	}
	
	//this is the end of New Genre
	
	@Step
	public void clickEditGenre(){
		homePage.editeventcatbtn.click();
	
	}
	@Step
	public void assertEditedGenre(String nameedt){
		String nameedts = homePage.genrename.getTextValue();
		if(nameedts.equals(nameedt))
		{
			assert true;
			
		}
		else {
			assert false;
		}
	}
	@Step
	public void assertSaveEditGenre(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Your genre data has been saved!")){
			assert true;
		}
		else{
			assert false;
		}
	}
	
	//this is the end of edit genre
	
	@Step
	public void assertDeleteGenre(String nameedt){
		String genrename = homePage.firstrownameeventcat.getTextValue();
		if (nameedt.equals(genrename)){
			assert true;
		}
		else{
			assert false;
		}
	}
	@Step
	public void clickDeleteGenre() throws Exception{
		homePage.deleteeventcatbtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
	}
	@Step
	public void assertSaveDeleteGenre(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif= homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Your genre data successfully deleted!")){
			assert true;
		}
		else{
			assert false;
		}
	}
	
	//this is the end of delete genre
	
	@Step
	public void clikManageRoom(){
		homePage.manageroommenu.click();
	}
	@Step
	public void clickNewRoom(){
		homePage.newroombtn.click();
	}
	@Step 
	public void insertRoomName(String name){
		homePage.waitFor(homePage.roomname);
		homePage.roomname.type(name);
	}
	@Step
	public void insertRoomDesc(String description){
		homePage.roomdesc.type(description);
	}
	@Step
	public void insertRoomGenre(String genre){
		homePage.roomgenre.typeAndEnter(genre);
	}
	@Step
	public void selectRoomBookable(String bookable){
		homePage.roombookable.selectByVisibleText(bookable);
	}
	@Step
	public void insertRoomScedule(String schedule){
		homePage.roomschedule.type(schedule);
	}
	@Step
	public void insertRoomOpentime(String opentime){
		homePage.roomopentime.typeAndEnter(opentime);
	}
	@Step 
	public void insertRoomClosetime(String closetime){
		homePage.roomclosetime.typeAndEnter(closetime);
	}
	@Step
	public void clickSaveRoom()throws Exception{
		homePage.saveroom.click();
		Thread.sleep(5000);
	}
	@Step
	public void assertSaveRoom(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Your room data has been saved!" )){
			assert true;
			
		}
		else{
			assert false;
		}
	}
	
	//this is the end new room
	
	@Step
	public void clickEditRoom(){
		homePage.editeventcatbtn.click();
	}
	@Step
	public void assertEditedRoom(String nameedt){
		homePage.waitFor(homePage.roomname);
		String nameedts = homePage.roomname.getTextValue();
		if(nameedts.equals(nameedt)){
			assert true;
		}
		else{
			assert false;
		}
	}
	@Step 
	public void assertSaveEditRoom(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Your room data has been saved!")){
			assert true;
		}
		else{
			assert false;
		}
	}
	
	//this is the end of edit room
	
	@Step
	public void assertDeleteRoom(String nameedt){
		String cek = homePage.firstroomname.getTextValue();
		if (nameedt.equals(cek)){
			assert true;
			
		}else{
			assert false;
		}
	}
	@Step
	public void clickDeleteRoom()throws Exception{
		homePage.deleteeventcatbtn.click();
		Thread.sleep(10000);
		homePage.getAlert().accept();
	}
	@Step
	public void assertSaveDeleteRoom(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif = homePage.notifsaveproduct.getTextValue();
		if(notif.contains("Your room data successfully deleted!")){
			assert true;
		}
		else{
			assert false;
		}
	}
	
	//this is the end of delete room
	
	@Step
	public void clickRoomSettingMenu(){
		homePage.waitFor(homePage.roomsettingmenu);
		homePage.roomsettingmenu.click();
		homePage.waitFor(homePage.rsroom);
	}
	@Step
	public void selectRoomRS(String room){
		homePage.waitFor(homePage.rsroom);
		homePage.rsroom.click();
		homePage.searchdropdown.typeAndEnter(room);
	}
	@Step
	public void insertStartDateRS(String startdate){
		Date date = new Date();
		String bulanenglish = new SimpleDateFormat("MMM").format(date);
		String tahunenglish = new SimpleDateFormat("YYYY").format(date);
		String[] parts = startdate.split("-");
		String part1 = parts[0]; 
//		String part2 = parts[1]; 
//		String part3 = parts[2]; 
		startdate= String.valueOf(part1+"-"+bulanenglish+"-"+tahunenglish);
		homePage.rsstartdate.typeAndEnter(startdate);
		
	}
	@Step
	public void insertEndDateRS(String enddate){
		Date date = new Date();
		String bulanenglish = new SimpleDateFormat("MMM").format(date);
		String tahunenglish = new SimpleDateFormat("YYYY").format(date);
		String[] parts = enddate.split("-");
		String part1 = parts[0]; 
//		String part2 = parts[1]; 
//		String part3 = parts[2]; 
		enddate= String.valueOf(part1+"-"+bulanenglish+"-"+tahunenglish);
		homePage.rsenddate.typeAndEnter(enddate);
	}
	@Step
	public void selectOpenDayRS(String openday){
		//homePage.rsopenday.typeAndEnter(openday);
		homePage.rsopenday.click();
		homePage.selectall.click();
	}
	@Step
	public void selectEventRS(String event){
		homePage.rsevent.click();;
		homePage.searchdropdown.typeAndEnter(event);
		
	}
	@Step
	public void insertTicketPriceRS(String ticketprice){
		homePage.rsticketprice.type(ticketprice);
	}
	@Step
	public void insertBottleRatioRS(String bottleratio){
		homePage.rsbottleratio.type(bottleratio);
	}
	@Step
	public void insertOpenTimeRS(String opentime){
		homePage.rsopentime.typeAndEnter(opentime);
	}
	@Step
	public void insertCloseTimeRS(String closetime){
		homePage.rsclosetime.typeAndEnter(closetime);
	}
	@Step
	public void selectCatPriceRS(String catprice){
		homePage.rscatprice.click();
		homePage.searchdropdown.typeAndEnter(catprice);
	}
	@Step
	public void clickSaveRS()throws Exception{
		homePage.rssavebtn.click();
		homePage.waitFor(homePage.rsticketprice);
		getticketprice = homePage.rsticketprice.getTextValue();
		Thread.sleep(5000);
	}
	@Step
	public void checkRoomCalendar(String startdate ,String room){
		homePage.rsroomcal.click();
		homePage.searchdropdown.typeAndEnter(room);
		String xinit = "//div[@id='calendar']/div[2]/div/table/tbody/tr/td/div/div/div[4]/div[2]/table/thead/tr/td";
		String yinit = "//div[@id='calendar']/div[2]/div/table/tbody/tr/td/div/div/div[5]/div[2]/table/thead/tr/td";
		String firstpath = "//div[@id='calendar']/div[2]/div/table/tbody/tr/td/div/div/div[";
		String scndpath = "]/div[2]/table/thead/tr/td[";
		String closed="]"	;
		int middle = 4;
		int end = 1;
		String find = firstpath+middle+scndpath+end+closed;
		String element1 = homePage.getDriver().findElement(By.xpath(find)).getText();
		String elementx = homePage.getDriver().findElement(By.xpath(xinit)).getText();
		String elementy = homePage.getDriver().findElement(By.xpath(yinit)).getText();
		String getdate = startdate.substring(0,2);
		System.out.println(getdate);
		if(elementx.equals(getdate)){
			String gothca = String.valueOf( xinit+"/a/div/span").replace("thead", "tbody");
			homePage.getDriver().findElement(By.xpath(gothca)).click();
			
		}
		else if(elementy.equals(getdate)){
			String gothca = String.valueOf( yinit+"/a/div/span").replace("thead", "tbody");
			homePage.getDriver().findElement(By.xpath(gothca)).click();
			
		}
		else{
			while (!element1.equalsIgnoreCase (getdate)){
			end++;
			find= firstpath+middle+scndpath+end+closed;
			 element1 = homePage.getDriver().findElement(By.xpath(find)).getText();
			 System.out.println(element1);
			 if(end == 7){
				 end = 1;
				 middle=5;
			 }
			 if(middle==5 && end==7){element1 = homePage.getDriver().findElement(By.xpath(find)).getText();}
			
			}
			String gothca = String.valueOf( find+"/a/div/span").replace("thead", "tbody");
			homePage.getDriver().findElement(By.xpath(gothca)).click();
		}
	}
	
	@Step
	public void assertRoomSettingPopUp(String opentime,String closetime,String bottleratio,String ticketprice,String catprice){
		if(getticketprice==null){
			getticketprice = "";
		}
		
		 if(!getticketprice.equals("")){
			if(getticketprice.equals(homePage.ticketpricepopup.getTextValue())){
				if (bottleratio.equals(homePage.bottleratiopopup.getTextValue())){
					if (opentime.equals(homePage.opentimepopup.getTextValue())){
						if(closetime.equals(homePage.closetimepopup.getTextValue())){
							if(catprice.equals(homePage.catpricepopup.getTextValue())){
							
								assert true;
								
							}
						}
					}
				}
			}
			else{
				assert false;
			}
		}
		else{
			if(ticketprice.equals(homePage.ticketpricepopup.getTextValue())){
				if (bottleratio.equals(homePage.bottleratiopopup.getTextValue())){
					if (opentime.equals(homePage.opentimepopup.getTextValue())){
						if(closetime.equals(homePage.closetimepopup.getTextValue())){
							if(catprice.equals(homePage.catpricepopup.getTextValue())){
							
								assert true;
								
							}
						}
					}
				}
			}
		}
		homePage.closepopupbtn.click();
		
	}
		
	// this is the end of new room setting
	@Step
	public void editOpenTimeRS(String opentime){
		homePage.opentimepopup.typeAndEnter(opentime);
	}
	@Step
	public void editCloseTimeRS(String closetime){
		homePage.closetimepopup.typeAndEnter(closetime);
	}
	@Step
	public void editBottleRatioRS(String bottleratio){
		homePage.bottleratiopopup.type(bottleratio);
	}
	@Step
	public void clickUpdatePopUpRS(){
		homePage.updatepopupbtn.click();
	}
	
	//this is the end of edit room setting
	
	@Step
	public void clickDeleteRS(){
		homePage.deletepopupbtn.click();
	}
	
	//this is the end of delete room setting
	
	@Step
	public void clickManageTable(){
		homePage.managetablesmenu.click();
	}
	@Step
	public void clickNewTable(){
		homePage.neweventcatbtn.click();
	}
	@Step
	public void selectAreaID(String areaid){
		homePage.areaid.click();
		homePage.searchdropdown.typeAndEnter(areaid);
	}
	@Step
	public void insertTableName(String name){
		homePage.tablename.type(name);
	}
	@Step
	public void insertTableType(String type){
		homePage.tabletype.selectByVisibleText(type);
	}
	@Step
	public void clickSaveTable(){
		homePage.saveeventcatbtn.click();
	}
	@Step
	public void assertSaveTable(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif=homePage.notifsaveproduct.getTextValue();
		
		if(notif.contains("Your desk data has been saved!" )){
			assert true;
		}
		else{
			assert false;
		}
	}
	
	//this is the end of new table
	
	@Step
	public void searchTablebyName(String nameedt){
		homePage.searchtablebyname.typeAndEnter(nameedt);
	}
	@Step
	public void clickEditTable(){
		homePage.editeventcatbtn.click();
	}
	
	//this is the end of edit table
	
	@Step
	public void clickDeleteTable() throws Exception{
		homePage.deleteeventcatbtn.click();
		Thread.sleep(5000);
		homePage.getAlert().accept();
	}
	@Step 
	public void assertDeleteTable(){
		homePage.waitFor(homePage.notifsaveproduct);
		String notif=homePage.notifsaveproduct.getTextValue();
		
		if(notif.contains("Your desk data successfully deleted!" )){
			assert true;
		}
		else{
			assert false;
		}
	}
}
