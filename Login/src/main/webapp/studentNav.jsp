<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>

<style type="text/css">
	body {
        font-family : Arial, Helvetica, sans-serif;
    }

    .navigation-bar {
        overflow : hidden;
        background-color : rgb(105, 162, 221);
        width : 100%;
    }

    .navigation-bar a {
        float : left;
        font-size : 16px;
        color : white;
        text-align : center;
        padding : 14px 16px;
        text-decoration: none;
    }

    .profile-menu, .fees-menu {
        float : left;
        overflow: hidden;
    }

    .pay-fee-menu {
        float : left;
        overflow : hidden;
    }

   .profile-menu .profile, .fees-menu .fees {
        font-size : 16px;
        border : none;
        outline: none;
        color: white;
        padding : 14px 16px;
        background-color : rgb(105, 162, 221);
        font-family : inherit;
        margin : 0;
    }

   .pay-fee-menu .pay-fee {
        width : 200px;
        font-size : 16px;
        border : none;
        outline : none;
        color : rgb(105, 162, 221);
        background-color : white;
        padding : 12px 16px;
        font-family : inherit;
        text-align : left;
    }

    .navigation-bar a:hover, .profile-menu:hover .profile, .fees-menu:hover .fees {
        background-color : white;
        color : rgb(105, 162, 221);
    }

    .pay-fee-menu:hover .pay-fee {
        color : white;
        background-color : rgb(105, 162, 221);
    }

    .profile-content, .fees-content {
        display : none;
        position : absolute;
        background-color : white;
        box-shadow : 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
        z-index : 1;
        width : 200px;
    }

    .pay-fee-content {
        display : none;
        position : absolute;
        background-color : white;
        width : fit-content;
        box-shadow : 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
        z-index : 1;
        left : 100%;
        top : 42px;
    }

    .profile-content a, .fees-content a {
        float : none;
        color : rgb(105, 162, 221);
        padding : 12px 16px;
        text-decoration: none;
        display : block;
        text-align: left;
    }

    .pay-fee-content a {
        float : none;
        color : rgb(105, 162, 221);
        padding : 12px 16px;
        text-decoration : none;
        display : block;
        text-align : left;
    }

    .profile-content a:hover, .fees-content a:hover {
        background-color: rgb(105, 162, 221);
        color : white;
    }

    .pay-fee-content a:hover {
        background-color : rgb(105, 162, 221);
        color : white;
    }

    .profile-menu:hover .profile-content, .fees-menu:hover .fees-content {
        display : block;
    }
    
    .user_name {
		float : right;
	}

	.user_name:hover {
		background-color : rgb(105, 162, 221);
	}

    .pay-fee-menu:hover .pay-fee-content {
        display : block;
    }
</style>

</head>
<body>	
	<p> im here </p>
	<div class = "navigation-bar">
		<s:url namespace = "/" action="Homee" var="term_url" escapeAmp="false">
			<s:param name="userId" value="%{userId}"/>
			<s:param name="userName" value="%{userName}"/>
		</s:url>
		<a href='<s:property value = "#term_url"/>'>Home</a>
		
		<div class = "profile-menu">
			<button class ="profile">Profile</button>
			<div class = "profile-content">
			
				<s:url namespace = "/" action="editStudentProfile" var="d_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
					<s:param name="StudentId" value="%{userId}"/>
				</s:url>
				<a href='<s:property value = "#d_url"/>'>Edit Profile</a>
			</div>
		</div>
		
        <s:url namespace = "/" action="StudentRegistrationForm1" var="d_url" escapeAmp="false">
            <s:param name="userId" value="%{userId}"/>
            <s:param name="userName" value="%{userName}"/>
            <s:param name="StudentId" value="%{userId}"/>
        </s:url>
        <a href='<s:property value = "#d_url"/>'>Registration</a>

        <s:url namespace = "/" action="StudentResultForm1" var="d_url" escapeAmp="false">
            <s:param name="userId" value="%{userId}"/>
            <s:param name="userName" value="%{userName}"/>
      		<s:param name="StudentId" value="%{userId}"/>      
        </s:url>
        <a href='<s:property value = "#d_url"/>'>Result</a>
        
        <div class = "fees-menu">
        	<button class = "fees">Fees</button>
        	<div class = "fees-content">
        	
        		<s:url namespace = "/" action="student/fee_receipt_pre" var="feereceipt" escapeAmp = "false">
        			<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
        		</s:url>
				<a href="<s:property value="#feereceipt"/>"> Fee Receipt </a>
				
				<div class = "pay-fee-menu">
					<button class = "pay-fee">Pay Fee</button>
					<div class = "pay-fee-content">
					
						<s:url namespace = "/" action="Homee" var="paytm" escapeAmp = "false">
		        			<s:param name="userId" value="%{userId}"/>
							<s:param name="userName" value="%{userName}"/>
						</s:url>
						<a href="<s:property value="#paytm"/>"> PayTm </a>
						
						<s:url namespace = "/" action="Homee" var="eazypay" escapeAmp = "false">
		        			<s:param name="userId" value="%{userId}"/>
							<s:param name="userName" value="%{userName}"/>
						</s:url>
						<a href="<s:property value="#eazypay"/>"> EazyPay </a>
					
					</div>
				</div>
				<br><br>
				<s:url namespace = "/" action="student/applicable_fee_pre" var="afp" escapeAmp = "false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href="<s:property value="#afp"/>"> Applicable Fee  </a>
        	</div>
        </div>

		<s:url namespace = "/" action="HomeLogout" var="term_url" escapeAmp="false">
			<s:param name="userId" value="%{uId}"/>
			<s:param name="userName" value="%{userName}"/>
		</s:url>
		<a href='<s:property value = "#term_url"/>' style = "float : right;">Logout</a>
		<a href="#" style = "float : right; background-color : rgb(105, 162, 221); color : white;">User Id : <s:property value="%{userId}"/></a>
		
	</div>
</body>
</html>