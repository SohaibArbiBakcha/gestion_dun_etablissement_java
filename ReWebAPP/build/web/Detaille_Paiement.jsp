<%-- 
    Document   : form_filiere
    Created on : 12/03/2020, 3:23:06 PM
    Author     : SpyECho
--%>

<%@page import="metier.Paiements"%>
<%@page import="java.util.List"%>
<%@page import="metier.Etudiants"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Groupes</title>
  <script src="jquery.js" type="text/javascript"></script>
  <!-- plugins:css -->
  <link rel="stylesheet" href="vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="vendors/base/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="images/favicon.png" />
  <script src="jquery.js" type="text/javascript"></script>
</head>
<%
    List<Paiements> p=(List<Paiements>) request.getAttribute("list");
%>
<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo mr-5" href="admin.jsp"><img src="images/logo.svg" class="mr-2" alt="logo"/></a>
        <a class="navbar-brand brand-logo-mini" href="admin.jsp"><img src="images/logo-mini.svg" alt="logo"/></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="ti-view-list"></span>
        </button>
        <ul class="navbar-nav navbar-nav-right">
          
          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
              <img src="images/faces/face29.png" alt="profile"/>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
                <a class="dropdown-item" href="<%=request.getContextPath()%>/logout">
                <i class="ti-power-off text-primary"></i>
                Logout
              </a>
            </div>
          </li>
        </ul>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:partials/_sidebar.html -->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="index.html">
              <i class="ti-shield menu-icon"></i>
              <span class="menu-title">Dashboard</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="ti-palette menu-icon"></i>
              <span class="menu-title">UI Elements</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="pages/ui-features/buttons.html">Buttons</a></li>
                <li class="nav-item"> <a class="nav-link" href="pages/ui-features/typography.html">Typography</a></li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="pages/forms/basic_elements.html">
              <i class="ti-layout-list-post menu-icon"></i>
              <span class="menu-title">Form elements</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="pages/charts/chartjs.html">
              <i class="ti-pie-chart menu-icon"></i>
              <span class="menu-title">Charts</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="pages/tables/basic-table.html">
              <i class="ti-view-list-alt menu-icon"></i>
              <span class="menu-title">Tables</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="pages/icons/themify.html">
              <i class="ti-star menu-icon"></i>
              <span class="menu-title">Icons</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" data-toggle="collapse" href="#auth" aria-expanded="false" aria-controls="auth">
              <i class="ti-user menu-icon"></i>
              <span class="menu-title">User Pages</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="auth">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="pages/samples/login.html"> Login </a></li>
                <li class="nav-item"> <a class="nav-link" href="pages/samples/login-2.html"> Login 2 </a></li>
                <li class="nav-item"> <a class="nav-link" href="pages/samples/register.html"> Register </a></li>
                <li class="nav-item"> <a class="nav-link" href="pages/samples/register-2.html"> Register 2 </a></li>
                <li class="nav-item"> <a class="nav-link" href="pages/samples/lock-screen.html"> Lockscreen </a></li>
              </ul>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="documentation/documentation.html">
              <i class="ti-write menu-icon"></i>
              <span class="menu-title">Documentation</span>
            </a>
          </li>
        </ul>
      </nav>
      <!-- partial -->
      <div class="main-panel">
          <div class="content-wrapper">             
              <div class="col-lg-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                    <h4 class="card-title">Liste De Tous Les Paiements</h4>
                    <div class="table-responsive" id="table">
                    <table class="table table-hover">
                      <thead>
                            <th>
                           cin
                        </th>
                          <th>
                           annee_scolaire
                          </th>
                          <th>
                            septembre
                          </th>
                          <th>
                            octobre
                          </th>
                          <th>
                            novembre
                          </th>
                          <th>
                            décembre
                          </th>
                          <th>
                            janvier
                          </th>
                          <th>
                            février
                          </th>
                          <th>
                            mars
                          </th>
                          <th>
                            avril
                          </th>
                          <th>
                            mai
                          </th>
                          <th>
                            juin
                          </th>
                          <th>
                            juillet
                          </th>
                        </tr>
                      </thead>
                      <tbody id="tb">
                          <%
                              for(int i=0 ; i<p.size() ; i++){
                          %>
                          <tr>
                              <td>
                                  <%=p.get(i).getCin()%>
                              </td>
                              <td>
                                  <%=p.get(i).getAnneeScolaire()%>
                              </td>
                              <td>
                                  <%if(p.get(i).getSept()==null){out.println("");}else{out.println(p.get(i).getSept());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getOct()==null){out.println("");}else{out.println(p.get(i).getOct());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getNov()==null){out.println("");}else{out.println(p.get(i).getNov());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getDec()==null){out.println("");}else{out.println(p.get(i).getDec());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getJanv()==null){out.println("");}else{out.println(p.get(i).getJanv());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getFevr()==null){out.println("");}else{out.println(p.get(i).getFevr());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getMar()==null){out.println("");}else{out.println(p.get(i).getMar());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getAvr()==null){out.println("");}else{out.println(p.get(i).getAvr());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getMai()==null){out.println("");}else{out.println(p.get(i).getMai());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getJuin()==null){out.println("");}else{out.println(p.get(i).getJuin());}%>
                              </td>
                              <td>
                                  <%if(p.get(i).getJuil()==null){out.println("");}else{out.println(p.get(i).getJuil());}%>
                              </td>
                          </tr>
                          <%
                              }
                          %>
                      </tbody>
                    </table>
                  </div>
                      <form action="<%=request.getContextPath()%>/aaventListPaiements">
                      <button type="submit" class="btn btn-primary mr-2" style="margin-top: 10px">Close</button>
                      </form>
                </div>
              </div>
            </div>
          </div>         
      </div>
      
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->

  <!-- plugins:js -->
  <script src="vendors/base/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <script src="vendors/chart.js/Chart.min.js"></script>
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script src="js/off-canvas.js"></script>
  <script src="js/hoverable-collapse.js"></script>
  <script src="js/template.js"></script>
  <script src="js/todolist.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <script src="js/dashboard.js"></script>
  <!-- End custom js for this page-->
</body>
</html>