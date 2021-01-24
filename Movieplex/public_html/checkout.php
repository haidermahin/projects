<!DOCTYPE html>
<html>
  <head>
    <title>MoviePlex | Tickets</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Bebas Neue' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Work Sans' rel='stylesheet'>
    <link rel="shortcut icon" type="image/PNG" href="/images/favicon.PNG"/>
    <link href="css/footer.css" rel="stylesheet">    

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!-- Form Validation -->
      <script>
      function validateForm() {
        let ccname = document.forms["paymentForm"]["ccname"].value;
        let ccnum = document.forms["paymentForm"]["ccnum"].value;
        let ccexpiration = document.forms["paymentForm"]["ccexpiration"].value;
        let cccvv = document.forms["paymentForm"]["cccvv"].value;

        if (!(ccname.match(/^[a-zA-Z ]+$/) && cccvv.match(/^[0-9][0-9][0-9]$/) && ccnum.match(/^[0-9]{16}$/) && ccexpiration.match(/^((0[1-9])|(1[0-2]))(([0-2][0-9])|(3[0-1]))$/))) {
          alert("Invalid card information.");
          return false;
        } else {
          return true;
        } 
      }
    </script>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <style>
    html, body {
      text-align: center;
      background-color: black;
    }

    body{
      margin-top:5%;
      padding-top:50px;
    }
    * {
      box-sizing: border-box;
    }
    .navbar-toggler-icon {
      background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 32 32' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath stroke='rgba(255,255,255, 1)' stroke-width='2' stroke-linecap='round' stroke-miterlimit='10' d='M4 8h24M4 16h24M4 24h24'/%3E%3C/svg%3E");
    }
    /* Style inputs */
    input[type=email], input[type=text], input[type=number], input[type=date], select, textarea {
      width: 100%;
      padding: 12px;
      border: 1px solid #ccc;
      margin-top: 6px;
      margin-bottom: 16px;
      resize: vertical;
    }

    input[type=submit] {
      background-color: red;
      color: white;
      padding: 12px 20px;
      border: none;
      cursor: pointer;
    }

    input[type=submit]:hover {
      background-color: #cc0000;
    }

    /* Style the container/contact section */
    .container {
      border-radius: 5px;
      background-color: #f2f2f2;
      padding: 10px;
    }

    /* Create two columns that float next to eachother */
    .column {
      float: left;
      width: 50%;
      margin-top: 6px;
      padding: 20px;
    }

    /* Clear floats after the columns */
    .row:after {
      content: "";
      display: table;
      clear: both;
    }
    
    h4, span {
      color: white;
    }
    
    .linewrapper {
      display: flex;
      align-items: baseline;
    }
    .middle {
      border-bottom: 1px dotted #aaa;
      flex-grow: 1;
      margin: 0 5px;
    }

    #title{font-family:'Bebas Neue';
      font-size:90px;
      color:white;
      font-style:italic;
      letter-spacing:1px;
      text-shadow: 2px 2px 4px red;
      text-align:center;}

    /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
    @media screen and (max-width: 600px) {
      .column, input[type=submit] {
        width: 100%;
        margin-top: 0;
      }
    }

    /* Required Red Asterisk */
    .required
      {
      color: red;
    }

    div.main {
      border: 2px solid #262626;
      padding: 4%;
      border-radius: 25px;
      background-color:#262626;
      margin-left:13%;
      margin-right:13%;
      position:relative;
      text-align:center;
    }

    .orderwrapper {
        text-align:left;
        padding: 4%;
        background-color:#292929;
        border-radius: 12px;
        border: 1px solid #4d4d4d;
    }

    label {
      display: inline-block;
      white-space: nowrap;
      margin-bottom: .5rem;
      color: white;
    }

    p {
      margin-top: 0;
      margin-bottom: 1rem;
      color: white;
    }
    

    </style>
  </head>

  <body>
  <div id="wrapper">
    <!--Header-->
    <nav class="navbar navbar-expand-sm flex-column align-items-stretch navbar-inverse bg-inverse fixed-top" style="background-color:#D11616">
      <div class="d-flex align-content-sm-center">
        <a href="./index.html" class="navbar-brand mx-sm-auto mr-auto"><img src="images/Movieplex_fin.png" style="max-width:50%;"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarMenu" aria-controls="navbarMenu" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      </div>
      <div class="d-md-flex d-block flex-row mx-md-auto mx-0">
        <div class="collapse navbar-collapse w-100" id="navbarMenu" style="font-family:'Work Sans';">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a href="./movies.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
                                                                            onMouseOut="this.style.color='white'">MOVIES</a>
            </li>
            <li class="nav-item">
              <a href="trailers.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
                                                                            onMouseOut="this.style.color='white'">TRAILERS</a>
            </li>
            <li class="nav-item">
              <a href="./food.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
                                                                          onMouseOut="this.style.color='white'">FOOD/DRINKS</a>
            </li>
            <li class="nav-item">
              <a href="./contact.html" class="nav-link" style="color:white;font-weight:bold;" onMouseOver="this.style.color='black'"
                                                                                              onMouseOut="this.style.color='white'">CONTACT US</a>
            </li>
            <li class="nav-item">
              <a href="./locations.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
                                                                               onMouseOut="this.style.color='white'"> LOCATIONS</a>
            </li>
            <li class="nav-item">
              <a href="./news.html" class="nav-link news" style="color:white;" onMouseOver="this.style.color='black'"
                                                                               onMouseOut="this.style.color='white'"> NEWS</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <br>
    <!--Displays the payment receipt-->
    <h1 id="title">Payment</h1>
    <div class="main">
      <form name="paymentForm" action="confirmation.php" onSubmit="return validateForm()" method="post">
        <div class="row"> 
          <div class="column">
            <?php
            $name = $_POST["name"];
            $email = $_POST["email"];
            $children = $_POST["children"];
            $adults = $_POST["adults"];
            $location = $_POST["location"];
            $movie = $_POST["movie"];
            $moviedate = date("D M jS", strtotime($_POST["moviedate"]));
            $showtime = $_POST["showtime"];
            
            echo '<input type="hidden" id="name" name="name" value="'.$name.'">';
            echo '<input type="hidden" id="email" name="email" value="'.$email.'">';
            echo '<input type="hidden" id="children" name="children" value="'.$children.'">';
            echo '<input type="hidden" id="adults" name="adults" value="'.$adults.'">';
            echo '<input type="hidden" id="location" name="location" value="'.$location.'">';
            echo '<input type="hidden" id="movie" name="movie" value="'.$movie.'">';
            echo '<input type="hidden" id="moviedate" name="moviedate" value="'.$moviedate.'">';
            echo '<input type="hidden" id="showtime" name="showtime" value="'.$showtime.'">';
    
            $numchild = (int)$children;
            $numadult = (int)$adults;
            $childprice = $numchild*7;
            $adultprice = $numadult*12;
            $total = $childprice+$adultprice;
            echo '<div class="orderwrapper">';
            echo '<h4 >Order details:</h4><br>';
            echo "<p>Movie: $movie</p>";
            echo "<p>Location: $location</p>";
            echo "<p>Time: $showtime</p>";
            echo '<div class="linewrapper">';
            echo '<span>' .$numchild. 'x Child</span>';
            echo '<div class="middle"></div>';
            echo '<span>' .'$' .$childprice. '.00</span>';
            echo '</div>';
            echo '<div class="linewrapper">';
            echo '<span>' .$numadult. 'x Adult</span>';
            echo '<div class="middle"></div>';
            echo '<span>' .'$' .$adultprice. '.00</span>';
            echo '</div>';
            echo '<div class="linewrapper">';
            echo '<span>' .'TOTAL</span>';
            echo '<div class="middle"></div>';
            echo '<span>' .'$' .$total. '.00</span>';
            echo '</div>';
            echo '</div>';
            ?>
          </div>
          <div class="column">
            <label for="ccname">Name on card <span class="required">*</span> </label>
            <input type="text" id="ccname" placeholder="" required>
            <label for="ccnum">Credit card number <span class="required">*</span> </label>
            <input type="text" id="ccnum" placeholder="" required>
            <div style="margin: 0px -20px">
              <div class="column">
                <label for="ccexpiration">Expiration <span class="required">*</span> </label>
                <input type="text" id="ccexpiration" placeholder="MMYY" required>
              </div>
              <div class="column">
                <label for="cccvv">CVV <span class="required">*</span> </label>
                <input type="text" id="cccvv" placeholder="" required>
              </div>
            </div>
          </div>
        </div>
        <input type="submit" value="Complete payment">
      </form>
    </div>
    
    <?php
        echo '<br><br><br><br><br><br><br><br><br><br>';
        echo '<br><br><br><br><br>';
    ?>
    
    <!--Footer-->
    <footer class="class=footer">
            
        <div class="row2">
          <div class="column2">
              <h4 id="ffont">SPECIAL DISCOUNTS</h4>
              <address>
                    <ul class="list-unstyled ffont">
                      <li>
                        50% discount on Tuesdays<br>
                        40% discount on all food & drinks on Thursdays<br>
                        20% off for all students<br>
                      </li>
                    </ul>
              </address>
          </div>
          <div class="column2">
                <h4 id="ffont">OUR LOCATIONS</h4>
                    <ul class="list-unstyled ffont">
                        <li><a href="locations.html"></a></li>
                        <li><a href="locations.html">Auburn Movieplex 10
                        </a></li>
                        <li><a href="locations.html">Geneva Movieplex 8</a></li>
                        <li><a href="locations.html">Johnstown Movieplex
                        </a></li>
                        <li><a href="locations.html">Massena Movieplex</a></li>
                        <li><a href="locations.html">Movieplex Cinema
                        </a></li>
                    </ul>
          </div>
          <div class="column2">
            <h4 id="ffont">INCOMING MOVIES</h4>
              <ul class="list-unstyled ffont">
                <li><a href="movies.html">Fast & Furious 9</a></li>
                <li><a href="movies.html">Top Gun:Maverick</a></li>
                <li><a href="movies.html">Dune </a></li>
                <li><a href="movies.html">Black Widow</a></li>
              </ul>
          </div>
          <div class="column2">
              <h4 id="ffont">USEFUL PAGES</h4>
              <ul class="list-unstyled ffont">
                <li><a href="ratings.html">Ratings</a></li>
                <li><a href="job.html">Apply for a Job</a></li>
                <li><a href="about.html">About Us</a></li>
                <li><a href="parties.html">Groups & Parties</a></li>
              </ul>
          </div>
        </div>
    </footer>

    </div>
  </body>
</html>
