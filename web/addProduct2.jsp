<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Add Product</title>
    <link rel="stylesheet" href="style.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    
  </head>
  <body>
      <!-- header page-->
      <jsp:include page="header.jsp"/>
          
    <div class="container mt-5 mb-5 ">
      <div class="row justify-content-center">
        <form action="#" class="col-md-6 myform">
          <div class="row mt-3">
            <div class="form-group col-md-6">
              <label for="product_name">Product name</label>
              <input
                type="text"
                class="form-control"
                id="product_name"
                placeholder="Enter product name"
              />
            </div>

            <div class="col-md-6 form-group">
              <div class="form-group">
                <label for="product_type">Product type</label>
                <select class="form-control" id="product_type">
                  <option value="mobile">Mobile</option>
                  <option value="tv">TV</option>
                  <option value="camera">Camera</option>
                  <option value="laptop">Laptop</option>
                </select>
              </div>
            </div>
          </div>

          <div class="form-group mt-3">
            <label for="product_desc">Product Description</label>
            <textarea class="form-control" id="product_desc"></textarea>
          </div>

          <div class="row mt-3">
            <div class="form-group col-md-6">
              <label for="unit_price">Unit Price</label>
              <input
                type="number"
                class="form-control"
                id="unit_price"
                min="0"
                placeholder="Enter product unit"
              />
            </div>

            <div class="form-group col-md-6">
              <label for="stock_quan">Stock Quantity</label>
              <input
                type="number"
                class="form-control"
                id="stock_quan"
                min="0"
                placeholder="Enter stock quantity"
              />
            </div>
          </div>

          <div class="form-group mt-3">
            <label for="product_img">Product Image</label>
            <input type="file" class="form-control" id="product_img" />
          </div>

          <div class="row text-center mt-3 mb-3  ">
            <div class="col-md-6">
              <button type="reset" class="btn btn-danger">Reset</button>
            </div>
            <div class="col-md-6">
              <button type="submit" class="btn btn-primary">Submit</button>
            </div>
          </div>
        </form>
      </div>
    </div>
    
    <!-- footer page-->
    <jsp:include page="footer.jsp"/>
    
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
