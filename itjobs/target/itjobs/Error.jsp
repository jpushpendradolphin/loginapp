<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/login.css"></link>
<script src="js/login.js"></script>
</head>
<body>

<div class="container">

<header>
Login Page
</header>
  
<nav>
  <ul>
    <!-- <li><a href="#">Login</a></li> -->
    <li><a href="Home.jsp">Home</a></li>
    <li><a href="Contact.jsp">Contact Us</a></li>
  </ul>
</nav>

<article style = "text-align:center">
<h3 style = "color : red; text-align :center">Error in Login Either User or Password is Wrong</h3>
  <h2>Welcome To Login Page</h2>
  <form action = "login" name = "loginForm" onsubmit="return validateForm()">
  <table align = "center">
  <tr>
  <td>UserName</td>
  <td><input type = "text" name = "uname"/></td>
  </tr>
  <tr>
  <td>Password</td>
  <td><input type = "password" name = "pass"/></td>
  </tr>
  <tr>
  <td><input type = "submit" value = "Login"/></td>
  </tr>
  </table>
  </form>
</article>

<footer>Copyright &copy; chetakjobs.com</footer>

</div>

</body>
</html>
