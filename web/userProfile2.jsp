<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Bootstrap demo</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.css" />
  </head>
  <body>
       <jsp:include page="header.jsp"/>
       
    <div class="container">
      <div class="row mt-5 col-md-12">
        <nav aria-label="breadcrumb" class="bg-warning rounded">
          <ol class="breadcrumb pt-3">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item active" aria-current="page">Library</li>
          </ol>
        </nav>
      </div>
      <div class="row mt-5 mb-5">
        <div class="col-md-3">
          <div class="card mb-3">
            <div class="card-body text-center">
              <img
                class="img-fluid w-50 rounded"
                src="images/profile.jpeg"
                alt="Card image cap"
              />
              <h5 class="mt-3">Hello Prashant</h5>
            </div>
          </div>
          <div class="card mb-3">
            <div class="card-body text-center">
              <h3>My Profile</h3>
            </div>
          </div>
        </div>

        <div class="col-md-9">
          <div class="card">
            <div class="card-body">
              <div class="row">
                <div class="col-md-4">
                  <p>Full Name</p>
                </div>
                <div class="col-md-8">
                  <p>Prashant</p>
                </div>
                <hr />
              </div>

              <div class="row">
                <div class="col-md-4">
                  <p>Email</p>
                </div>
                <div class="col-md-8">
                  <p>prashantyaduvanshi43@gmail.com</p>
                </div>
                <hr />
              </div>

              <div class="row">
                <div class="col-md-4">
                  <p>Phone</p>
                </div>
                <div class="col-md-8">
                  <p>602827379</p>
                </div>
                <hr />
              </div>

              <div class="row">
                <div class="col-md-4">
                  <p>Address</p>
                </div>
                <div class="col-md-8">
                  <p>Bhopal</p>
                </div>
                <hr />
              </div>

              <div class="row">
                <div class="col-md-4">
                  <p>Pincode</p>
                </div>
                <div class="col-md-8">
                  <p>847229</p>
                </div>
              </div>
            </div>
          </div>
        </div>
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
