<%-- 
    Document   : index
    Created on : Aug 22, 2023, 12:32:44 AM
    Author     : ahjhj
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </head>
    <body>
        <c:url value="/" var="action"/>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Hostel</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav" me-auto>
                        <li class="nav-item">
                            <a class="nav-link" href="${action}">Home</a>
                        </li>
                        <c:forEach items="${categories}" var="c">

                            <c:url value="/" var="cateAction">
                                <c:param name="cateId" value="${c.id}"/>
                            </c:url>
                            <li class="nav-item">
                                <a class="nav-link" href="${cateAction}">${c.name}</a>
                            </li>
                        </c:forEach>
                        <form class="d-flex" action="${action}">
                            <input class="form-control me-2" type="text" name="keyword" placeholder="Search">
                            <button class="btn btn-primary" type="submit">Search</button>
                        </form>
                    </ul>
                </div>
            </div>
        </nav>

        <section class="container">
            <div>
                <button>
                    <a href="#" class="btn btn-info">Add product</a>
                </button>
            </div>
            <c:if test="${counter} > 1">
            <ul class="pagination mt-1">
                <li class="page-item"><a class="page-link" href="${action}">All product</a></li>

                <c:forEach begin="1" end="${counter}" var="i">
                    <c:url value="/" var="pageAction">
                        <c:param name="page" value="${i}"/>
                    </c:url>
                    <li class="page-item"><a class="page-link" href="${pageAction}">${i}</a></li>

                </c:forEach>
            </ul>
                </c:if>
            <table class="table table-hover">

                <thead>
                    <tr>
                        <th></th>
                        <th>ID</th>
                        <th>Product name </th>
                        <th>Price </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${products}" var="p">
                        <tr>
                            <td>
                                <img src="${p.image}" alt ="${p.name}" width="120"/>
                            </td>
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.price} vnd </td>
                            <td><a href="#" class ="btn btn-success">Update</a>
                                <button class="btn btn-danger">Delete</button></td>

                        </tr>
                    </c:forEach>
                </tbody>            

            </table>

        </section>
    </body>
</html>
