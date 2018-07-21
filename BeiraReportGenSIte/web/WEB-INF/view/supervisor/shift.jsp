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

        <title>Beira Enviro | Shift</title>

        <!-- Bootstrap core CSS -->

        <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
              crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Boogaloo|Gloria+Hallelujah|Patrick+Hand" rel="stylesheet">
        <link href="../resources/custom/bootswatch.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Jua|Philosopher">
        <link href="../resources/homePageStyles/blockQuoteStyle.css" rel="stylesheet" type="text/css"/>
        <link href="../resources/homePageStyles/half-slider.css" rel="stylesheet" type="text/css"/>
        <link href="../resources/custom/UserCustomStyles.css" rel="stylesheet" type="text/css"/>
        <link href="../resources/custom/sweetalert.css" rel="stylesheet" type="text/css"/>
        <link href="../resources/homePageStyles/footer-distributed-with-address-and-phones.css" rel="stylesheet" type="text/css"/>
        <link href="../resources/custom/inputSuggestStyles.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="customNavBar">
            <div class="container">
                <a class="navbar-brand" href="LoginPage.jsp" style="font-family: 'Philosopher', sans-serif; font-size: 25px;">Beira Enviro Solutions (Pvt.) Limited</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarColor01" style="align-items: flex-end;">
                    <ul class="navbar-nav mr-auto">

                        <li class="nav-item" style="padding-left: 225px;">
                            <a class="nav-link" href="<c:url value="#"/>">| Packing OEE</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="#"/>">| Extrusion OEE </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="../login/userLogOut"/>">| Log out </a>
                        </li>

                    </ul>
                    <label style="color: #ffffff; ">Supervisor : ${searchedSupervisor.name}</label>
                </div>
            </div>


        </nav>

        <div class="container">
            <!--            DONT REMOVE BELOW DIV ITS TO CREATE SPACE-->
            <div style="height: 85px;"></div>

            <h2>Shift Details</h2>
            <hr>
            <form id="shiftDetailsForm">
                <div class="row">
                    <div class="col-md-3">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">Date of the shift</label>
                            <input type="text" class="form-control" placeholder="yyyy/mm/dd"  name="date" id="dateinput">
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">Technician</label>
                            <input type="text" class="form-control" placeholder="name here"  name="technician">
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">Number of workers</label>
                            <input type="text" class="form-control" placeholder="amount"  name="numOfWorkers" id="dateinput">
                        </div>
                    </div>
                    <div class="col-md-2" style="padding-left: 40px;">
                        <fieldset class="form-group">
                            <label class="col-form-label" for="inputDefault">Shift type</label>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input type="radio" class="form-check-input"  id="optionsRadios1" value="Day" name="shift" checked="">Day shift
                                </label>
                            </div>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input type="radio" class="form-check-input" id="optionsRadios2" value="Night" name="shift">Night shift
                                </label>
                            </div>
                        </fieldset>
                    </div>
                    <div class="col-md-2" style="padding-top: 20px;">
                        <div class="form-group">
                            <button type="button" class="btn btn-success" id="enterShiftDetails">Start Shift</button>
                        </div>
                    </div>
                </div>
            </form>
            <div style="height: 25px;"></div>

            <div id="itemSubmisionFormDiv">
                <div style="height: 25px;"></div>
                <h2>Item Production Details</h2>
                <hr>    
                <form id="productionItemDetailsForm" autocomplete="off">
                    <div style="height: 25px;"></div>
                    <h4>Item Details</h4>
                    <hr>
                    <div style="height: 25px;"></div>
                    <div class="row">
                        <div class="col-md-2">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">SO number</label>
                                <input type="text" class="form-control" placeholder="so"  name="sOnumber" id="soNumber">
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Customer</label>
                                <input type="text" class="form-control" placeholder="name"  name="customer" id="customer">
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="autocomplete" style="width:250px;">
                                <label class="col-form-label" for="inputDefault">Part number</label>
                                <input id="myInputProduction" type="text" name="partNumber" placeholder="part number" class="form-control">
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Produced</label>
                                <input type="text" class="form-control" placeholder="qty"  name="producedQty" id="produced">
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Cartons</label>
                                <input type="text" class="form-control" placeholder="new"  name="newCartons" id="cartonsNew">
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Cartons</label>
                                <input type="text" class="form-control" placeholder="used"  name="usedCartons" id="cartonsUsed">
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Bags(PP/PE)</label>
                                <input type="text" class="form-control" placeholder="qty"  name="bags" id="bags">
                            </div>
                        </div>
                        <div class="col-md-1">
                            <fieldset class="form-group">
                                <label class="col-form-label" for="inputDefault">Single die</label>
                                <div class="form-check">
                                    <label class="form-check-label" style="padding-left: 23px; padding-bottom: 8px;">
                                        <input class="form-check-input" type="checkbox" value="single" name="die" id="die">
                                    </label>
                                </div>
                            </fieldset>
                        </div>
                    </div>
                    <div style="height: 15px;"></div>
                    <div class="row">
                        <div class="col-md-8"></div>
                        <div class="col-md-4" style="padding-left: 250px;">
                            <button type="button" class="btn btn-success" id="enterToTableBtn">Add to table</button>
                        </div>
                    </div>
                    <div style="height: 25px;"></div>
                    <h4>Reject Analysis</h4>
                    <hr>    
                    <div style="height: 45px;"></div>
                    <div class="row">
                        <div class="col-md-1"></div>
                        <div class="col-md-10">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th scope="col">Item#</th>
                                        <th scope="col">Metal detector</th>
                                        <th scope="col">Back flush</th>
                                        <th scope="col">Line change</th>
                                        <th scope="col">Line rejects</th>
                                        <th scope="col">Other</th>
                                    </tr>
                                </thead>
                                <tbody id="rejectTableBody">
<!--                                     Jquery fills body when clicks-->
                                </tbody>
                            </table>
                        </div>
                        <div class="col-md-1"></div>
                    </div>
                    <div style="height: 15px;"></div>

                    <div style="height: 25px;"></div>
                    <div style="height: 25px;"></div>
                    <h4>Machine Run Time</h4>
                    <hr>
                    <div style="height: 15px;"></div>
                    <div class="row">
                        <div class="col-md-2">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">From</label>
                                <input type="text" class="form-control" placeholder="time"  name="fromRunTime" id="runtimeFrom">
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">To</label>
                                <input type="text" class="form-control" placeholder="time"  name="toRunTime" id="runtimeTo">
                            </div>
                        </div>
                        <div class="col-md-1" style="padding-top: 5px;">
                            <fieldset disabled="">
                                <label class="control-label" for="disabledInput">#Mins</label>
                                <input class="form-control" id="disabledInputRun" type="text" placeholder="mins" disabled="" name="noOfMinutesRuntime">
                            </fieldset>
                        </div>
                    </div>

                    <div style="height: 35px;"></div>
                    <h4>Machine Down Time</h4>
                    <hr>    
                    <div style="height: 15px;"></div>
                    <div class="row">
                        <div class="col-md-2">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Status</label>
                                <select class="custom-select" name="status" id="status">
                                    <option value="unplanned" selected>Un planned</option>
                                    <option value="planned" selected>Planned</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">From</label>
                                <input type="text" class="form-control" placeholder="time"  name="fromDowntime" id="downtimeFrom">
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">To</label>
                                <input type="text" class="form-control" placeholder="time"  name="toDowntime" id="downTimeTo">
                            </div>
                        </div>
                        <div class="col-md-1" style="padding-top: 5px;">
                            <fieldset disabled="">
                                <label class="control-label" for="disabledInput">#Mins</label>
                                <input class="form-control" id="disabledInputDown" type="text" placeholder="mins" disabled="" name="noOfMinutesDowntime">
                            </fieldset>
                        </div>
                        <div class="col-md-3">
                            <div class="form-group">
                                <label class="col-form-label" for="inputDefault">Reason</label>
                                <select class="custom-select" name="reason" id="reason">
                                    <option value="changing item" selected>Changing to item 2</option>
                                    <option value="line re set up" selected>Line re set up</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="exampleTextarea">Comment</label>
                                <textarea class="form-control" id="exampleTextarea" rows="3" name="comment"></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-9"></div>
                        <div class="col-md-3" style="padding-left: 145px;">
                            <button type="button" class="btn btn-success" id="submitDownTimeBtn">Add Downtime</button>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <h6 id="downtimeSuccess" style=" display: none; color: red; padding-left: 96px; font-size: 20px; font-family: 'Patrick Hand', cursive; ">Down time added !</h6>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                    <div style="height: 65px;"></div>
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4" style="padding-left: 100px;">
                            <button type="button" class="btn btn-success" id="submitToProductionBtn" style="width: 180px;">Submit Item</button>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                    <div style="height: 65px;"></div>
                </form>
            </div>
            <div style="height: 65px;"></div>
            <h2>Packing</h2>
            <hr>    
            <div style="height: 25px;"></div>
            <form id="packingDetailForm" autocomplete="off">
                <div class="row">
                    <div class="col-md-3">
                        <div class="autocomplete" style="width:250px;">
                            <label class="col-form-label" for="inputDefault">Part number</label>
                            <input id="myInputPacking" type="text" name="partNumber" placeholder="part number" class="form-control">
                        </div>
                    </div>
                    <div class="col-md-1">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">Packed</label>
                            <input type="text" class="form-control" placeholder="qty"  name="packedQuantity">
                        </div>
                    </div>
                    <div class="col-md-2">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">Cutter wastage</label>
                            <input type="text" class="form-control" placeholder="cutter"  name="cutterWastage">
                        </div>
                    </div>
                    <div class="col-md-1">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">From</label>
                            <input type="text" class="form-control" placeholder="time"  name="from" id="fromTimePacking">
                        </div>
                    </div>
                    <div class="col-md-1">
                        <div class="form-group">
                            <label class="col-form-label" for="inputDefault">To</label>
                            <input type="text" class="form-control" placeholder="time"  name="to" id="toTimePacking">
                        </div>
                    </div>
                    <div class="col-md-1" style="padding-top: 5px;">
                        <fieldset disabled="">
                            <label class="control-label" for="disabledInput">#Mins</label>
                            <input class="form-control" id="disabledInputPacking" type="text" placeholder="mins" disabled="" name="noOfMinutes">
                        </fieldset>
                    </div>
                    <div class="col-md-1">
                        <fieldset class="form-group">
                            <label class="col-form-label" for="inputDefault">Tea #1</label>
                            <div class="form-check">
                                <label class="form-check-label" style="padding-left: 23px; padding-bottom: 8px;">
                                    <input class="form-check-input" type="checkbox" value="yes" name="tea1">
                                </label>
                            </div>
                        </fieldset>
                    </div>
                    <div class="col-md-1">
                        <fieldset class="form-group">
                            <label class="col-form-label" for="inputDefault">Tea #2</label>
                            <div class="form-check">
                                <label class="form-check-label" style="padding-left: 23px; padding-bottom: 8px;">
                                    <input class="form-check-input" type="checkbox" value="yes" name="tea2">
                                </label>
                            </div>
                        </fieldset>
                    </div>
                    <div class="col-md-1">
                        <fieldset class="form-group">
                            <label class="col-form-label" for="inputDefault">Lunch/Dinner</label>
                            <div class="form-check">
                                <label class="form-check-label" style="padding-left: 23px; padding-bottom: 8px;">
                                    <input class="form-check-input" type="checkbox" value="yes" name="lunchDinner">
                                </label>
                            </div>
                        </fieldset>
                    </div>
                </div>
                <div style="height: 15px;"></div>
                <div class="row">
                    <div class="col-md-8"></div>
                    <div class="col-md-4" style="padding-left: 250px;">
                        <button type="button" class="btn btn-success" id="submitToProductionBtn">Submit Packing</button>
                    </div>

                </div>
            </form>
        </div>


        <!-- Footer -->
        <!--        Please be kind enough not to remove developer credentials .-->
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
        <script src="../resources/js/supervisorControl.js" type="text/javascript"></script>
        <script src="../resources/js/sweetalert.js" type="text/javascript"></script>
        <script src="../resources/js/inputSuggestControl.js" type="text/javascript"></script>

    </body>
</html>
