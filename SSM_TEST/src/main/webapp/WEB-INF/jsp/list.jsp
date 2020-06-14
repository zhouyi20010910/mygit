<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
<style>
    #main{width:80%;margin:10 auto}
</style>
</head>
<body>
       <div id="main">
            <table> 
                 <tr>
                     <td colspan="8"  style="text-align:center">
                       <form id="ff" action=""  method="post">
                          <input type="hidden" name="page"  id="page" value="1"/>
                           <select name="">
                           <option value="-1">全部</option>
                           <c:forEach var=""  items="">
                               <option value=""></option>
                           </c:forEach>
                           </select>
                           <input type="submit" value="搜索"/>
                        </form>
                     </td>
                 </tr>
                 <tr>
                    <th>编号</th>
                    <th>名称</th>
                    <th>操作</th>
                 </tr>
                 <c:forEach var="o"  items="${list }">
                 <tr>
                    <td>${o.id }</td>
                    <td>${o.name }</td>
                    <td><a href="">编辑</a>
                 </tr>
                 </c:forEach>
            </table>
            
            <div style="text-align:center">
               <a href="javascript:getPage(1)">首页</a>
               <a href="javascript:getPage(${currentpage-1 })">上一页</a>
                <a href="javascript:getPage(${currentpage+1 })">上一页</a>
               <a href="javascript:getPage(${pagecount})">末页</a>
               第${currentpage}页/共${pagecount }页
            </div>
       
       </div>
       <script type="text/javascript"  src="js/jquery-1.12.0.min.js"></script>
       <script>
           function getPage(index)
           {
        	   $("#page").val(index);
        	   $("#ff").submit();
           }
       
       </script>
</body>
</html>