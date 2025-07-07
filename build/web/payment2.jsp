<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Payment</title>
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
       
    <div class="conatiner mt-5 mb-5">
      <div class="row justify-content-center">
        <form action="#" class="col-md-6 myform">
          <div class="text-center">
            <img
              src="images/payment.png"
              alt=""
              height="100px"
              width="100px"
              class="rounded-circle"
            />
            <h2 class="text-primary mt-2">Payment Details</h2>
          </div>
          <div class="row mt-3">
            <div class="form-group col-md-12">
              <label for="card_holder_name">Name of Card Holder</label>
              <input
                type="text"
                id="card_holder_name"
                class="form-control"
                title="Please enter a valid name"
                placeholder="Name"
                required
              />
            </div>
          </div>
          <div class="row mt-3">
            <div class="col-md-12 form-group">
              <label for="card-number">Credit Card Number</label>
              <input
                type="text"
                class="form-control"
                id="card-number"
                placeholder="0000-0000-0000-0000"
                maxlength="19"
                pattern="\d{4}-?\d{4}-?\d{4}-?\d{4}"
                title="Please enter a valid credit card number in the format XXXX-XXXX-XXXX-XXXX"
                oninput="this.value = this.value.replace(/\D/g, '').replace(/(\d{4})(?=\d)/g, '$1-').slice(0, 19);"
                required
              />
            </div>
          </div>

          <div class="row mt-3">
            <div class="col-md-6 form-group">
              <label for="expiry_month">Expiry Month</label>
              <select
                id="expiry_month"
                class="form-control"
                title="Please select expiry month"
                required
              >
                <option value="" disabled selected>Select Month</option>
                <!-- Placeholder option -->
                <option value="01">01</option>
                <option value="02">02</option>
                <option value="03">03</option>
                <option value="04">04</option>
                <option value="05">05</option>
                <option value="06">06</option>
                <option value="07">07</option>
                <option value="08">08</option>
                <option value="09">09</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
              </select>
            </div>

            <div class="col-md-6 form-group">
              <label for="expiry_year">Expiry Year</label>
              <select
                id="expiry_year"
                class="form-control"
                title="Please select a valid expiry year 20XX"
                required
              >
                <option value="" disabled selected>Select Year</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
                <option value="32">32</option>
                <option value="33">33</option>
                <option value="34">34</option>
              </select>
            </div>

            <!-- <div class="col-md-6 form-group">
              <label for="expiry_year">Expiry Year</label>
              <input
                type="number"
                id="expiry_year"
                class="form-control"
                title="Please enter a valid expiry year"
                placeholder="Year"
                min="24"
                max="34"
                oninput="
                if(this.value.length > 2) this.value = this.value.slice(0, 2);
                if(this.value < 24) this.value = 24;
             
            "
                required
              />
            </div> -->
          </div>

          <div class="row mt-3 mb-3">
            <div class="col-md-6 form-group">
              <label for="cvv">Card CVV</label>
              <input
                type="number"
                class="form-control"
                id="cvv"
                min="0"
                placeholder="Please enter a valid 3-digit CVV"
                oninput="if(this.value.length > 3) this.value = this.value.slice(0, 3);"
                required
              />
            </div>

            <div class="col-md-6 form-group">
              <label for="">&nbsp;</label>
              <button type="submit" class="btn btn-warning form-control">
                Pay Rs: 20000
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
