package com.ebizu.zoukebc.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://zoukebcdev.ebizu.com/")
public class HomePage extends PageObject {

	@FindBy (id="loginform-username")
	public WebElementFacade username;
	
	@FindBy (id="loginform-password")
	public WebElementFacade password;
	
	@FindBy (id="loginform-rememberme")
	public WebElementFacade rememberme;
	
	@FindBy (id = "login-btn")
	public WebElementFacade loginbtn;
	
	@FindBy (linkText ="Dashboard")
	public WebElementFacade dashboardmenu;
	
	@FindBy (linkText="Promotions")
	public WebElementFacade promotionsmenu;
	
	@FindBy (linkText="Manage Promotions")
	public WebElementFacade managepromotionsmenu;
	
	@FindBy (id="new-promotion")
	public WebElementFacade newpromotionsbtn;
	
	@FindBy (css="input.select2-search__field")
	public WebElementFacade slcpromoroom;
	
	@FindBy (id="deal-del_title")
	public  WebElementFacade offername;
	
	@FindBy (id="deal-del_start")
	public WebElementFacade promostartdate;
	
	@FindBy (id="deal-del_end")
	public WebElementFacade promoenddate;
	
	@FindBy (id="deal-del_description")
	public WebElementFacade promodesc;
	
	@FindBy(id="deal-is_banner")
	public WebElementFacade promobanner;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElementFacade newpromosavebtn;
	
	@FindBy(xpath="//div[@id='wrap']/div[2]/div")
	public WebElementFacade savepromonotif;
	//the end of new promotions
	
	@FindBy(name="DealSearch[del_title]")
	public WebElementFacade searchpromobytitle;
	
	@FindBy(css="span.glyphicon.glyphicon-pencil")
	public WebElementFacade editbtnpromo;
	
	@FindBy (id="btn-deal-save")
	public WebElementFacade editsavebtn;
	
	//the end of edit promotions
	
	@FindBy (css="span.glyphicon.glyphicon-trash")
	public WebElementFacade deletebtnpromo;
	
	//the end of delete promotions
	
	@FindBy (linkText = "Events")
	public WebElementFacade eventsmenu;
	
	@FindBy(linkText = "Manage Event")
	public WebElementFacade manageeventmenu;
	
	@FindBy (id="new-event")
	public WebElementFacade neweventbtn;
	
	@FindBy(id="event-evt_room_id")
	public WebElementFacade roomevent;
	@FindBy(id="event-evt_evc_id")
	public WebElementFacade categoryevent;
	@FindBy(id="event-evt_start_date")
	public WebElementFacade dateevent;
	@FindBy(id="event-evt_name")
	public WebElementFacade nameevent;
	@FindBy(id="event-evt_body")
	public WebElementFacade bodyevent;
	@FindBy(id="event-evt_supported_by")
	public WebElementFacade supportevent;
	@FindBy(id="event-tic_price")
	public WebElementFacade priceevent;
	@FindBy(id="event-is_banner")
	
	public WebElementFacade bannerevent;
	@FindBy(id="event-evt_website_url")
	public WebElementFacade websiteevent;
	@FindBy(id="event-evt_youtube_url")
	public WebElementFacade videoevent;
	@FindBy(id="event-evt_cp_id")
	public WebElementFacade categorypriceevent;
	@FindBy(id="event-is_guestlist")
	public WebElementFacade guestlistevent;
	@FindBy(id="event-is_guestlist_url")
	public WebElementFacade guestlisturlevent;
	@FindBy(id="btn-event-save")
	public WebElementFacade saveeventbtn;
	
	//this is the end of add new event
	
	@FindBy(name="EventSearch[evt_name]")
	public WebElementFacade searcheventbyname;
	
	@FindBy(css="span.glyphicon.glyphicon-pencil")
	public WebElementFacade editeventbtn;
	
	@FindBy(id="btn-event-save")
	public WebElementFacade saveediteventbtn;
	
	//this is the end of edit event
	
	@FindBy(xpath="//div[@id='event-grid-container']/table/tbody/tr/td[4]")
	public WebElementFacade firstgridrowname;
	
	@FindBy(css="span.glyphicon.glyphicon-trash")
	public WebElementFacade deleteeventbtn;
	               
	@FindBy(xpath="//div[@id='wrap']/div[2]/div")
	public WebElementFacade notifdeleventsuccess;
	
	//this is the end of delete event
	
	@FindBy (linkText="Event Category")
	public WebElementFacade eventcatmenu;
	
	@FindBy(id="new-event")
	public WebElementFacade neweventcatbtn;
	
	@FindBy(id="eventcategory-evc_name")
	public WebElementFacade nameeventcat;
	
	@FindBy(id="eventcategory-evc_description")
	public WebElementFacade  desceventcat;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElementFacade saveeventcatbtn;
	
	//this is the end of new event category
	
	@FindBy(css="span.glyphicon.glyphicon-pencil")
	public WebElementFacade editeventcatbtn;
	
	//this is the end of edit event category
	
	@FindBy(xpath="//div[@id='w0']/table/tbody/tr/td[2]")
	public WebElementFacade firstrownameeventcat;
	
	@FindBy(css="span.glyphicon.glyphicon-trash")
	public WebElementFacade deleteeventcatbtn;
	
	//this is the end of delete event category
	
	@FindBy(linkText="Products")
	public WebElementFacade productsmenu;
	
	@FindBy(linkText="Manage Products")
	public WebElementFacade manageproductsmenu;
	
	@FindBy(linkText="New Product")
	public WebElementFacade newproductbtn;
	
	 @FindBy(id="productitem-pit_name")
			 public WebElementFacade prodname;
	    @FindBy(id="productitem-pit_pc_id")
	    public WebElementFacade prodcat;
	    @FindBy(css="input.select2-search__field")
	    public WebElementFacade prodmix;
	    @FindBy(id="productitem-pit_description")
	    public WebElementFacade proddesc;
	    @FindBy(id="productitem-pit_brand")
	    public WebElementFacade prodbrand;
	    @FindBy(id="productitem-pit_currency_type")
	    public WebElementFacade prodcurtype;
	    @FindBy(xpath="(//input[@type='search'])[2]")
	    public WebElementFacade prodcatprice;
	    @FindBy(id="productitem-pit_detail-size")
	    public WebElementFacade prodsize;
	    @FindBy(id="productitem-pit_detail-colour")
	    public WebElementFacade prodcol;
	    @FindBy(id="productitem-pit_detail-sku")
	    public WebElementFacade prodsku;
	    @FindBy(id="productitem-pit_detail-barcode")
	    public WebElementFacade prodcode;
	    @FindBy(id="productitem-pit_detail-selling_price")
	    public WebElementFacade prodselprice;
	    @FindBy(id="productitem-pit_detail-cost_price")
	    public WebElementFacade prodcostprice;
	    @FindBy(id="productitem-pit_detail-margin")
	    public WebElementFacade prodmargin;
	    @FindBy(id="productitem-pit_detail-remark")
	    public WebElementFacade prodremark;
	    @FindBy(id="productitem-pit_detail-custody_status")
	    public WebElementFacade prodcustodystat;
	    @FindBy(id="productitem-pit_detail-status")
	    public WebElementFacade prodrsvnstat;
	    @FindBy(id="save_product_bottom")
	    public WebElementFacade savenewproductbtn;
	    @FindBy(xpath="//div[@id='wrap']/div[2]/div")
	    public WebElementFacade notifsaveproduct;
	    
	    //this is the end of new product
	    
	    @FindBy(name="ProductSearch[pit_name]")
	    public WebElementFacade searchprodbyname;
	    @FindBy(css="a.pull-right > i.fa.fa-pencil")
	    public WebElementFacade editproductbtn;
	    @FindBy(id="save_product_up")
	    public WebElementFacade savenewproductbtnup;
	    @FindBy(id="sku-item-0")
	    public WebElementFacade editprodsku;
	    @FindBy(id="barcode-item-0")
	    public WebElementFacade editprodcode;
	    
	    //this is the end of edit product
	    
	    @FindBy(css="a.tooltips.a-detail-product > span")
	    public WebElementFacade productgridname;
	    @FindBy(css="i.fa.fa-trash-o")
	    public WebElementFacade deleteprodbtn;
	    
	    //this is the end of delete product
	    
	    @FindBy(linkText="Categories")
	    public WebElementFacade categoriesmenu;
	    @FindBy(linkText="New Category")
	    public WebElementFacade newcategory;
	    @FindBy(id="productcategory-pc_name")
	    public WebElementFacade categoryname;
	   
	    //this is the end of new category
	    
	    //this is the end of edit category
	    
	    //this is the end of delete category
	    
	    @FindBy(linkText="Category Price")
	    public WebElementFacade catpricemenu;
	    @FindBy(id="new-event")
	    public WebElementFacade newcatpricebtn;
	    @FindBy(id="categoryprice-cp_name")
	    public WebElementFacade catpricename;
	    @FindBy(id="categoryprice-cp_description")
	    public WebElementFacade catprocedesc;
	    @FindBy(id="productspecialprice-0-psp_pit_name")
	    public WebElementFacade bottlename1;
	    @FindBy(id="productspecialprice-0-psp_pit_price")
	    public WebElementFacade bottleprice1;
	    
	    // this is the end of new category price;
	    
	    @FindBy(name="CategoryPriceSearch[cp_name]")
	    public WebElementFacade searchcatpricebyname;
	    
	    //this is the end of edit category price
	    
	    //this is the end of delete category price
	    
	    @FindBy(linkText="Rooms")
	    public WebElementFacade roomsmenu;
	    @FindBy(linkText="Manage Genre")
	    public WebElementFacade managegenremenu;
	    @FindBy(id="genre-genre_name")
	    public WebElementFacade genrename;
	    @FindBy(id="genre-genre_color")
	    public WebElementFacade genrecolor;
	    
	   //this the end of new edit delete genre
	    
	    @FindBy(linkText="Manage Rooms")
	    public WebElementFacade manageroommenu;
	    @FindBy(id="new-room")
	    public WebElementFacade newroombtn;
	    @FindBy(id="room-room_name")
	    public WebElementFacade roomname;
	    @FindBy(id="room-room_description")
	    public WebElementFacade roomdesc;
	    @FindBy(css="input.select2-search__field")
	    public WebElementFacade roomgenre;
	    @FindBy(id="room-room_bookable")
	    public WebElementFacade roombookable;
	    @FindBy(id="room-room_sequence")
	    public WebElementFacade roomseq;
	    @FindBy(id="room-room_schedule")
	    public WebElementFacade roomschedule;
	    @FindBy(id="room-room_open_time")
	    public WebElementFacade roomopentime;
	    @FindBy(id="room-room_close_time")
	    public WebElementFacade roomclosetime;
	    @FindBy(xpath="(//button[@type='submit'])[3]")
	    public WebElementFacade saveroom;
	    
	    //this is the end of new room
	    
	    @FindBy(xpath="//div[@id='w0-container']/table/tbody/tr/td[2]")
	    public WebElementFacade firstroomname;
	    
	    //this is the end of edit and delete room
	    
	    @FindBy(linkText="Room Setting")
	    public WebElementFacade roomsettingmenu;
	    @FindBy(id="select2-roomrate-room_id-container")
	    public WebElementFacade rsroom;
	    @FindBy(id="roomrate-start_date")
	    public WebElementFacade rsstartdate;
	    @FindBy(id="roomrate-end_date")
	    public WebElementFacade rsenddate;
	    @FindBy(css ="input.select2-search__field")
	    public WebElementFacade rsopenday;
	    @FindBy(id="select2-w1-container")
	    public WebElementFacade rsevent;
	    @FindBy(id="ticket-price")
	    public WebElementFacade rsticketprice;
	    @FindBy(name="ratio")
	    public WebElementFacade rsbottleratio;
	    @FindBy(id="w2")
	    public WebElementFacade rsopentime;
	    @FindBy(id="w3")
	    public WebElementFacade rsclosetime;
	    @FindBy(id="select2-w4-container")
	    public WebElementFacade rscatprice;
	    @FindBy(id="btn-room-setting-save")
	    public WebElementFacade rssavebtn;
	    @FindBy(id="select2-room_id_cal-container")
	    public WebElementFacade rsroomcal;
	    @FindBy(css="span.select2-search.select2-search--dropdown > input.select2-search__field")
	    public WebElementFacade searchdropdown;
	    @FindBy(css="span.s2-select-label")
	    public WebElementFacade selectall;
	    
	    //thiss is the end of add room setting
	    
	     @FindBy(id="open_time")
	     public WebElementFacade opentimepopup;
	     @FindBy(id="close_time")
	     public WebElementFacade closetimepopup;
	     @FindBy(id="ratio")
	     public WebElementFacade bottleratiopopup;
	     @FindBy(id="evt_id_cal")
	     public WebElementFacade eventpopup;
	     @FindBy(id="tic_price")
	     public WebElementFacade ticketpricepopup;
	     @FindBy(id="cp_id_cal")
	     public WebElementFacade catpricepopup;
	     @FindBy(id="room_rate_update")
	     public WebElementFacade updatepopupbtn;
	     @FindBy(id="room_rate_delete")
	     public WebElementFacade deletepopupbtn;
	     @FindBy(css="button.btn.btn-default")
	     public WebElementFacade closepopupbtn;
	
	     // this is the end of edit and delete room setting
	     
	     @FindBy(linkText="Manage Tables")
	     public WebElementFacade managetablesmenu;
	     @FindBy(id="select2-desk-desk_area_id-container")
	     public WebElementFacade areaid;
	     @FindBy(id="desk-desk_name")
	     public WebElementFacade tablename;
	     @FindBy(id="desk-desk_type")
	     public WebElementFacade tabletype;
	     
	     //this is the end of new table
	     
	     @FindBy(name="DeskSearch[desk_name]")
	     public WebElementFacade searchtablebyname;
	     
	     //this is the end of edit and delete table
	     
	     @FindBy(linkText="Table Setting")
	     public WebElementFacade tablesettingmenu;
	     @FindBy(id="select2-w0-container")
	     public WebElementFacade tsroom;
	     @FindBy(css="input.select2-search__field")
	     public WebElementFacade tstable;
	     @FindBy(id="w2")
	     public WebElementFacade tsstartdate;
	     @FindBy(id="w3")
	     public WebElementFacade tsenddate;
	     @FindBy(xpath="(//input[@type='search'])[2]")
	     public WebElementFacade tsopendays;
	     @FindBy(name="min_bottle_default")
	     public WebElementFacade tsminbottle;
	     @FindBy(name="save_form-desk-manage")
	     public WebElementFacade tssavebtn;
	     @FindBy(id="select2-w5-container")
	     public WebElementFacade tstablecal;
	     
	     //this is the end of new table setting
	     
	     @FindBy(id="min_bottle_default")
	     public WebElementFacade minbottlepopup;
	     
}
