function getChildItemYes() {
	var value = $('input:radio[name=rbischilditem]:checked').val();

	return value;
};

$(document)
		.ready(
				function() {

					// Form Wizard Validations

					$('#login').validate(
							{
								rules : {
									txtusername : {
										required : true
									},
									txtpassword : {
										required : true
									}
								},
								messages : {
									txtusername : {
										required : 'Please Enter Username'
									},
									txtpassword : {
										required : 'Please Enter Password'
									}
								},

								errorPlacement : function(label, element) {
									$('<span class="arrow"></span>')
											.insertBefore(element);
									$('<span class="error"></span>')
											.insertAfter(element).append(label)
								},
							});

					$('#frmDeliveryMethod')
							.validate(
									{
										rules : {
											deliverymethodname : {
												required : true
											}
										},
										messages : {
											deliverymethodname : {
												required : 'Please Enter Delivery Method'
											},
										},

										errorPlacement : function(label,
												element) {
											$('<span class="arrow"></span>')
													.insertBefore(element);
											$('<span class="error"></span>')
													.insertAfter(element)
													.append(label)
										},
									});

					$('#frmItemOptionCategory')
							.validate(
									{
										rules : {
											optioncategoryname : {
												required : true
											},
											minimumchoicecounter : {
												required : true,
												number : true
											}
										},
										messages : {
											optioncategoryname : {
												required : 'Please Enter Option Category Name'
											},
											minimumchoicecounter : {
												required : 'Please Enter Minimum Choice Counter',
												number : 'Only digits are allowed'
											}
										},
										errorPlacement : function(label,
												element) {
											$('<span class="arrow"></span>')
													.insertBefore(element);
											$('<span class="error"></span>')
													.insertAfter(element)
													.append(label)
										},
									});

					$("#frmMenuCategory")
							.validate(
									{
										rules : {
											menucategoryname : {
												required : true
											}
										},
										messages : {
											menucategoryname : {
												required : "Please Enter Menu Category Name"
											}
										},
										errorPlacement : function(label,
												element) {
											$('<span class="arrow"></span>')
													.insertBefore(element);
											$('<span class="error"></span>')
													.insertAfter(element)
													.append(label)
										},
									});

					$('#frmMenuItem').validate({
						rules : {
							restaurant_master : {
								required : true
							},
							restaurant_category : {
								required : true
							},
							menuitemname : {
								required : true
							},
							price : {
								required : true,
								number : true
							},
							priceeffectdate : {
								required : true
							},
							menu_item : {
								required : function(element) {
									return (getChildItemYes() == 'yes');
								}
							},
							item_option_category : {
								required : function(element) {
									return (getChildItemYes() == 'yes');
								}
							},
						},

						messages : {
							restaurant_master : {
								required : 'Please Select Restaurant'
							},
							restaurant_category : {
								required : 'Please Select Menu Category'
							},
							menuitemname : {
								required : 'Please Enter Menu Item Name'
							},
							price : {
								required : 'Please Enter Price',
								number : 'Only digits are allowed'
							},
							priceeffectdate : {
								required : 'Please Select Date'
							},
							menu_item : {
								required : 'Please Select Parent Menu Item'
							},
							item_option_category : {
								required : 'Please Select Item Option Category'
							}
						},
					});

					$("#frmRestaurant")
							.validate(
									{

										rules : {
											restaurantlogo : {
												required: true,
								                extension: "jpe?g|gif"
											},
											restaurantname : {
												required : true,
												minlength : 3
											},
											streetno : {
												required : true,
											},
											areaname : {
												required : true,
											},
											cityname : {
												required : true,
											},
											statename : {
												required : true,
											},
											countryname : {
												required : true,

											},
											restaurantphonenumber : {
												required : true,
												minlength : 9
											},
											emailaddress :{
												required : true,
												email: true
											},
											mindeliveryamt : {
												required : true,
												number : true
											},
											restaurantcategory : {
												required : true
											},
										},
										messages : {
											restaurantlogo : {
												required: "Please Provide Restaurant Logo",
								                extension: "Logo having .jpe/.jpeg/.gif extension is allowed" 							                
											},
											restaurantname : {
												required : "Please Enter Restarant Name",
												minlength : "Atleast 3 characters required"
											},
											streetno : {
												required : "Please Enter Street No"

											},
											areaname : {
												required : "Please Choose Area"
											},
											cityname : {
												required : "Please Choose City"
											},
											statename : {
												required : "Please Choose State"
											},
											countryname : {
												required : "Please Choose Country"

											},
											restaurantphonenumber : {
												required : "Please Enter Restaurant Phone Number"
											},
											emailaddress :{
												required : "Please Enter Email Address.",
												email: "Please enter proper Email address"
											},
											mindeliveryamt : {
												required : "Enter Minimum Delivery Amount",
												number : "Only Digits are allowed"
											},
											restaurantcategory : {
												required : "Please Select at least one category"
											},
										},
										errorPlacement : function(label,
												element) {
											$('<span class="arrow"></span>')
													.insertBefore(element);
											$('<span class="error"></span>')
													.insertAfter(element)
													.append(label)
										},

									});

					$("#frmCountryMaster").validate(
							{
								rules : {
									countryname : {
										required : true
									}
								},
								messages : {
									countryname : {
										required : "Please Enter Country Name"
									}
								},
								errorPlacement : function(label, element) {
									$('<span class="arrow"></span>')
											.insertBefore(element);
									$('<span class="error"></span>')
											.insertAfter(element).append(label)
								},
							});

					$("#frmStateMaster")
							.validate(
									{
										rules : {
											statename : {
												required : true
											},
											stateshortname : {
												required : true
											},
											country_master : {
												required : true
											}
										},
										messages : {
											statename : {
												required : "Please Enter State Name"
											},
											stateshortname : {
												required : "Please Enter Short State Name"
											},
											country_master : {
												required : "Please Select Country"
											}
										},
										errorPlacement : function(label,
												element) {
											$('<span class="arrow"></span>')
													.insertBefore(element);
											$('<span class="error"></span>')
													.insertAfter(element)
													.append(label)
										},
									});

					$("#frmCityMaster").validate(
							{
								rules : {
									cityname : {
										required : true
									},
									state_master : {
										required : true
									}
								},
								messages : {
									cityname : {
										required : "Please Enter City Name"
									},
									state_master : {
										required : "Please Select State"
									}
								},
								errorPlacement : function(label, element) {
									$('<span class="arrow"></span>')
											.insertBefore(element);
									$('<span class="error"></span>')
											.insertAfter(element).append(label)
								},
							});

					$("#frmAreaMaster")
							.validate(
									{
										rules : {
											areaname : {
												required : true
											},
											zipcode : {
												required : true,
												number : true,
												minlength : 5,
												maxlength : 5
											},
											city_master : {
												required : true
											}
										},
										messages : {
											areaname : {
												required : "Please Enter Area Name"
											},
											zipcode : {
												required : "Please Enter Zip Code",
												number : 'Only digits are allowed',
												minlength : "Atleast 6 Digits required",
												maxlength : "Maximum 6 Digits allowed"
											},
											city_master : {
												required : "Please Select City"
											}
										},
										errorPlacement : function(label,
												element) {
											$('<span class="arrow"></span>')
													.insertBefore(element);
											$('<span class="error"></span>')
													.insertAfter(element)
													.append(label)
										},
									});

					$('#rootwizard')
							.bootstrapWizard(
									{
										'tabClass' : 'form-wizard',
										'onNext' : function(tab, navigation,
												index) {
											var $valid = $("#frmRestaurant")
													.valid();
											if (!$valid) {
												$validator.focusInvalid();
												return false;
											} else {
												$('#rootwizard').find(
														'.form-wizard')
														.children('li').eq(
																index - 1)
														.addClass('complete');
												$('#rootwizard')
														.find('.form-wizard')
														.children('li')
														.eq(index - 1)
														.find('.step')
														.html(
																'<i class="icon-ok"></i>');
											}
										},
										'onTabClick' : function(tab,navigation,
													index) {
											return false;
										}
									});
				});
