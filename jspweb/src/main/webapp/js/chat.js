/**
 * 
 */
 
 
function send(){
let cnick=$("#cnick").val();
let ccontent=$("#ccontent").val();
$.ajax({
	url :"send",
	data:{"cnick":cnick,"ccontent":ccontent},
	success: function(result){
		$("#cnick").val("");
		$("#ccontent").val("");
	}
	
});	
}
	

 
 
 $(function(){
	
});
$.ajax({
	 url: "/chatting",
	 error: function(){
		 // ERROR 
	 }, success: function(){
		 // Success
	 },
	 timeout: 600 // 3 seconds
});

