$(function() {
    $.ajax({
        url : ContextUtil.info,
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
    var len = data.workers.length;
    for (var i = 0; i < len; i++) {
        tableStr = tableStr + "<tr><td align='center'>" + data.workers[i].address
            + "</td>" + "<td align='center'>" + data.workers[i].state + "</td>"
            + "<td align='center'>" + data.cores + "</td>"
            + "<td align='center'>" + data.coresUsed + "</td>"
            + "<td align='center'>" + data.memory + "</td>"
            + "<td align='center'>" + data.memoryUsed + "</td></tr>";
    }
    //将动态生成的table添加的事先隐藏的div中.
    $("#dataTable").html(tableStr);
}