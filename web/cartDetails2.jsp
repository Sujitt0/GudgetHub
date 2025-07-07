
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Cart Details</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="style.css" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css"
      integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
  </head>
  <body >
      <%@include file="header.jsp" %>   
     
    <div class="text-primary text-center h2 mt-4 mb-4">Cart Items</div>
    <div class="container-fluid ">
      <div class="table-responsive">
        <table class="table table-hover text-center">
          <thead>
            <tr>
              <th>Product Image</th>
              <th>Product Name</th>
              <th>Price</th>
              <th>Qty</th>
              <th>Add</th>
              <th>Remove</th>
              <th>Amount</th>
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
              <td>Iphone</td>
              <td>60000</td>
              <td>
                <form action="">
                  <input type="number" min="0" />
                  <input type="hidden" name="" value="" />
                </form>
              </td>
              <td>
                <a href="#"><i class="fa-solid fa-plus"></i></a>
              </td>
              <td>
                <a href="#"><i class="fa-solid fa-minus"></i></a>
              </td>
              <td>70000</td>
            </tr>
            <tr>
              <td colspan="6" class="h4">Total anount in rupees</td>
              <td>60000</td>
            </tr>
            <tr>
              <td colspan="5">
                <form action="">
                  <button type="reset" class="btn btn-dark">Cancle</button>
                </form>
              </td>
              <td colspan="2">
                <form action="">
                  <button type="submit" class="btn btn-warning">Pay Now</button>
                </form>
              </td>
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
