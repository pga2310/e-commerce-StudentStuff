function setMenuOptions(menuOption, menuItem) {
	
	var selectedMenuOption = "#" + menuOption;
	var selectedMenuItem = "#" + menuItem;
	jQuerythis = $(selectedMenuOption);
	
	jQuery('ul', jQuerythis).addClass("opened");
	jQuery('ul', jQuerythis).css("display", "block");
	
	$(selectedMenuItem).addClass("active");
}

jQuery('#nav li').on('click', function(e) {

	jQuerythis = jQuery(this);
	e.stopPropagation(); 

	if(jQuerythis.has('ul').length) {
		e.preventDefault();
		 
		var ele_class = jQuery('ul', this).attr("class");
		if(ele_class != 'sub-menu opened')
		{
			jQuery('#nav').find('ul:visible').slideToggle("normal");
			jQuery('#nav').find('ul:visible').removeClass("opened");
		}
		jQuery('ul', this).slideToggle("normal");
		if(ele_class == 'sub-menu opened')
		{
			jQuery('ul', this).removeClass("opened");
		}
		else
		{
			jQuery('ul', this).addClass("opened");
		}
	}
});