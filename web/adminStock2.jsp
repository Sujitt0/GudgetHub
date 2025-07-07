<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Admin Stock</title>
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
      
    <div class="text-primary text-center h2 mt-3 mb-3">Product Stock</div>
    <div class="container-fluid mt-5 mb-5">
      <div class="table-responsive">
        <table class="table table-bordered table-hover text-center">
          <thead>
            <tr>
              <th>Product Image</th>
              <th>Product Id</th>
              <th>Product Name</th>
              <th>Price</th>
              <th>Sold Qty</th>
              <th>Stock Qty</th>
              <th colspan="2" class="text-center">Action</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <img
                  src="images/product_img.jpg"
                  width="100px"
                  height="100px"
                  alt=""
                />
              </td>
              <td>12345</td>
              <td>Iphone</td>
              <td>60000</td>
              <td>10</td>
              <td>20</td>
              <td>
                <form action="" class="text-center mb-3 mt-3">
                  <button class="Submit btn btn-primary">Update</button>
                </form>
              </td>
              <td>
                <form action="" class="text-center">
                  <button class="Reset btn btn-danger">Remove</button>
                </form>
              </td>
            </tr>

            <tr>
              <td colspan="8" class="text-center h4">No items available</td>
            </tr>
          </tbody>
        </table>
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
