<%-- 
    Document   : connect
    Created on : 12 mars 2020, 08:45:41
    Author     : Med
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/vendors/base/vendor.bundle.base.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
  <link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.png" />
    </head>
    <%
        String msg=(String) request.getAttribute("msg");
    %>
    <body>
  <div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-stretch auth auth-img-bg">
        <div class="row flex-grow">
            <div class="col-lg-6 d-flex align-items-center justify-content-center">
            <div class="auth-form-transparent text-left p-3">
              <div class="brand-logo">
                <img src="<%=request.getContextPath()%>/images/logo.svg" alt="logo">
              </div>
              <h4>Welcome back!</h4>
              <h6 class="font-weight-light">Happy to see you again!</h6>
              <form class="pt-3" action="<%=request.getContextPath()%>/login" method="">
                <div class="form-group">
                  <label for="exampleInputEmail">Username</label>
                  <div class="input-group">
                    <div class="input-group-prepend bg-transparent">
                      <span class="input-group-text bg-transparent border-right-0">
                        <i class="ti-user text-primary"></i>
                      </span>
                    </div>
                      <input type="text" class="form-control form-control-lg border-left-0" id="exampleInputEmail" placeholder="Username" name="username">
                  </div>
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword">Password</label>
                  <div class="input-group">
                    <div class="input-group-prepend bg-transparent">
                      <span class="input-group-text bg-transparent border-right-0">
                        <i class="ti-lock text-primary"></i>
                      </span>
                    </div>
                      <input type="password" class="form-control form-control-lg border-left-0" id="exampleInputPassword" placeholder="Password" name="password">                        
                  </div>
                </div>
                <div class="my-3">
                    <input type="submit" value="Login" style="width: 100% ; border: none ; background-color: #62BEDC ; color: white ; height: 50px"/>
                </div>
                <div style="color: red">
                    <% if(msg!=null && msg.length()!=0){
                        out.println(msg);
                    }
                    %>
                    </div>
              </form>
            </div>
          </div>
          <div class="col-lg-6 login-half-bg d-flex flex-row" style="background-image: url(<%=request.getContextPath()%>/images/auth/login-bg.jpg) ; background-size: cover">
            <p class="text-white font-weight-medium text-center flex-grow align-self-end">Copyright &copy; 2018  All rights reserved.</p>
          </div>
        </div>
      </div>
      <!-- content-wrapper ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  <script src="<%=request.getContextPath()%>/vendors/base/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- inject:js -->
  <script src="<%=request.getContextPath()%>/js/off-canvas.js"></script>
  <script src="<%=request.getContextPath()%>/js/hoverable-collapse.js"></script>
  <script src="<%=request.getContextPath()%>/js/template.js"></script>
  <script src="<%=request.getContextPath()%>/js/todolist.js"></script>
    </body>
</html>
