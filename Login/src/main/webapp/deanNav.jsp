<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dean Ap</title>

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

    .program-structure-menu {
        float : left;
        overflow: hidden;
    }

    /*.terms-menu {
        float : left;
        overflow : hidden;
    }*/

    .program-structure-menu .program-structure {
        font-size : 16px;
        border : none;
        outline: none;
        color: white;
        padding : 14px 16px;
        background-color : rgb(105, 162, 221);
        font-family : inherit;
        margin : 0;
    }

    /*.terms-menu .terms {
        width : 200px;
        font-size : 16px;
        border : none;
        outline : none;
        color : rgb(105, 162, 221);
        background-color : white;
        padding : 12px 16px;
        font-family : inherit;
        text-align : left;
    }*/

    .navigation-bar a:hover, .program-structure-menu:hover .program-structure {
        background-color : white;
        color : rgb(105, 162, 221);
    }

    /*.terms-menu:hover .terms {
        color : white;
        background-color : rgb(105, 162, 221);
    }*/

    .program-structure-content {
        display : none;
        position : absolute;
        background-color : white;
        box-shadow : 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
        z-index : 1;
        width : 200px;
    }

    /*.terms-content {
        display : none;
        position : absolute;
        background-color : white;
        width : 200px;
        box-shadow : 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
        z-index : 1;
        left : 100%;
        top : 84px;
    }*/

    .program-structure-content a {
        float : none;
        color : rgb(105, 162, 221);
        padding : 12px 16px;
        text-decoration: none;
        display : block;
        text-align: left;
    }

    /*.terms-content a {
        float : none;
        color : rgb(105, 162, 221);
        padding : 12px 16px;
        text-decoration : none;
        display : block;
        text-align : left;
    }*/

    .program-structure-content a:hover {
        background-color: rgb(105, 162, 221);
        color : white;
    }

    /*.terms-content a:hover {
        background-color : rgb(105, 162, 221);
        color : white;
    }*/

    .program-structure-menu:hover .program-structure-content {
        display : block;
    }
    
    .user_name {
		float : right;
	}

	.user_name:hover {
		background-color : rgb(105, 162, 221);
	}

    /*.terms-menu:hover .terms-content {
        display : block;
    }*/
</style>

</head>
<body>	

	<div class = "navigation-bar">
		<s:url action="Homee" var="term_url" escapeAmp="false">
			<s:param name="userId" value="%{userId}"/>
			<s:param name="userName" value="%{userName}"/>
		</s:url>
		<a href='<s:property value = "#term_url"/>'>Home</a>
		<div class = "program-structure-menu">
			<button class = "program-structure" style = "width : 200px;">Program Structure</button>
			<div class = "program-structure-content">
				<s:url action="getTermYear" var="term_url" escapeAmp="false">
				<s:param name="userId" value="%{userId}"/>
				<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#term_url"/>'>Term</a>
				
				<s:url action="getYear" var="acadYears_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#acadYears_url"/>'>AcadYear</a>
				
				<s:url action="getProgram" var="program_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#program_url"/>'>Program</a>
				
				<s:url action="getCourse" var="course_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#course_url"/>'>Course</a>
				
				<s:url action="getAcadTermCourse" var="atc_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#atc_url"/>'>Add Course in Term-Acad</a>
				
				<s:url action="getSlotAcadTermCourse" var="atc_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#atc_url"/>'>Batch-Master</a>		
				
				<s:url action="getSlotAllotment" var="atc_url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#atc_url"/>'>Show slot allotment</a>
				
				<s:url action="Registrarcoursemaster" var="url" escapeAmp="false">
					<s:param name="userId" value="%{userId}"/>
					<s:param name="userName" value="%{userName}"/>
				</s:url>
				<a href='<s:property value = "#url"/>'>View Courses</a>			
			</div>
		</div>
		<s:url action="getGradeApprovalFromDeanPBS" var="app_dean_url" escapeAmp="false">
			<s:param name="userId" value="%{userId}"/>
			<s:param name="userName" value="%{userName}"/>
		</s:url>
		<a href='<s:property value = "#app_dean_url"/>'>Grade Approval</a>
		<s:url action="HomeLogout" var="term_url" escapeAmp="false">
			<s:param name="userId" value="%{userId}"/>
			<s:param name="userName" value="%{userName}"/>
		</s:url>
		<a href='<s:property value = "#term_url"/>' style = "float : right;">Logout</a>
		<a href="#" style = "float : right; background-color : rgb(105, 162, 221); color : white;">User Id : <s:property value="%{userId}"/></a>
		
	</div><br><br>
</body>
</html>