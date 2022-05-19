$( function(){  
	$.ajax({
		url : 'getcart' ,
		success : function( re ){
			alert( re );
			for(let i=0; i<re.length;i++){
				alert(re[i]);
			}
		}
	});
});