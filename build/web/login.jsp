<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Login Form</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.css" />
  </head>
  <body >
       <jsp:include page="header.jsp"/>
       <%
           String message=request.getParameter("message");
       %>
    <div class="container mt-5 mb-5">
      <div class="row justify-content-center">
          <form action="./LoginServlet" class="col-md-4 myform " method="post">
          <div class="text-center mt-3">
            <h2 class="text-primary">Login Form</h2>
            <%
               if(message!=null){%>
               <p style="color: crimson;"><%= message %></p>
               <%
                   }
               %>
          </div>

          <div class="row mt-3">
            <div class="col-md-12 form-group">
              <label for="username">Username</label>
              <input
                type="email"
                class="form-control"
                name="username"
                id="username"
                placeholder="Enter username"
                required
              />
            </div>
          </div>

          <div class="row mt-3">
            <div class="col-md-12 form-group">
              <label for="password">Password</label>
              <input
                type="password"
                class="form-control"
                name="password"
                id="password"
                placeholder="Enter password"
                required
              />
            </div>
          </div>

          <div class="row mt-3">
            <div class="form-group col-md-12">
              <label for="loginas">Login as</label>
              <select class="form-control" name="userType" id="loginas">
                <option value="customer">CUSTOMER</option>
                <option value="admin">ADMIN</option>
              </select>
            </div>
          </div>

          <div class="row m-3">
            <div class="col-md-12 text-center">
              <button type="submit" class="btn btn-outline-primary">
                Login
              </button>
            </div>
          </div>
        </form>
      </div>
    </div>
        <jsp:include page="footer.jsp"/>
      
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
