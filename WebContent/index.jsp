<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<base href="spider">
<meta charset="UTF-8">
<title>Java爬虫Demo</title>
<link type="text/css" rel="stylesheet" href="style/jquery.lightbox-0.5.css"/>
<link type="text/css" rel="stylesheet" href="style/index.css" />
</head>
<body>


	<!-- header start -->
	<div class="header">
		<h1>Java爬虫Demo</h1>
		<select id="searchSelect" name="searchType">
			<option value="weimei">唯美图片</option>
			<option value="oumei">欧美图片</option>
			<option value="meinv">美女图片</option>
			<option value="xiaoqingxin">小清新</option>
			<option value="sucai">素材</option>
		</select>
		<a href="javascrippt:void(0)" class="btn">点击搜索</a>
	</div>
	<!-- header end -->

	<!-- content start -->
	<div id="wrapper">
		<div id="content"></div>
	</div>
	<!-- content end -->
	
	
	
	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="js/blocksit.min.js"></script>
	<script type="text/javascript" src="js/jquery.lazyload.min.js"></script>
	<script type="text/javascript" src="js/jquery.lightbox-0.5.min.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	
</body>
</html>

