$(function(){

	var col = 5;
	
	blockImage(col);

	var category = $("#searchSelect option:selected").val();
	loadImage(category,"1");


	var currentWidth = 1200;
	$(window).resize(function(){
		var winWidth = $(window).width();
		var conWidth;
		if(winWidth<400){
			conWidth = 240;
			col = 1;
		}else if(winWidth<660){
			conWidth = 440;
			col = 3;
		}else if(winWidth<880){
			conWidth = 660;
			col = 4;
		}else{
			conWidth = 1200;
			col = 5;
		}

		if(conWidth!=currentWidth){
			currentWidth=conWidth;
			$("#content").width(conWidth);
			blockImage(col);
		}

	});
	
	
});


	
	
$(".btn").click(function(){
	var category = $("#searchSelect option:selected").val();
	loadImage(category,"1");
});

function blockImage(col){
	$("#content").BlocksIt({
		numOfCol:col,
		offsetX:10,
		offsetY:12
	});
}
	

function loadImage(category,page){
	$.post("getData",{category:category,page:page},function(data){
		$("#content").empty();
		for(var i = 0;i<data.length;i++){
			var img ='<div class="grid">'+
			    '<div class="imgholder">'+
				'<img class="lazy"  src="'+data[i].src+'"/>'+
				'</div>'+
				'<strong>'+data[i].title+'</strong>'+
				'<div class="meta">'+
				'<a href="'+data[i].src+'" class="lightbox">查看高清原图</a>'+
				'</div>'+
				'</div>';
			$("#content").append(img);
		}
		blockImage(5);
		$("a.lightbox").lightBox();
	},"json");
}
















