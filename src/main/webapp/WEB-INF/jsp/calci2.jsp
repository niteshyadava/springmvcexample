<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Student Information</h2>

   <table>
    <tr>
        <td>First Name:</td>
        <td>${student.firstName}</td>
    </tr>
    <tr>
        <td>Last Name:</td>
        <td>${student.lastName}</td>
    </tr>
    <tr>
        <td>Father's Name:</td>
        <td>${student.fatherName}</td>
    </tr>
    <tr>
        <td>Place of birth:</td>
        <td>${student.pob}</td>
    </tr>
    
     <tr>
        <td>Email id:</td>
        <td>${student.eid}</td>
    </tr>
    <tr>
        <td>Phone Number:</td>
        <td>${student.pno}</td>
    </tr>
    
   
    <tr>
        <td>Marks in 10:</td>
        <td>${student.marks1}</td>
        <td>${student.marks2}</td>
        <td>${percentage10}</td>
        
    </tr>
    
    <tr>
        <td>Marks in 12:</td>
        <td>${student.marks3}</td>
        <td>${student.marks4}</td>
        <td>${percentage12}</td>
    </tr>
   
   
    
 <%-- <tr>
        <td>DOB:</td>
        <td>${student.dob}</td>
    </tr>
     
       --%>
  
    <tr>
        <td>University</td>
        <td>${student.university}</td>
    </tr>
    
    <tr>
        <td>Course</td>
        <td>${student.course}</td>
    </tr>   
   </table> 
 <br/><br/> 
 <center>
   <!--  <input type="submit" value="Print"> --> 
   <input type="button" 
   onClick="window.print()" 
   value="Print This Page"/>
  </center>
</body>
</html>