/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Global properties

downtimeObj = [];

function Downtime(status, from, to, mins, reason, comment) {

    this.status = status;
    this.from = from;
    this.to = to;
    this.mins = mins;
    this.reason = reason;
    this.comment = comment;
}




$("#enterShiftDetails").click(function () {
    var ajaxConfigure = {
        type: "POST",
        url: "../supervisior/enterShiftDetails",
        async: true,
        data: $("#shiftDetailsForm").serialize()
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                if (response.toString() == "success") {
                    swal("Shift started!", "Please enter Production , Rejects , Packing details below!", "success");
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });
});

function getTimeRange(fromValueArr, toValueArr) {

    var fromSplittedValues = fromValueArr.split(".");
    var from1 = parseInt(fromSplittedValues[0]);
    var from2 = parseInt(fromSplittedValues[1]);

    var toSplittedValues = toValueArr.split(".");
    var to1 = parseInt(toSplittedValues[0]);
    var to2 = parseInt(toSplittedValues[1]);

    var fromValueAbs = (60 * from1) + from2;
    var toValueAbs = (60 * to1) + to2;
    var result = Math.abs(toValueAbs - fromValueAbs);

    return result;

}


$("#runtimeTo").on('keypress', function (e) {

    if (e.keycode == 13 || e.which == 13) {

        e.preventDefault();

        var fromValueArr = $("#runtimeFrom").val();
        var toValueArr = $("#runtimeTo").val();
        var result = getTimeRange(fromValueArr, toValueArr);

        $("#disabledInputRun").val(result);
    }


});

$("#downTimeTo").on('keypress', function (e) {

    if (e.keycode == 13 || e.which == 13) {

        e.preventDefault();

        var fromValueArr = $("#downtimeFrom").val();
        var toValueArr = $("#downTimeTo").val();
        var result = getTimeRange(fromValueArr, toValueArr);

        $("#disabledInputDown").val(result);
    }


});

$("#toTimePacking").on('keypress', function (e) {

    if (e.keycode == 13 || e.which == 13) {

        e.preventDefault();

        var fromValueArr = $("#fromTimePacking").val();
        var toValueArr = $("#toTimePacking").val();
        var result = getTimeRange(fromValueArr, toValueArr);

        $("#disabledInputPacking").val(result);
    }


});

$("#submitDownTimeBtn").click(function () {

    var status = $("#status").val();
    var reason = $("#reason").val();
    var objDowntime = new Downtime(status, $("#downtimeFrom").val(), $("#downTimeTo").val(), $("#disabledInputDown").val(), reason, $("#exampleTextarea").val());
    console.log(objDowntime);
    downtimeObj.push(objDowntime);
    console.log(downtimeObj);
    $("#status").val(status);
    $("#downtimeFrom").val('');
    $("#downTimeTo").val('');
    $("#disabledInputDown").val('');
    $("#reason").val(reason);
    $("#exampleTextarea").val('');
    $("#downtimeSuccess").fadeIn(1500);
    $("#downtimeSuccess").fadeOut(1000)


});

$("#enterToTableBtn").click(function () {

//$("#profileTable").hide();

//$("#payDetailsBody").empty();
    var tableContent = '<tr class="table-active">' +
            '<th scope="row">1</th>' +
            '<td><input type="text" class="form-control"  id="metalDetector" ></td>' +
            '<td><input type="text" class="form-control"  id="backFlush"></td>' +
            '<td><input type="text" class="form-control"  id="lineChange" ></td>' +
            '<td><input type="text" class="form-control"  id="lineRejects" ></td>' +
            '<td><input type="text" class="form-control"  id="other"></td>' +
            '</tr>';


    $("#rejectTableBody").append(tableContent);


});


$("#submitToProductionBtn").click(function () {

    var itemObj = {
        soNumber: $("#soNumber").val(),
        customer: $("#customer").val(),
        partNumber: $("#myInputProduction").val(),
        producedQty: $("#produced").val(),
        cartonsNew: $("#cartonsNew").val(),
        cartonsUsed: $("#cartonsUsed").val(),
        bags: $("#bags").val(),
        die: $("#die").val(),
        metalDetector: $("#metalDetector").val(),
        backFlush: $("#backFlush").val(),
        lineChange: $("#lineChange").val(),
        lineRejects: $("#lineRejects").val(),
        other: $("#other").val(),
        runtimeFrom: $("#runtimeFrom").val(),
        runtimeTo: $("#runtimeTo").val(),
        disabledInputRun: $("#disabledInputRun").val(),
        downtimeArr: downtimeObj
    };

    console.log(itemObj);
    

    var ajaxConfigure = {
        contentType:"application/json",
        type: "POST",
        url: "../supervisior/saveItemData",
        async: true,
        data: JSON.stringify(itemObj)
    };
    $.ajax(ajaxConfigure)
            .done(function (response) {
                if (response.toString() == "success") {
                    swal("Success!", "Item Added!", "success");
                }
                if (response.toString() == "error") {
                    swal("error!", "Something Went Wrong!", "error");
                }
            });

    $("#soNumber").val('');
    $("#customer").val('');
    $("#myInputProduction").val('');
    $("#produced").val('');
    $("#cartonsNew").val('');
    $("#cartonsUsed").val('');
    $("#bags").val('');
    $("#die").val('');
    $("#rejectTableBody").empty();
    $("#runtimeFrom").val('');
    $("#runtimeTo").val('');
    $("#disabledInputRun").val('');

});  