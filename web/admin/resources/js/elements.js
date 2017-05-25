$(document).ready(function() {				
	
	$('.timepicker-24').timepicker({
		minuteStep : 1,
		showSeconds : true,
		showMeridian : false
	});
	
	$('.input-append.date').datepicker({
		autoclose: true,
		todayHighlight: true
    });	
});	
	 