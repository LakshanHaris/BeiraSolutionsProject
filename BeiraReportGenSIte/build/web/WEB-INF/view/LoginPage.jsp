<%-- 
    Document   : LoginPage
    Created on : 13-Jul-2018, 14:48:38
    Author     : Lakshan Harischandra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Beira Enviro | Home</title>

        <!-- Bootstrap core CSS -->

        <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
              crossorigin="anonymous">
        <link href="../resources/custom/bootswatch.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Jua|Philosopher">
        <link href="../resources/homePageStyles/blockQuoteStyle.css" rel="stylesheet" type="text/css"/>
        <link href="../resources/homePageStyles/half-slider.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="../resources/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="../resources/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="../resources/custom/form-elements.css">
        <link rel="stylesheet" href="../resources/custom/style.css">
        <link href="../resources/homePageStyles/footer-distributed-with-address-and-phones.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="customNavBar">
            <div class="container">
                <a class="navbar-brand" href="LoginPage.jsp" style="font-family: 'Philosopher', sans-serif; font-size: 25px;">Beira Enviro Solutions (Pvt.) Limited</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
        </nav>

        <div class="top-content">
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-md-4 form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Login to your account</h3>
                                    <p>Welcome Again!</p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-lock"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <form role="form" action="login/getshiftpage" method="POST" id="loginForm" class="login-form" >
                                    <div class="form-group">
                                        <label class="sr-only" for="form-username">Registration number</label>
                                        <input type="text" name="regNumber" placeholder="supervisior id" class="form-username form-control" id="form-username" required>
                                    </div>
                                    <div class="form-group">
                                        <label class="sr-only" for="form-password">Password</label>
                                        <input type="password" name="password" placeholder="password" class="form-password form-control" id="form-password">
                                    </div>
                                    <button type="submit" class="btn">Log in</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!-- Footer -->
        
        <footer class="footer-distributed">

            <div class="footer-left">

                <h3>Beira<span>Enviro</span></h3>
                <p class="footer-company-name">Beira enviro solutions &copy; 2018&nbsp;</p>
                <p class="footer-company-name">developed by JDeps team</p>

            </div>

            <div class="footer-center">


            </div>

            <div class="footer-right">

                <p class="footer-company-about">
                    <span>About the company</span>
                    Beira is a single source, end-to-end, value chain solutions partner who can supply to large international buyers of professional and household cleaning products..
                </p>

            </div>

        </footer>


        <script src="../resources/js/jQuery-2.1.3.min.js" type="text/javascript"></script>
        <script src="../resources/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="../resources/bootstrap/js/bootstrap.min.js"></script>
        <script src="../resources/js/jquery.backstretch.js" type="text/javascript"></script>
        <script src="../resources/js/scriptsLogin.js"></script>

    </body>
</html>
