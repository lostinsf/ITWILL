<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include.jsp"%>
<%@ include file="include.jsp"%>

</head>
<body>
  <form>
  	<fieldset>
  		<input type="search" />
	  		<button type="submit">
	  		<i class="fa fa-search">
	  		</i>
	  		</button>
	  	<br>
  	</fieldset>
  </form>
   <img id="test" alt="테스트그림" src="${pageContext.request.contextPath}/resources/${pageName}/img/mov.jpg">
</body>
</html>
