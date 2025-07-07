<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Registration Form</title>
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
           String message=(String)request.getParameter("message");
       %>
       
    <div class="container mt-5 mb-5">
      <div class="row justify-content-center">
        <form action="RegisterServlet" class="col-md-6 myform">
          <div class="text-center mt-3">
            <h2 class="text-primary">Registration Form</h2>
             <%
               if(message!=null){%>
               <p style="color: blue;"><%= message %></p>
               <%
                   }
               %>
          </div>

          <div class="row">
            <div class="col-md-6 form-group">
              <label for="user_name">Name</label>
              <input
                type="text"
                name="name"
                class="form-control"
                id="user_name"
                placeholder="Enter your name"
                required
              />
            </div>

            <div class="col-md-6 form-group">
              <label for="user_email">Email</label>
              <input
                type="email"
                name="email"
                class="form-control"
                id="user_email"
                placeholder="Enter your email id"
                required
              />
            </div>
          </div>

         <div class="form-group">
            <label for="address">Address </label>
            <textarea
              name="address"
              id="address"
              class="form-control"
              placeholder="Enter your permanent address"
            ></textarea>
          </div>

          <div class="row">
            <div class="col-md-6 form-group">
              <label for="mobile">Mobile No.</label>
              <input
                  name="mobile"
                type="tel"
                class="form-control"
                id="mobile"
                placeholder="Enter your 10-digit mobile number"
                pattern="[0-9]{10}"
                title="Mobile number must be exactly 10 digits."
                maxlength="10"
                minlength="10"
                oninput="this.value = this.value.replace(/[^0-9]/g, '');"
                aria-label="Mobile number input field"
                required
              />
            </div>


             <div class="col-md-6 form-group">
              <label for="pincode">Pincode</label>
              <input
                  name="pincode"
                type="text"
                class="form-control"
                id="pincode"
                placeholder="Enter your 6-digit pincode"
                pattern="[0-9]{6}"
                title="Enter your 6-digit pincode."
                maxlength="6"
                oninput="this.value = this.value.replace(/[^0-9]/g, '');"
                aria-label="Pincode input field"
                required
              />
            </div>
          </div>

          <div class="row">
            <div class="col-md-6 form-group">
              <label for="password">Password</label>
              <input
                type="password"
                name="password"
                class="form-control"
                id="password"
                 placeholder="Enter strong password."
                required
              />
            </div>

            <div class="col-md-6 form-group">
              <label for="cpassword">Confirm Password</label>
              <input
                type="password"
                name="cpassword"
                class="form-control"
                id="cpassword"
                placeholder="Enter strong password."
                required
              />
            </div>
          </div>

          <div class="row mt-3 mb-3 text-center">
            <div class="col-md-6">
              <button type="reset" class="btn btn-outline-danger">Reset</button>
            </div>

            <div class="col-md-6">
              <button type="submit" class="btn btn-outline-primary">
                Register
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
