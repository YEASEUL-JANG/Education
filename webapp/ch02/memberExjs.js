/**
 * memberExjs.js
 */
 function enter(){
	console.log(window.event.keyCode); 
		if(window.event.keyCode==13){
	test();
	}
}

function test(){
	var name=document.input.name.value;
	var id=document.input.id.value;
	var email=document.input.email.value;
	var phone=document.input.phone.value;
	var password=document.input.password.value;
	
	document.input.submit();
}