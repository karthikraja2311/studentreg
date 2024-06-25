
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Page</title>
<link rel="stylesheet" href="Admin.css">
</head>
<body>
 <form class="Admin" action="Viewdetails" method="post">
            <h1> 
                ADMIN LOGIN
            </h1>
            <div class="input-details">
                <div>
                    <label>User Name</label>
                    <input type="text" placeholder="Enter Your User Name" name="username" required>
                </div>
                <div>
                    <label>Password</label>
                    <input type="text" placeholder="Enter Your Password" name="password" required>
                </div>
                <div class="buttons">
                    <button class="SubmitBtn" value="login">
                    <span class="btntext">Submit</span>
                    </button>
                 </div>

            </div>
            
        </form>
<script src="Function.js"></script>

</body>
</html>