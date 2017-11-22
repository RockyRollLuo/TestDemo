$(document).ready(main);

function main(){
    $("#queryBtn").click(queryBtn);
    $("#saveBtn").click(saveBtn);

    $('#content-table').bootstrapTable({
        //------以下可以再表格中的data-field设置
        // columns: [{
        //     field: 'order',
        //     title: '序号'
        // }, {
        //     field: 'keyWord',
        //     title: '关键字'
        // }, {
        //     field: 'roadNo',
        //     title: '路区号'
        // }, {
        //     field: 'remark',
        //     title: '备注'
        // }, {
        //     field: 'operation',
        //     title: '操作'
        // }],
        //------方法一：通过url获取json数据
        url:"test.json"
        //------方法二：通过data添加json数据
        //data:
        //     [
        //     { "order":"11" , "keyWord":"12","roadNo":"13","remark":"14","operation":"<a href='#' onclick='delBtn(11)' style='color:#000;text-decoration:none;'>删除</a>" },
        //     { "order":"21" , "keyWord":"22","roadNo":"23","remark":"24" ,"operation":"<a href='#' onclick='delBtn(12)' style='color:#000;text-decoration:none;'>删除</a>" },
        //     { "order":"31" , "keyWord":"32","roadNo":"33","remark":"34" ,"operation":"<a href='#' onclick='delBtn(13)' style='color:#000;text-decoration:none;'>删除</a>" },
        //     { "order":"41" , "keyWord":"42","roadNo":"43","remark":"44" ,"operation":"<a href='#' onclick='delBtn(14)' style='color:#000;text-decoration:none;'>删除</a>" },
        //     { "order":"51" , "keyWord":"52","roadNo":"53","remark":"54" ,"operation":"<a href='#' onclick='delBtn(15)' style='color:#000;text-decoration:none;'>删除</a>" },
        //     { "order":"61" , "keyWord":"62","roadNo":"63","remark":"64","operation":"<a href='#' onclick='delBtn(16)' style='color:#000;text-decoration:none;'>删除</a>"  }
        // ]
    });
}

function queryBtn() {
    var roadNo=$("#roadNo").val();
    var status=$("#status").val();

    alert(roadNo);
    alert(status);

    // body...
}


function delBtn(e) {
    // body...
    var id=e;
    alert(e);


}

function saveBtn(){
    var keyWord=$("#keyWord").val();
    var roadNo=$("#roadNo2").val();
    var remark=$("#remark").val();

    alert(keyWord);
    alert(roadNo);
    alert(remark);

}

