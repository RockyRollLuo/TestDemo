var JsonData="/testData/data1.json"; //Json的数据源，可以是url请求的数据

$(function() {
    $.ajax({
        url : JsonData,
        type : "GET",
        success : function(data) {
            //调用创建表和填充动态填充数据的方法.
            createShowingTable(data)
        },
        error : function() {
        }
    });
});

//动态的创建一个table，同时将后台获取的数据动态的填充到相应的单元格
function createShowingTable(data) {
    //获取后台传过来的jsonData,并进行解析

    //此处需要让其动态的生成一个table并填充数据
    var tableStr = "";
    var len = data.data.length;
    for (var i = 0; i < len; i++) {
        tableStr = tableStr + "<tr><td align='center'>" + data.workers[i].address
            + "</td>" + "<td align='center'>" + data.id + "</td>"
            + "<td align='center'>" + data.name + "</td>"
            + "<td align='center'>" + data.sex + "</td>"
            + "<td align='center'>" + data.age + "</td></tr>";
    }
    //将动态生成的table添加的事先隐藏的div中.
    $("#dataTable").html(tableStr);
}