$.urlParam = function(name) {
            var results = new RegExp('[\\?&]' + name + '=([^&#]*)')
                                    .exec(window.location.href);
            return results[1] || 0;
}
function addFile(){
	$('#frmRestaurant').submit();
}

$('#frmRestaurant').ajaxForm({
	dataType: 'json',
	success: function(jsonData) {
	alert(jsonData.message);
	if (jsonData.success) {
	window.location.href = "viewrestaurants";
	}
	}
	});

$('#frmMenuCategory').ajaxForm({
	    dataType: 'json',
	    success: function(jsonData) {
	      alert(jsonData.message);
	      if (jsonData.success) {
	    	  window.location.href = "viewmenucategories";
	      }
	    }
});

$('#frmMenuItem').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
    	alert(jsonData.message);
    	if (jsonData.success) {
    		 window.location.href = "viewmenuitem";
      } 
    } 
});

$('#frmCountryMaster').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
    	
      alert(jsonData.message);
      if (jsonData.success) {
       window.location.href = "viewcountrymaster"; 
      }
    } 
});

$('#frmStateMaster').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
      alert(jsonData.message);
      if (jsonData.success) {
    	  window.location.href = "viewstatemaster";
      }
    } 
});

$('#frmCityMaster').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
     
      alert(jsonData.message);
      if (jsonData.success) {        
        window.location.href="viewcitymaster";
      }
    } 
});

$('#frmAreaMaster').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
     
      alert(jsonData.message);
      if (jsonData.success) {        
        window.location.href="viewareamaster";
      }
    } 
});

$('#frmDeliveryMethod').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
    	alert(jsonData.message);
      if (jsonData.success) {
    	  window.location.href="viewdeliverymethod";
      } 
    } 
});

$('#frmItemOptionCategory').ajaxForm({
    dataType: 'json',
    success: function(jsonData) {
    	alert(jsonData.message);
      if (jsonData.success) {
    	  window.location.href="viewitemoptioncategory";
      } 
    } 
});

