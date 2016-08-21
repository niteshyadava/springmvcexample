<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>
<center>
<h3 style="color:red;">ONLINE APPLICATION FORM</h3>
</center>
<form method="POST" action="addstudent">
   
   First Name:<input type="text" name="firstName">
   <br/><br/><br/>
   Last Name:<input type="text" name="lastName">
   <br/><br/><br/>
   Username:<input type="text" name="userName">
   Password:<input type="password" name="password">
   <br/><br/><br/>

   Father's Name:<input type="text" name="fatherName">
   <br/><br/><br/>
   Place of Birth:<input type="text" name="pob">
   <br/><br/><br/>
    Email id:<input type="text" name="eid">
   <br/><br/><br/>
   Phone number:<input type="number" name="pno">
   <br/><br/><br/>
   
   Enter your 10 standard marks:
   <br/>
   <br/>
   Enter marks in subject 1(max.100):<input type="number" name="marks1" min="1" max="100">
   <br/><br/><br/>
   Enter marks in subject 2(max.100):<input type="number" name="marks2" min="1" max="100">
   <br/><br/><br/>
   
   Enter your 12 standard marks
   <br/><br/>
   Enter marks in subject 1(max.100):<input type="number" name="marks3" min="1" max="100">
   <br/><br/><br/>
   Enter marks in subject 2(max.100):<input type="number" name="marks4" min="1" max="100">
   <br/><br/><br/> 
   
   Select the University you want to apply for:
   <input type="radio" name="university" value="SRM">SRM
   <input type="radio" name="university" value="VIT">VIT
   <input type="radio" name="university" value="MANIPAL">MANIPAL
   <br/><br/><br/>
   Select the course to apply for:
   <input type="radio" name="course" value="B.Tech">B.Tech
   <input type="radio" name="course" value="B.Comm">B.Comm
   <input type="radio" name="course" value="Hotel Management">Hotel Management
   <br/><br/><br/>
   
   <center>
   <input type="submit" value="Submit">
   </center>
</form>
</body>
</html>