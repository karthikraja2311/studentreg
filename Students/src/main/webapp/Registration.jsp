<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title> Regisration Form</title>
<link rel="stylesheet" href="Registration.css">
</head>
<body>
 <div class="container">
            <header>Regisration</header>

            <form id="myform"  action="register" method="post">

                <div class="form first">

                    <div class="details personal">
                        <span class="title">Personal Details</span>

                        <div class="fields">
                            <div class="input-details">
                                <label>Full_Name</label>
                                <input type="text" placeholder="Enter Your name" name="name" required>
                            </div>

                            <div class="input-details">
                                <label>Date_of_Birth</label>
                                <input type="date" placeholder="Enter Birth Date" name="date" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Email</label>
                                <input type="text" placeholder="Enter Your email" name="email"required>
                            </div>

                            <div class="input-details">
                                <label>Phone_Number</label>
                                <input type="number" placeholder="Enter Phone Number" name="pnumber" required>
                            </div>

                            <div class="input-details">
                                <label>Gender</label>
                                <input type="text" placeholder="Enter Your Gender"name="gender" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Nationality</label>
                                <input type="text" placeholder="Enter your Nationality"  name="nationality" required>
                            </div>

                        </div>



                    </div>
                    <div class="details famils">

                        <span class="title">Family_Details</span>

                        <div class="fields">

                            <div class="input-details">
                                <label>Father_Name</label>
                                <input type="text" placeholder="Enter Father Name" name="fname" required>
                            </div>

                            <div class="input-details">
                                <label>Father_Phone_Number</label>
                                <input type="number" placeholder="Enter Phone Number" name="fnumber" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Father_Occupation</label>
                                <input type="text" placeholder="Enter Your Occupation" name="foccu" required>
                            </div>

                            <div class="input-details">
                                <label>Mother_Name</label>
                                <input type="text" placeholder="Enter Mother Name" name="mname" required>
                            </div>

                            <div class="input-details">
                                <label>Mother_Phone_Number</label>
                                <input type="number" placeholder="Enter Phone Number" id=number name="mnumber" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Mother_Occupation</label>
                                <input type="text" placeholder="Enter your Occupation" name="moccu" required>
                            </div>

                        </div>

                    </div>
                </div>
                <div class="second form">

                    <div class="details personal">

                        <span class="title">Address Details</span>
                        <div class="fields">

                            <div class="input-details">
                                <label>Country</label>
                                <input type="text" placeholder="Enter Your Country" name="country" required>
                            </div>
    
                            <div class="input-details">
                                <label>State</label>
                                <input type="text" placeholder="Enter Your state"  name="state"  required>
                            </div>
                            
                            <div class="input-details">
                                <label>District</label>
                                <input type="text" placeholder="Enter Your District"  name="district" required>
                            </div>
    
                            <div class="input-details">
                                <label>Area_land_Mark</label>
                                <input type="text" placeholder="Enter Your Area & landmark" name="are" required>
                            </div>
    
                            <div class="input-details">
                                <label>Door_Number</label>
                                <input type="text" placeholder="Enter Your Door Number" name="door" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Pin_Code</label>
                                <input type="text" placeholder="Enter your PIN Code" name="pin" required>
                            </div>

                        </div>

                    </div>
                    <div class="details personal">

                        <span class="title">Other Details</span>

                        <div class="fields">
                            <div class="input-details">
                                <label>School_Name</label>
                                <input type="text" placeholder="Enter Your School Name" name="school" required>
                            </div>
    
                            <div class="input-details">
                                <label>Major</label>
                                <input type="text" placeholder="Enter Your Major" name="major" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Cut_Off_Mark</label>
                                <input type="text" placeholder="Enter Your Cut Off Mark" name="mark" required>
                            </div>

                            <div class="input-details">
                                <label>Area_of_Intrest_Option1</label>
                                <input type="text" placeholder="Enter Department" name="option1" required>
                            </div>
    
                            <div class="input-details">
                                <label>Option2</label>
                                <input type="text" placeholder="Enter Department" name="option2" required>
                            </div>
                            
                            <div class="input-details">
                                <label>Option3</label>
                                <input type="text" placeholder="Enter Department" name="option3" required>
                            </div>
                            

                        </div>
                    </div>
                    <div class="buttons">
                       
    
                       <button class="SubmitBtn">
                            <span class="btntext">Submit</span>
                       </button>
                    </div>
                </div>
            </form>

        </div>
        
       

</body>
</html>