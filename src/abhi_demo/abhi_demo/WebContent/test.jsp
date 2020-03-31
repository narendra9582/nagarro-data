<% String d=request.getParameter("opt"); 
int ch=Integer.parseInt(d); 
switch(ch){ case 1: %> 
<jsp:include page="home.jsp" /> 
<% break; case 2: %> 
<jsp:include page="register.jsp" /> 
<% break;
case 3: %> 
<jsp:include page="login.jsp" /> 
<% break;
default:%>
<jsp:include page="home.jsp" /> <%}%>