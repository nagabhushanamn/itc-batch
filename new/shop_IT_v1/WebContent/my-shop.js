/**
 * 
 */

// Model
var items = [ {
	id:1,
	name : 'Laptop',
	price : 192000,
	description : 'New Mac pro Laptop',
	canBuy:true,
	notAvailable:false,
	images:[
		{thumb:'images/Laptop.png',full:''}
	],
	reviews:[
		{stars:5,author:'nag@gmail.com',comment:'This is good laptop'},
		{stars:2,author:'indu@gmail.com',comment:'This is costly'}
	]
}, {
	id:2,
	name : 'Mobile',
	price : 2000,
	description : 'New iphone 7s Laptop',
	canBuy:true,
	notAvailable:false,
	images:[
		{thumb:'images/Mobile.png',full:''}
	],
	reviews:[
		{stars:5,author:'nag@gmail.com',comment:'This is good laptop'},
		{stars:2,author:'indu@gmail.com',comment:'This is costly'}
	]
} ];

// --------------------------------------------------------------

// way-1 - plain-js

// document.querySelector('h3').textContent = item.name;
// document.querySelector('h4').textContent = item.price;
// document.querySelector('p').textContent = item.description;

// --------------------------------------------------------------

// way-2 - jQuery
// $(document).ready(function(){
// $('h3').text(item.name);
// $('h4').text(item.price);
// $('p').text(item.description);
// });

// --------------------------------------------------------------

// way-3 - Angular

var shopMod = angular.module('shop', []);

shopMod.controller('ShopController', function() {
	//
	this.products = items;
	var self=this;
	this.submitReview=function(product){
		
		//send this review-data to server..using AJAX call
		
		product.reviews.push(self.newReview);
		self.newReview=null;
		
		
	}
	
});
