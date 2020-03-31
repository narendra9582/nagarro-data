<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <html lang="en">
  <head> 
  <meta charset="utf-8">
  <title>Show Hide Dropdown Using CSS</title> 
  <style type="text/css"> 
  ul{ padding: 0; list-style: none; background: #f2f2f2; } 
  ul li{ display: inline-block; position: relative; line-height: 11px; text-align: left; } 
  ul li a{ display: block; padding: 8px 25px; color: #333; text-decoration: none; } 
  ul li a:hover{ color: #fff; background: #939393; } 
  ul li ul.dropdown{ min-width: 100%; /* Set width of the dropdown */ background: #f2f2f2; display: none; position: absolute; z-index: 999; left: 0; } 
  ul li:hover ul.dropdown{ display: block; /* Display the dropdown */ } 
  ul li ul.dropdown li{ display: block; } 
  </style> 
  </head> 
  <body> 
  <ul> 
  <li><a href="test.jsp?opt=1">Home</a></li>
 <li> <a href="#">About</a></li> 
<li>
     <a href="#">Products ▾</a> 
     <ul class="dropdown"> 
          <li><a href="test.jsp?opt=2">register</a></li> 
         <li><a href="test.jsp?opt=3">login</a></li> 
          <li><a href="#">Printers</a></li> 
     </ul> 
 </li>
  
   <li><a href="#">Contact</a></li> 
</ul> 
 </body> 
 </html> 
 
 
 
 
 
 
 
 
 