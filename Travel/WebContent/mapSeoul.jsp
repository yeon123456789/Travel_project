<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
	        svg circle {
	          fill: orange;
	          opacity: .5;
	          stroke: white;
	        }
	        svg circle:hover {
	          fill: red;
	          stroke: #333;
	        }
	        svg text {
	          pointer-events: none;
	        }
	        svg .municipality {
	          fill: #efefef;
	          stroke: #fff;
	        }
	        svg .municipality-label {
	          fill: #bbb;
	          font-size: 12px;
	          font-weight: 300;
	          text-anchor: middle;
	        }
	        svg #map text {
	          color: #333;
	          font-size: 10px;
	          text-anchor: middle;
	        }
	        svg #places text {
	          color: #777;
	          font: 10px sans-serif;
	          text-anchor: start;
	        }
	        #title {
	            font-family: sans-serif;
	        }
	        #title p {
	            font-size: 10pt;
	        }
	         div #chart{
		        display: block;
				margin:auto;
				text-align:center;
	        }
   		</style>
	</head>
	<body>
		<div id="chart"></div>
   <!--  <div id="title">
        <h2>식신로드 서울지역 만점식단 20선</h2>
        <p>식신로드에서 만점을 받은 음식점을 D3.js, TopoJSON을 이용해 지도를 그렸습니다.
        지도 만드는 법은 <a href="http://www.lucypark.kr/blog/2015/06/24/seoul-matzip-mapping/">D3를 이용한 서울시내 맛집 시각화 (Feat. 식신로드)</a>를 참고해주세요.
        <p>
          <a href="http://www.wikitree.co.kr/main/news_view.php?id=217101">Data by Wikitree</a>
          and <a href="https://gist.github.com/e9t/ba9edd99793a5c91eaab">code</a>
          by <a href="http://lucypark.kr">Lucy Park</a>.
          <br>
          <a href="http://opensource.org/licenses/Apache-2.0">Licensed with Apache 2.0</a>
        </p>
    </div> -->
    <script src="http://d3js.org/d3.v3.min.js"></script>
    <script src="http://d3js.org/topojson.v1.min.js"></script>
    <script>
    var width = 800,
        height = 600;

    var svg = d3.select("#chart").append("svg")
        .attr("width", width)
        .attr("height", height);

    var map = svg.append("g").attr("id", "map"),
        places = svg.append("g").attr("id", "places");

    var projection = d3.geo.mercator()
        .center([126.9895, 37.5651])
        .scale(100000)
        .translate([width/2, height/2])
        
  
    	

    var path = d3.geo.path().projection(projection);

    d3.json("seoul_municipalities_topo_simple.json", function(error, data) {
      var features = topojson.feature(data, data.objects.seoul_municipalities_geo).features;
      map.selectAll('path')
          .data(features)
        .enter().append('path')
          .attr('class', function(d) { console.log(); return 'municipality c' + d.properties.code })
          .attr('d', path);

      map.selectAll('text')
          .data(features)
        .enter().append("text")
          .attr("transform", function(d) { return "translate(" + path.centroid(d) + ")"; })
          .attr("dy", ".35em")
          .attr("class", "municipality-label")
          .text(function(d) { return d.properties.name; })
    });
	
    function popupMarker(){
	    d3.csv("places1.csv", function(data) {
	        places.selectAll("circle")
	            .data(data)
	         	.enter().append("circle")
	            .attr("cx", function(d) { return projection([d.lon, d.lat])[0]; })
	            .attr("cy", function(d) { return projection([d.lon, d.lat])[1]; })
	            .attr("r", 10)
	            .on("mouseover", handleMouseOver)
	            .on("mouseout", handleMouseOut);
	        
	        function handleMouseOver(d, i) {  // Add interactivity
	
	            // Use D3 to select element, change color and size
	            // Specify where to put label of text
	            svg.append("text").attr({
	               id: "t"+ d.name ,  // Create an id for text so we can select it later for removing on mouseout
	                x: function() { return projection([d.lon, d.lat])[0]; },
	                y: function() { return projection([d.lon, d.lat])[1] + 8; }
	            })
	            .text(function() {
	              return [d.name];  // Value of the text
	            });
	          }
	        
	        function handleMouseOut(d, i) {
	        	d3.select("#t"+d.name).remove();  // Remove text location
	        }  
	        
	    })
    }
     
    </script>
			
	</body>
</html>