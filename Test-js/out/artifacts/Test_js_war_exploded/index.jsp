<%--
  Created by IntelliJ IDEA.
  User: luoqi3
  Date: 2017/11/15
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>

  <link rel="stylesheet" href="bootstrap/bootstrap-table.min.css">
  <script src="bootstrap/bootstrap-table.min.js"></script>

  <script src="test2.js"></script>
  <title></title>
</head>
<body>
<div class="container">
  <form class="form">

      <div class="row">
      <div class="col-sm-4">
        <label for="siteName">站点名称:</label><input type="text" class="form-control" id="siteName" readonly="readonly" value="$!{siteName}">
      </div>
      <div class="col-sm-4">
        <label for="roadNo">路区号:</label>
        <input type="text" class="form-control" id="roadNo">
      </div>
      <div class="col-sm-4">
        <label for="status">状态:</label>
        <select class="form-control" id="status">
          <option>已维护</option>
          <option>未维护</option>
          <option>选项</option>
        </select>
      </div>
    </div>
  </form>


    <p class="text-right">
      <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">新增</button>
      <button type="button" class="btn btn-primary" id="queryBtn">查询</button>
    </p>


  <table class="table table-bordered" id="content-table">
    <thead>
    <tr>
      <th data-field="order">序号</th>
      <th data-field="keyWord">关键字</th>
      <th data-field="roadNo">路区号</th>
      <th data-field="remark">备注</th>
      <th data-field="operation">操作</th>
    </tr>
    </thead>
    <tbody>

      <tr>
        <td>11</td>
        <td>12</td>
        <td>13</td>
        <td>14</td>
        <td><a href="#" onclick="delBtn(11)" style="color:#000;text-decoration:none;">删除</a></td>
      </tr>
      <tr>
        <td>21</td>
        <td>22</td>
        <td>23</td>
        <td>24</td>
        <td><a href="#" onclick="delBtn(12)" style="color:#000;text-decoration:none;">删除</a></td>
      </tr><tr>
        <td>31</td>
        <td>32</td>
        <td>33</td>
        <td>34</td>
        <td><a href="#" onclick="delBtn(13)" style="color:#000;text-decoration:none;">删除</a></td>
      </tr>



    </tbody>
  </table>


  <!--弹出框-->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
        <!-- 模态框头部 -->
        <div class="modal-header">
          <h4 class="modal-title">新增信息</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <!-- 模态框主体 -->
        <div class="modal-body">
          <form class="form-horizontal" role="form">
            <div class="form-group">
              <label for="keyWord" class="col-sm-2 control-label">关键字</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="keyWord" placeholder="请输入关键字">
              </div>
            </div>
            <div class="form-group">
              <label for="roadNo2" class="col-sm-2 control-label">路区号</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="roadNo2" placeholder="请输入路区号">
              </div>
            </div>
            <div class="form-group">
              <label for="remark" class="col-sm-2 control-label">备注</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="remark" placeholder="请输备注">
              </div>
            </div>
          </form>
        </div>
        <!-- 模态框底部 -->
        <div class="modal-footer">
          <button type="button" class="btn btn-primary" id="saveBtn">保存</button>
          <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
        </div>
      </div>
    </div>
  </div>



</div>


</body>
</html>
